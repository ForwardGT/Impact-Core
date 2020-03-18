package com.gwppcore.modChest;

/*
 * Created by WanionCane(https://github.com/WanionCane).
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@SideOnly(Side.CLIENT)
public class Renderer_BaseChest extends TileEntitySpecialRenderer
{
	public static final Renderer_BaseChest instance = new Renderer_BaseChest();

	private ModelChest modelChest = new ModelChest();

	private Renderer_BaseChest() {}

	public void renderTileEntityAt(final TileEntity tileEntity, final double x, final double y, final double z, final float distance)
	{
		final TE_BaseChest TEBaseChest = (TE_BaseChest) tileEntity;
		bindTexture(TEBaseChest.getTexture());
		GL11.glPushMatrix();
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslatef((float) x, (float) y + 1.0F, (float) z + 1.0F);
		GL11.glScalef(1.0F, -1.0F, -1.0F);
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);

		GL11.glRotatef(TEBaseChest.hasWorldObj() ? TEBaseChest.getFacingSide() : -90, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		float f1 = TEBaseChest.prevLidAngle + (TEBaseChest.lidAngle - TEBaseChest.prevLidAngle) * distance;

		f1 = 1.0F - f1;
		f1 = 1.0F - f1 * f1 * f1;
		modelChest.chestLid.rotateAngleX = -(f1 * (float)Math.PI / 2.0F);
		modelChest.renderAll();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}
}