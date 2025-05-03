package serendustry.machine;

import static gregtech.api.util.RelativeDirection.DOWN;
import static gregtech.api.util.RelativeDirection.FRONT;
import static gregtech.api.util.RelativeDirection.LEFT;
import static serendustry.item.SerendustryMetaItems.*;

import java.io.IOException;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentBase;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.Widget;
import gregtech.api.gui.widgets.SlotWidget;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.Recipe;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextComponentUtil;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

public class MetaTileEntityPlasmaFoundry extends RecipeMapMultiblockController {

    private static final String NO_CATALYST = "serendustry.machine.plasma_foundry.no_catalyst";
    private final int CATALYST = 32842846;

    private ItemStackHandler controllerSlot;
    @NotNull
    private ItemStack catalyst = ItemStack.EMPTY;

    public MetaTileEntityPlasmaFoundry(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES);
        itemInventory = controllerSlot = new ItemStackHandler(1);
    }

    @Override
    public MetaTileEntityPlasmaFoundry createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityPlasmaFoundry(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public boolean checkRecipe(@NotNull Recipe recipe, boolean consumeIfSuccess) {
        ItemStack[] expectedCatalysts = recipe.getProperty(PlasmaFoundryCatalystProperty.getInstance(),
                new ItemStack[0]);
        if (expectedCatalysts.length != 0) {
            for (ItemStack expectedCatalyst : expectedCatalysts) {
                if (ItemStack.areItemsEqual(expectedCatalyst, this.catalyst)) {
                    if (consumeIfSuccess) {
                        this.catalyst.setCount(this.catalyst.getCount() - 1);
                        syncCatalyst();
                    }
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(LEFT, DOWN, FRONT)
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      A      ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      A      ",
                        "     AAA     ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "     AAA     ",
                        "    AAAAA    ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      B      ",
                        "      B      ",
                        "      D      ",
                        "    AAAAA    ",
                        "   AAAAAAA   ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      A      ",
                        "     B B     ",
                        "     B B     ",
                        "     B B     ",
                        "   A AAA A   ",
                        "  AAAAAAAAA  ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      A      ",
                        "     BAB     ",
                        "     B B     ",
                        "     B B     ",
                        "     B B     ",
                        "     B B     ",
                        "     A A     ",
                        "    B   B    ",
                        "    B A B    ",
                        "    B A B    ",
                        "  A AAAAA A  ",
                        " AAAAAAAAAAA ")
                .aisle(
                        "      B      ",
                        "      B      ",
                        "      A      ",
                        "     BCB     ",
                        "     B B     ",
                        "     B B     ",
                        "    CA AC    ",
                        "    BA AB    ",
                        "    B   B    ",
                        "    B A B    ",
                        "    B A B    ",
                        "    B A B    ",
                        "    A A A    ",
                        "   B  A  B   ",
                        "   B AAA B   ",
                        "   B AAA B   ",
                        " A AAAAAAA A ",
                        "AAAAAAAAAAAAA")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      A      ",
                        "     BAB     ",
                        "     B B     ",
                        "     B B     ",
                        "     B B     ",
                        "     B B     ",
                        "     A A     ",
                        "    B   B    ",
                        "    B A B    ",
                        "    B A B    ",
                        "  A AAAAA A  ",
                        " AAAAAAAAAAA ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "      A      ",
                        "     B B     ",
                        "     B B     ",
                        "     B B     ",
                        "   A AAA A   ",
                        "  AAAAAAAAA  ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      B      ",
                        "      B      ",
                        "      B      ",
                        "    AAAAA    ",
                        "   AAAAAAA   ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "     AAA     ",
                        "    AAAAA    ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      A      ",
                        "     AAA     ")
                .aisle(
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "             ",
                        "      A      ")
                .where('D', selfPredicate())
                .where('A',
                        states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PALLADIUM_SUBSTATION))
                                .setMinGlobalLimited(158).or(autoAbilities()))
                .where('B', frames(Materials.NaquadahAlloy))
                .where('C', states(Blocks.LAVA.getBlockState().getBaseState()))
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.PALLADIUM_SUBSTATION_CASING; // todo
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @NotNull List<String> tooltip,
                               boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.flavor"));
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.description1"));
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.description2"));
        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.description3"));
        String catalyst = I18n.format(NO_CATALYST);
        NBTTagCompound tag = stack.getTagCompound();
        if (tag != null) {
            ItemStack catalystStack = new ItemStack(tag.getCompoundTag("Catalyst"));
            if (!catalystStack.isEmpty()) {
                catalyst = catalystStack.getDisplayName();
            }
        }

        tooltip.add(I18n.format("serendustry.machine.plasma_foundry.catalyst") + " " + "§e" + catalyst + "§7");
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        TextComponentBase catalystText;
        if (catalyst.isEmpty()) {
            catalystText = TextComponentUtil.translationWithColor(TextFormatting.GRAY, NO_CATALYST);
        } else {
            catalystText = TextComponentUtil.stringWithColor(TextFormatting.GRAY, catalyst.getDisplayName());
        }

        MultiblockDisplayText.builder(textList, isStructureFormed())
                .setWorkingStatus(recipeMapWorkable.isWorkingEnabled(), recipeMapWorkable.isActive())
                .addEnergyUsageLine(getEnergyContainer())
                .addEnergyTierLine(GTUtility.getTierByVoltage(recipeMapWorkable.getMaxVoltage()))
                .addCustom(tl -> {
                    // Catalyst line
                    tl.add(TextComponentUtil.translationWithColor(
                            TextFormatting.GRAY,
                            "serendustry.machine.plasma_foundry.catalyst"));

                    tl.add(catalystText);
                })
                .addWorkingStatusLine()
                .addProgressLine(recipeMapWorkable.getProgressPercent());
    }

    @Override
    protected Widget getFlexButton(int x, int y, int width, int height) {
        return new SlotWidget(controllerSlot, 0, x, y, true, true).setBackgroundTexture(GuiTextures.SLOT);
    }

    protected ItemStack getStackInSlot() {
        return controllerSlot.getStackInSlot(0);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);
        GTUtility.writeItems(controllerSlot, "ControllerSlot", data);
        data.setTag("Catalyst", this.catalyst.writeToNBT(new NBTTagCompound()));
        return data;
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        GTUtility.readItems(controllerSlot, "ControllerSlot", data);
        this.catalyst = new ItemStack(data.getCompoundTag("Catalyst"));
    }

    @Override
    public void initFromItemStackData(NBTTagCompound data) {
        super.initFromItemStackData(data);
        this.catalyst = new ItemStack(data.getCompoundTag("Catalyst"));
    }

    @Override
    public void writeItemStackData(NBTTagCompound data) {
        super.writeItemStackData(data);
        data.setTag("Catalyst", this.catalyst.writeToNBT(new NBTTagCompound()));
    }

    @Override
    public void onRemoval() {
        Block.spawnAsEntity(getWorld(), getPos(), getStackInSlot());
    }

    @Override
    public void update() {
        super.update();
        if (getWorld().isRemote) return;
        if (this.catalyst.isEmpty()) {
            ItemStack stack = this.controllerSlot.getStackInSlot(0);
            if (SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES.isValidCatalyst(stack)) {
                this.catalyst = stack.copy();
                this.catalyst.setCount(SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES.getCatalystUses(stack));

                stack = stack.copy();
                stack.setCount(stack.getCount() - 1);
                this.controllerSlot.setStackInSlot(0, stack);

                syncCatalyst();
            }
        }
    }

    private void syncCatalyst() {
        writeCustomData(CATALYST, w -> w.writeItemStack(this.catalyst));
    }

    @Override
    public void receiveCustomData(int dataId, PacketBuffer buf) {
        super.receiveCustomData(dataId, buf);
        if (dataId == CATALYST) {
            try {
                catalyst = buf.readItemStack();
            } catch (IOException e) {
                throw new RuntimeException(e); // java...
            }
        }
    }
}
