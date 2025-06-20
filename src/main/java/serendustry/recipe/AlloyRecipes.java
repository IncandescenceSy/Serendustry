package serendustry.recipe;

import static gregicality.multiblocks.api.unification.GCYMMaterials.Zeron100;
import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.HV;
import static gregtech.api.GTValues.IV;
import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.LuV;
import static gregtech.api.GTValues.MAX;
import static gregtech.api.GTValues.MV;
import static gregtech.api.GTValues.OpV;
import static gregtech.api.GTValues.UEV;
import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UV;
import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.V;
import static gregtech.api.GTValues.VA;
import static gregtech.api.GTValues.ZPM;
import static gregtech.api.recipes.RecipeMaps.AUTOCLAVE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.EXTRACTOR_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FLUID_HEATER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FORMING_PRESS_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LASER_ENGRAVER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.VACUUM_RECIPES;
import static gregtech.api.unification.material.Materials.Air;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.AluminiumSulfite;
import static gregtech.api.unification.material.Materials.Americium;
import static gregtech.api.unification.material.Materials.Antimony;
import static gregtech.api.unification.material.Materials.Argon;
import static gregtech.api.unification.material.Materials.BasalticMineralSand;
import static gregtech.api.unification.material.Materials.BlackSteel;
import static gregtech.api.unification.material.Materials.Cadmium;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.Cerium;
import static gregtech.api.unification.material.Materials.Chlorine;
import static gregtech.api.unification.material.Materials.Chrome;
import static gregtech.api.unification.material.Materials.Copper;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.DistilledWater;
import static gregtech.api.unification.material.Materials.Dubnium;
import static gregtech.api.unification.material.Materials.Einsteinium;
import static gregtech.api.unification.material.Materials.Electrum;
import static gregtech.api.unification.material.Materials.EnderPearl;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Fermium;
import static gregtech.api.unification.material.Materials.Gadolinium;
import static gregtech.api.unification.material.Materials.Gallium;
import static gregtech.api.unification.material.Materials.GarnetSand;
import static gregtech.api.unification.material.Materials.Germanium;
import static gregtech.api.unification.material.Materials.GraniticMineralSand;
import static gregtech.api.unification.material.Materials.HSSG;
import static gregtech.api.unification.material.Materials.HSSS;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.Holmium;
import static gregtech.api.unification.material.Materials.HydrochloricAcid;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.Indium;
import static gregtech.api.unification.material.Materials.Invar;
import static gregtech.api.unification.material.Materials.Iron;
import static gregtech.api.unification.material.Materials.Kanthal;
import static gregtech.api.unification.material.Materials.Krypton;
import static gregtech.api.unification.material.Materials.Lava;
import static gregtech.api.unification.material.Materials.Lithium;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Manganese;
import static gregtech.api.unification.material.Materials.Mendelevium;
import static gregtech.api.unification.material.Materials.Mercury;
import static gregtech.api.unification.material.Materials.Methane;
import static gregtech.api.unification.material.Materials.Molybdenum;
import static gregtech.api.unification.material.Materials.Naquadah;
import static gregtech.api.unification.material.Materials.NaquadahAlloy;
import static gregtech.api.unification.material.Materials.NaquadahEnriched;
import static gregtech.api.unification.material.Materials.Naquadria;
import static gregtech.api.unification.material.Materials.NetherStar;
import static gregtech.api.unification.material.Materials.Nichrome;
import static gregtech.api.unification.material.Materials.Nickel;
import static gregtech.api.unification.material.Materials.Niobium;
import static gregtech.api.unification.material.Materials.NiobiumNitride;
import static gregtech.api.unification.material.Materials.Oganesson;
import static gregtech.api.unification.material.Materials.Osmiridium;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Phosphate;
import static gregtech.api.unification.material.Materials.Plutonium239;
import static gregtech.api.unification.material.Materials.Polonium;
import static gregtech.api.unification.material.Materials.Polyethylene;
import static gregtech.api.unification.material.Materials.Promethium;
import static gregtech.api.unification.material.Materials.Redstone;
import static gregtech.api.unification.material.Materials.Rhenium;
import static gregtech.api.unification.material.Materials.Rhodium;
import static gregtech.api.unification.material.Materials.RoseGold;
import static gregtech.api.unification.material.Materials.Rubidium;
import static gregtech.api.unification.material.Materials.Ruridit;
import static gregtech.api.unification.material.Materials.Ruthenium;
import static gregtech.api.unification.material.Materials.Rutherfordium;
import static gregtech.api.unification.material.Materials.Rutile;
import static gregtech.api.unification.material.Materials.Samarium;
import static gregtech.api.unification.material.Materials.SamariumMagnetic;
import static gregtech.api.unification.material.Materials.Scandium;
import static gregtech.api.unification.material.Materials.Silicon;
import static gregtech.api.unification.material.Materials.SiliconDioxide;
import static gregtech.api.unification.material.Materials.SolderingAlloy;
import static gregtech.api.unification.material.Materials.Steel;
import static gregtech.api.unification.material.Materials.SterlingSilver;
import static gregtech.api.unification.material.Materials.Stone;
import static gregtech.api.unification.material.Materials.Strontium;
import static gregtech.api.unification.material.Materials.Sulfur;
import static gregtech.api.unification.material.Materials.TinAlloy;
import static gregtech.api.unification.material.Materials.Titanium;
import static gregtech.api.unification.material.Materials.Trinium;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.material.Materials.Tungsten;
import static gregtech.api.unification.material.Materials.TungstenCarbide;
import static gregtech.api.unification.material.Materials.TungstenSteel;
import static gregtech.api.unification.material.Materials.Uraninite;
import static gregtech.api.unification.material.Materials.Uranium238;
import static gregtech.api.unification.material.Materials.Vanadium;
import static gregtech.api.unification.material.Materials.Xenon;
import static gregtech.api.unification.material.Materials.Ytterbium;
import static gregtech.api.unification.material.Materials.Yttrium;
import static gregtech.api.unification.material.Materials.Zeolite;
import static gregtech.api.unification.material.Materials.Zirconium;
import static gregtech.api.unification.ore.OrePrefix.crushedCentrifuged;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static gregtech.api.unification.ore.OrePrefix.ingotHot;
import static gregtech.api.unification.ore.OrePrefix.lens;
import static gregtech.api.unification.ore.OrePrefix.nugget;
import static gregtech.api.unification.ore.OrePrefix.round;
import static gregtech.common.items.MetaItems.QUANTUM_MAINFRAME_ZPM;
import static gregtech.common.metatileentities.MetaTileEntities.ASSEMBLY_LINE;
import static gregtech.common.metatileentities.MetaTileEntities.ELECTROLYZER;
import static serendustry.item.SerendustryMetaItems.CULTURE_STEM_CELL_WIRED;
import static serendustry.item.material.SerendustryMaterials.ALMST;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Actinoids;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AerCrystal;
import static serendustry.item.material.SerendustryMaterials.Alkalis;
import static serendustry.item.material.SerendustryMaterials.Aluminum;
import static serendustry.item.material.SerendustryMaterials.Amogus;
import static serendustry.item.material.SerendustryMaterials.AnthraciteCoal;
import static serendustry.item.material.SerendustryMaterials.AquaCrystal;
import static serendustry.item.material.SerendustryMaterials.Arcanite;
import static serendustry.item.material.SerendustryMaterials.ArceusAlloy2B;
import static serendustry.item.material.SerendustryMaterials.AssemblyLine;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.Bedrockium;
import static serendustry.item.material.SerendustryMaterials.BismuthTellurite;
import static serendustry.item.material.SerendustryMaterials.BituminousCoal;
import static serendustry.item.material.SerendustryMaterials.BlackStarMatter;
import static serendustry.item.material.SerendustryMaterials.BoneSteel;
import static serendustry.item.material.SerendustryMaterials.ChargedDraconium;
import static serendustry.item.material.SerendustryMaterials.Cinobite;
import static serendustry.item.material.SerendustryMaterials.CondensedCoal;
import static serendustry.item.material.SerendustryMaterials.CondensedStarMatter;
import static serendustry.item.material.SerendustryMaterials.CrystalMatrix;
import static serendustry.item.material.SerendustryMaterials.CubicZirconia;
import static serendustry.item.material.SerendustryMaterials.DeepDarkIron;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Draconium;
import static serendustry.item.material.SerendustryMaterials.EglinSteel;
import static serendustry.item.material.SerendustryMaterials.Enderiiium;
import static serendustry.item.material.SerendustryMaterials.EnderiiumBase;
import static serendustry.item.material.SerendustryMaterials.EnergeticAlloy;
import static serendustry.item.material.SerendustryMaterials.EnergyCrystal;
import static serendustry.item.material.SerendustryMaterials.EnrichedHolmium;
import static serendustry.item.material.SerendustryMaterials.EnrichedNaquadahAlloy;
import static serendustry.item.material.SerendustryMaterials.EnrichedTeflon;
import static serendustry.item.material.SerendustryMaterials.ExtremelyUnstableTiberium;
import static serendustry.item.material.SerendustryMaterials.FluxedElectrum;
import static serendustry.item.material.SerendustryMaterials.GalliumYttrium;
import static serendustry.item.material.SerendustryMaterials.HastelloyK243;
import static serendustry.item.material.SerendustryMaterials.HastelloyN;
import static serendustry.item.material.SerendustryMaterials.HastelloyX78;
import static serendustry.item.material.SerendustryMaterials.HighDurabilityCompoundSteel;
import static serendustry.item.material.SerendustryMaterials.HighGradeSolderingAlloy;
import static serendustry.item.material.SerendustryMaterials.IgnisCrystal;
import static serendustry.item.material.SerendustryMaterials.Inconel792;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.InfinityCatalyst;
import static serendustry.item.material.SerendustryMaterials.InfusedGold;
import static serendustry.item.material.SerendustryMaterials.Jasper;
import static serendustry.item.material.SerendustryMaterials.Lafium;
import static serendustry.item.material.SerendustryMaterials.Lanthanoids;
import static serendustry.item.material.SerendustryMaterials.Ledox;
import static serendustry.item.material.SerendustryMaterials.LigniteCoal;
import static serendustry.item.material.SerendustryMaterials.Lumiium;
import static serendustry.item.material.SerendustryMaterials.Luminessence;
import static serendustry.item.material.SerendustryMaterials.Magic2;
import static serendustry.item.material.SerendustryMaterials.MagnetoResonatic;
import static serendustry.item.material.SerendustryMaterials.MultiversalAlloy;
import static serendustry.item.material.SerendustryMaterials.MutatedLivingSolder;
import static serendustry.item.material.SerendustryMaterials.NaquadriaticTaranium;
import static serendustry.item.material.SerendustryMaterials.NetherizedDiamond;
import static serendustry.item.material.SerendustryMaterials.Onionium;
import static serendustry.item.material.SerendustryMaterials.OrdoCrystal;
import static serendustry.item.material.SerendustryMaterials.Originite;
import static serendustry.item.material.SerendustryMaterials.PeatCoal;
import static serendustry.item.material.SerendustryMaterials.PerditioCrystal;
import static serendustry.item.material.SerendustryMaterials.Periodicium;
import static serendustry.item.material.SerendustryMaterials.Pikyonium;
import static serendustry.item.material.SerendustryMaterials.Pinkium;
import static serendustry.item.material.SerendustryMaterials.Platinium;
import static serendustry.item.material.SerendustryMaterials.PostTransitionMetals;
import static serendustry.item.material.SerendustryMaterials.Prasiolite;
import static serendustry.item.material.SerendustryMaterials.PulsatingIron;
import static serendustry.item.material.SerendustryMaterials.Quantium;
import static serendustry.item.material.SerendustryMaterials.Quantum;
import static serendustry.item.material.SerendustryMaterials.RawAdamantium;
import static serendustry.item.material.SerendustryMaterials.RealCupronickel;
import static serendustry.item.material.SerendustryMaterials.Rhopalthenit;
import static serendustry.item.material.SerendustryMaterials.ScOpv;
import static serendustry.item.material.SerendustryMaterials.ScUev;
import static serendustry.item.material.SerendustryMaterials.ScUiv;
import static serendustry.item.material.SerendustryMaterials.ScUxv;
import static serendustry.item.material.SerendustryMaterials.Shirabon;
import static serendustry.item.material.SerendustryMaterials.Signalium;
import static serendustry.item.material.SerendustryMaterials.Silane;
import static serendustry.item.material.SerendustryMaterials.SiliconCarbide;
import static serendustry.item.material.SerendustryMaterials.StellarAlloy;
import static serendustry.item.material.SerendustryMaterials.SubBituminousCoal;
import static serendustry.item.material.SerendustryMaterials.Tairitsu;
import static serendustry.item.material.SerendustryMaterials.Taranium;
import static serendustry.item.material.SerendustryMaterials.TastyNeutronium;
import static serendustry.item.material.SerendustryMaterials.Teflon;
import static serendustry.item.material.SerendustryMaterials.TerraCrystal;
import static serendustry.item.material.SerendustryMaterials.Thaumium;
import static serendustry.item.material.SerendustryMaterials.TiberiumAboreus;
import static serendustry.item.material.SerendustryMaterials.TiberiumCruentus;
import static serendustry.item.material.SerendustryMaterials.TiberiumRiparius;
import static serendustry.item.material.SerendustryMaterials.TiberiumVinifera;
import static serendustry.item.material.SerendustryMaterials.TungstenHexachloride;
import static serendustry.item.material.SerendustryMaterials.VibrantAlloy;
import static serendustry.machine.SerendustryRecipeMaps.CVD_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

import net.minecraft.init.Items;

import gregtech.api.fluids.store.FluidStorageKeys;

public class AlloyRecipes {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .input(dust, Gallium, 1).input(dust, Yttrium, 1)
                .output(dust, GalliumYttrium, 2)
                .duration(90).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, RoseGold, 1).input(dust, SterlingSilver, 1).input(dust, Electrum, 2)
                .input(dust, InfusedGold, 2).input(dust, Naquadria, 4)
                .fluidInputs(SolderingAlloy.getFluid(1440))
                .output(dust, FluxedElectrum, 4)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Americium, 1).input(dust, Oganesson, 1).input(dust, Uranium238, 1).input(dust, Sulfur, 1)
                .output(dust, Amogus, 4)
                .duration(800).EUt(VA[ZPM] + 10).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahAlloy, 10).input(dust, Rhenium, 5).input(dust, Naquadria, 4)
                .input(dust, Polonium, 3).input(dust, Rutherfordium, 2).input(dust, Fermium, 1)
                .output(dust, HastelloyX78, 30)
                .duration(3000).EUt(VA[ZPM] + 25).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, HastelloyX78, 5).input(dust, Tritanium, 4).input(dust, TungstenCarbide, 4)
                .input(dust, Promethium, 4).input(dust, NiobiumNitride, 2).input(dust, Mendelevium, 1)
                .output(dust, HastelloyK243, 20)
                .duration(2500).EUt(VA[UV]).buildAndRegister();

        /*
         * MIXER_RECIPES.recipeBuilder()
         * .input(dust, Steel, 20).input(dust, Chrome, 13).input(dust, Copper, 10).input(dust, Nickel, 3)
         * .input(dust, Molybdenum, 2).input(dust, Tungsten, 2)
         * .output(dust, Zeron100, 50)
         * .duration(3500).EUt(VA[IV]).buildAndRegister();
         */

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Zeron100, 8).input(dust, Titanium, 6).input(dust, Naquadria, 4).input(dust, Gadolinium, 3)
                .input(dust, Osmiridium, 1)
                .fluidInputs(Mercury.getFluid(1000))
                .output(dust, Cinobite, 26)
                .duration(1600).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel, 2).input(dust, Aluminium, 2).input(dust, Niobium, 1).input(dust, Nichrome, 1)
                .output(dust, Inconel792, 6)
                .duration(280).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Invar, 5).input(dust, Iron, 4).input(dust, Kanthal, 1).input(dust, Sulfur, 1)
                .input(dust, Silicon, 1).input(dust, Carbon, 1)
                .output(dust, EglinSteel, 13)
                .duration(600).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Antimony, 2).input(dust, Platinium, 2).input(dust, Ytterbium).input(dust, Nichrome)
                .input(dust, SiliconCarbide)
                .output(dust, Onionium, 7)
                .duration(400).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Inconel792, 8).input(dust, EglinSteel, 5).input(dust, NaquadahEnriched, 4)
                .input(dust, TungstenSteel, 4).input(dust, Cerium, 3).input(dust, Onionium, 7)
                .output(dust, Pikyonium, 29)
                .duration(1900).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel, 15).input(dust, Molybdenum, 4).input(dust, Yttrium, 2).input(dust, Chrome, 2)
                .input(dust, Titanium, 2)
                .output(dust, HastelloyN, 25)
                .duration(1200).EUt(VA[EV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, HastelloyN, 8).input(dust, Nickel, 8).input(dust, Aluminum, 6).input(dust, Naquadah, 4)
                .input(dust, Tungsten, 4).input(dust, Samarium, 2).input(dust, Carbon, 2)
                .fluidInputs(Argon.getFluid(2000))
                .output(dust, Lafium, 36)
                .duration(2400).EUt(VA[UV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, Lafium, 36)
                .output(dust, HastelloyN, 8).output(dust, Nickel, 8).output(dust, Aluminum, 6).output(dust, Naquadah, 4)
                .output(dust, Tungsten, 4).output(dust, Samarium, 2).output(dust, Carbon, 2)
                .fluidOutputs(Argon.getFluid(2000))
                .duration(3960).EUt(60).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahEnriched, 4).input(dust, Rhodium, 2).input(dust, Ruthenium, 2)
                .input(dust, Rubidium, 2).input(dust, Dubnium, 1).input(dust, Einsteinium, 1)
                .output(dust, EnrichedNaquadahAlloy, 12)
                .duration(500).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Silicon, 5).input(dust, Iron, 1)
                .fluidInputs(Oxygen.getFluid(10000))
                .output(dust, Prasiolite, 16)
                .duration(6000).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Zirconium, 1).input(dust, Oxygen, 2)
                .output(dust, CubicZirconia, 3)
                .duration(113).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, BismuthTellurite, 4).input(dust, Prasiolite, 3).input(dust, CubicZirconia, 1)
                .input(dust, SamariumMagnetic, 1)
                .output(dust, MagnetoResonatic, 9)
                .duration(352).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, TungstenSteel, 12).input(dust, HSSS, 9).input(dust, HSSG, 6).input(dust, Ruridit, 3)
                .input(dust, MagnetoResonatic, 2).input(dust, Plutonium239, 1)
                .output(dust, HighDurabilityCompoundSteel, 33)
                .duration(3100).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic, 3).input(dust, Cinobite, 1).input(dust, Pikyonium, 1)
                .input(dust, Aluminum, 1)
                .output(dust, ScUev, 6)
                .duration(2400).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Aluminum).input(dust, Phosphate)
                .output(dust, Luminessence, 2)
                .duration(400).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Luminessence, 2).input(dust, TinAlloy).input(dust, RoseGold).input(dust, Phosphate)
                .output(dust, Lumiium, 5)
                .duration(800).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Lumiium, 3).input(dust, Aluminum, 2).input(dust, FluxedElectrum).input(dust, Phosphate)
                .output(dust, Signalium, 7)
                .duration(1100).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Signalium, 4).input(dust, EnderPearl, 2).input(dust, TastyNeutronium, 2)
                .input(dust, Phosphate)
                .output(dust, EnderiiumBase, 9)
                .duration(1400).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, EnderiiumBase, 4).input(dust, InfusedGold).input(dust, Phosphate)
                .output(dust, Enderiiium, 6)
                .duration(1000).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Iron).input(dust, EnderPearl).input(dust, Uraninite)
                .output(dust, PulsatingIron, 3)
                .duration(200).EUt(VA[EV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, PulsatingIron, 4).input(dust, Zeolite).input(dust, GarnetSand).input(dust, HSSS)
                .fluidInputs(Mercury.getFluid(1000))
                .output(dust, EnergeticAlloy, 8)
                .duration(800).EUt(VA[ZPM]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, EnergeticAlloy, 5).input(dust, Zeolite).input(dust, BasalticMineralSand)
                .input(dust, GraniticMineralSand)
                .output(dust, VibrantAlloy, 8)
                .duration(900).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, VibrantAlloy, 8).input(dust, TastyNeutronium, 2).input(dust, Aluminum, 2)
                .input(dust, AluminiumSulfite)
                .output(dust, StellarAlloy, 13)
                .duration(1600).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, VibrantAlloy, 3).input(dust, Naquadria, 2).input(dust, FluxedElectrum, 2)
                .input(dust, EnderiiumBase, 2)
                .output(dust, ScUiv, 9)
                .duration(1500).EUt(VA[UHV]).buildAndRegister();

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(gemExquisite, Diamond).input(dust, NetherStar)
                .output(dust, CrystalMatrix)
                .duration(20).EUt(VA[UHV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(dust, Draconium)
                .fluidInputs(Redstone.getFluid(1000))
                .output(dust, ChargedDraconium)
                .duration(180).EUt(VA[UHV]).buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64)
                .input(dust, Stone, 64).input(dust, Stone, 64)
                .output(dust, Bedrockium, 1)
                .duration(120).EUt(VA[UHV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, ChargedDraconium, 4).input(dust, StellarAlloy, 4).input(dust, Luminessence, 3)
                .input(dust, InfinityCatalyst, 2)
                .output(dust, ScUxv, 13)
                .duration(1800).EUt(VA[UEV]).buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64)
                .input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64)
                .output(dust, Jasper, 8)
                .duration(500).EUt(VA[UHV]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, Carbon)
                .fluidInputs(Silane.getFluid(1000), Argon.getFluid(100))
                .output(dust, SiliconCarbide, 2)
                .fluidOutputs(Hydrogen.getFluid(4000))
                .duration(100).EUt(VA[HV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Trinium, 3).input(dust, HSSS, 4).input(dust, TungstenCarbide, 2).input(dust, Osmiridium)
                .input(dust, Strontium)
                .output(dust, ArceusAlloy2B, 11)
                .duration(600).EUt(VA[LuV]).buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(ASSEMBLY_LINE)
                .fluidOutputs(AssemblyLine.getFluid(100))
                .duration(1000).EUt(VA[UEV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(AssemblyLine.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
                .fluidOutputs(AssemblyLine.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(1200).EUt(VA[UEV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, StellarAlloy, 15).input(dust, ArceusAlloy2B, 10).input(dust, Lafium, 10)
                .input(dust, Jasper, 5).input(dust, Americium, 5).input(dust, EnergyCrystal, 5)
                .input(dust, Germanium, 5)
                .input(dust, SiliconCarbide, 5)
                .fluidInputs(AssemblyLine.getPlasma(144))
                .output(dust, Quantum, 60)
                .duration(4800).EUt(VA[UIV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, Quantum, 60)
                .output(dust, StellarAlloy, 15).output(dust, ArceusAlloy2B, 10).output(dust, Lafium, 10)
                .output(dust, Jasper, 5).output(dust, Americium, 5).output(dust, EnergyCrystal, 5)
                .output(dust, Germanium, 5).output(dust, SiliconCarbide, 5)
                .fluidOutputs(AssemblyLine.getPlasma(144))
                .duration(7200).EUt(60).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(QUANTUM_MAINFRAME_ZPM)
                .fluidInputs(Quantum.getFluid(288))
                .output(dust, Quantium)
                .duration(200).EUt(VA[UIV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Quantum, 5).input(dust, Ledox, 4).input(dust, AwakenedDraconium, 3)
                .input(dust, Enderiiium, 3).input(dust, Infinity, 3).input(dust, NaquadriaticTaranium, 3)
                .input(dust, Amogus, 2)
                .output(dust, ScOpv, 23)
                .duration(2500).EUt(VA[UIV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, ScOpv, 23)
                .output(dust, Quantum, 5).output(dust, Ledox, 4).output(dust, AwakenedDraconium, 3)
                .output(dust, Enderiiium, 3).output(dust, Infinity, 3).output(dust, NaquadriaticTaranium, 3)
                .output(dust, Amogus, 2)
                .duration(2760).EUt(60).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(CULTURE_STEM_CELL_WIRED).input(dust, SolderingAlloy, 4).input(dust, NetherStar)
                .fluidInputs(Iron.getPlasma(144), Nickel.getPlasma(144))
                .fluidOutputs(MutatedLivingSolder.getFluid(576))
                .requireInside(CHEMICAL_RECIPES, UV, 1)
                .requireInside(CHEMICAL_BATH_RECIPES, UV, 1)
                .duration(1200).EUt(VA[UV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Iron)
                .fluidInputs(Magic2.getFluid(100))
                .output(dust, Thaumium)
                .duration(300).EUt(VA[LV]).buildAndRegister();

        for (int i = LV; i <= OpV; i++) {
            EXTRACTOR_RECIPES.recipeBuilder()
                    .input(ELECTROLYZER[i])
                    .fluidOutputs(Magic2.getFluid((int) (V[i] / 32)))
                    .duration(500).EUt(VA[i]).buildAndRegister();
        }

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Copper, 40).input(dust, Nickel, 22).input(dust, Iron, 1).input(dust, Manganese, 1)
                .circuitMeta(2)
                .output(dust, RealCupronickel, 64)
                .duration(6400).EUt(24).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahEnriched, 8).input(dust, Holmium)
                .output(dust, EnrichedHolmium, 9)
                .duration(380).EUt(VA[LuV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(foil, Teflon, 8).input(foil, NaquadahEnriched).input(foil, EnrichedHolmium)
                .input(foil, EnrichedNaquadahAlloy).input(foil, EglinSteel).input(foil, Zeron100)
                .input(foil, HastelloyN).input(foil, TinAlloy).input(foil, TungstenSteel)
                .output(dust, EnrichedTeflon)
                .duration(420).EUt(VA[LuV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, EnrichedTeflon)
                .output(foil, NaquadahEnriched, 8).output(foil, Teflon).output(foil, EnrichedHolmium)
                .output(foil, EnrichedNaquadahAlloy).output(foil, EglinSteel).output(foil, Zeron100)
                .output(foil, HastelloyN).output(foil, TinAlloy).output(foil, TungstenSteel)
                .duration(120).EUt(60).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Infinity, 5)
                .input(dust, Shirabon, 3)
                .input(dust, ScOpv, 2)
                .input(dust, StellarAlloy, 2)
                .input(dust, ScUxv, 1)
                .input(dust, Quantum)
                .input(dust, Actinoids)
                .input(dust, Lanthanoids)
                .input(dust, Periodicium)
                .output(dust, MultiversalAlloy, 17)
                .duration(4000).EUt(VA[OpV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, MultiversalAlloy, 17)
                .output(dust, Infinity, 5).output(dust, Shirabon, 3).output(dust, ScOpv, 2)
                .output(dust, StellarAlloy, 2).output(dust, ScUxv, 1).output(dust, TastyNeutronium)
                .output(dust, Quantum).output(dust, Periodicium).output(dust, Alkalis)
                .duration(1820).EUt(60).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Rhodium, 1).input(dust, Palladium, 1).input(dust, Ruthenium, 1)
                .output(dust, Rhopalthenit, 3)
                .duration(400).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Cadmium, 4).input(dust, Antimony, 3).input(dust, Indium, 1)
                .output(dust, HighGradeSolderingAlloy, 8)
                .duration(480).EUt(VA[IV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Aluminium, 2).input(dust, Lithium, 2).input(dust, Magnesium, 1)
                .input(dust, Scandium, 2).input(dust, Titanium, 3)
                .output(dust, ALMST, 9)
                .duration(440).EUt(VA[IV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Lava.getFluid(100))
                .output(dust, IgnisCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(DistilledWater.getFluid(100))
                .output(dust, AquaCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Polyethylene.getFluid(100))
                .output(dust, TerraCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Air.getFluid(100))
                .output(dust, AerCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(Antimony.getFluid(100))
                .output(dust, OrdoCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Diamond)
                .fluidInputs(TinAlloy.getFluid(100))
                .output(dust, PerditioCrystal)
                .duration(30).EUt(VA[LV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, IgnisCrystal, 1)
                .input(dust, AquaCrystal, 1)
                .input(dust, TerraCrystal, 1)
                .input(dust, AerCrystal, 1)
                .output(dust, EnergyCrystal, 4)
                .duration(400).EUt(VA[EV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .fluidInputs(Arcanite.getFluid(144))
                .notConsumable(lens, IgnisCrystal)
                .notConsumable(lens, OrdoCrystal)
                .notConsumable(lens, PerditioCrystal)
                .notConsumable(lens, EnergyCrystal)
                .output(ingot, Arcanite, 1)
                .duration(3200).EUt(VA[UEV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(ingot, Arcanite)
                .notConsumable(lens, AquaCrystal)
                .notConsumable(lens, AerCrystal)
                .notConsumable(lens, PerditioCrystal)
                .output(nugget, Arcanite, 9)
                .duration(3200).EUt(VA[UEV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(nugget, Arcanite)
                .notConsumable(lens, TerraCrystal)
                .notConsumable(lens, AerCrystal)
                .notConsumable(lens, OrdoCrystal)
                .output(round, Arcanite)
                .duration(356).EUt(VA[UEV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .input(dust, AbyssalAlloy, 8)
                .output(dust, Naquadria, 3)
                .output(dust, Taranium, 1)
                .output(dust, TungstenCarbide, 1)
                .output(dust, NetherizedDiamond, 1)
                .output(dust, Germanium, 1)
                .fluidOutputs(BlackStarMatter.getFluid(400))
                .duration(2400).EUt(VA[UV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Tungsten, 9).input(dust, Naquadria, 8).input(dust, Bedrockium, 6)
                .input(dust, Vanadium, 5).input(dust, BlackSteel, 2).input(dust, Taranium).input(dust, SiliconCarbide)
                .output(dust, Tairitsu, 32)
                .duration(2400).EUt(VA[UHV]).buildAndRegister();

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(gemExquisite, LigniteCoal).input(gemExquisite, AnthraciteCoal)
                .input(gemExquisite, BituminousCoal).input(gemExquisite, SubBituminousCoal)
                .input(gemExquisite, PeatCoal)
                .output(dust, CondensedCoal)
                .duration(20).EUt(VA[MAX]).buildAndRegister();

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(gemExquisite, TiberiumAboreus).input(gemExquisite, TiberiumCruentus)
                .input(gemExquisite, TiberiumRiparius)
                .input(gemExquisite, TiberiumVinifera).input(crushedCentrifuged, Originite)
                .output(dust, ExtremelyUnstableTiberium)
                .duration(20).EUt(VA[MAX]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(ingot, Steel).input(Items.BONE)
                // .fluidInputs(Blood.getFluid(100))
                .output(ingot, BoneSteel)
                .blastFurnaceTemp(1800)
                .duration(120).EUt(VA[MV]).buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .input(dust, Tungsten)
                .fluidInputs(Chlorine.getFluid(6000))
                .output(dust, TungstenHexachloride, 7)
                .duration(20 * 5).EUt(VA[EV]).buildAndRegister();

        CVD_RECIPES.recipeBuilder()
                .input(dust, TungstenHexachloride, 7)
                .fluidInputs(Hydrogen.getFluid(2000), Methane.getFluid(1000))
                .output(dust, TungstenCarbide)
                .fluidOutputs(HydrochloricAcid.getFluid(6000))
                .duration(20 * 5).EUt(VA[EV]).buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, PostTransitionMetals).input(dust, Chrome).input(dust, Rhodium)
                .input(dust, Europium).input(dust, Rutile).input(dust, Onionium)
                .input(dust, ScUiv).input(dust, Jasper).input(dust, Shirabon)
                .output(dust, Pinkium, 9)
                .duration(1200).EUt(VA[MAX]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(RawAdamantium.getFluid(144), Krypton.getFluid(10))
                .output(ingotHot, Adamantium)
                .blastFurnaceTemp(10800)
                .duration(737).EUt(VA[UV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, DeepDarkIron)
                .fluidInputs(CondensedStarMatter.getFluid(1000), Xenon.getFluid(10))
                .output(ingotHot, DeepDarkSteel)
                .blastFurnaceTemp(10800)
                .duration(20 * 90).EUt(VA[UXV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .input(ingotHot, DeepDarkSteel)
                .fluidInputs(BlackStarMatter.getFluid(500), Helium.getFluid(FluidStorageKeys.LIQUID, 5000))
                .output(ingot, DeepDarkSteel)
                .fluidOutputs(Helium.getFluid(5000))
                .duration(20 * 90).EUt(VA[UXV]).buildAndRegister();
    }
}
