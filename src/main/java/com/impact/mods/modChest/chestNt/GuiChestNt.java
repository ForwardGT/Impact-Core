package com.impact.mods.modChest.chestNt;

import com.impact.System.Refstrings;
import com.impact.mods.modChest.BASE.Gui_BaseChest;
import com.impact.mods.modChest.BASE.TE_BaseChest;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public final class GuiChestNt extends Gui_BaseChest
{
	private final TEChestNt TEChestNt;

	public GuiChestNt(@Nonnull final TEChestNt TEChestNt, final InventoryPlayer inventoryPlayer)
	{
		super(new ContainerChestNt(TEChestNt, inventoryPlayer));
		this.TEChestNt = TEChestNt;
	}

	@Nonnull
	@Override
	protected TE_BaseChest getTileEntity()
	{
		return TEChestNt;
	}
	protected ResourceLocation getPathTexture(){
		return new ResourceLocation(Refstrings.MODID, "textures/gui/ChestNt.png");
	}
	protected int getXSize(){
		return 428;
	}
	protected int getYSize(){
		return 275;
	}
	protected int getScale(){
		return 500;
	}
	protected int getNamedPos(){
		return 8;
	}

}