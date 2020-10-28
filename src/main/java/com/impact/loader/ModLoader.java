package com.impact.loader;

import com.impact.mods.GregTech.TecTech.Holo_Impact;
import com.impact.mods.GregTech.TecTech.Holo_Vanila_GregTech;
import com.impact.recipes.OpenComputersRecipe;
import com.impact.recipes.RailCraftRecipe;
import com.impact.recipes.TecTechRecipe;
import cpw.mods.fml.common.Loader;

public class ModLoader implements Runnable {

    @Override
    public void run() {

        // --- TecTech
        if (Loader.isModLoaded("tectech")) {
            new TecTechRecipe().run();
            new Holo_Impact().run();
            new Holo_Vanila_GregTech().run();
        }

        // --- OpenComputers
        if (Loader.isModLoaded("OpenComputers")) {
            new OpenComputersRecipe().run();
        }

        // --- RailCraft
        if (Loader.isModLoaded("Railcraft")) {
            new RailCraftRecipe().run();
        }
    }
}
