package serendustry.recipe;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static serendustry.item.material.SerendustryMaterials.*;

public class FerrofluidChain {
    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Iron)
                .fluidInputs(Iron3Chloride.getFluid(1000))
                .fluidOutputs(Iron2Chloride.getFluid(1000))
                .duration(80).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Iron)
                .fluidInputs(HydrochloricAcid.getFluid(1000),
                        Methanol.getFluid(1000))
                .fluidOutputs(Iron2Chloride.getFluid(1000))
                .circuitMeta(2)
                .duration(80).EUt(VA[LV]).buildAndRegister();

       /* DISTILLERY_RECIPES.recipeBuilder() TODO: fix this crashing
                .fluidInputs(SeedOil.getFluid(1000))
                .output(dust, StearicAcid)
                .circuitMeta(2)
                .duration(240).EUt(VA[LV]).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(SeedOil.getFluid(1000))
                .output(dust, StearicAcid)
                .circuitMeta(2)
                .duration(240).EUt(VA[LV]).buildAndRegister();*/

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, StearicAcid)
                .input(dust, CalciumChloride)
                .fluidOutputs(OleicAcid.getFluid(1000))
                .duration(240).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(OleicAcid.getFluid(500),
                        Hydrogen.getFluid(1000))
                .output(dust, StearicAcid)
                .duration(240).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Water.getFluid(1000),
                        OleicAcid.getFluid(1000),
                        Ammonia.getFluid(1000))
                .output(dust, AmmoniumOleate)
                .duration(240).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, AmmoniumOleate)
                .fluidInputs(DistilledWater.getFluid(1000),
                        Iron2Chloride.getFluid(1000),
                        Iron3Chloride.getFluid(1000),
                        HydrochloricAcid.getFluid(1000))
                .output(dust, MagneticNanoparticleMixture)
                .duration(480).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, MagneticNanoparticleMixture, 10)
                .fluidInputs(Kerosene.getFluid(1000))
                .fluidOutputs(Ferrofluid.getFluid(1000))
                .duration(2400).EUt(VA[ZPM]).buildAndRegister();
    }
}
