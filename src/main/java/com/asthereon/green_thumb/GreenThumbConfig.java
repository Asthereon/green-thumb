package com.asthereon.green_thumb;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("greenthumb")
public interface GreenThumbConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "showItemName",
			name = "Show Item Name",
			description = "Show the name of the seed on hover."
	)
	default boolean showItemName() {
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "showLevelRequirement",
			name = "Show Level Requirement",
			description = "Show the level requirement for a seed on hover."
	)
	default boolean showLevelRequirement() {
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "showSeedType",
			name = "Show Seed Type",
			description = "Show the seed type for a seed on hover."
	)
	default boolean showSeedType() {
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "showSeedsPerPatch",
			name = "Show Seeds Per Patch",
			description = "Show the seeds required to plant a patch for a seed on hover."
	)
	default boolean showSeedsPerPatch() {
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "showGrowthTime",
			name = "Show Growth Time",
			description = "Show the average time for a seed to grow."
	)
	default boolean showGrowthTime() {
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "showGrowthCycles",
			name = "Show Growth Cycles",
			description = "Show the average number and length of the growth cycles for a seed."
	)
	default boolean showGrowthCycles() {
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "showProtectionPayment",
			name = "Show Protection Payment",
			description = "Show the payment for a farmer to protect a seed on hover."
	)
	default boolean showProtectionPayment() {
		return true;
	}

	@ConfigItem(
			position = 7,
			keyName = "showProtectionFlowers",
			name = "Show Protection Flowers",
			description = "Show the flowers that can be used to protect a seed on hover."
	)
	default boolean showProtectionFlowers() {
		return true;
	}

	@ConfigItem(
			position = 8,
			keyName = "showUses",
			name = "Show Uses",
			description = "Show the uses for the crop harvested from a seed on hover."
	)
	default boolean showUses() {
		return true;
	}

	@ConfigItem(
			position = 9,
			keyName = "metRequirementColor",
			name = "Met Requirement Color",
			description = "Configures the text color used when a requirement is met"
	)
	default Color metRequirementColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
			position = 10,
			keyName = "notMetRequirementColor",
			name = "Not Met Requirement Color",
			description = "Configures the text color used when a requirement is not met"
	)
	default Color notMetRequirementColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			position = 11,
			keyName = "itemNameColor",
			name = "Item Name Color",
			description = "Configures the text color used for the name of the item on hover."
	)
	default Color itemNameColor() { return Color.WHITE; }

	@ConfigItem(
			position = 12,
			keyName = "showPlantXP",
			name = "Show Plant XP",
			description = "Show the experience gained for planting the seed on hover."
	)
	default boolean showPlantXP() {
		return false;
	}

	@ConfigItem(
			position = 13,
			keyName = "showCheckHealthXP",
			name = "Show Check Health XP",
			description = "Show the experience gained for checking the health of the seed on hover (if applicable)."
	)
	default boolean showCheckHealthXP() {
		return true;
	}

	@ConfigItem(
			position = 14,
			keyName = "showHarvestXP",
			name = "Show Harvest XP",
			description = "Show the experience gained for each harvest of the seed on hover (if applicable)."
	)
	default boolean showHarvestXP() {
		return false;
	}
}
