package com.impact.recipes.machines;

import static com.impact.common.item.Core_List_Items.AcaciaScheme;
import static com.impact.common.item.Core_List_Items.BarnardaCScheme;
import static com.impact.common.item.Core_List_Items.BirchScheme;
import static com.impact.common.item.Core_List_Items.DarkOakScheme;
import static com.impact.common.item.Core_List_Items.DustSmallFertilizer;
import static com.impact.common.item.Core_List_Items.DustTinyFertilizer;
import static com.impact.common.item.Core_List_Items.JungleScheme;
import static com.impact.common.item.Core_List_Items.OakScheme;
import static com.impact.common.item.Core_List_Items.RubberScheme;
import static com.impact.common.item.Core_List_Items.SpruceScheme;

import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

public class FarmRecipe implements Runnable {

  final Core_Items CoreItems = Core_Items.getInstance(); //пыльки
  final Core_Items2 CoreItems2 = Core_Items2.getInstance(); //компоненты

  @Override
  public void run() {
    //Oak
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(OakScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 20L, 0),
            GT_ModHandler.getModItem("minecraft", "log", 4L, 0),
            GT_ModHandler.getModItem("minecraft", "sapling", 3L, 0),
            GT_ModHandler.getModItem("minecraft", "sapling", 1L, 0),
            GT_ModHandler.getModItem("minecraft", "apple", 2L, 0)},
        new int[]{10000, 5000, 9000, 5000, 10000}, 100, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(OakScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 20L, 0),
            GT_ModHandler.getModItem("minecraft", "log", 4L, 0),
            GT_ModHandler.getModItem("minecraft", "sapling", 4L, 0),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 0),
            GT_ModHandler.getModItem("minecraft", "apple", 3L, 0),
            GT_ModHandler.getModItem("minecraft", "leaves", 32L, 0)},
        new int[]{10000, 5000, 9500, 7500, 10000, 10000}, 300, 120);
    //Spruce
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(SpruceScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 30L, 1),
            GT_ModHandler.getModItem("minecraft", "log", 5L, 1),
            GT_ModHandler.getModItem("minecraft", "sapling", 4L, 1),
            GT_ModHandler.getModItem("minecraft", "sapling", 1L, 1),
            GT_ModHandler.getModItem("minecraft", "brown_mushroom", 1L, 0)},
        new int[]{10000, 6000, 9000, 2000, 500}, 160, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(SpruceScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 30L, 1),
            GT_ModHandler.getModItem("minecraft", "log", 5L, 1),
            GT_ModHandler.getModItem("minecraft", "sapling", 5L, 1),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 1),
            GT_ModHandler.getModItem("minecraft", "brown_mushroom", 1L, 0),
            GT_ModHandler.getModItem("minecraft", "leaves", 48L, 1)},
        new int[]{10000, 6000, 9500, 3000, 750, 10000}, 480, 120);
    //Birch
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BirchScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 15L, 2),
            GT_ModHandler.getModItem("minecraft", "log", 2L, 2),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 2),
            GT_ModHandler.getModItem("minecraft", "sapling", 1L, 2),
            GT_ModHandler.getModItem("minecraft", "sugar", 1L, 0)},
        new int[]{10000, 5000, 9000, 5000, 500}, 80, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BirchScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 15L, 2),
            GT_ModHandler.getModItem("minecraft", "log", 2L, 2),
            GT_ModHandler.getModItem("minecraft", "sapling", 3L, 2),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 2),
            GT_ModHandler.getModItem("minecraft", "sugar", 2L, 0),
            GT_ModHandler.getModItem("minecraft", "leaves", 40L, 2)},
        new int[]{10000, 5000, 9500, 6000, 500, 10000}, 240, 120);
    //Jungle
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(JungleScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 25L, 3),
            GT_ModHandler.getModItem("minecraft", "log", 3L, 3),
            GT_ModHandler.getModItem("minecraft", "sapling", 3L, 3),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 3),
            GT_ModHandler.getModItem("minecraft", "dye", 3L, 3)},
        new int[]{10000, 4000, 9000, 6000, 2000}, 120, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(JungleScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log", 25L, 3),
            GT_ModHandler.getModItem("minecraft", "log", 3L, 3),
            GT_ModHandler.getModItem("minecraft", "sapling", 5L, 3),
            GT_ModHandler.getModItem("minecraft", "dye", 3L, 3),
            GT_ModHandler.getModItem("minecraft", "vine", 5L, 0),
            GT_ModHandler.getModItem("minecraft", "leaves", 24L, 3)},
        new int[]{10000, 4000, 9500, 2000, 10000, 10000}, 360, 120);
    //Acacia
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(AcaciaScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 15L, 0),
            GT_ModHandler.getModItem("minecraft", "log2", 4L, 0),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 4),
            GT_ModHandler.getModItem("minecraft", "sapling", 1L, 4),
            GT_ModHandler.getModItem("minecraft", "deadbush", 1L, 0)},
        new int[]{10000, 5000, 9000, 3000, 3000}, 140, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(AcaciaScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 15L, 0),
            GT_ModHandler.getModItem("minecraft", "log2", 4L, 0),
            GT_ModHandler.getModItem("minecraft", "sapling", 3L, 4),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 4),
            GT_ModHandler.getModItem("minecraft", "deadbush", 2L, 0),
            GT_ModHandler.getModItem("minecraft", "leaves2", 36L, 0)},
        new int[]{10000, 5000, 9500, 4000, 4000, 10000}, 420, 120);
    //DarkOak
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(DarkOakScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 20L, 1),
            GT_ModHandler.getModItem("minecraft", "log2", 4L, 1),
            GT_ModHandler.getModItem("minecraft", "sapling", 3L, 5),
            GT_ModHandler.getModItem("minecraft", "sapling", 1L, 5),
            GT_ModHandler.getModItem("minecraft", "apple", 2L, 0)},
        new int[]{10000, 5000, 9000, 5000, 10000}, 120, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(DarkOakScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("minecraft", "log2", 20L, 1),
            GT_ModHandler.getModItem("minecraft", "log2", 4L, 1),
            GT_ModHandler.getModItem("minecraft", "sapling", 4L, 5),
            GT_ModHandler.getModItem("minecraft", "sapling", 2L, 5),
            GT_ModHandler.getModItem("minecraft", "apple", 3L, 0),
            GT_ModHandler.getModItem("minecraft", "leaves2", 48L, 1)},
        new int[]{10000, 5000, 9500, 6000, 10000, 10000}, 360, 120);
    //Rubber
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(RubberScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("IC2", "blockRubWood", 10L, 0),
            GT_ModHandler.getModItem("IC2", "blockRubWood", 2L, 0),
            GT_ModHandler.getModItem("IC2", "blockRubSapling", 2L, 0),
            GT_ModHandler.getModItem("IC2", "blockRubSapling", 1L, 0),
            GT_ModHandler.getModItem("IC2", "itemHarz", 3L, 0)},
        new int[]{10000, 4000, 9000, 4000, 10000}, 170, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(RubberScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("IC2", "blockRubWood", 10L, 0),
            GT_ModHandler.getModItem("IC2", "blockRubWood", 2L, 0),
            GT_ModHandler.getModItem("IC2", "blockRubSapling", 3L, 0),
            GT_ModHandler.getModItem("IC2", "blockRubSapling", 2L, 0),
            GT_ModHandler.getModItem("IC2", "itemHarz", 3L, 0),
            GT_ModHandler.getModItem("IC2", "blockRubLeaves", 32L, 0)},
        new int[]{10000, 4000, 9500, 5000, 10000, 10000}, 510, 120);
    //Barnarda
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BarnardaCScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustTinyFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(1),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 25L),
            GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 3L),
            GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 3L),
            GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 2L),
            GT_ModHandler.getModItem("GalaxySpace", "BarnardaCStrawberry", 3L)},
        new int[]{10000, 4000, 10000, 6000, 2000}, 200, 120);
    GT_Values.RA.addFarmRecipe(CoreItems2.getRecipe(BarnardaCScheme.getMetaID(), 0),
        CoreItems.getRecipe(DustSmallFertilizer.getMetaID(), 1), GT_Utility.getIntegratedCircuit(2),
        Materials.Water.getFluid(1000L), GT_Values.NF,
        new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 25L),
            GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 3L),
            GT_ModHandler.getModItem("GalaxySpace", "barnardaCsapling", 5L),
            GT_ModHandler.getModItem("GalaxySpace", "BarnardaCStrawberry", 3L),
            GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelion3", 5L),
            GT_ModHandler.getModItem("GalaxySpace", "barnardaCleaves", 24L)},
        new int[]{10000, 4000, 10000, 2000, 10000, 10000}, 400, 120);

  }
}
