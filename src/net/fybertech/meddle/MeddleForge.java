package net.fybertech.meddle;

import net.minecraft.launchwrapper.ITweaker;

public class MeddleForge extends Meddle
{
	/**
	 * Hacky workaround to make compatible with other tweakers including LiteLoader.
	 * @returns an empty array of Strings.
	 */

	@Override
	public String[] getLaunchArguments()
	{
		return new String[0];
	}
}
