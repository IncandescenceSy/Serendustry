package serendustry.machine;

import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.BlockWireCoil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;

public class MetaTileEntityGiantFractionatingColumn extends RecipeMapMultiblockController {

    public MetaTileEntityGiantFractionatingColumn(ResourceLocation rl) {
        super(rl, SerendustryRecipeMaps.GIANT_FRACTIONATING_COLUMN_RECIPES);
    }

    @Override
    public MetaTileEntityGiantFractionatingColumn createMetaTileEntity(IGregTechTileEntity te) {
        return new MetaTileEntityGiantFractionatingColumn(metaTileEntityId);
    }

    @Override
    public @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("YYYY#YYYY", "YYY###YYY", "YY#####YY", "Y#######Y", "Y#######Y", "#########", "#########", "#########", "#########", "#########", "#########", "YYYY#YYYY", "YYY###YYY", "YY#####YY", "Y#######Y", "Y#######Y")
                .aisle("YXXXXXXXY", "YXXXXXXXY", "YXXXXXXXY", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#CCCCCCC#", "#XXXXXXX#", "#CCCCCCC#", "#XXXXXXX#", "#XXXXXXX#", "YXXXXXXXY", "YXXXXXXXY", "Y#######Y", "#########", "#########")
                .aisle("YXXXXXXXY", "YXXXXXXXY", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#XXXXXXX#", "YXXXXXXXY", "YXXXXXXXY", "#########", "#########", "#########")
                .aisle("YXXXXXXXY", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#XXXXXXX#", "YXXXXXXXY", "#XXXXXXX#", "#########", "#########", "#########")
                .aisle("#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#########", "#########", "#########")
                .aisle("YXXXXXXXY", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#XXXXXXX#", "YXXXXXXXY", "#XXXXXXX#", "#########", "#########", "#########")
                .aisle("YXXXXXXXY", "YXXXXXXXY", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#C#####C#", "#XXXXXXX#", "#XXXXXXX#", "YXXXXXXXY", "YXXXXXXXY", "#########", "#########", "#########")
                .aisle("YXXXXXXXY", "YXXXSXXXY", "YXXXXXXXY", "#XXXXXXX#", "#XXXXXXX#", "#XXXXXXX#", "#CCCCCCC#", "#XXXXXXX#", "#CCCCCCC#", "#XXXXXXX#", "#XXXXXXX#", "YXXXXXXXY", "YXXXXXXXY", "Y#######Y", "#########", "#########")
                .aisle("YYYY#YYYY", "YYY###YYY", "YY#####YY", "Y#######Y", "Y#######Y", "#########", "#########", "#########", "#########", "#########", "#########", "YYYY#YYYY", "YYY###YYY", "YY#####YY", "Y#######Y", "Y#######Y")

                .where('S', selfPredicate())
                .where('X', states(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PTFE_INERT_CASING)).setMinGlobalLimited(530))
                .where('Y', states(getCasingState()).setMinGlobalLimited(134).or(autoAbilities()))
                .where('C', states(MetaBlocks.WIRE_COIL.getState(BlockWireCoil.CoilType.TRITANIUM)))
                .where('#', air())
                .build();
    }

    public ICubeRenderer getBaseTexture(@Nullable IMultiblockPart part) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    // todo: add custom ??? Casings - Pink
    private IBlockState getCasingState() {
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.IV);
    }
}
