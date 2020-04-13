package com.impact.loader;


import com.impact.mods.GregTech.GTregister.GT_ItemRegister;
import com.impact.mods.GregTech.GTregister.GT_Machines_BasicRegister;
import com.impact.mods.GregTech.GTregister.GT_Machines_MultiRegister;
import com.impact.mods.GregTech.GTregister.GT_WorldGenRegister;
import com.impact.recipes.*;
import com.impact.mods.GregTech.casings.GT_Loader_Casings;
import com.impact.recipes.debug.DEBUG_Recipe;
import com.impact.recipes.machines.*;

public class GT_ModLoader {

	private static final GT_ItemRegister ItemLoader = new GT_ItemRegister();
	private static final GT_Loader_Casings CasingsLoader = new GT_Loader_Casings();
	private static final GT_Machines_MultiRegister MachineMultiLoader = new GT_Machines_MultiRegister();
	private static final GT_Machines_BasicRegister MachineBasicLoader = new GT_Machines_BasicRegister();
	private static final HandRecipe CraftingRecipeLoader = new HandRecipe();
	private static final GT_WorldGenRegister Worldgenloader = new GT_WorldGenRegister();

	private static final DEBUG_Recipe DEBUG_Recipe = new DEBUG_Recipe();
	private static final CentrifugeRecipe CentrifugeRecipe = new CentrifugeRecipe();
	private static final PulveriserRecipe PulveriserRecipe = new PulveriserRecipe();
	private static final LaserEngraverRecipe LaserEngraverRecipe = new LaserEngraverRecipe();
	private static final FormingPressRecipe FormingPressRecipe = new FormingPressRecipe();
	private static final ChemicalBathRecipe ChemicalBathRecipe = new ChemicalBathRecipe();
	private static final AssemblerRecipe AssemblerRecipe = new AssemblerRecipe();
	private static final FreezSolidifierRecipe FreezSolidifierRecipe = new FreezSolidifierRecipe();
	private static final Printer3DRecipe Printer3DRecipe = new Printer3DRecipe();
	private static final BlastSmelterRecipe BlastSmelterRecipe = new BlastSmelterRecipe();
	private static final ComponentAssemblerRecipe ComponentAssemblerRecipe = new ComponentAssemblerRecipe();
	private static final CompessorRecipe CompessorRecipe = new CompessorRecipe();
	private static final AlloySmelterRecipe AlloySmelterRecipe = new AlloySmelterRecipe();
	private static final MixerRecipe MixerRecipe = new MixerRecipe();
	private static final EBFRecipe EBFRecipe = new EBFRecipe();

	public static void run()
    {
		ItemLoader.run();
		CasingsLoader.run();
		MachineMultiLoader.run();
		MachineBasicLoader.run();
		CraftingRecipeLoader.run();
		Worldgenloader.run();
	/** ========================= */
		DEBUG_Recipe.run();
		CentrifugeRecipe.run();
		PulveriserRecipe.run();
		LaserEngraverRecipe.run();
		FormingPressRecipe.run();
		ChemicalBathRecipe.run();
		AssemblerRecipe.run();
		FreezSolidifierRecipe.run();
		Printer3DRecipe.run();
		BlastSmelterRecipe.run();
		ComponentAssemblerRecipe.run();
		CompessorRecipe.run();
		AlloySmelterRecipe.run();
		MixerRecipe.run();
		EBFRecipe.run();
    }
}
