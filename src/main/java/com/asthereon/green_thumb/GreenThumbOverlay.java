package com.asthereon.green_thumb;

import net.runelite.api.*;
import net.runelite.api.gameval.InterfaceID;
import net.runelite.api.gameval.InventoryID;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.tooltip.Tooltip;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.awt.*;
import java.util.Optional;

public class GreenThumbOverlay extends Overlay {

    private final Client client;
    private final TooltipManager tooltipManager;
    private final ItemManager itemManager;
    private final GreenThumbConfig config;
    private final GreenThumbPlugin plugin;

    private final StringBuilder stringBuilder = new StringBuilder();

    @Inject
    GreenThumbOverlay(Client client, TooltipManager tooltipManager, ItemManager itemManager, GreenThumbConfig config, GreenThumbPlugin plugin)
    {
        setPosition(OverlayPosition.DYNAMIC);
        this.client = client;
        this.tooltipManager = tooltipManager;
        this.itemManager = itemManager;
        this.config = config;
        this.plugin = plugin;
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        if (client.isMenuOpen() || !plugin.shouldShowTooltip())
        {
            return null;
        }

        final MenuEntry[] menuEntries = client.getMenu().getMenuEntries();
        final int last = menuEntries.length - 1;

        if (last < 0)
        {
            return null;
        }

        final MenuEntry menuEntry = menuEntries[last];

        if (StringUtils.isEmpty(menuEntry.getTarget()) ||
                menuEntry.getOption().contains("View") ||
                menuEntry.getParam0() < 0)
        {
            // These are interface buttons, don't render the overlay.
            return null;
        }

        final MenuAction action = menuEntry.getType();
        final int componentID = menuEntry.getParam1();

        switch (action)
        {
            case WIDGET_TARGET:
            case WIDGET_TARGET_ON_WIDGET:
            case CC_OP:
            case CC_OP_LOW_PRIORITY:
                Optional<ItemContainer> container = getContainer(componentID);
                if (container.isPresent())
                {
                    // Read the hovered item from its widget: in the seed vault the widget index is not the container slot
                    Widget widget = menuEntry.getWidget();
                    if (widget != null && widget.getItemId() != -1)
                    {
                        String itemName = stripExtra(itemManager.getItemComposition(widget.getItemId()).getName());

                        Seed seed = Seed.getSeedFromItemName(itemName);
                        if (seed != null) {
                            stringBuilder.append(seed.getTooltip(config, client, widget.getItemQuantity()));
                        }
                    }
                    if (stringBuilder.length() > 0)
                    {
                        addTooltip();
                    }
                    break;
                }
                break;
        }
        return null;
    }

    private Optional<ItemContainer> getContainer(int widgetId)
    {
        int interfaceID = WidgetUtil.componentToInterface(widgetId);
        if (interfaceID == InterfaceID.INVENTORY || interfaceID == InterfaceID.BANKSIDE || interfaceID == InterfaceID.SEED_VAULT_DEPOSIT) {
            return Optional.ofNullable(client.getItemContainer(InventoryID.INV));
        }
        else if (interfaceID == InterfaceID.BANKMAIN) {
            return Optional.ofNullable(client.getItemContainer(InventoryID.BANK));
        }
        else if (interfaceID == InterfaceID.SEED_VAULT) {
            return Optional.ofNullable(client.getItemContainer(InventoryID.SEED_VAULT));
        }
        else if (interfaceID == InterfaceID.SHARED_BANK) {
            return Optional.ofNullable(client.getItemContainer(InventoryID.INV_GROUP_TEMP));
        }
        else if (interfaceID == InterfaceID.HOSIDIUS_SEEDBOX) {
            return Optional.ofNullable(client.getItemContainer(InventoryID.SEED_BOX));
        }
        return Optional.empty();
    }

    private void addTooltip()
    {
        tooltipManager.add(new Tooltip(stringBuilder.toString()));
        stringBuilder.setLength(0);
    }

    private String stripExtra(String item)
    {
        String stripped = item.replaceAll("\\s?\\(\\d\\)", "");
        return stripped.substring(0, 1).toUpperCase() + stripped.substring(1);
    }
}
