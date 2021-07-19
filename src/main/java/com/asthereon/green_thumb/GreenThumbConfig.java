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
			keyName = "showLevelRequirement",
			name = "Show Level Requirement",
			description = "Show the level requirement for a seed on hover."
	)
	default boolean showLevelRequirement() {
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "showSeedType",
			name = "Show Seed Type",
			description = "Show the seed type for a seed on hover."
	)
	default boolean showSeedType() {
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "showSeedsPerPatch",
			name = "Show Seeds Per Patch",
			description = "Show the seeds required to plant a patch for a seed on hover."
	)
	default boolean showSeedsPerPatch() {
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "showProtectionPayment",
			name = "Show Protection Payment",
			description = "Show the payment for a farmer to protect a seed on hover."
	)
	default boolean showProtectionPayment() {
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "showProtectionFlowers",
			name = "Show Protection Flowers",
			description = "Show the flowers that can be used to protect a seed on hover."
	)
	default boolean showProtectionFlowers() {
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "showUses",
			name = "Show Uses",
			description = "Show the uses for the crop harvested from a seed on hover."
	)
	default boolean showUses() {
		return true;
	}

	@ConfigItem(
			keyName = "metRequirementColor",
			name = "Met Requirement Color",
			description = "Configures the text color used when a requirement is met",
			position = 6
	)
	default Color metRequirementColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
			keyName = "notMetRequirementColor",
			name = "Not Met Requirement Color",
			description = "Configures the text color used when a requirement is not met",
			position = 6
	)
	default Color notMetRequirementColor()
	{
		return Color.RED;
	}
}
