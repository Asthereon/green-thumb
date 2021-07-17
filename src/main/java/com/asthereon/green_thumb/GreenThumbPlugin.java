package com.asthereon.green_thumb;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

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

	@Override
	protected void startUp() throws Exception
	{
		log.info("Green Thumb started!");
		overlayManager.add(greenThumbOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Green Thumb stopped!");
		overlayManager.remove(greenThumbOverlay);
	}

	@Provides
	GreenThumbConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GreenThumbConfig.class);
	}
}
