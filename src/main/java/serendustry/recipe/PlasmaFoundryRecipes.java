package serendustry.recipe;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import serendustry.machine.MetaTileEntityPlasmaFoundry;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static serendustry.item.SerendustryMetaItems.*;
import static serendustry.item.material.SerendustryMaterials.*;
import static serendustry.machine.SerendustryMetaTileEntities.PLASMA_FOUNDRY;
import static serendustry.machine.SerendustryRecipeMaps.PLASMA_FOUNDRY_RECIPES;

public class PlasmaFoundryRecipes {

    public static void init() {
        multiRecipes();
        catalysts();
        catalystRecipes();
        alloyRecipes();
    }

    private static void catalysts() {
        MetaItem<?>.MetaValueItem[] metaItemCatalysts = new MetaItem.MetaValueItem[] {
                CATALYST_STEELS, CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS, CATALYST_GOLD_ALLOYS, CATALYST_BATTERY_ALLOY, CATALYST_SOLDERING_ALLOYS, CATALYST_PLATINUM_GROUP_ALLOYS, CATALYST_NAQUADAH_ALLOYS, CATALYST_SUPERCONDUCTORS, CATALYST_HAM_ALLOY, CATALYST_ARCANITE
        };
        for(MetaItem<?>.MetaValueItem item : metaItemCatalysts) {
            PLASMA_FOUNDRY_RECIPES.registerCatalyst(item.getStackForm(), 50);
        }
    }

    private static void multiRecipes() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(circuit, MarkerMaterials.Tier.UV, 32)
                .input(ROBOT_ARM_ZPM, 8)
                .input(ELECTRIC_PUMP_ZPM, 16)
                .input(ELECTRIC_PISTON_ZPM, 16)
                .input(frameGt, Tritanium, 16)
                .input(plate, Duranium, 64)
                .input(plate, Osmiridium, 64)
                .input(stick, Americium, 64)
                .input(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .input(wireGtHex, HSSG, 64)
                .fluidInputs(HighGradeSolderingAlloy.getFluid(144 * 16),
                        Europium.getFluid(144 * 16))
                .output(PLASMA_FOUNDRY)
                .duration(6400).EUt(VA[UV]).buildAndRegister();
    }

    private static void catalystRecipes() {
        // todo: Add catalysts -- they go into the controller (only 1 at once, cannot be taken out) and lose durability with each craft
    }

    private static void alloyRecipes() {

        // Recipe duration: Original 1x EBF blast time * 20 * quantity / 2 once for every tier up to UV / 4 an extra time

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144 * 256),
                        Oxygen.getPlasma(100))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(Steel.getFluid(144 * 256))
                .duration(25*20*256/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(BlackBronze.getFluid(144 * 25),
                        Nickel.getFluid(144 * 25),
                        Steel.getFluid(144 * 75),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_COPPER_ALLOYS)
                .fluidOutputs(BlackSteel.getFluid(144 * 125))
                .duration(76*20*125/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144 * 84),
                        Nickel.getFluid(144 * 14),
                        Manganese.getFluid(144 * 14),
                        Chrome.getFluid(144 * 14),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(StainlessSteel.getFluid(144 * 126))
                .duration(55*20*126/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(RoseGold.getFluid(144 * 8),
                        Brass.getFluid(144 * 8),
                        BlackSteel.getFluid(144 * 32),
                        Steel.getFluid(144 * 16),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_COPPER_ALLOYS, CATALYST_GOLD_ALLOYS)
                .fluidOutputs(BlueSteel.getFluid(144 * 128))
                .duration(50*20*128/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(SterlingSilver.getFluid(144 * 8),
                        BismuthBronze.getFluid(144 * 8),
                        BlackSteel.getFluid(144 * 32),
                        Steel.getFluid(144 * 16),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_COPPER_ALLOYS)
                .fluidOutputs(RedSteel.getFluid(144 * 128))
                .duration(50*20*128/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Iron.getFluid(144 * 32),
                        Tungsten.getFluid(144 * 32),
                        Iron.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(TungstenSteel.getFluid(144 * 64))
                .duration(50*20*64/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(TungstenSteel.getFluid(144 * 40),
                        Chrome.getFluid(144 * 8),
                        Molybdenum.getFluid(144 * 16),
                        Vanadium.getFluid(144 * 8),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(HSSG.getFluid(144 * 72))
                .duration(65*20*72/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(HSSG.getFluid(144 * 48),
                        Cobalt.getFluid(144 * 8),
                        Manganese.getFluid(144 * 8),
                        Silicon.getFluid(144 * 8),
                        Oxygen.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(HSSE.getFluid(144 * 72))
                .duration(70*20*72/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(HSSG.getFluid(144 * 48),
                        Osmium.getFluid(144 * 8),
                        Iridium.getFluid(144 * 16),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_STEELS, CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(HSSS.getFluid(144 * 72))
                .duration(75*20*72/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Manganese.getFluid(144 * 32),
                        Phosphorus.getFluid(144 * 32),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS)
                .fluidOutputs(ManganesePhosphide.getFluid(144 * 64))
                .duration(50*20*64/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Magnesium.getFluid(144 * 20),
                        Boron.getFluid(144 * 40),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS)
                .fluidOutputs(MagnesiumDiboride.getFluid(144 * 60))
                .duration(50*20*60/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Barium.getFluid(144 * 8),
                        Calcium.getFluid(144 * 8),
                        Copper.getFluid(144 * 12),
                        Mercury.getFluid(4000),
                        Oxygen.getPlasma(4000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_COPPER_ALLOYS)
                .fluidOutputs(MercuryBariumCalciumCuprate.getFluid(144 * 64))
                .duration(75*20*64/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(144 * 16),
                        Platinum.getFluid(144 * 48),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(UraniumTriplatinum.getFluid(144 * 64))
                .duration(75*20*64/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Samarium.getFluid(144 * 16),
                        Iron.getFluid(144 * 16),
                        Arsenic.getFluid(144 * 16),
                        Oxygen.getPlasma(4000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS)
                .fluidOutputs(SamariumIronArsenicOxide.getFluid(144 * 64))
                .duration(75*20*64/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Indium.getFluid(144 * 16),
                        Tin.getFluid(144 * 8),
                        Barium.getFluid(144 * 8),
                        Titanium.getFluid(144 * 4),
                        Copper.getFluid(144 * 28),
                        Oxygen.getPlasma(8000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS)
                .fluidOutputs(IndiumTinBariumTitaniumCuprate.getFluid(144 * 64))
                .duration(50*20*64/2/2/2/4).EUt(VA[UV]).buildAndRegister();
        

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Uranium238.getFluid(144 * 16),
                        Rhodium.getFluid(144 * 16),
                        Naquadah.getFluid(144 * 32),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(UraniumRhodiumDinaquadide.getFluid(144 * 64))
                .duration(75*20*64/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(NaquadahEnriched.getFluid(144 * 27),
                        Trinium.getFluid(144 * 18),
                        Europium.getFluid(144 * 12),
                        Duranium.getFluid(144 * 6),
                        Nickel.getPlasma(1000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(EnrichedNaquadahTriniumEuropiumDuranide.getFluid(144 * 60))
                .duration(60*20*60/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Ruthenium.getFluid(144 * 5),
                        Trinium.getFluid(144 * 10),
                        Americium.getFluid(144 * 5),
                        Neutronium.getFluid(144 * 10),
                        Oxygen.getPlasma(12000))
                .foundryCatalyst(CATALYST_SUPERCONDUCTORS, CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(RutheniumTriniumAmericiumNeutronate.getFluid(144 * 70))
                .duration(50*20*70/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 384),
                        Tin.getFluid(144 * 128),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS)
                .fluidOutputs(Bronze.getFluid(144 * 512))
                .duration(15*20*512/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 384),
                        Zinc.getFluid(144 * 128),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(Brass.getFluid(144 * 512))
                .duration(15*20*512/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 512),
                        Redstone.getFluid(144 * 2048),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(RedAlloy.getFluid(144 * 512))
                .duration(15*20*512/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 512),
                        Electrotine.getFluid(144 * 2048),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(BlueAlloy.getFluid(144 * 512))
                .duration(15*20*512/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 256),
                        Nickel.getFluid(144 * 256),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(Potin.getFluid(144 * 512))
                .duration(15*20*512/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 336),
                        Tin.getFluid(144 * 112),
                        Lead.getFluid(144 * 56),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_TIN_ALLOYS)
                .fluidOutputs(Potin.getFluid(144 * 504))
                .duration(15*20*504/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Copper.getFluid(144 * 75),
                        Electrum.getFluid(144 * 50),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_GOLD_ALLOYS)
                .fluidOutputs(BlackBronze.getFluid(144 * 125))
                .duration(50*20*125/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Bismuth.getFluid(144 * 25),
                        Brass.getFluid(144 * 100),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(BismuthBronze.getFluid(144 * 125))
                .duration(50*20*125/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Silver.getFluid(144 * 100),
                        Copper.getFluid(144 * 25),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(SterlingSilver.getFluid(144 * 125))
                .duration(50*20*125/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(144 * 100),
                        Copper.getFluid(144 * 25),
                        Helium.getPlasma(1000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS, CATALYST_GOLD_ALLOYS)
                .fluidOutputs(RoseGold.getFluid(144 * 125))
                .duration(50*20*125/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Gold.getFluid(144 * 256),
                        Silver.getFluid(144 * 256),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_GOLD_ALLOYS)
                .fluidOutputs(Electrum.getFluid(144 * 512))
                .duration(15*20*512/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Lead.getFluid(144 * 416),
                        Silver.getFluid(144 * 104),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_BATTERY_ALLOY)
                .fluidOutputs(BatteryAlloy.getFluid(144 * 520))
                .duration(15*20*520/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Tin.getFluid(144 * 312),
                        Lead.getFluid(144 * 156),
                        Antimony.getFluid(144 * 52),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_SOLDERING_ALLOYS)
                .fluidOutputs(SolderingAlloy.getFluid(144 * 520))
                .duration(15*20*520/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Cadmium.getFluid(144 * 32),
                        Antimony.getFluid(144 * 23),
                        Indium.getFluid(144 * 8),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_SOLDERING_ALLOYS)
                .fluidOutputs(HighGradeSolderingAlloy.getFluid(144 * 64))
                .duration(75*20*64/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Tin.getFluid(144 * 256),
                        Iron.getFluid(144 * 256),
                        Helium.getPlasma(100))
                .foundryCatalyst(CATALYST_TIN_ALLOYS)
                .fluidOutputs(TinAlloy.getFluid(144 * 512))
                .duration(15*20*512/2/2/2/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Ruthenium.getFluid(144 * 36),
                        Tungsten.getFluid(144 * 18),
                        Molybdenum.getFluid(144 * 9),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(RTMAlloy.getFluid(144 * 63))
                .duration(70*20*63/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Yttrium.getFluid(144 * 5),
                        Barium.getFluid(144 * 10),
                        Copper.getFluid(144 * 15),
                        Oxygen.getPlasma(6000))
                .foundryCatalyst(CATALYST_COPPER_ALLOYS)
                .fluidOutputs(YttriumBariumCuprate.getFluid(144 * 65))
                .duration(50*20*65/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Ruthenium.getFluid(144 * 40),
                        Iridium.getFluid(144 * 20),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(Ruridit.getFluid(144 * 60))
                .duration(80*20*60/2/2/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Osmium.getFluid(144 * 16),
                        Iridium.getFluid(144 * 48),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_PLATINUM_GROUP_ALLOYS)
                .fluidOutputs(Osmiridium.getFluid(144 * 64))
                .duration(50*20*64/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Naquadah.getFluid(144 * 32),
                        Trinium.getFluid(144 * 16),
                        Osmiridium.getFluid(144 * 16),
                        Iron.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(NaquadahAlloy.getFluid(144 * 64))
                .duration(50*20*64/2/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(RoseGold.getFluid(144 * 24),
                        Promethium.getFluid(144 * 16),
                        Naquadria.getFluid(144 * 16),
                        Thulium.getFluid(144 * 8),
                        Nickel.getPlasma(144 * 8),
                        Argon.getPlasma(1000))
                .foundryCatalyst(CATALYST_GOLD_ALLOYS, CATALYST_NAQUADAH_ALLOYS)
                .fluidOutputs(Hihiirokane.getFluid(144 * 64))
                .duration(100*20*64/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Tritanium.getFluid(144 * 24),
                        Darmstadtium.getFluid(144 * 16),
                        ALMST.getFluid(144 * 16),
                        HSSS.getFluid(144 * 8),
                        Nickel.getPlasma(144 * 8),
                        Iron.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_STEELS)
                .fluidOutputs(HalkonitePreparationBase.getFluid(144 * 64))
                .duration(100*20*64/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Holmium.getFluid(144 * 32),
                        Americium.getFluid(144 * 16),
                        Moscovium.getFluid(144 * 16),
                        Nickel.getPlasma(144 * 8),
                        Tin.getPlasma(144 * 8))
                .foundryCatalyst(CATALYST_HAM_ALLOY)
                .fluidOutputs(HAMAlloy.getFluid(144 * 64))
                .duration(100*20*64/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Flerovium.getFluid(144 * 32),
                        HighGradeSolderingAlloy.getFluid(144 * 24),
                        Darmstadtium.getFluid(144 * 8),
                        Nickel.getPlasma(144 * 8),
                        Nitrogen.getPlasma(1000))
                .foundryCatalyst(CATALYST_SOLDERING_ALLOYS)
                .fluidOutputs(SuperheavySolderingAlloy.getFluid(144 * 64))
                .duration(100*20*64/2/4).EUt(VA[UV]).buildAndRegister();

        PLASMA_FOUNDRY_RECIPES.recipeBuilder()
                .fluidInputs(Thorium.getFluid(144 * 108),
                        EnergyCrystal.getFluid(144 * 108),
                        OrdoCrystal.getFluid(144 * 27),
                        PerditioCrystal.getFluid(144 * 27),
                        Nickel.getPlasma(144 * 64),
                        Tin.getPlasma(144 * 64))
                .foundryCatalyst(CATALYST_ARCANITE)
                .fluidOutputs(Arcanite.getFluid(144 * 240))
                .duration(400000).EUt(VA[UEV]).buildAndRegister();
    }
}
