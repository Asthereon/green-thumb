package com.asthereon.green_thumb;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.FocusChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.HotkeyListener;

@Slf4j
@PluginDescriptor(
	name = "Green Thumb"
)
public class GreenThumbPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private GreenThumbConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private GreenThumbOverlay greenThumbOverlay;

	@Inject
	private KeyManager keyManager;

	private volatile boolean hotkeyPressed;

	private final HotkeyListener hotkeyListener = new HotkeyListener(() -> config.tooltipHotkey())
	{
		@Override
		public void hotkeyPressed()
		{
			hotkeyPressed = true;
		}

		@Override
		public void hotkeyReleased()
		{
			hotkeyPressed = false;
		}
	};

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(greenThumbOverlay);
		keyManager.registerKeyListener(hotkeyListener);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(greenThumbOverlay);
		keyManager.unregisterKeyListener(hotkeyListener);
		hotkeyPressed = false;
	}

	@Subscribe
	public void onFocusChanged(FocusChanged focusChanged)
	{
		// The key release is never seen if the client loses focus while the hotkey is held
		if (!focusChanged.isFocused())
		{
			hotkeyPressed = false;
		}
	}

	boolean shouldShowTooltip()
	{
		return !config.hotkeyEnabled() || hotkeyPressed;
	}

	@Provides
	GreenThumbConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GreenThumbConfig.class);
	}
}
