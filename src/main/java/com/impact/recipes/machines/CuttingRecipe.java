package com.impact.recipes.machines;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;


public class CuttingRecipe implements Runnable {

    @Override
    public void run() {

        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot10.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer10.get(64), ItemList.Circuit_Silicon_Wafer10.get(64), 6400, 122880, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot9.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer9.get(40), null, 1000, 240, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot8.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer8.get(64), ItemList.Circuit_Silicon_Wafer8.get(64), 3200, 7680, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot7.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer7.get(64), ItemList.Circuit_Silicon_Wafer7.get(32), 2400, 1920, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot6.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer6.get(64), ItemList.Circuit_Silicon_Wafer6.get(64), 4800, 122880, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot5.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer5.get(64), null, 3700, 7680, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot4.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer4.get(48), null, 1200, 240, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot3.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer3.get(64), null, 1600, 480, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot2.get(1), GT_Values.NI, ItemList.Circuit_Silicon_Wafer2.get(32), null, 800, 120, true);
        GT_Values.RA.addCutterRecipe(ItemList.Circuit_Silicon_Ingot.get(1), ItemList.Circuit_Silicon_Wafer.get(16), null, 400, 16);
    }
}
