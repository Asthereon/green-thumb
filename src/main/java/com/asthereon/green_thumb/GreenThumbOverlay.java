package com.asthereon.green_thumb;

import net.runelite.api.*;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
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
    private static final int INVENTORY_ITEM_WIDGETID = WidgetInfo.INVENTORY.getPackedId();
    private static final int BANK_ITEM_WIDGETID = WidgetInfo.BANK_ITEM_CONTAINER.getPackedId();
    private static final int BANKED_INVENTORY_ITEM_WIDGETID = WidgetInfo.BANK_INVENTORY_ITEMS_CONTAINER.getPackedId();

    private final Client client;
    private final TooltipManager tooltipManager;
    private final ItemManager itemManager;
    private final GreenThumbConfig config;

    private final StringBuilder stringBuilder = new StringBuilder();

    @Inject
    GreenThumbOverlay(Client client, TooltipManager tooltipManager, ItemManager itemManager, GreenThumbConfig config)
    {
        setPosition(OverlayPosition.DYNAMIC);
        this.client = client;
        this.tooltipManager = tooltipManager;
        this.itemManager = itemManager;
        this.config = config;
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        if (client.isMenuOpen())
        {
            return null;
        }

        final MenuEntry[] menuEntries = client.getMenuEntries();
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
        final int widgetId = menuEntry.getParam1();
        final int groupId = WidgetInfo.TO_GROUP(widgetId);

        switch (action)
        {
            case ITEM_USE_ON_WIDGET:
            case CC_OP:
            case ITEM_USE:
            case ITEM_FIRST_OPTION:
            case ITEM_SECOND_OPTION:
            case ITEM_THIRD_OPTION:
            case ITEM_FOURTH_OPTION:
            case ITEM_FIFTH_OPTION:
                switch (groupId)
                {
                    case WidgetID.INVENTORY_GROUP_ID:
                    case WidgetID.BANK_GROUP_ID:
                    case WidgetID.BANK_INVENTORY_GROUP_ID:
                        Optional<ItemContainer> container = getContainer(widgetId);
                        if (container.isPresent())
                        {
                            Optional<Item> item = getContainerItem(container.get(), menuEntry.getParam0());
                            if (item.isPresent())
                            {
                                String itemName = stripExtra(itemManager.getItemComposition(item.get().getId()).getName());

                                Seed seed = Seed.getSeedFromItemName(itemName);
                                if (seed != null) {
                                    stringBuilder.append(seed.getTooltip(config, client, item.get().getQuantity()));
                                }
                            }
                            if (stringBuilder.length() > 0)
                            {
                                addTooltip();
                            }
                            break;
                        }
                }
                break;
        }
        return null;
    }

    private Optional<ItemContainer> getContainer(int widgetId)
    {
        if (widgetId == INVENTORY_ITEM_WIDGETID || widgetId == BANKED_INVENTORY_ITEM_WIDGETID)
        {
            return Optional.ofNullable(client.getItemContainer(InventoryID.INVENTORY));
        }
        else if (widgetId == BANK_ITEM_WIDGETID)
        {
            return Optional.ofNullable(client.getItemContainer(InventoryID.BANK));
        }
        return Optional.empty();
    }

    private Optional<Item> getContainerItem(ItemContainer container, int itemId)
    {
        return Optional.ofNullable(container.getItem(itemId));
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
