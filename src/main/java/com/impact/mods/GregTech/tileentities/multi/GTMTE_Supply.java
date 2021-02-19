package com.impact.mods.GregTech.tileentities.multi;

import static com.impact.loader.ItemRegistery.IGlassBlock;

import com.impact.mods.GregTech.blocks.Casing_Helper;
import com.impact.mods.GregTech.gui.GUI_BASE;
import com.impact.mods.GregTech.tileentities.multi.debug.GT_MetaTileEntity_MultiParallelBlockBase;
import com.impact.util.MultiBlockTooltipBuilder;
import com.impact.util.Vector3i;
import com.impact.util.Vector3ic;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.objects.GT_RenderedTexture;
import gregtech.api.util.GT_Recipe;
import gregtech.api.util.GT_Utility;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.input.Keyboard;

public class GTMTE_Supply extends GT_MetaTileEntity_MultiParallelBlockBase {

  public static String mModed;
  Block CASING = Casing_Helper.sCaseCore1;
  byte CASING_META = 10;
  ITexture INDEX_CASE = Textures.BlockIcons.casingTexturePages[3][CASING_META];
  int CASING_TEXTURE_ID = CASING_META + 128 * 3;
  private int mLevel = 0;

  public GTMTE_Supply(int aID, String aName, String aNameRegional) {
    super(aID, aName, aNameRegional);
  }

  public GTMTE_Supply(String aName) {
    super(aName);
  }

  @Override
  public ITexture[] getTexture(final IGregTechTileEntity aBaseMetaTileEntity, final byte aSide,
      final byte aFacing,
      final byte aColorIndex, final boolean aActive, final boolean aRedstone) {
    return aSide == 1
        ? new ITexture[]{INDEX_CASE, new GT_RenderedTexture(
        aActive
            ? Textures.BlockIcons.MP1a
            : Textures.BlockIcons.MP1)}
        : new ITexture[]{INDEX_CASE};
  }

  @Override
  public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
    return new GTMTE_Supply(this.mName);
  }

  @Override
  public String[] getDescription() {
    final MultiBlockTooltipBuilder b = new MultiBlockTooltipBuilder();
    b
        .addInfo("One-block machine analog")
        .addParallelInfo(1, 256)
        .addInfo("Parallel Point will upped Upgrade Casing")
        .addInfo("Upgrade Casing must be filled in completely")
        .addTypeMachine("Autoclave, Dust Washer, Ore Washer, Chemical Bath")
        .addScrew()
        .addSeparatedBus()
        .addSeparator()
        .addController()
        .addEnergyHatch("Any casing")
        .addMaintenanceHatch("Any casing")
        .addInputBus("Any casing (max x6)")
        .addOutputBus("Any casing (max x3)")
        .addInputHatch("Any casing (max x3)")
        .addCasingInfo("Supply Production Casing")
        .signAndFinalize(": " + EnumChatFormatting.RED + "IMPACT");
    if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
      return b.getInformation();
    } else {
      return b.getStructureInformation();
    }
  }

  @Override
  public Object getClientGUI(int aID, InventoryPlayer aPlayerInventory,
      IGregTechTileEntity aBaseMetaTileEntity) {
    return new GUI_BASE(aPlayerInventory, aBaseMetaTileEntity, getLocalName(),
        "MultiParallelBlockGUI.png", mModed);

  }

  @Override
  public GT_Recipe.GT_Recipe_Map getRecipeMap() {
    return mMode == 0 ? GT_Recipe.GT_Recipe_Map.sAutoclaveRecipes
        : mMode == 1 ? GT_Recipe.GT_Recipe_Map.sDustWashRecipes :
            mMode == 2 ? GT_Recipe.GT_Recipe_Map.sOreWasherRecipes
                : GT_Recipe.GT_Recipe_Map.sChemicalBathRecipes;
  }

  public boolean checkMachine(IGregTechTileEntity thisController, ItemStack guiSlotItem) {
    // Вычисляем вектор направления, в котором находится задняя поверхность контроллера
    final Vector3ic forgeDirection = new Vector3i(
        ForgeDirection.getOrientation(thisController.getBackFacing()).offsetX,
        ForgeDirection.getOrientation(thisController.getBackFacing()).offsetY,
        ForgeDirection.getOrientation(thisController.getBackFacing()).offsetZ);

    int minCasingAmount = 12; // Минимальное количество кейсов
    boolean formationChecklist = true; // Если все ок, машина собралась

    for (byte X = -2; X <= 2; X++) {
      for (byte Y = -2; Y <= 2; Y++) {
        if (X == 0 && Y == 0) {
          continue;
        }
        if ((X == 2 || X == -2) && (Y == 2 || Y == -2)) {
          continue;
        }

        final Vector3ic offset = rotateOffsetVector(forgeDirection, X, 0, Y);
        IGregTechTileEntity currentTE = thisController
            .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
        if (!super.addMaintenanceToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addInputToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addMufflerToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addEnergyInputToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addOutputToMachineList(currentTE, CASING_TEXTURE_ID)) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z())
              == CASING_META)) {
            minCasingAmount--;
          } else {
            formationChecklist = false;
          }
        }
      }
    }
    for (byte X = -2; X <= 2; X++) {
      for (byte Y = -2; Y <= 2; Y++) {
        for (byte Z = -1; Z >= -3; Z--) {

          if ((X == 2 || X == -2) && (Y == 2 || Y == -2)) {
            continue;
          }

          if (X == 1 && Y == 1 || X == -1 && Y == -1 || X == 1 && Y == -1 || X == -1 && Y == 1
              || X == 0 && Y == 1 || X == 0 && Y == -1 || X == 1 && Y == 0 || X == -1 && Y == 0) {
            continue;
          }

          final Vector3ic offset = rotateOffsetVector(forgeDirection, X, Z, Y);

          String glass = thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
              .getUnlocalizedName();
          if (Y == 2 && X == 1 || Y == -2 && X == 1 || Y == 2 && X == -1 || Y == -2 && X == -1
              || Y == 1 && X == 2 || Y == -1 && X == 2 || Y == 1 && X == -2 || Y == -1 && X == -2) {
            if (thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == IGlassBlock) {
            } else {
              formationChecklist = false;
            }
            continue;
          }

          if (X == 0 && Y == 0) {
            if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 0)) {
              this.mLevel = 4;
            } else if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 1)) {
              this.mLevel = 16;
            } else if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 2)) {
              this.mLevel = 64;
            } else if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 3)) {
              this.mLevel = 256;
            } else if (thisController.getAirOffset(offset.x(), offset.y(), offset.z())) {
              this.mLevel = 1;
            } else {
              formationChecklist = false;
            }
            continue;
          }

          IGregTechTileEntity currentTE = thisController
              .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
          if (!super.addMaintenanceToMachineList(currentTE, CASING_TEXTURE_ID)
              && !super.addInputToMachineList(currentTE, CASING_TEXTURE_ID)
              && !super.addMufflerToMachineList(currentTE, CASING_TEXTURE_ID)
              && !super.addEnergyInputToMachineList(currentTE, CASING_TEXTURE_ID)
              && !super.addOutputToMachineList(currentTE, CASING_TEXTURE_ID)) {

            if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z())
                == CASING_META)) {
              minCasingAmount--;
            } else {
              formationChecklist = false;
            }
          }
        }
      }
    }
    for (byte X = -2; X <= 2; X++) {
      for (byte Y = -2; Y <= 2; Y++) {
        if (X == 0 && Y == 0) {
          continue;
        }
        if ((X == 2 || X == -2) && (Y == 2 || Y == -2)) {
          continue;
        }

        final Vector3ic offset = rotateOffsetVector(forgeDirection, X, -4, Y);
        IGregTechTileEntity currentTE = thisController
            .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
        if (!super.addMaintenanceToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addInputToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addMufflerToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addEnergyInputToMachineList(currentTE, CASING_TEXTURE_ID)
            && !super.addOutputToMachineList(currentTE, CASING_TEXTURE_ID)) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z())
              == CASING_META)) {
            minCasingAmount--;
          } else {
            formationChecklist = false;
          }
        }
      }
    }

    setParallel(this.mLevel);

    if (this.mInputBusses.size() > 6) {
      formationChecklist = false;
    }
    if (this.mInputHatches.size() > 3) {
      formationChecklist = false;
    }
    if (this.mOutputBusses.size() > 3) {
      formationChecklist = false;
    }
    if (this.mEnergyHatches.size() > 4) {
      formationChecklist = false;
    }
    if (this.mMaintenanceHatches.size() != 1) {
      formationChecklist = false;
    }

    return formationChecklist;
  }

  @Override
  public boolean checkRecipe(ItemStack itemStack) {
    return impactRecipe(itemStack, mLevel, true);
  }

  @Override
  public int getPollutionPerTick(ItemStack aStack) {
    return 0;
  }


  public void onScrewdriverRightClick(byte aSide, EntityPlayer aPlayer, float aX, float aY,
      float aZ) {
    if (aPlayer.isSneaking()) {
      ScrewClick(aSide, aPlayer, aX, aY, aZ);
    } else {
      mMode++;
    }
    if (mMode > 3) {
      mMode = 0;
    }
    mModed = (mMode == 0 ? " Autoclave "
        : mMode == 1 ? " Dust Washer " : mMode == 2 ? " Ore Washer " : " Chemical Bath ");
    GT_Utility.sendChatToPlayer(aPlayer,
        "Now" + EnumChatFormatting.YELLOW + mModed + EnumChatFormatting.RESET + "Mode");
  }

}