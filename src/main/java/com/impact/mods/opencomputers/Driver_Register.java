package com.impact.mods.opencomputers;

import li.cil.oc.api.Driver;

public class Driver_Register {
	
	public static void init() {
		Driver.add(new Driver_NuclearReactor());
	}
}
