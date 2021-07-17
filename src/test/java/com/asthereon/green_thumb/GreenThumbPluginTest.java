package com.asthereon.green_thumb;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class GreenThumbPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GreenThumbPlugin.class);
		RuneLite.main(args);
	}
}