package com.impact.recipes.machines;

import static com.impact.util.Utilits.Itemstack;

import com.impact.common.item.Core_Items;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;

public class EBFRecipe implements Runnable {

  final Core_Items CoreItems = Core_Items.getInstance();

  @Override
  public void run() {

/** ================================= start CORE MOD =================================*/
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HastelloyC276, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HastelloyC276, 1L), null,
            60 * 20, 1920, 3601);
    GT_Values.RA.addBlastRecipe(Itemstack(Core_Items.getInstance(), 16, 42),
        GT_Utility.getIntegratedCircuit(1), null, null, Itemstack(Core_Items.getInstance(), 1, 45),
        null, 20 * 300, 480, 3200);
    GT_Values.RA.addBlastRecipe(Itemstack(Core_Items.getInstance(), 16, 43),
        GT_Utility.getIntegratedCircuit(1), null, null, Itemstack(Core_Items.getInstance(), 1, 46),
        null, 20 * 300, 1920, 4200);
    GT_Values.RA.addBlastRecipe(Itemstack(Core_Items.getInstance(), 16, 44),
        GT_Utility.getIntegratedCircuit(1), null, null, Itemstack(Core_Items.getInstance(), 1, 47),
        null, 20 * 300, 7680, 4200);
    /* ================================= end CORE MOD =================================*/

/** ================================= start GT =================================*/

    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iron, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Steel, 1L),
        Materials.Ash.getDustTiny(1), 500, 120, 1000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.WroughtIron, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Steel, 1L),
            Materials.Ash.getDustTiny(1), 100, 120, 1000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Copper, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.AnnealedCopper, 1L), GT_Values.NI,
        500, 120, 1200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ruby, 1L),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Aluminium, 3L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DarkAsh, 1L), 400, 100, 1200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Ruby, 1L), GT_Values.NI,
            GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Aluminium, 3L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DarkAsh, 1L), 320, 100, 1200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.GreenSapphire, 1L),
            GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Aluminium, 3L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DarkAsh, 1L), 400, 100, 1200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.gem, Materials.GreenSapphire, 1L),
            GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Aluminium, 3L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DarkAsh, 1L), 320, 100, 1200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sapphire, 1L),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Aluminium, 3L), GT_Values.NI, 400,
        100, 1200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Sapphire, 1L),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Aluminium, 3L), GT_Values.NI, 320,
        100, 1200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ilmenite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Carbon, 1L), GT_Values.NF,
        GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.WroughtIron, 4L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Rutile, 4L), 800, 480, 1700);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnesium, 2L),
        GT_Utility.getIntegratedCircuit(11), Materials.Titaniumtetrachloride.getFluid(1000L),
        GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnesiumchloride, 2L), 800, 480,
        2140);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Copper, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.AnnealedCopper, 1L), GT_Values.NI,
        200, 120, 1200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.FerriteMixture, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(2000), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.NickelZincFerrite, 1L), null, 400,
            120, Materials.NickelZincFerrite.mBlastFurnaceTemp);
    GT_Values.RA.addBlastRecipe(CoreItems.getRecipe(34, 1), GT_Utility.getIntegratedCircuit(11),
        Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Neutronium, 1L), GT_Values.NI,
        2000, 500000, 9000);
    GT_Values.RA.addBlastRecipe(CoreItems.getRecipe(34, 1), GT_Utility.getIntegratedCircuit(12),
        Materials.PerroxGas.getGas(20L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Neutronium, 1L), GT_Values.NI, 200,
        500000, 9000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Adamantium, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Adamantium, 1L), GT_Values.NI,
            2000, 500000, 10800);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Adamantium, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Adamantium, 1L), GT_Values.NI,
            2500, 500000, 10800);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Adamantium, 1L),
            GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Adamantium, 1L), GT_Values.NI,
            200, 500000, 10800);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectrumFlux, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.ElectrumFlux, 1L),
            GT_Values.NI, 1000, 62880, 9000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectrumFlux, 1L),
            GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.ElectrumFlux, 1L),
            GT_Values.NI, 250, 62880, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSG, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), GT_Values.NI, 800, 1920,
        4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSG, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), GT_Values.NI, 1300,
        1920, 4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSE, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), GT_Values.NI, 900, 1920,
        5400);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSE, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), GT_Values.NI, 1400,
        1920, 5400);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSS, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), GT_Values.NI, 1000,
        1920, 5400);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSS, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), GT_Values.NI, 1500,
        1920, 5400);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadah, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadah, 1L), GT_Values.NI, 500,
        7680, 5000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NaquadahAlloy, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahAlloy, 1L),
            GT_Values.NI, 1000, 62880, 7200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NaquadahEnriched, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahEnriched, 1L),
            GT_Values.NI, 500, 7680, 7000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadria, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadria, 1L), GT_Values.NI, 500,
        122880, 9000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmiridium, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmiridium, 1L), GT_Values.NI,
            900, 30720, 4500);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TungstenSteel, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenSteel, 1L),
            GT_Values.NI, 1300, 480, 3000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TungstenSteel, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenSteel, 1L),
            GT_Values.NI, 800, 480, 3000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Desh, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Desh, 1L), GT_Values.NI, 1200, 480,
        3000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Desh, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Desh, 1L), GT_Values.NI, 800, 480,
        3000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TungstenCarbide, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L),
            GT_Values.NI, 1500, 480, 2460);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TungstenCarbide, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L),
            GT_Values.NI, 1000, 480, 2460);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.StainlessSteel, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.StainlessSteel, 1L), GT_Values.NI,
            1100, 480, 1700);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.StainlessSteel, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.StainlessSteel, 1L), GT_Values.NI,
            600, 480, 1700);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Aluminium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Aluminium, 1L), GT_Values.NI, 930,
        120, 1700);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MeteoricSteel, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.MeteoricSteel, 1L),
            GT_Values.NI, 1500, 480, 2460);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MeteoricSteel, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.MeteoricSteel, 1L),
            GT_Values.NI, 1000, 480, 2460);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NiobiumTitanium, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NiobiumTitanium, 1L),
            GT_Values.NI, 1500, 480, 4500);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NiobiumTitanium, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NiobiumTitanium, 1L),
            GT_Values.NI, 1000, 480, 4500);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Pentacadmiummagnesiumhexaoxid, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Pentacadmiummagnesiumhexaoxid, 1L),
        GT_Values.NI, 1700, 480, 2500);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Pentacadmiummagnesiumhexaoxid, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Pentacadmiummagnesiumhexaoxid, 1L),
        GT_Values.NI, 1200, 480, 2500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Titaniumonabariumdecacoppereikosaoxid, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Titaniumonabariumdecacoppereikosaoxid, 1L),
        GT_Values.NI, 1800, 480, 3300);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Titaniumonabariumdecacoppereikosaoxid, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Titaniumonabariumdecacoppereikosaoxid, 1L),
        GT_Values.NI, 1300, 480, 3300);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Uraniumtriplatinid, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Uraniumtriplatinid, 1L),
        GT_Values.NI, 1900, 1920, 4400);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Uraniumtriplatinid, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Uraniumtriplatinid, 1L),
        GT_Values.NI, 1400, 1920, 4400);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Vanadiumtriindinid, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Vanadiumtriindinid, 1L),
        GT_Values.NI, 2000, 1920, 5200);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Vanadiumtriindinid, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Vanadiumtriindinid, 1L),
        GT_Values.NI, 1500, 1920, 5200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust,
        Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator
            .get(OrePrefixes.ingotHot,
                Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid, 1L),
        GT_Values.NI, 2100, 7680, 6000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust,
        Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot,
            Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid, 1L),
        GT_Values.NI, 1600, 7680, 6000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust,
        Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot,
            Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid, 1L),
        GT_Values.NI, 160, 7680, 6000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Tetranaquadahdiindiumhexaplatiumosminid, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Tetranaquadahdiindiumhexaplatiumosminid, 1L),
        GT_Values.NI, 2000, 7680, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Tetranaquadahdiindiumhexaplatiumosminid, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Tetranaquadahdiindiumhexaplatiumosminid, 1L),
        GT_Values.NI, 1500, 7680, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Tetranaquadahdiindiumhexaplatiumosminid, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Tetranaquadahdiindiumhexaplatiumosminid, 1L),
        GT_Values.NI, 150, 7680, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuvwire, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuvwire, 1L),
        GT_Values.NI, 2100, 30720, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuvwire, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Radon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuvwire, 1L),
        GT_Values.NI, 1600, 30720, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuvwire, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuvwire, 1L),
        GT_Values.NI, 160, 30720, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuhvwire, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuhvwire, 1L),
        GT_Values.NI, 2200, 122880, 10800);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuhvwire, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Radon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuhvwire, 1L),
        GT_Values.NI, 1700, 122880, 10800);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuhvwire, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuhvwire, 1L),
        GT_Values.NI, 170, 122880, 10800);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuevwire, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuevwire, 1L),
        GT_Values.NI, 2300, 500000, 12600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuevwire, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Radon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuevwire, 1L),
        GT_Values.NI, 1800, 500000, 12600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator
            .get(OrePrefixes.dust, Materials.Longasssuperconductornameforuevwire, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
        GT_OreDictUnificator
            .get(OrePrefixes.ingotHot, Materials.Longasssuperconductornameforuevwire, 1L),
        GT_Values.NI, 180, 500000, 12600);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RedstoneAlloy, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.RedstoneAlloy, 1L), GT_Values.NI,
            500, 120, 1000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RedstoneAlloy, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.RedstoneAlloy, 1L), GT_Values.NI,
            1000, 120, 1200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ConductiveIron, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ConductiveIron, 1L), GT_Values.NI,
            700, 120, 1200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ConductiveIron, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ConductiveIron, 1L), GT_Values.NI,
            1200, 120, 1500);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnergeticAlloy, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Hydrogen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticAlloy, 1L), GT_Values.NI,
            1000, 120, 2200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnergeticAlloy, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticAlloy, 1L), GT_Values.NI,
            1500, 120, 2500);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.VibrantAlloy, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Hydrogen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VibrantAlloy, 1L),
            GT_Values.NI, 1000, 480, 3000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.VibrantAlloy, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VibrantAlloy, 1L),
            GT_Values.NI, 1500, 480, 3600);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectricalSteel, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 1L),
            GT_Values.NI, 1000, 120, 1000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectricalSteel, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 1L),
            GT_Values.NI, 1500, 120, 1200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.PulsatingIron, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.PulsatingIron, 1L), GT_Values.NI,
            1000, 480, 1800);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.PulsatingIron, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.PulsatingIron, 1L), GT_Values.NI,
            1500, 480, 2200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Soularium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Soularium, 1L), GT_Values.NI, 1000,
        120, 1000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Soularium, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Soularium, 1L), GT_Values.NI, 1500,
        120, 1200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DarkSteel, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), GT_Values.NI, 1000,
        480, 1800);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DarkSteel, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), GT_Values.NI, 1500,
        480, 2200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Draconium, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.Naquadah.getMolten(144L),
        Materials.Tartarite.getFluid(144L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 2L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1L), 800, 30720, 7200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DraconiumAwakened, 1L),
            GT_Utility.getIntegratedCircuit(12), Materials.NaquadahEnriched.getMolten(144L),
            Materials.EnrichedTartarite.getFluid(144L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 2L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1L), 1600, 122880,
            10800);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Europiumoxide, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Europiumoxide, 1L),
            GT_Values.NI, 1000, 30720, 7200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Europiumoxide, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Europiumoxide, 1L),
            GT_Values.NI, 1500, 30720, 7200);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Diamericiumtitanium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Diamericiumtitanium, 1L),
        GT_Values.NI, 1200, 122880, 9000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Infuscolium, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Infuscolium, 1L), GT_Values.NI,
            600, 30720, 9000);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Infuscolium, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Infuscolium, 1L), GT_Values.NI,
            1200, 30720, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Europium, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Europium, 1L), GT_Values.NI, 1500,
        7680, 6000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Europium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Europium, 1L), GT_Values.NI, 1000,
        7680, 6000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Quantium, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Quantium, 1L), GT_Values.NI, 160,
        122880, 10800);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Quantium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Quantium, 1L), GT_Values.NI, 1600,
        122880, 10800);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Quantium, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Quantium, 1L), GT_Values.NI, 2100,
        122880, 9900);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CosmicNeutronium, 1L),
            GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.CosmicNeutronium, 1L),
            GT_Values.NI, 150, 500000, 12600);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CosmicNeutronium, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.CosmicNeutronium, 1L),
            GT_Values.NI, 1500, 500000, 12600);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CosmicNeutronium, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.CosmicNeutronium, 1L),
            GT_Values.NI, 2000, 500000, 12600);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlackPlutonium, 1L),
            GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(20L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.BlackPlutonium, 1L),
            GT_Values.NI, 150, 500000, 12600);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlackPlutonium, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.BlackPlutonium, 1L),
            GT_Values.NI, 1500, 500000, 12600);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlackPlutonium, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.BlackPlutonium, 1L),
            GT_Values.NI, 2000, 500000, 12600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Enderium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Enderium, 1L), GT_Values.NI, 1000,
        480, 4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Enderium, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Enderium, 1L), GT_Values.NI, 1500,
        480, 4500);
    GT_Values.RA.addBlastRecipe(ItemList.Circuit_Parts_RawCrystalChip.get(1),
        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Emerald, 1),
        Materials.Helium.getGas(1000), null, ItemList.Circuit_Parts_Crystal_Chip_Elite.get(1), null,
        900, 480, 5000);
    GT_Values.RA.addBlastRecipe(ItemList.Circuit_Parts_RawCrystalChip.get(1),
        GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Olivine, 1),
        Materials.Helium.getGas(1000), null, ItemList.Circuit_Parts_Crystal_Chip_Elite.get(1), null,
        900, 480, 5000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 32),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1), null, null,
        ItemList.Circuit_Silicon_Ingot.get(1, new Object[0]), null, 6000, 120, 1784);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 64),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 8),
        Materials.Nitrogen.getGas(8000), null,
        ItemList.Circuit_Silicon_Ingot2.get(1, new Object[0]), null, 9000, 480, 2484);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 16),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Naquadah, 1),
        Materials.Argon.getGas(8000), null, ItemList.Circuit_Silicon_Ingot3.get(1, new Object[0]),
        null, 1200, 1920, 5400);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 8),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Enderium, 6),
        Materials.Argon.getGas(4000), null, ItemList.Circuit_Silicon_Ingot4.get(1, new Object[0]),
        null, 11500, 1024, 3333);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 24),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Naquadria, 2),
        Materials.Argon.getGas(8000), null, ItemList.Circuit_Silicon_Ingot5.get(1, new Object[0]),
        null, 2100, 30720, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 32),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MysteriousCrystal, 4),
        Materials.Argon.getGas(16000), null, ItemList.Circuit_Silicon_Ingot6.get(1, new Object[0]),
        null, 2900, 500000, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 32),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Europium, 2),
        Materials.Radon.getGas(8000), null, ItemList.Circuit_Silicon_Ingot7.get(1, new Object[0]),
        null, 15000, 7680, 6484);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 64),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Americium, 4),
        Materials.Radon.getGas(16000), null, ItemList.Circuit_Silicon_Ingot8.get(1, new Object[0]),
        null, 18000, 30720, 9000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 8),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.VibrantAlloy, 6),
        Materials.Argon.getGas(3000), null, ItemList.Circuit_Silicon_Ingot9.get(1, new Object[0]),
        null, 9000, 1024, 3333);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 64),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Neutronium, 4),
        Materials.Radon.getGas(24000), null, ItemList.Circuit_Silicon_Ingot10.get(1, new Object[0]),
        null, 24000, 500000, 12600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.block, Materials.Silicon, 64),
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Neutronium, 4),
        Materials.PerroxGas.getGas(480), null,
        ItemList.Circuit_Silicon_Ingot10.get(1, new Object[0]), null, 6400, 500000, 12600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Argon.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Trinium, 1L), GT_Values.NI, 1500,
        30720, 7200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSLA, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.HSLA, 1L), GT_Values.NI, 1500, 480,
        1811);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSLA, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Oxygen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.HSLA, 1L), GT_Values.NI, 1000, 480,
        1811);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BT6, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.BT6, 1L), GT_Values.NI, 1500, 480,
        3200);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BT6, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.BT6, 1L), GT_Values.NI, 1000, 480,
        3200);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Birmabright, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Birmabright, 1L), GT_Values.NI,
            930, 120, 1476);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.InfinityCatalyst, 1L),
            GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(100L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.InfinityCatalyst, 1L),
            GT_Values.NI, 2000, 2000000, 12600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Infinity, 1L),
        GT_Utility.getIntegratedCircuit(12), Materials.PerroxGas.getGas(500L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Infinity, 1L), GT_Values.NI, 2000,
        2000000, 12600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iridium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Iridium, 1L), GT_Values.NI, 800,
        7680, 4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iridium, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Iridium, 1L), GT_Values.NI, 1600,
        7680, 4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmium, 1L), GT_Values.NI, 900,
        30720, 4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmium, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmium, 1L), GT_Values.NI, 1800,
        30720, 4500);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Oriharukon, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Oriharukon, 1L), GT_Values.NI,
            700, 30720, 5400);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Oriharukon, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Oriharukon, 1L), GT_Values.NI,
            1400, 30720, 5400);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.VanadiumGallium, 1L),
            GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VanadiumGallium, 1L),
            GT_Values.NI, 1200, 480, 4500);
    GT_Values.RA
        .addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.VanadiumGallium, 1L),
            GT_Utility.getIntegratedCircuit(11), Materials.Helium.getGas(1000L), GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VanadiumGallium, 1L),
            GT_Values.NI, 600, 480, 4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titanium, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), GT_Values.NI, 1400,
        1920, 1940);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titanium, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), GT_Values.NI, 700,
        1920, 1940);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.YttriumBariumCuprate, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.YttriumBariumCuprate, 1L),
        GT_Values.NI, 1200, 480, 4500);
    GT_Values.RA.addBlastRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.YttriumBariumCuprate, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.YttriumBariumCuprate, 1L),
        GT_Values.NI, 600, 480, 4500);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Tungsten, 1L), GT_Values.NI, 2400,
        1920, 3000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Tungsten, 1L), GT_Values.NI, 1200,
        1920, 3000);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Mytryl, 1L),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Mytryl, 1L), GT_Values.NI, 1700,
        1920, 3600);
    GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Mytryl, 1L),
        GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000L), GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Mytryl, 1L), GT_Values.NI, 1200,
        1920, 3600);

    /* ================================= end GT =================================*/

    GT_Values.RA.addBlastRecipe(
        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 2L, 4),
        GT_Utility.getIntegratedCircuit(1), GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Titanium, 1L), GT_Values.NI, 1500,
        120, 1500);


  }
}
