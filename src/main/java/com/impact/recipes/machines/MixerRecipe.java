package com.impact.recipes.machines;

import com.impact.item.Core_Items;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class MixerRecipe implements Runnable {

    final Core_Items CoreItems = Core_Items.getInstance();

    @Override
    public void run() {

/** ================================= start CORE MOD =================================*/
        //HastelloyC276
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Nickel, 32L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Molybdenum, 8L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Chrome, 7L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cobalt, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten, 1L), GT_Utility.getIntegratedCircuit(6), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HastelloyC276, 28L), 150 * 20, 1920);
        //Potin
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Copper, 6L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tin, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lead, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(3), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Potin, 9L), 20 * 20, 8);
        //EglinSteel
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iron, 5L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Invar, 5L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 4L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Carbon, 1L), GT_Utility.getIntegratedCircuit(5), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EglinSteel, 16L), 30 * 20, 16);
        //Birmabright
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Aluminium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnesium, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Manganese, 1L), GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(3), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Birmabright, 3L), 10 * 20, 48);

        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Neutronium, 16L), GT_Values.NI, GT_Utility.getIntegratedCircuit(1), GT_Values.NI, Materials.Helium.getPlasma(2304L), GT_Values.NF, CoreItems.getRecipe(34,16), 3600, 122880);

        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(28,64), Materials.DeepIron.getDust(64), Materials.EuropiumoxideMagnetic.getDust(21), Materials.ChromiumTrioxide.getDust(64), GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.GarnetRed, 54L), GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.Opal, 47L), GT_Values.NF, GT_Values.NF, CoreItems.getRecipe(36, 1), 3600, 262144);
        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(35,64), Materials.DeepIron.getDust(64), Materials.EuropiumoxideMagnetic.getDust(21), Materials.ChromiumTrioxide.getDust(64), GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.GarnetRed, 54L), GT_OreDictUnificator.get(OrePrefixes.gemExquisite, Materials.Opal, 47L), GT_Values.NF, GT_Values.NF, CoreItems.getRecipe(36, 1), 3600, 262144);

        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(28,16), Materials.MysteriousCrystal.getDust(4), Materials.Oriharukon.getDust(4), Materials.BlackPlutonium.getDustTiny(4), GT_Utility.getIntegratedCircuit(1), GT_Values.NI, Materials.Mutagen.getFluid(4000), Materials.BioMediumRaw.getFluid(4000), GT_Values.NI, 300, 122880);
        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(35,16), Materials.MysteriousCrystal.getDust(4), Materials.Oriharukon.getDust(4), Materials.BlackPlutonium.getDustTiny(4), GT_Utility.getIntegratedCircuit(1), GT_Values.NI, Materials.Mutagen.getFluid(4000), Materials.BioMediumRaw.getFluid(4000), GT_Values.NI, 300, 122880);
        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(28,32), Materials.MysteriousCrystal.getDust(6), Materials.Oriharukon.getDust(6), Materials.InfinityCatalyst.getDustTiny(1), GT_Utility.getIntegratedCircuit(2), GT_Values.NI, Materials.Mutagen.getFluid(8000), Materials.BioMediumRaw.getFluid(8000), GT_Values.NI, 400, 122880);
        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(35,32), Materials.MysteriousCrystal.getDust(6), Materials.Oriharukon.getDust(6), Materials.InfinityCatalyst.getDustTiny(1), GT_Utility.getIntegratedCircuit(2), GT_Values.NI, Materials.Mutagen.getFluid(8000), Materials.BioMediumRaw.getFluid(8000), GT_Values.NI, 400, 122880);

        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gypsum, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Calcite, 1L), GT_Utility.getIntegratedCircuit(1), GT_Values.NF,  GT_Values.NF, CoreItems.getRecipe(37,4), 200, 8);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gypsum, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Marble, 1L), GT_Utility.getIntegratedCircuit(1), GT_Values.NF,  GT_Values.NF, CoreItems.getRecipe(37,4), 200, 8);

        /* ================================= end CORE MOD =================================*/
/** ================================= start GT =================================*/
        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(2,1), CoreItems.getRecipe(10,1), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ledox, 1L), GT_Values.NI, new FluidStack(FluidRegistry.getFluid("ic2coolant"), 3000), Materials.SuperCoolant.getFluid(3000), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ice, 3L), 300, 480);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sodium, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Potassium, 3L), GT_Utility.getIntegratedCircuit(2), GT_Values.NI, GT_Values.NF, Materials.SodiumPotassium.getFluid(1000), GT_Values.NI, 400, 30);

        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Clay, 3L), CoreItems.getRecipe(37,1), GT_Utility.getIntegratedCircuit(1), GT_Values.NI, GT_Values.NF,  GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Fireclay, 4L), 200, 8);

        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gypsum, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Calcite, 1L), GT_Utility.getIntegratedCircuit(2), Materials.Water.getFluid(1000L), Materials.Concrete.getMolten(1152L), GT_Values.NI, 40, 16);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Stone, 2L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Gypsum, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Marble, 1L), GT_Utility.getIntegratedCircuit(2), Materials.Water.getFluid(1000L), Materials.Concrete.getMolten(1152L), GT_Values.NI, 40, 16);
        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(37,4), GT_Utility.getIntegratedCircuit(1), GT_Values.NI, GT_Values.NI, Materials.Water.getFluid(1000L), Materials.Concrete.getMolten(1152L), GT_Values.NI, 40, 16);

        /* ================================= end GT =================================*/
        /** ================================= start AE =================================*/
        GT_Values.RA.addMixerRecipe(CoreItems.getRecipe(38,1), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NetherQuartz, 1L), GT_Values.NI, Materials.Water.getFluid(500L), GT_Values.NF, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 2L, 8), 20, 16);

        /* ================================= end AE =================================*/
    }
}
