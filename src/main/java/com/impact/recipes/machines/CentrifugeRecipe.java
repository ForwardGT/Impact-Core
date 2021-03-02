package com.impact.recipes.machines;

import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;

public class CentrifugeRecipe implements Runnable {

  final Core_Items CoreItems = Core_Items.getInstance();
  final Core_Items2 CoreItems2 = Core_Items2.getInstance();

  @Override
  public void run() {

/** ================================= start CORE MOD =================================*/
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Bauxite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Molybdenite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Desh, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Plutonium, 1L),
        new int[]{5000, 2500, 1000, 750, 500, 150}, 600, 60);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustDeimos", 1),
        GT_Values.NI, GT_Values.NF, Materials.SulfuricAcid.getFluid(50L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Magnesite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Pitchblende, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Cooperite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neodymium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tungstate, 1L),
        new int[]{5000, 3000, 1000, 750, 650, 350}, 600, 60);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustCeres", 1), GT_Values.NI,
            GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Platinum, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Titanium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tungsten, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
            new int[]{5000, 2500, 1000, 750, 500, 150}, 800, 120);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIceEuropa", 1),
        GT_Values.NI, GT_Values.NF, Materials.Oxygen.getGas(50L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lazurite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Mithril, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Barium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
        new int[]{5000, 2500, 1250, 750, 500, 150}, 800, 120);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustEuropa", 1),
        GT_Values.NI, GT_Values.NF, Materials.Nitrogen.getGas(100L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iron, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Sodalite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Barium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
        new int[]{5000, 3000, 1000, 750, 500, 300}, 800, 120);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustGanymed", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chromite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Diamond, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Palladium, 1L),
        new int[]{5000, 3000, 1000, 750, 600, 250}, 800, 120);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustCallisto", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GregTech_API.getStackofAmountFromOreDict("dustIceCallisto", 1),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Topaz, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlueTopaz, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Lithium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tungsten, 1L),
        new int[]{1500, 3000, 1000, 900, 750, 250}, 800, 120);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIo", 1), GT_Values.NI,
            GT_Values.NF, Materials.SulfuricGas.getGas(100L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ruby, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gold, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Iridium, 1L),
            new int[]{5000, 3000, 1000, 750, 500, 250}, 1000, 256);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustVenus", 1), GT_Values.NI,
            GT_Values.NF, Materials.CarbonDioxide.getGas(500L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Carbon, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Scheelite, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Amethyst, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.GarnetRed, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Mytryl, 1L),
            new int[]{10000, 3000, 1000, 750, 500, 250}, 1000, 256);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1),
        GT_Values.NI, GT_Values.NF, Materials.Helium_3.getGas(50L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Vanadium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungstate, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Titanium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ruby, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Diamond, 1L),
        new int[]{5000, 3000, 1000, 750, 500, 250}, 1000, 256);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIceEnceladus", 1),
            GT_Values.NI, GT_Values.NF, Materials.Oxygen.getGas(150L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MysteriousCrystal, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ledox, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
            new int[]{5000, 3000, 1000, 750, 400, 200}, 1200, 480);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustEnceladus", 1),
        GT_Values.NI, GT_Values.NF, Materials.Nitrogen.getGas(150L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Opal, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
        new int[]{5000, 3000, 1000, 750, 400, 100}, 1200, 480);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustTitan", 1), GT_Values.NI,
            GT_Values.NF, Materials.Methane.getGas(100L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Emerald, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
            new int[]{5000, 2500, 1000, 900, 500, 200}, 1200, 480);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustOberon", 1),
        GT_Values.NI, GT_Values.NF, Materials.Argon.getGas(50L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium235, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Plutonium241, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
        new int[]{4000, 2000, 800, 300, 150, 150}, 1200, 480);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1),
        GT_Values.NI, GT_Values.NF, Materials.Argon.getGas(50L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Desh, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Chrome, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Osmium, 1L),
        new int[]{4000, 2000, 1000, 750, 500, 350}, 1200, 480);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustTriton", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Niobium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Yttrium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1L),
        new int[]{5000, 3000, 1000, 750, 500, 350}, 1400, 1024);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustProteus", 1),
        GT_Values.NI, GT_Values.NF, Materials.Radon.getGas(10L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Diamond, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Uranium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Plutonium, 1L),
        new int[]{5000, 2500, 1000, 750, 500, 350}, 1400, 1024);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ledox, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
        new int[]{5000, 2500, 1250, 750, 500, 400}, 1600, 1920);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustPluto", 1), GT_Values.NI,
            GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.GarnetRed, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.GarnetYellow, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1L),
            new int[]{5000, 2500, 850, 500, 500, 300}, 1600, 1920);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustMakeMake", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetRed, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetYellow, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Yttrium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Niobium, 1L),
        new int[]{2500, 2500, 1000, 750, 500, 350}, 1600, 1920);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustHaumea", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Lanthanum, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Caesium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Cerium, 1L),
        new int[]{5000, 2500, 850, 750, 500, 450}, 1600, 1920);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustSurfaceCentauriA", 1),
            GT_Values.NI, GT_Values.NF, Materials.Mercury.getFluid(100L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Iridium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L),
            new int[]{5000, 3000, 1000, 1000, 100, 50}, 1800, 4096);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustCentauriA", 1),
        GT_Values.NI, GT_Values.NF, Materials.Mercury.getFluid(200L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neutronium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L),
        new int[]{5000, 2000, 500, 2500, 150, 80}, 1800, 4096);
    GT_Values.RA
        .addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustVegaB", 1), GT_Values.NI,
            GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium235, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium241, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Europium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadria, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DraconiumAwakened, 1L),
            new int[]{5000, 3000, 1500, 800, 500, 50}, 1800, 4096);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustBarnardaE", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
        new int[]{2500, 2000, 1500, 750, 250, 250}, 1800, 4096);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustBarnardaF", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
        new int[]{2500, 2000, 1500, 750, 250, 250}, 1800, 4096);
    GT_Values.RA.addCentrifugeRecipe(GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1),
        GT_Values.NI, GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Draconium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Trinium, 1L),
        new int[]{5000, 2500, 1000, 750, 150, 50}, 1800, 4096);
    GT_Values.RA
        .addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrotine, 8L),
            GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrum, 1L), GT_Values.NI,
            GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 10000}, 400, 480);
    GT_Values.RA.addCentrifugeRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlackPlutonium, 1L), GT_Values.NI,
        GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.CosmicNeutronium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.CosmicNeutronium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.CosmicNeutronium, 1L),
        GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{1000, 500, 100}, 200, 500000);

    GT_Values.RA
        .addCentrifugeRecipe(CoreItems.getRecipe(31, 1), GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Clay, 2L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Brick, 1L), GT_Values.NI,
            GT_Values.NI, GT_Values.NI, new int[]{10000, 9000, 7500}, 400, 30);
    GT_Values.RA
        .addCentrifugeRecipe(CoreItems.getRecipe(32, 1), GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Brick, 2L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Stone, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.SiliconDioxide, 1L),
            GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000, 7500, 6000}, 400, 30);

    GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCgrass", 1L),
        GT_Values.NI, GT_Values.NF, GT_Values.NF, CoreItems2.getRecipe(151, 1),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
        GT_ModHandler.getModItem("minecraft", "sand", 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI,
        new int[]{5000, 1000, 5000}, 400, 8);
    GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdirt", 1L),
        GT_Values.NI, GT_Values.NF, GT_Values.NF, CoreItems2.getRecipe(151, 1),
        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
        GT_ModHandler.getModItem("minecraft", "sand", 1L), GT_Values.NI, GT_Values.NI, GT_Values.NI,
        new int[]{2500, 1000, 5000}, 400, 8);
    GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 1L),
        GT_Values.NI, GT_Values.NF, Materials.Radon.getGas(60L), CoreItems2.getRecipe(151, 1),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Carbon, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 1L), GT_Values.NI, GT_Values.NI,
        GT_Values.NI, new int[]{3750, 2500, 2500}, 400, 8);
    GT_Values.RA
        .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelion3", 64L),
            GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
            GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L),
            CoreItems2.getRecipe(151, 16),
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
            GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);
    GT_Values.RA.addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCreed", 64L),
        GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
        GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L), CoreItems2.getRecipe(151, 16),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
        GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);
    GT_Values.RA
        .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelions", 64L),
            GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
            GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L),
            CoreItems2.getRecipe(151, 16),
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
            GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);
    GT_Values.RA
        .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelions", 64L, 1),
            GT_Values.NI, GT_Values.NF, Materials.Biomass.getGas(1000L),
            GT_ModHandler.getModItem("IC2", "itemFuelPlantBall", 64L),
            CoreItems2.getRecipe(151, 16),
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 4L), GT_Values.NI,
            GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 10000}, 400, 8);

    GT_Values.RA.addCentrifugeRecipe(
        GT_OreDictUnificator.get(OrePrefixes.dust.get(Materials.Orichalcum), 4L), GT_Values.NI,
        GT_Values.NF, GT_Values.NF,
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Trinium, 1L),
        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Oriharukon, 1L), GT_Values.NI,
        GT_Values.NI, new int[]{10000, 10000, 10000, 10000}, 300, 122880);
    GT_Values.RA
        .addCentrifugeRecipe(GT_OreDictUnificator.get(OrePrefixes.dust.get(Materials.Mytryl), 6L),
            GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lead, 3L),
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum, 2L),
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Draconium, 1L), GT_Values.NI,
            GT_Values.NI, GT_Values.NI, new int[]{10000, 10000, 5000}, 400, 1920);

    /* ================================= end CORE MOD =================================*/
/** ================================= start GALAXYSPACE =================================*/
    GT_Values.RA
        .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L, 0),
            GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Platinum, 1L), null, null,
            new int[]{10000, 7500, 6000, 5000}, 400, 120);
    GT_Values.RA
        .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L, 1),
            GT_Values.NI, GT_Values.NF, GT_Values.NF,
            GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1L),
            GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1L), null, null,
            new int[]{10000, 7500, 6000, 5000}, 500, 256);

    /* ================================= end GALAXYSPACE =================================*/

  }
}
