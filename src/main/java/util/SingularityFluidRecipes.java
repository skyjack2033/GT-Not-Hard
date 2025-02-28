package util;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.util.GTRecipe;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.FluidStack;

import java.util.HashMap;
import java.util.Map;

public class SingularityFluidRecipes {
    public static final Map<String, Map<Integer, FluidStack>> VoidFliudRecipes = new HashMap<>();

    public static final RecipeMap<RecipeMapBackend> addVoidFluidRecipes = RecipeMapBuilder
        .of("Singularity")
        .maxIO(0, 0, 0, 1)
        .minInputs(0, 0)
        .build();

    public static void addSingularityFluidRecipes(String Dim, FluidStack OutPutFluid) {
        GTValues.RA.stdBuilder()
            .fluidOutputs(OutPutFluid)
            .noOptimize()
            .fake()
            .setNEIDesc(Dim)
            .duration(3600)
            .eut(0)
            .addTo(addVoidFluidRecipes);
    }

    public static void addVoidFliudRecipes() {
        //T0 - Overworld - Ow
        Map<Integer,FluidStack> OverworldRecipes = new HashMap<>();
        OverworldRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        OverworldRecipes.put(1 , Materials.Caesium.getMolten(1000));
        OverworldRecipes.put(2 , Materials.Calcium.getMolten(1000));
        OverworldRecipes.put(3 , Materials.Chrome.getMolten(1000));
        OverworldRecipes.put(4 , Materials.Copper.getMolten(1000));
        OverworldRecipes.put(5 , Materials.Gold.getMolten(1000));
        OverworldRecipes.put(6 , Materials.Iron.getMolten(1000));
        OverworldRecipes.put(7 , Materials.Lithium.getMolten(1000));
        OverworldRecipes.put(8 , Materials.Magnesium.getMolten(1000));
        OverworldRecipes.put(9 , Materials.Manganese.getMolten(1000));
        OverworldRecipes.put(10, Materials.Nickel.getMolten(1000));
        OverworldRecipes.put(11, Materials.Niobium.getMolten(1000));
        OverworldRecipes.put(12, Materials.Potassium.getMolten(1000));
        OverworldRecipes.put(13, Materials.Redstone.getMolten(1000));
        OverworldRecipes.put(14, Materials.Silicon.getMolten(1000));
        OverworldRecipes.put(15, Materials.Tantalum.getMolten(1000));
        OverworldRecipes.put(16, Materials.Tin.getMolten(1000));
        OverworldRecipes.put(17, Materials.Vanadium.getMolten(1000));

        OverworldRecipes.put(18, Materials.Mercury.getFluid(1000));
        OverworldRecipes.put(19, Materials.Oil.getFluid(1000));
        OverworldRecipes.put(20, Materials.OilHeavy.getFluid(1000));
        OverworldRecipes.put(21, Materials.OilLight.getFluid(1000));
        OverworldRecipes.put(22, Materials.OilMedium.getFluid(1000));

        OverworldRecipes.put(23, Materials.Chlorine.getGas(1000));
        OverworldRecipes.put(24, Materials.Fluorine.getGas(1000));
        OverworldRecipes.put(25, Materials.Hydrogen.getGas(1000));
        OverworldRecipes.put(26, Materials.NatruralGas.getGas(1000));
        OverworldRecipes.put(27, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < OverworldRecipes.size(); i++) {
            FluidStack OutPutFluid = OverworldRecipes.get(i);
            addSingularityFluidRecipes("T0: Overworld", OutPutFluid);
        }

        //T0 - Nether - Ne
        Map<Integer,FluidStack> NetherRecipes = new HashMap<>();
        NetherRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        NetherRecipes.put(1 , Materials.Antimony.getMolten(1000));
        NetherRecipes.put(2 , Materials.Barium.getMolten(1000));
        NetherRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        NetherRecipes.put(4 , Materials.Calcium.getMolten(1000));
        NetherRecipes.put(5 , Materials.Chrome.getMolten(1000));
        NetherRecipes.put(6 , Materials.Copper.getMolten(1000));
        NetherRecipes.put(7 , Materials.Electrotine.getMolten(1000));
        NetherRecipes.put(8 , Materials.Iron.getMolten(1000));
        NetherRecipes.put(9 , Materials.Lead.getMolten(1000));
        NetherRecipes.put(10, Materials.Manganese.getMolten(1000));
        NetherRecipes.put(11, Materials.Molybdenum.getMolten(1000));
        NetherRecipes.put(12, Materials.Potassium.getMolten(1000));
        NetherRecipes.put(13, Materials.Silicon.getMolten(1000));
        NetherRecipes.put(14, Materials.Tantalum.getMolten(1000));
        NetherRecipes.put(15, Materials.Thorium.getMolten(1000));
        NetherRecipes.put(16, Materials.Zinc.getMolten(1000));

        NetherRecipes.put(17, Materials.Lava.getFluid(1000));
        NetherRecipes.put(18, Materials.Mercury.getFluid(1000));

        NetherRecipes.put(19, Materials.Hydrogen.getGas(1000));
        NetherRecipes.put(20, Materials.Nitrogen.getGas(1000));
        NetherRecipes.put(21, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < NetherRecipes.size(); i++) {
            FluidStack OutPutFluid = NetherRecipes.get(i);
            addSingularityFluidRecipes("T0: Nether", OutPutFluid);
        }

        //T0 - Twilight - TF
        Map<Integer,FluidStack> TwilightRecipes = new HashMap<>();
        TwilightRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        TwilightRecipes.put(1 , Materials.Arsenic.getMolten(1000));
        TwilightRecipes.put(2 , Materials.Calcium.getMolten(1000));
        TwilightRecipes.put(3 , Materials.Cobalt.getMolten(1000));
        TwilightRecipes.put(4 , Materials.Copper.getMolten(1000));
        TwilightRecipes.put(5 , Materials.Gold.getMolten(1000));
        TwilightRecipes.put(6 , Materials.Iron.getMolten(1000));
        TwilightRecipes.put(7 , Materials.Lead.getMolten(1000));
        TwilightRecipes.put(8 , Materials.Lithium.getMolten(1000));
        TwilightRecipes.put(9 , Materials.Magnesium.getMolten(1000));
        TwilightRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        TwilightRecipes.put(11, Materials.Nickel.getMolten(1000));
        TwilightRecipes.put(12, Materials.Niobium.getMolten(1000));
        TwilightRecipes.put(13, Materials.Potassium.getMolten(1000));
        TwilightRecipes.put(14, Materials.Silicon.getMolten(1000));
        TwilightRecipes.put(15, Materials.Silver.getMolten(1000));
        TwilightRecipes.put(16, Materials.Tin.getMolten(1000));
        TwilightRecipes.put(17, Materials.Vanadium.getMolten(1000));

        TwilightRecipes.put(18, Materials.Mercury.getFluid(1000));

        TwilightRecipes.put(19, Materials.Chlorine.getGas(1000));
        TwilightRecipes.put(20, Materials.Fluorine.getGas(1000));
        TwilightRecipes.put(21, Materials.Hydrogen.getGas(1000));
        TwilightRecipes.put(22, Materials.Nitrogen.getGas(1000));
        TwilightRecipes.put(23, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TwilightRecipes.size(); i++) {
            FluidStack OutPutFluid = TwilightRecipes.get(i);
            addSingularityFluidRecipes("T0: Twilight", OutPutFluid);
        }

        //T0 - TheEnd - ED
        Map<Integer,FluidStack> TheEndRecipes = new HashMap<>();
        TheEndRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        TheEndRecipes.put(1 , Materials.Antimony.getMolten(1000));
        TheEndRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        TheEndRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        TheEndRecipes.put(4 , Materials.Calcium.getMolten(1000));
        TheEndRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        TheEndRecipes.put(6 , Materials.Copper.getMolten(1000));
        TheEndRecipes.put(7 , Materials.Gold.getMolten(1000));
        TheEndRecipes.put(8 , Materials.Iron.getMolten(1000));
        TheEndRecipes.put(9 , Materials.Lead.getMolten(1000));
        TheEndRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        TheEndRecipes.put(11, Materials.Nickel.getMolten(1000));
        TheEndRecipes.put(12, Materials.Silicon.getMolten(1000));
        TheEndRecipes.put(13, Materials.Thorium.getMolten(1000));
        TheEndRecipes.put(14, Materials.Tin.getMolten(1000));
        TheEndRecipes.put(15, Materials.Vanadium.getMolten(1000));

        TheEndRecipes.put(16, Materials.Hydrogen.getGas(1000));
        TheEndRecipes.put(17, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TheEndRecipes.size(); i++) {
            FluidStack OutPutFluid = TheEndRecipes.get(i);
            addSingularityFluidRecipes("T0: TheEnd", OutPutFluid);
        }

        //T0 - EndAsteroid - EA
        Map<Integer,FluidStack> EndAsteroidRecipes = new HashMap<>();
        EndAsteroidRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        EndAsteroidRecipes.put(1 , Materials.Antimony.getMolten(1000));
        EndAsteroidRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        EndAsteroidRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        EndAsteroidRecipes.put(4 , Materials.Calcium.getMolten(1000));
        EndAsteroidRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        EndAsteroidRecipes.put(6 , Materials.Copper.getMolten(1000));
        EndAsteroidRecipes.put(7 , Materials.Gold.getMolten(1000));
        EndAsteroidRecipes.put(8 , Materials.Iridium.getMolten(1000));
        EndAsteroidRecipes.put(9 , Materials.Iron.getMolten(1000));
        EndAsteroidRecipes.put(10, Materials.Lead.getMolten(1000));
        EndAsteroidRecipes.put(11, Materials.Lithium.getMolten(1000));
        EndAsteroidRecipes.put(12, Materials.Magnesium.getMolten(1000));
        EndAsteroidRecipes.put(13, Materials.Manganese.getMolten(1000));
        EndAsteroidRecipes.put(14, Materials.Molybdenum.getMolten(1000));
        EndAsteroidRecipes.put(15, Materials.Naquadah.getMolten(1000));
        EndAsteroidRecipes.put(16, Materials.NaquadahEnriched.getMolten(1000));
        EndAsteroidRecipes.put(17, Materials.Nickel.getMolten(1000));
        EndAsteroidRecipes.put(18, Materials.Palladium.getMolten(1000));
        EndAsteroidRecipes.put(19, Materials.Platinum.getMolten(1000));
        EndAsteroidRecipes.put(20, Materials.Potassium.getMolten(1000));
        EndAsteroidRecipes.put(21, Materials.Silicon.getMolten(1000));
        EndAsteroidRecipes.put(22, Materials.Tantalum.getMolten(1000));
        EndAsteroidRecipes.put(23, Materials.Thorium.getMolten(1000));
        EndAsteroidRecipes.put(24, Materials.Tin.getMolten(1000));
        EndAsteroidRecipes.put(25, Materials.Tungsten.getMolten(1000));
        EndAsteroidRecipes.put(26, Materials.Vanadium.getMolten(1000));

        EndAsteroidRecipes.put(27, Materials.Chlorine.getGas(1000));
        EndAsteroidRecipes.put(28, Materials.Fluorine.getGas(1000));
        EndAsteroidRecipes.put(29, Materials.Hydrogen.getGas(1000));
        EndAsteroidRecipes.put(30, Materials.Nitrogen.getGas(1000));
        EndAsteroidRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < EndAsteroidRecipes.size(); i++) {
            FluidStack OutPutFluid = EndAsteroidRecipes.get(i);
            addSingularityFluidRecipes("T0: EndAsteroid", OutPutFluid);
        }

        //T1 - Moon - Mo
        Map<Integer,FluidStack> MoonRecipes = new HashMap<>();
        MoonRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        MoonRecipes.put(1 , Materials.Barium.getMolten(1000));
        MoonRecipes.put(2 , Materials.Calcium.getMolten(1000));
        MoonRecipes.put(3 , Materials.Cerium.getMolten(1000));
        MoonRecipes.put(4 , Materials.Chrome.getMolten(1000));
        MoonRecipes.put(5 , Materials.Copper.getMolten(1000));
        MoonRecipes.put(6 , Materials.Gadolinium.getMolten(1000));
        MoonRecipes.put(7 , Materials.Gold.getMolten(1000));
        MoonRecipes.put(8 , Materials.Holmium.getMolten(1000));
        MoonRecipes.put(9 , Materials.Iron.getMolten(1000));
        MoonRecipes.put(10, Materials.Lanthanum.getMolten(1000));
        MoonRecipes.put(11, Materials.Lead.getMolten(1000));
        MoonRecipes.put(12, Materials.Manganese.getMolten(1000));
        MoonRecipes.put(13, Materials.Molybdenum.getMolten(1000));
        MoonRecipes.put(14, Materials.Neodymium.getMolten(1000));
        MoonRecipes.put(15, Materials.Samarium.getMolten(1000));
        MoonRecipes.put(16, Materials.Silicon.getMolten(1000));
        MoonRecipes.put(17, Materials.Tin.getMolten(1000));
        MoonRecipes.put(18, Materials.Titanium.getMolten(1000));

        MoonRecipes.put(19, Materials.SaltWater.getFluid(1000));

        MoonRecipes.put(20, Materials.Chlorine.getGas(1000));
        MoonRecipes.put(21, Materials.Fluorine.getGas(1000));
        MoonRecipes.put(22, Materials.Helium_3.getGas(1000));
        MoonRecipes.put(23, Materials.Hydrogen.getGas(1000));
        MoonRecipes.put(24, Materials.Nitrogen.getGas(1000));
        MoonRecipes.put(25, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MoonRecipes.size(); i++) {
            FluidStack OutPutFluid = MoonRecipes.get(i);
            addSingularityFluidRecipes("T1: Moon", OutPutFluid);
        }

        //T2 - Deimos - De
        Map<Integer,FluidStack> DeimosRecipes = new HashMap<>();
        DeimosRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        DeimosRecipes.put(1 , Materials.Antimony.getMolten(1000));
        DeimosRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        DeimosRecipes.put(3 , Materials.Calcium.getMolten(1000));
        DeimosRecipes.put(4 , Materials.Cerium.getMolten(1000));
        DeimosRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        DeimosRecipes.put(6 , Materials.Copper.getMolten(1000));
        DeimosRecipes.put(7 , Materials.Draconium.getMolten(1000));
        DeimosRecipes.put(8 , Materials.Electrotine.getMolten(1000));
        DeimosRecipes.put(9 , Materials.Gadolinium.getMolten(1000));
        DeimosRecipes.put(10, Materials.Holmium.getMolten(1000));
        DeimosRecipes.put(11, Materials.Iron.getMolten(1000));
        DeimosRecipes.put(12, Materials.Lanthanum.getMolten(1000));
        DeimosRecipes.put(13, Materials.Lithium.getMolten(1000));
        DeimosRecipes.put(14, Materials.Neodymium.getMolten(1000));
        DeimosRecipes.put(15, Materials.Nickel.getMolten(1000));
        DeimosRecipes.put(16, Materials.Oriharukon.getMolten(1000));
        DeimosRecipes.put(17, Materials.Samarium.getMolten(1000));
        DeimosRecipes.put(18, Materials.Silicon.getMolten(1000));
        DeimosRecipes.put(19, Materials.Thaumium.getMolten(1000));
        DeimosRecipes.put(20, Materials.Tungsten.getMolten(1000));
        DeimosRecipes.put(21, Materials.Uranium.getMolten(1000));
        DeimosRecipes.put(22, Materials.Vanadium.getMolten(1000));
        DeimosRecipes.put(23, Materials.Vinteum.getMolten(1000));
        DeimosRecipes.put(24, Materials.Vyroxeres.getMolten(1000));
        DeimosRecipes.put(25, Materials.Zinc.getMolten(1000));

        DeimosRecipes.put(26, Materials.Chlorine.getGas(1000));
        DeimosRecipes.put(27, Materials.Fluorine.getGas(1000));
        DeimosRecipes.put(28, Materials.Hydrogen.getGas(1000));
        DeimosRecipes.put(29, Materials.Nitrogen.getGas(1000));
        DeimosRecipes.put(30, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < DeimosRecipes.size(); i++) {
            FluidStack OutPutFluid = DeimosRecipes.get(i);
            addSingularityFluidRecipes("T2: Deimos", OutPutFluid);
        }

        //T2 - Mars - Ma
        Map<Integer,FluidStack> MarsRecipes = new HashMap<>();
        MarsRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        MarsRecipes.put(1 , Materials.Antimony.getMolten(1000));
        MarsRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        MarsRecipes.put(3 , Materials.Barium.getMolten(1000));
        MarsRecipes.put(4 , Materials.Beryllium.getMolten(1000));
        MarsRecipes.put(5 , Materials.Bismuth.getMolten(1000));
        MarsRecipes.put(6 , Materials.Calcium.getMolten(1000));
        MarsRecipes.put(7 , Materials.Chrome.getMolten(1000));
        MarsRecipes.put(8 , Materials.Cobalt.getMolten(1000));
        MarsRecipes.put(9 , Materials.Copper.getMolten(1000));
        MarsRecipes.put(10, Materials.Desh.getMolten(1000));
        MarsRecipes.put(11, Materials.Gold.getMolten(1000));
        MarsRecipes.put(12, Materials.Iron.getMolten(1000));
        MarsRecipes.put(13, Materials.Lead.getMolten(1000));
        MarsRecipes.put(14, Materials.Lithium.getMolten(1000));
        MarsRecipes.put(15, Materials.Nickel.getMolten(1000));
        MarsRecipes.put(16, Materials.Potassium.getMolten(1000));
        MarsRecipes.put(17, Materials.Silicon.getMolten(1000));
        MarsRecipes.put(18, Materials.Thorium.getMolten(1000));
        MarsRecipes.put(19, Materials.Tungsten.getMolten(1000));
        MarsRecipes.put(20, Materials.Uranium.getMolten(1000));
        MarsRecipes.put(21, Materials.Vanadium.getMolten(1000));
        MarsRecipes.put(22, Materials.Zinc.getMolten(1000));

        MarsRecipes.put(23, Materials.Chlorobenzene.getFluid(1000));
        MarsRecipes.put(24, Materials.Mercury.getFluid(1000));
        MarsRecipes.put(25, Materials.SaltWater.getFluid(1000));

        MarsRecipes.put(26, Materials.Chlorine.getGas(1000));
        MarsRecipes.put(27, Materials.Fluorine.getGas(1000));
        MarsRecipes.put(28, Materials.Hydrogen.getGas(1000));
        MarsRecipes.put(29, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MarsRecipes.size(); i++) {
            FluidStack OutPutFluid = MarsRecipes.get(i);
            addSingularityFluidRecipes("T2: Mars", OutPutFluid);
        }

        //T2 - Phobos - Ph
        Map<Integer,FluidStack> PhobosRecipes = new HashMap<>();
        PhobosRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        PhobosRecipes.put(1 , Materials.Antimony.getMolten(1000));
        PhobosRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        PhobosRecipes.put(3 , Materials.Barium.getMolten(1000));
        PhobosRecipes.put(4 , Materials.Bismuth.getMolten(1000));
        PhobosRecipes.put(5 , Materials.Calcium.getMolten(1000));
        PhobosRecipes.put(6 , Materials.Cobalt.getMolten(1000));
        PhobosRecipes.put(7 , Materials.Draconium.getMolten(1000));
        PhobosRecipes.put(8 , Materials.Electrotine.getMolten(1000));
        PhobosRecipes.put(9 , Materials.Gold.getMolten(1000));
        PhobosRecipes.put(10, Materials.Iron.getMolten(1000));
        PhobosRecipes.put(11, Materials.Lead.getMolten(1000));
        PhobosRecipes.put(12, Materials.Molybdenum.getMolten(1000));
        PhobosRecipes.put(13, Materials.Nickel.getMolten(1000));
        PhobosRecipes.put(14, Materials.Oriharukon.getMolten(1000));
        PhobosRecipes.put(15, Materials.Silicon.getMolten(1000));
        PhobosRecipes.put(16, Materials.Thaumium.getMolten(1000));
        PhobosRecipes.put(17, Materials.Thorium.getMolten(1000));
        PhobosRecipes.put(18, Materials.Titanium.getMolten(1000));
        PhobosRecipes.put(19, Materials.Uranium.getMolten(1000));
        PhobosRecipes.put(20, Materials.Vanadium.getMolten(1000));
        PhobosRecipes.put(21, Materials.Vinteum.getMolten(1000));
        PhobosRecipes.put(22, Materials.Vyroxeres.getMolten(1000));
        PhobosRecipes.put(23, Materials.Zinc.getMolten(1000));

        PhobosRecipes.put(24, Materials.Chlorine.getGas(1000));
        PhobosRecipes.put(25, Materials.Fluorine.getGas(1000));
        PhobosRecipes.put(26, Materials.Hydrogen.getGas(1000));
        PhobosRecipes.put(27, Materials.Nitrogen.getGas(1000));
        PhobosRecipes.put(28, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < PhobosRecipes.size(); i++) {
            FluidStack OutPutFluid = PhobosRecipes.get(i);
            addSingularityFluidRecipes("T2: Phobos", OutPutFluid);
        }

        //T3 - Asteroids - As
        Map<Integer,FluidStack> AsteroidsRecipes = new HashMap<>();
        AsteroidsRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        AsteroidsRecipes.put(1 , Materials.Antimony.getMolten(1000));
        AsteroidsRecipes.put(2 , Materials.Calcium.getMolten(1000));
        AsteroidsRecipes.put(3 , Materials.Chrome.getMolten(1000));
        AsteroidsRecipes.put(4 , Materials.Copper.getMolten(1000));
        AsteroidsRecipes.put(5 , Materials.Gold.getMolten(1000));
        AsteroidsRecipes.put(6 , Materials.Iron.getMolten(1000));
        AsteroidsRecipes.put(7 , Materials.Lithium.getMolten(1000));
        AsteroidsRecipes.put(8 , Materials.Magnesium.getMolten(1000));
        AsteroidsRecipes.put(9 , Materials.Naquadah.getMolten(1000));
        AsteroidsRecipes.put(10, Materials.NaquadahEnriched.getMolten(1000));
        AsteroidsRecipes.put(11, Materials.Silicon.getMolten(1000));
        AsteroidsRecipes.put(12, Materials.Titanium.getMolten(1000));
        AsteroidsRecipes.put(13, Materials.Tungsten.getMolten(1000));
        AsteroidsRecipes.put(14, Materials.Vanadium.getMolten(1000));

        AsteroidsRecipes.put(15, Materials.Hydrogen.getGas(1000));
        AsteroidsRecipes.put(16, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < AsteroidsRecipes.size(); i++) {
            FluidStack OutPutFluid = AsteroidsRecipes.get(i);
            addSingularityFluidRecipes("T3: Asteroids", OutPutFluid);
        }

        //T3 - Callisto - Ca
        Map<Integer,FluidStack> CallistoRecipes = new HashMap<>();
        CallistoRecipes.put(0 , Materials.Alduorite.getMolten(1000));
        CallistoRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        CallistoRecipes.put(2 , Materials.Calcium.getMolten(1000));
        CallistoRecipes.put(3 , Materials.CallistoIce.getMolten(1000));
        CallistoRecipes.put(4 , Materials.Cerium.getMolten(1000));
        CallistoRecipes.put(5 , Materials.Chrome.getMolten(1000));
        CallistoRecipes.put(6 , Materials.Copper.getMolten(1000));
        CallistoRecipes.put(7 , Materials.Gadolinium.getMolten(1000));
        CallistoRecipes.put(8 , Materials.Gold.getMolten(1000));
        CallistoRecipes.put(9 , Materials.Holmium.getMolten(1000));
        CallistoRecipes.put(10, Materials.Iron.getMolten(1000));
        CallistoRecipes.put(11, Materials.Lanthanum.getMolten(1000));
        CallistoRecipes.put(12, Materials.Lithium.getMolten(1000));
        CallistoRecipes.put(13, Materials.Magnesium.getMolten(1000));
        CallistoRecipes.put(14, Materials.Neodymium.getMolten(1000));
        CallistoRecipes.put(15, Materials.Nickel.getMolten(1000));
        CallistoRecipes.put(16, Materials.Palladium.getMolten(1000));
        CallistoRecipes.put(17, Materials.Platinum.getMolten(1000));
        CallistoRecipes.put(18, Materials.Plutonium.getMolten(1000));
        CallistoRecipes.put(19, Materials.Samarium.getMolten(1000));
        CallistoRecipes.put(20, Materials.Silicon.getMolten(1000));
        CallistoRecipes.put(21, Materials.Thorium.getMolten(1000));
        CallistoRecipes.put(22, Materials.Titanium.getMolten(1000));
        CallistoRecipes.put(23, Materials.Tungsten.getMolten(1000));
        CallistoRecipes.put(24, Materials.Uranium.getMolten(1000));
        CallistoRecipes.put(25, Materials.Vanadium.getMolten(1000));

        CallistoRecipes.put(26, Materials.LiquidAir.getFluid(1000));
        CallistoRecipes.put(27, Materials.SuperCoolant.getFluid(1000));

        CallistoRecipes.put(28, Materials.Chlorine.getGas(1000));
        CallistoRecipes.put(29, Materials.Fluorine.getGas(1000));
        CallistoRecipes.put(30, Materials.Hydrogen.getGas(1000));
        CallistoRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < CallistoRecipes.size(); i++) {
            FluidStack OutPutFluid = CallistoRecipes.get(i);
            addSingularityFluidRecipes("T3: Callisto", OutPutFluid);
        }

        //T3 - Ceres - Ce
        Map<Integer,FluidStack> CeresRecipes = new HashMap<>();
        CeresRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        CeresRecipes.put(1 , Materials.Beryllium.getMolten(1000));
        CeresRecipes.put(2 , Materials.Calcium.getMolten(1000));
        CeresRecipes.put(3 , Materials.Chrome.getMolten(1000));
        CeresRecipes.put(4 , Materials.Copper.getMolten(1000));
        CeresRecipes.put(5 , Materials.Electrotine.getMolten(1000));
        CeresRecipes.put(6 , Materials.Iron.getMolten(1000));
        CeresRecipes.put(7 , Materials.Lead.getMolten(1000));
        CeresRecipes.put(8 , Materials.Magnesium.getMolten(1000));
        CeresRecipes.put(9 , Materials.Manganese.getMolten(1000));
        CeresRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        CeresRecipes.put(11, Materials.Nickel.getMolten(1000));
        CeresRecipes.put(12, Materials.Palladium.getMolten(1000));
        CeresRecipes.put(13, Materials.Platinum.getMolten(1000));
        CeresRecipes.put(14, Materials.Plutonium.getMolten(1000));
        CeresRecipes.put(15, Materials.Potassium.getMolten(1000));
        CeresRecipes.put(16, Materials.Silicon.getMolten(1000));
        CeresRecipes.put(17, Materials.Tantalum.getMolten(1000));
        CeresRecipes.put(18, Materials.Thorium.getMolten(1000));
        CeresRecipes.put(19, Materials.Uranium.getMolten(1000));
        CeresRecipes.put(20, Materials.Vanadium.getMolten(1000));

        CeresRecipes.put(21, Materials.Chlorine.getGas(1000));
        CeresRecipes.put(22, Materials.Fluorine.getGas(1000));
        CeresRecipes.put(23, Materials.Hydrogen.getGas(1000));
        CeresRecipes.put(24, Materials.Nitrogen.getGas(1000));
        CeresRecipes.put(25, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < CeresRecipes.size(); i++) {
            FluidStack OutPutFluid = CeresRecipes.get(i);
            addSingularityFluidRecipes("T3: Ceres", OutPutFluid);
        }

        //T3 - Europa - Eu
        Map<Integer,FluidStack> EuropaRecipes = new HashMap<>();
        EuropaRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        EuropaRecipes.put(1 , Materials.Calcium.getMolten(1000));
        EuropaRecipes.put(2 , Materials.Chrome.getMolten(1000));
        EuropaRecipes.put(3 , Materials.Iron.getMolten(1000));
        EuropaRecipes.put(4 , Materials.Ledox.getMolten(1000));
        EuropaRecipes.put(5 , Materials.Lithium.getMolten(1000));
        EuropaRecipes.put(6 , Materials.Magnesium.getMolten(1000));
        EuropaRecipes.put(7 , Materials.Manganese.getMolten(1000));
        EuropaRecipes.put(8 , Materials.Molybdenum.getMolten(1000));
        EuropaRecipes.put(9 , Materials.Orichalcum.getMolten(1000));
        EuropaRecipes.put(10, Materials.Potassium.getMolten(1000));
        EuropaRecipes.put(11, Materials.Rubracium.getMolten(1000));
        EuropaRecipes.put(12, Materials.Silicon.getMolten(1000));
        EuropaRecipes.put(13, Materials.Tin.getMolten(1000));
        EuropaRecipes.put(14, Materials.Tungsten.getMolten(1000));

        EuropaRecipes.put(15, Materials.OilExtraHeavy.getFluid(1000));
        EuropaRecipes.put(16, Materials.SaltWater.getFluid(1000));

        EuropaRecipes.put(17, Materials.Fluorine.getGas(1000));
        EuropaRecipes.put(18, Materials.Hydrogen.getGas(1000));
        EuropaRecipes.put(19, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < EuropaRecipes.size(); i++) {
            FluidStack OutPutFluid = EuropaRecipes.get(i);
            addSingularityFluidRecipes("T3: Europa", OutPutFluid);
        }

        //T3 - Ganymede - Ga
        Map<Integer,FluidStack> GanymedeRecipes = new HashMap<>();
        GanymedeRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        GanymedeRecipes.put(1 , Materials.Antimony.getMolten(1000));
        GanymedeRecipes.put(2 , Materials.Calcium.getMolten(1000));
        GanymedeRecipes.put(3 , Materials.Chrome.getMolten(1000));
        GanymedeRecipes.put(4 , Materials.Copper.getMolten(1000));
        GanymedeRecipes.put(5 , Materials.Iron.getMolten(1000));
        GanymedeRecipes.put(6 , Materials.Lead.getMolten(1000));
        GanymedeRecipes.put(7 , Materials.Lithium.getMolten(1000));
        GanymedeRecipes.put(8 , Materials.Magnesium.getMolten(1000));
        GanymedeRecipes.put(9 , Materials.Nickel.getMolten(1000));
        GanymedeRecipes.put(10, Materials.Palladium.getMolten(1000));
        GanymedeRecipes.put(11, Materials.Platinum.getMolten(1000));
        GanymedeRecipes.put(12, Materials.Plutonium.getMolten(1000));
        GanymedeRecipes.put(13, Materials.Silicon.getMolten(1000));
        GanymedeRecipes.put(14, Materials.Silver.getMolten(1000));
        GanymedeRecipes.put(15, Materials.Thorium.getMolten(1000));
        GanymedeRecipes.put(16, Materials.Titanium.getMolten(1000));
        GanymedeRecipes.put(17, Materials.Tungsten.getMolten(1000));
        GanymedeRecipes.put(18, Materials.Uranium.getMolten(1000));

        GanymedeRecipes.put(19, Materials.Mercury.getFluid(1000));

        GanymedeRecipes.put(20, Materials.Hydrogen.getGas(1000));
        GanymedeRecipes.put(21, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < GanymedeRecipes.size(); i++) {
            FluidStack OutPutFluid = GanymedeRecipes.get(i);
            addSingularityFluidRecipes("T3: Ganymede", OutPutFluid);
        }

        //T3 - Ross128b - Rb
        Map<Integer,FluidStack> Ross128bRecipes = new HashMap<>();
        Ross128bRecipes.put(0 , Materials.Lava.getFluid(1000));
        Ross128bRecipes.put(1 , Materials.NatruralGas.getGas(1000));
        Ross128bRecipes.put(2 , Materials.OilExtraHeavy.getFluid(1000));

        for (int i = 0; i < Ross128bRecipes.size(); i++) {
            FluidStack OutPutFluid = Ross128bRecipes.get(i);
            addSingularityFluidRecipes("T3: Ross128b", OutPutFluid);
        }

        //T4 - Io - Io
        Map<Integer,FluidStack> IoRecipes = new HashMap<>();
        IoRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        IoRecipes.put(1 , Materials.Barium.getMolten(1000));
        IoRecipes.put(2 , Materials.Calcium.getMolten(1000));
        IoRecipes.put(3 , Materials.Cerium.getMolten(1000));
        IoRecipes.put(4 , Materials.Ceruclase.getMolten(1000));
        IoRecipes.put(5 , Materials.Chrome.getMolten(1000));
        IoRecipes.put(6 , Materials.Gadolinium.getMolten(1000));
        IoRecipes.put(7 , Materials.Gold.getMolten(1000));
        IoRecipes.put(8 , Materials.Holmium.getMolten(1000));
        IoRecipes.put(9 , Materials.InfusedGold.getMolten(1000));
        IoRecipes.put(10, Materials.Iridium.getMolten(1000));
        IoRecipes.put(11, Materials.Iron.getMolten(1000));
        IoRecipes.put(12, Materials.Lanthanum.getMolten(1000));
        IoRecipes.put(13, Materials.Lead.getMolten(1000));
        IoRecipes.put(14, Materials.Manganese.getMolten(1000));
        IoRecipes.put(15, Materials.Mithril.getMolten(1000));
        IoRecipes.put(16, Materials.Mytryl.getMolten(1000));
        IoRecipes.put(17, Materials.Neodymium.getMolten(1000));
        IoRecipes.put(18, Materials.Nickel.getMolten(1000));
        IoRecipes.put(19, Materials.Niobium.getMolten(1000));
        IoRecipes.put(20, Materials.Osmium.getMolten(1000));
        IoRecipes.put(21, Materials.Palladium.getMolten(1000));
        IoRecipes.put(22, Materials.Platinum.getMolten(1000));
        IoRecipes.put(23, Materials.Plutonium.getMolten(1000));
        IoRecipes.put(24, WerkstoffLoader.Rhodium.getMolten(1000));
        IoRecipes.put(25, WerkstoffLoader.Ruthenium.getMolten(1000));
        IoRecipes.put(26, Materials.Samarium.getMolten(1000));
        IoRecipes.put(27, Materials.Silicon.getMolten(1000));
        IoRecipes.put(28, Materials.Tantalum.getMolten(1000));
        IoRecipes.put(29, Materials.Thaumium.getMolten(1000));
        IoRecipes.put(30, Materials.Thorium.getMolten(1000));
        IoRecipes.put(31, Materials.Tin.getMolten(1000));
        IoRecipes.put(32, Materials.Uranium.getMolten(1000));
        IoRecipes.put(33, Materials.Vanadium.getMolten(1000));
        IoRecipes.put(34, Materials.Vulcanite.getMolten(1000));
        IoRecipes.put(35, Materials.Zinc.getMolten(1000));

        IoRecipes.put(36, Materials.SulfuricAcid.getFluid(1000));

        IoRecipes.put(37, Materials.CarbonDioxide.getGas(1000));
        IoRecipes.put(38, Materials.Hydrogen.getGas(1000));
        IoRecipes.put(39, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < IoRecipes.size(); i++) {
            FluidStack OutPutFluid = IoRecipes.get(i);
            addSingularityFluidRecipes("T4: Io", OutPutFluid);
        }

        //T4 - Mercury - Me
        Map<Integer,FluidStack> MercuryRecipes = new HashMap<>();
        MercuryRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        MercuryRecipes.put(1 , Materials.Antimony.getMolten(1000));
        MercuryRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        MercuryRecipes.put(3 , Materials.Bismuth.getMolten(1000));
        MercuryRecipes.put(4 , Materials.Calcium.getMolten(1000));
        MercuryRecipes.put(5 , Materials.Chrome.getMolten(1000));
        MercuryRecipes.put(6 , Materials.Copper.getMolten(1000));
        MercuryRecipes.put(7 , Materials.Draconium.getMolten(1000));
        MercuryRecipes.put(8 , Materials.Electrotine.getMolten(1000));
        MercuryRecipes.put(9 , Materials.Iridium.getMolten(1000));
        MercuryRecipes.put(10, Materials.Iron.getMolten(1000));
        MercuryRecipes.put(11, Materials.Lead.getMolten(1000));
        MercuryRecipes.put(12, Materials.Molybdenum.getMolten(1000));
        MercuryRecipes.put(13, Materials.Naquadah.getMolten(1000));
        MercuryRecipes.put(14, Materials.NaquadahEnriched.getMolten(1000));
        MercuryRecipes.put(15, Materials.Naquadria.getMolten(1000));
        MercuryRecipes.put(16, Materials.Nickel.getMolten(1000));
        MercuryRecipes.put(17, Materials.Osmium.getMolten(1000));
        MercuryRecipes.put(18, Materials.Palladium.getMolten(1000));
        MercuryRecipes.put(19, Materials.Platinum.getMolten(1000));
        MercuryRecipes.put(20, WerkstoffLoader.Rhodium.getMolten(1000));
        MercuryRecipes.put(21, WerkstoffLoader.Ruthenium.getMolten(1000));
        MercuryRecipes.put(22, Materials.Silicon.getMolten(1000));
        MercuryRecipes.put(23, Materials.Thaumium.getMolten(1000));
        MercuryRecipes.put(24, Materials.Titanium.getMolten(1000));
        MercuryRecipes.put(25, Materials.Vinteum.getMolten(1000));

        MercuryRecipes.put(26, Materials.Mercury.getFluid(1000));

        MercuryRecipes.put(27, Materials.Chlorine.getGas(1000));
        MercuryRecipes.put(28, Materials.Helium_3.getGas(1000));
        MercuryRecipes.put(29, Materials.Hydrogen.getGas(1000));
        MercuryRecipes.put(30, Materials.Nitrogen.getGas(1000));
        MercuryRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MercuryRecipes.size(); i++) {
            FluidStack OutPutFluid = MercuryRecipes.get(i);
            addSingularityFluidRecipes("T4: Mercury", OutPutFluid);
        }

        //T4 - Venus - Ve
        Map<Integer,FluidStack> VenusRecipes = new HashMap<>();
        VenusRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        VenusRecipes.put(1 , Materials.Antimony.getMolten(1000));
        VenusRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        VenusRecipes.put(3 , Materials.Barium.getMolten(1000));
        VenusRecipes.put(4 , Materials.Beryllium.getMolten(1000));
        VenusRecipes.put(5 , Materials.Cerium.getMolten(1000));
        VenusRecipes.put(6 , Materials.Chrome.getMolten(1000));
        VenusRecipes.put(7 , Materials.Cobalt.getMolten(1000));
        VenusRecipes.put(8 , Materials.Copper.getMolten(1000));
        VenusRecipes.put(9 , Materials.Gadolinium.getMolten(1000));
        VenusRecipes.put(10, Materials.Holmium.getMolten(1000));
        VenusRecipes.put(11, Materials.Iridium.getMolten(1000));
        VenusRecipes.put(12, Materials.Iron.getMolten(1000));
        VenusRecipes.put(13, Materials.Lanthanum.getMolten(1000));
        VenusRecipes.put(14, Materials.Lead.getMolten(1000));
        VenusRecipes.put(15, Materials.MeteoricIron.getMolten(1000));
        VenusRecipes.put(16, Materials.Naquadah.getMolten(1000));
        VenusRecipes.put(17, Materials.NaquadahEnriched.getMolten(1000));
        VenusRecipes.put(18, Materials.Naquadria.getMolten(1000));
        VenusRecipes.put(19, Materials.Neodymium.getMolten(1000));
        VenusRecipes.put(20, Materials.Nickel.getMolten(1000));
        VenusRecipes.put(21, Materials.Osmium.getMolten(1000));
        VenusRecipes.put(22, Materials.Palladium.getMolten(1000));
        VenusRecipes.put(23, Materials.Platinum.getMolten(1000));
        VenusRecipes.put(24, Materials.Quantium.getMolten(1000));
        VenusRecipes.put(25, WerkstoffLoader.Rhodium.getMolten(1000));
        VenusRecipes.put(26, WerkstoffLoader.Ruthenium.getMolten(1000));
        VenusRecipes.put(27, Materials.Samarium.getMolten(1000));
        VenusRecipes.put(28, Materials.Silicon.getMolten(1000));
        VenusRecipes.put(29, Materials.Silver.getMolten(1000));
        VenusRecipes.put(30, Materials.Thorium.getMolten(1000));
        VenusRecipes.put(31, Materials.Tin.getMolten(1000));
        VenusRecipes.put(32, Materials.Titanium.getMolten(1000));
        VenusRecipes.put(33, Materials.Uranium.getMolten(1000));
        VenusRecipes.put(34, Materials.Zinc.getMolten(1000));

        VenusRecipes.put(35, Materials.Mercury.getFluid(1000));
        VenusRecipes.put(36, Materials.SulfuricAcid.getFluid(1000));

        VenusRecipes.put(37, Materials.CarbonDioxide.getGas(1000));
        VenusRecipes.put(38, Materials.Hydrogen.getGas(1000));
        VenusRecipes.put(39, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < VenusRecipes.size(); i++) {
            FluidStack OutPutFluid = VenusRecipes.get(i);
            addSingularityFluidRecipes("T4: Venus", OutPutFluid);
        }

        //T5 - Enceladus - En
        Map<Integer,FluidStack> EnceladusRecipes = new HashMap<>();
        EnceladusRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        EnceladusRecipes.put(1 , Materials.Calcium.getMolten(1000));
        EnceladusRecipes.put(2 , Materials.Cerium.getMolten(1000));
        EnceladusRecipes.put(3 , Materials.Chrome.getMolten(1000));
        EnceladusRecipes.put(4 , Materials.Copper.getMolten(1000));
        EnceladusRecipes.put(5 , Materials.Gadolinium.getMolten(1000));
        EnceladusRecipes.put(6 , Materials.Holmium.getMolten(1000));
        EnceladusRecipes.put(7 , Materials.Iridium.getMolten(1000));
        EnceladusRecipes.put(8 , Materials.Iron.getMolten(1000));
        EnceladusRecipes.put(9 , Materials.Lanthanum.getMolten(1000));
        EnceladusRecipes.put(10, Materials.Ledox.getMolten(1000));
        EnceladusRecipes.put(11, Materials.Lithium.getMolten(1000));
        EnceladusRecipes.put(12, Materials.Neodymium.getMolten(1000));
        EnceladusRecipes.put(13, Materials.Nickel.getMolten(1000));
        EnceladusRecipes.put(14, Materials.Orichalcum.getMolten(1000));
        EnceladusRecipes.put(15, Materials.Osmium.getMolten(1000));
        EnceladusRecipes.put(16, Materials.Palladium.getMolten(1000));
        EnceladusRecipes.put(17, Materials.Platinum.getMolten(1000));
        EnceladusRecipes.put(18, WerkstoffLoader.Rhodium.getMolten(1000));
        EnceladusRecipes.put(19, Materials.Rubracium.getMolten(1000));
        EnceladusRecipes.put(20, WerkstoffLoader.Ruthenium.getMolten(1000));
        EnceladusRecipes.put(21, Materials.Samarium.getMolten(1000));
        EnceladusRecipes.put(22, Materials.Silicon.getMolten(1000));
        EnceladusRecipes.put(23, Materials.Tungsten.getMolten(1000));
        EnceladusRecipes.put(24, Materials.Vanadium.getMolten(1000));
        EnceladusRecipes.put(25, Materials.Uranium.getMolten(1000));

        EnceladusRecipes.put(26, Materials.Chlorine.getGas(1000));
        EnceladusRecipes.put(27, Materials.Hydrogen.getGas(1000));
        EnceladusRecipes.put(28, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < EnceladusRecipes.size(); i++) {
            FluidStack OutPutFluid = EnceladusRecipes.get(i);
            addSingularityFluidRecipes("T5: Enceladus", OutPutFluid);
        }

        //T5 - Miranda - Mi
        Map<Integer,FluidStack> MirandaRecipes = new HashMap<>();
        MirandaRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        MirandaRecipes.put(1 , Materials.Antimony.getMolten(1000));
        MirandaRecipes.put(2 , Materials.Calcium.getMolten(1000));
        MirandaRecipes.put(3 , Materials.Chrome.getMolten(1000));
        MirandaRecipes.put(4 , Materials.Copper.getMolten(1000));
        MirandaRecipes.put(5 , Materials.Desh.getMolten(1000));
        MirandaRecipes.put(6 , Materials.Draconium.getMolten(1000));
        MirandaRecipes.put(7 , Materials.Electrotine.getMolten(1000));
        MirandaRecipes.put(8 , Materials.Iridium.getMolten(1000));
        MirandaRecipes.put(9 , Materials.Iron.getMolten(1000));
        MirandaRecipes.put(10, Materials.Lithium.getMolten(1000));
        MirandaRecipes.put(11, Materials.Magnesium.getMolten(1000));
        MirandaRecipes.put(12, Materials.Manganese.getMolten(1000));
        MirandaRecipes.put(13, Materials.Nickel.getMolten(1000));
        MirandaRecipes.put(14, Materials.Niobium.getMolten(1000));
        MirandaRecipes.put(15, Materials.Osmium.getMolten(1000));
        MirandaRecipes.put(16, Materials.Palladium.getMolten(1000));
        MirandaRecipes.put(17, Materials.Platinum.getMolten(1000));
        MirandaRecipes.put(18, WerkstoffLoader.Rhodium.getMolten(1000));
        MirandaRecipes.put(19, WerkstoffLoader.Ruthenium.getMolten(1000));
        MirandaRecipes.put(20, Materials.Silicon.getMolten(1000));
        MirandaRecipes.put(21, Materials.Tantalum.getMolten(1000));
        MirandaRecipes.put(22, Materials.Thaumium.getMolten(1000));
        MirandaRecipes.put(23, Materials.Titanium.getMolten(1000));
        MirandaRecipes.put(24, Materials.Tin.getMolten(1000));
        MirandaRecipes.put(25, Materials.Tungsten.getMolten(1000));
        MirandaRecipes.put(26, Materials.Vinteum.getMolten(1000));

        MirandaRecipes.put(27, Materials.Mercury.getFluid(1000));

        MirandaRecipes.put(28, Materials.Chlorine.getGas(1000));
        MirandaRecipes.put(29, Materials.Fluorine.getGas(1000));
        MirandaRecipes.put(30, Materials.Hydrogen.getGas(1000));
        MirandaRecipes.put(31, Materials.HydricSulfide.getGas(1000));
        MirandaRecipes.put(32, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MirandaRecipes.size(); i++) {
            FluidStack OutPutFluid = MirandaRecipes.get(i);
            addSingularityFluidRecipes("T5: Miranda", OutPutFluid);
        }

        //T5 - Oberon - Ob
        Map<Integer,FluidStack> OberonRecipes = new HashMap<>();
        OberonRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        OberonRecipes.put(1 , Materials.Calcium.getMolten(1000));
        OberonRecipes.put(2 , Materials.Chrome.getMolten(1000));
        OberonRecipes.put(3 , Materials.Copper.getMolten(1000));
        OberonRecipes.put(4 , Materials.DeepIron.getMolten(1000));
        OberonRecipes.put(5 , Materials.Iridium.getMolten(1000));
        OberonRecipes.put(6 , Materials.Iron.getMolten(1000));
        OberonRecipes.put(7 , Materials.Lead.getMolten(1000));
        OberonRecipes.put(8 , Materials.Lithium.getMolten(1000));
        OberonRecipes.put(9 , Materials.Manganese.getMolten(1000));
        OberonRecipes.put(10, Materials.Naquadah.getMolten(1000));
        OberonRecipes.put(11, Materials.NaquadahEnriched.getMolten(1000));
        OberonRecipes.put(12, Materials.Naquadria.getMolten(1000));
        OberonRecipes.put(13, Materials.Nickel.getMolten(1000));
        OberonRecipes.put(14, Materials.Osmium.getMolten(1000));
        OberonRecipes.put(15, Materials.Palladium.getMolten(1000));
        OberonRecipes.put(16, Materials.Platinum.getMolten(1000));
        OberonRecipes.put(17, WerkstoffLoader.Rhodium.getMolten(1000));
        OberonRecipes.put(18, WerkstoffLoader.Ruthenium.getMolten(1000));
        OberonRecipes.put(19, Materials.ShadowIron.getMolten(1000));
        OberonRecipes.put(20, Materials.Silicon.getMolten(1000));
        OberonRecipes.put(21, Materials.Tantalum.getMolten(1000));
        OberonRecipes.put(22, Materials.Thorium.getMolten(1000));
        OberonRecipes.put(23, Materials.Tritium.getMolten(1000));
        OberonRecipes.put(24, Materials.Tungsten.getMolten(1000));
        OberonRecipes.put(25, Materials.Uranium.getMolten(1000));

        OberonRecipes.put(26, Materials.CarbonMonoxide.getGas(1000));
        OberonRecipes.put(27, Materials.Chlorine.getGas(1000));
        OberonRecipes.put(28, Materials.Hydrogen.getGas(1000));
        OberonRecipes.put(39, Materials.Nitrogen.getGas(1000));
        OberonRecipes.put(30, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < OberonRecipes.size(); i++) {
            FluidStack OutPutFluid = OberonRecipes.get(i);
            addSingularityFluidRecipes("T5: Oberon", OutPutFluid);
        }

        //T5 - Titan - Ti
        Map<Integer,FluidStack> TitanRecipes = new HashMap<>();
        TitanRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        TitanRecipes.put(1 , Materials.Antimony.getMolten(1000));
        TitanRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        TitanRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        TitanRecipes.put(4 , Materials.Bismuth.getMolten(1000));
        TitanRecipes.put(5 , Materials.Calcium.getMolten(1000));
        TitanRecipes.put(6 , Materials.Cerium.getMolten(1000));
        TitanRecipes.put(7 , Materials.Chrome.getMolten(1000));
        TitanRecipes.put(8 , Materials.Cobalt.getMolten(1000));
        TitanRecipes.put(9 , Materials.Gadolinium.getMolten(1000));
        TitanRecipes.put(10, Materials.Gold.getMolten(1000));
        TitanRecipes.put(11, Materials.Holmium.getMolten(1000));
        TitanRecipes.put(12, Materials.InfusedGold.getMolten(1000));
        TitanRecipes.put(13, Materials.Iridium.getMolten(1000));
        TitanRecipes.put(14, Materials.Iron.getMolten(1000));
        TitanRecipes.put(15, Materials.Lanthanum.getMolten(1000));
        TitanRecipes.put(16, Materials.Lead.getMolten(1000));
        TitanRecipes.put(17, Materials.Magnesium.getMolten(1000));
        TitanRecipes.put(18, Materials.Manganese.getMolten(1000));
        TitanRecipes.put(19, Materials.MeteoricIron.getMolten(1000));
        TitanRecipes.put(20, Materials.Molybdenum.getMolten(1000));
        TitanRecipes.put(21, Materials.Naquadah.getMolten(1000));
        TitanRecipes.put(22, Materials.NaquadahEnriched.getMolten(1000));
        TitanRecipes.put(23, Materials.Naquadria.getMolten(1000));
        TitanRecipes.put(24, Materials.Neodymium.getMolten(1000));
        TitanRecipes.put(25, Materials.Nickel.getMolten(1000));
        TitanRecipes.put(26, Materials.Osmium.getMolten(1000));
        TitanRecipes.put(27, Materials.Palladium.getMolten(1000));
        TitanRecipes.put(28, Materials.Platinum.getMolten(1000));
        TitanRecipes.put(29, WerkstoffLoader.Rhodium.getMolten(1000));
        TitanRecipes.put(30, WerkstoffLoader.Ruthenium.getMolten(1000));
        TitanRecipes.put(31, Materials.Samarium.getMolten(1000));
        TitanRecipes.put(32, Materials.Silicon.getMolten(1000));
        TitanRecipes.put(33, Materials.Tantalum.getMolten(1000));
        TitanRecipes.put(34, Materials.Thorium.getMolten(1000));
        TitanRecipes.put(35, Materials.Titanium.getMolten(1000));

        TitanRecipes.put(36, Materials.Argon.getGas(1000));
        TitanRecipes.put(37, Materials.Chlorine.getGas(1000));
        TitanRecipes.put(38, Materials.Deuterium.getGas(1000));
        TitanRecipes.put(39, Materials.Ethane.getGas(1000));
        TitanRecipes.put(40, Materials.Hydrogen.getGas(1000));
        TitanRecipes.put(41, Materials.Methane.getGas(1000));
        TitanRecipes.put(42, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TitanRecipes.size(); i++) {
            FluidStack OutPutFluid = TitanRecipes.get(i);
            addSingularityFluidRecipes("T5: Titan", OutPutFluid);
        }

        //T5 - Ross128ba - Ra
        Map<Integer,FluidStack> Ross128baRecipes = new HashMap<>();
        Ross128baRecipes.put(0 , Materials.Helium_3.getGas(1000));
        Ross128baRecipes.put(1 , WerkstoffLoader.Krypton.getFluidOrGas(1000));
        Ross128baRecipes.put(2 , WerkstoffLoader.Neon.getFluidOrGas(1000));
        Ross128baRecipes.put(3 , Materials.SaltWater.getFluid(1000));
        Ross128baRecipes.put(4 , WerkstoffLoader.Xenon.getFluidOrGas(1000));

        for (int i = 0; i < Ross128baRecipes.size(); i++) {
            FluidStack OutPutFluid = Ross128baRecipes.get(i);
            addSingularityFluidRecipes("T5: Ross128ba", OutPutFluid);
        }

        //T6 - Proteus - Pr
        Map<Integer,FluidStack> ProteusRecipes = new HashMap<>();
        ProteusRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        ProteusRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        ProteusRecipes.put(2 , Materials.Barium.getMolten(1000));
        ProteusRecipes.put(3 , Materials.Calcium.getMolten(1000));
        ProteusRecipes.put(4 , Materials.Chrome.getMolten(1000));
        ProteusRecipes.put(5 , Materials.Copper.getMolten(1000));
        ProteusRecipes.put(6 , Materials.DeepIron.getMolten(1000));
        ProteusRecipes.put(7 , Materials.Gold.getMolten(1000));
        ProteusRecipes.put(8 , Materials.Iridium.getMolten(1000));
        ProteusRecipes.put(9 , Materials.Iron.getMolten(1000));
        ProteusRecipes.put(10, Materials.InfusedGold.getMolten(1000));
        ProteusRecipes.put(11, Materials.Lead.getMolten(1000));
        ProteusRecipes.put(12, Materials.Magnesium.getMolten(1000));
        ProteusRecipes.put(13, Materials.Molybdenum.getMolten(1000));
        ProteusRecipes.put(14, Materials.Naquadah.getMolten(1000));
        ProteusRecipes.put(15, Materials.Neutronium.getMolten(1000));
        ProteusRecipes.put(16, Materials.Nickel.getMolten(1000));
        ProteusRecipes.put(17, Materials.Osmium.getMolten(1000));
        ProteusRecipes.put(18, Materials.Palladium.getMolten(1000));
        ProteusRecipes.put(19, Materials.Platinum.getMolten(1000));
        ProteusRecipes.put(20, WerkstoffLoader.Rhodium.getMolten(1000));
        ProteusRecipes.put(21, WerkstoffLoader.Ruthenium.getMolten(1000));
        ProteusRecipes.put(22, Materials.ShadowIron.getMolten(1000));
        ProteusRecipes.put(23, Materials.Silicon.getMolten(1000));
        ProteusRecipes.put(24, Materials.Titanium.getMolten(1000));
        ProteusRecipes.put(25, Materials.Trinium.getMolten(1000));
        ProteusRecipes.put(26, Materials.Tungsten.getMolten(1000));
        ProteusRecipes.put(27, Materials.Uranium.getMolten(1000));
        ProteusRecipes.put(28, Materials.Vanadium.getMolten(1000));

        ProteusRecipes.put(29, Materials.Ammonia.getGas(1000));
        ProteusRecipes.put(30, Materials.Deuterium.getGas(1000));
        ProteusRecipes.put(31, Materials.Helium_3.getGas(1000));
        ProteusRecipes.put(32, Materials.Hydrogen.getGas(1000));
        ProteusRecipes.put(33, Materials.Oxygen.getGas(1000));
        ProteusRecipes.put(34, Materials.Tritium.getGas(1000));

        for (int i = 0; i < ProteusRecipes.size(); i++) {
            FluidStack OutPutFluid = ProteusRecipes.get(i);
            addSingularityFluidRecipes("T6: Proteus", OutPutFluid);
        }

        //T6 - Triton - Tr
        Map<Integer,FluidStack> TritonRecipes = new HashMap<>();
        TritonRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        TritonRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        TritonRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        TritonRecipes.put(3 , Materials.Calcium.getMolten(1000));
        TritonRecipes.put(4 , Materials.Cerium.getMolten(1000));
        TritonRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        TritonRecipes.put(6 , Materials.DeepIron.getMolten(1000));
        TritonRecipes.put(7 , Materials.Gadolinium.getMolten(1000));
        TritonRecipes.put(8 , Materials.Gallium.getMolten(1000));
        TritonRecipes.put(9 , Materials.Gold.getMolten(1000));
        TritonRecipes.put(10, Materials.Holmium.getMolten(1000));
        TritonRecipes.put(11, Materials.Iridium.getMolten(1000));
        TritonRecipes.put(12, Materials.Iron.getMolten(1000));
        TritonRecipes.put(13, Materials.Lanthanum.getMolten(1000));
        TritonRecipes.put(14, Materials.Lead.getMolten(1000));
        TritonRecipes.put(15, Materials.Lithium.getMolten(1000));
        TritonRecipes.put(16, Materials.Manganese.getMolten(1000));
        TritonRecipes.put(17, Materials.Mithril.getMolten(1000));
        TritonRecipes.put(18, Materials.Naquadah.getMolten(1000));
        TritonRecipes.put(19, Materials.Neodymium.getMolten(1000));
        TritonRecipes.put(20, Materials.Neutronium.getMolten(1000));
        TritonRecipes.put(21, Materials.Nickel.getMolten(1000));
        TritonRecipes.put(22, Materials.Niobium.getMolten(1000));
        TritonRecipes.put(23, Materials.Osmium.getMolten(1000));
        TritonRecipes.put(24, Materials.Palladium.getMolten(1000));
        TritonRecipes.put(25, Materials.Platinum.getMolten(1000));
        TritonRecipes.put(26, Materials.Plutonium241.getMolten(1000));
        TritonRecipes.put(27, WerkstoffLoader.Rhodium.getMolten(1000));
        TritonRecipes.put(28, WerkstoffLoader.Ruthenium.getMolten(1000));
        TritonRecipes.put(29, Materials.Samarium.getMolten(1000));
        TritonRecipes.put(30, Materials.ShadowIron.getMolten(1000));
        TritonRecipes.put(31, Materials.Silicon.getMolten(1000));
        TritonRecipes.put(32, Materials.Silver.getMolten(1000));
        TritonRecipes.put(33, Materials.Tantalum.getMolten(1000));
        TritonRecipes.put(34, Materials.Thaumium.getMolten(1000));
        TritonRecipes.put(35, Materials.Thorium.getMolten(1000));
        TritonRecipes.put(36, Materials.Titanium.getMolten(1000));
        TritonRecipes.put(37, Materials.Tungsten.getMolten(1000));
        TritonRecipes.put(38, Materials.Uranium.getMolten(1000));
        TritonRecipes.put(39, Materials.Uranium235.getMolten(1000));
        TritonRecipes.put(40, Materials.Vanadium.getMolten(1000));
        TritonRecipes.put(41, Materials.Yttrium.getMolten(1000));

        TritonRecipes.put(42, Materials.Chlorine.getGas(1000));
        TritonRecipes.put(43, Materials.Ethylene.getGas(1000));
        TritonRecipes.put(44, Materials.Hydrogen.getGas(1000));
        TritonRecipes.put(45, Materials.Nitrogen.getGas(1000));
        TritonRecipes.put(46, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TritonRecipes.size(); i++) {
            FluidStack OutPutFluid = TritonRecipes.get(i);
            addSingularityFluidRecipes("T6: Triton", OutPutFluid);
        }

        //T7 - Haumea - Ha
        Map<Integer,FluidStack>HaumeaRecipes = new HashMap<>();
        HaumeaRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        HaumeaRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        HaumeaRecipes.put(2 , Materials.Beryllium.getMolten(1000));
        HaumeaRecipes.put(3 , Materials.Calcium.getMolten(1000));
        HaumeaRecipes.put(4 , Materials.Cerium.getMolten(1000));
        HaumeaRecipes.put(5 , Materials.Chrome.getMolten(1000));
        HaumeaRecipes.put(6 , Materials.Gadolinium.getMolten(1000));
        HaumeaRecipes.put(7 , Materials.Gold.getMolten(1000));
        HaumeaRecipes.put(8 , Materials.Holmium.getMolten(1000));
        HaumeaRecipes.put(9 , Materials.InfusedGold.getMolten(1000));
        HaumeaRecipes.put(10, Materials.Iron.getMolten(1000));
        HaumeaRecipes.put(11, Materials.Lanthanum.getMolten(1000));
        HaumeaRecipes.put(12, Materials.Lead.getMolten(1000));
        HaumeaRecipes.put(13, Materials.Lithium.getMolten(1000));
        HaumeaRecipes.put(14, Materials.Magnesium.getMolten(1000));
        HaumeaRecipes.put(15, Materials.Manganese.getMolten(1000));
        HaumeaRecipes.put(16, Materials.Naquadah.getMolten(1000));
        HaumeaRecipes.put(17, Materials.NaquadahEnriched.getMolten(1000));
        HaumeaRecipes.put(18, Materials.Naquadria.getMolten(1000));
        HaumeaRecipes.put(19, Materials.Neodymium.getMolten(1000));
        HaumeaRecipes.put(20, Materials.Neutronium.getMolten(1000));
        HaumeaRecipes.put(21, Materials.Platinum.getMolten(1000));
        HaumeaRecipes.put(22, Materials.Plutonium241.getMolten(1000));
        HaumeaRecipes.put(23, Materials.Potassium.getMolten(1000));
        HaumeaRecipes.put(24, Materials.Samarium.getMolten(1000));
        HaumeaRecipes.put(25, Materials.Silicon.getMolten(1000));
        HaumeaRecipes.put(26, Materials.Thorium.getMolten(1000));
        HaumeaRecipes.put(27, Materials.Titanium.getMolten(1000));
        HaumeaRecipes.put(28, Materials.Tungsten.getMolten(1000));
        HaumeaRecipes.put(29, Materials.Uranium.getMolten(1000));
        HaumeaRecipes.put(30, Materials.Uranium235.getMolten(1000));

        HaumeaRecipes.put(31, Materials.Hydrogen.getGas(1000));
        HaumeaRecipes.put(32, Materials.Nitrogen.getGas(1000));
        HaumeaRecipes.put(33, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < HaumeaRecipes.size(); i++) {
            FluidStack OutPutFluid = HaumeaRecipes.get(i);
            addSingularityFluidRecipes("T7: Haumea", OutPutFluid);
        }

        //T7 - Kuiperbelt - KB
        Map<Integer,FluidStack> KuiperbeltRecipes = new HashMap<>();
        KuiperbeltRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        KuiperbeltRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        KuiperbeltRecipes.put(2 , Materials.Antimony.getMolten(1000));
        KuiperbeltRecipes.put(3 , Materials.Arsenic.getMolten(1000));
        KuiperbeltRecipes.put(4 , Materials.Calcium.getMolten(1000));
        KuiperbeltRecipes.put(5 , Materials.Chrome.getMolten(1000));
        KuiperbeltRecipes.put(6 , Materials.Cobalt.getMolten(1000));
        KuiperbeltRecipes.put(7 , Materials.Copper.getMolten(1000));
        KuiperbeltRecipes.put(8 , Materials.Iridium.getMolten(1000));
        KuiperbeltRecipes.put(9 , Materials.Iron.getMolten(1000));
        KuiperbeltRecipes.put(10, Materials.Lead.getMolten(1000));
        KuiperbeltRecipes.put(11, Materials.Lithium.getMolten(1000));
        KuiperbeltRecipes.put(12, Materials.Mithril.getMolten(1000));
        KuiperbeltRecipes.put(13, Materials.Naquadah.getMolten(1000));
        KuiperbeltRecipes.put(14, Materials.NaquadahEnriched.getMolten(1000));
        KuiperbeltRecipes.put(15, Materials.Naquadria.getMolten(1000));
        KuiperbeltRecipes.put(16, Materials.Neutronium.getMolten(1000));
        KuiperbeltRecipes.put(17, Materials.Nickel.getMolten(1000));
        KuiperbeltRecipes.put(18, Materials.Osmium.getMolten(1000));
        KuiperbeltRecipes.put(19, Materials.Palladium.getMolten(1000));
        KuiperbeltRecipes.put(20, Materials.Platinum.getMolten(1000));
        KuiperbeltRecipes.put(21, WerkstoffLoader.Rhodium.getMolten(1000));
        KuiperbeltRecipes.put(22, WerkstoffLoader.Ruthenium.getMolten(1000));
        KuiperbeltRecipes.put(23, Materials.Thaumium.getMolten(1000));
        KuiperbeltRecipes.put(24, Materials.Thorium.getMolten(1000));
        KuiperbeltRecipes.put(25, Materials.Titanium.getMolten(1000));
        KuiperbeltRecipes.put(26, Materials.Tungsten.getMolten(1000));
        KuiperbeltRecipes.put(27, Materials.Uranium.getMolten(1000));

        KuiperbeltRecipes.put(28, Materials.Hydrogen.getGas(1000));
        KuiperbeltRecipes.put(29, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < KuiperbeltRecipes.size(); i++) {
            FluidStack OutPutFluid = KuiperbeltRecipes.get(i);
            addSingularityFluidRecipes("T7: Kuiperbelt", OutPutFluid);
        }

        //T7 - Makemake - MM
        Map<Integer,FluidStack> MakemakeRecipes = new HashMap<>();
        MakemakeRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        MakemakeRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        MakemakeRecipes.put(2 , Materials.Beryllium.getMolten(1000));
        MakemakeRecipes.put(3 , Materials.BlackPlutonium.getMolten(1000));
        MakemakeRecipes.put(4 , Materials.Boron.getMolten(1000));
        MakemakeRecipes.put(5 , Materials.Calcium.getMolten(1000));
        MakemakeRecipes.put(6 , Materials.Cerium.getMolten(1000));
        MakemakeRecipes.put(7 , Materials.Chrome.getMolten(1000));
        MakemakeRecipes.put(8 , Materials.Gadolinium.getMolten(1000));
        MakemakeRecipes.put(9 , Materials.Gallium.getMolten(1000));
        MakemakeRecipes.put(10, Materials.Gold.getMolten(1000));
        MakemakeRecipes.put(11, Materials.Holmium.getMolten(1000));
        MakemakeRecipes.put(12, Materials.Iron.getMolten(1000));
        MakemakeRecipes.put(13, Materials.Lanthanum.getMolten(1000));
        MakemakeRecipes.put(14, Materials.Lead.getMolten(1000));
        MakemakeRecipes.put(15, Materials.Lithium.getMolten(1000));
        MakemakeRecipes.put(16, Materials.Magnesium.getMolten(1000));
        MakemakeRecipes.put(17, Materials.Manganese.getMolten(1000));
        MakemakeRecipes.put(18, Materials.Naquadah.getMolten(1000));
        MakemakeRecipes.put(19, Materials.Neodymium.getMolten(1000));
        MakemakeRecipes.put(20, Materials.Neutronium.getMolten(1000));
        MakemakeRecipes.put(21, Materials.Niobium.getMolten(1000));
        MakemakeRecipes.put(22, Materials.Potassium.getMolten(1000));
        MakemakeRecipes.put(23, Materials.Realgar.getMolten(1000));
        MakemakeRecipes.put(24, Materials.Samarium.getMolten(1000));
        MakemakeRecipes.put(25, Materials.Silicon.getMolten(1000));
        MakemakeRecipes.put(26, Materials.Thorium.getMolten(1000));
        MakemakeRecipes.put(27, Materials.Titanium.getMolten(1000));
        MakemakeRecipes.put(28, Materials.Tungsten.getMolten(1000));
        MakemakeRecipes.put(29, Materials.Uranium.getMolten(1000));
        MakemakeRecipes.put(30, Materials.Vanadium.getMolten(1000));
        MakemakeRecipes.put(31, Materials.Yttrium.getMolten(1000));

        MakemakeRecipes.put(32, Materials.HydrofluoricAcid.getFluid(1000));

        MakemakeRecipes.put(33, Materials.Hydrogen.getGas(1000));
        MakemakeRecipes.put(34, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MakemakeRecipes.size(); i++) {
            FluidStack OutPutFluid = MakemakeRecipes.get(i);
            addSingularityFluidRecipes("T7: Makemake", OutPutFluid);
        }

        //T7 - Pluto - Pl
        Map<Integer,FluidStack> PlutoRecipes = new HashMap<>();
        PlutoRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        PlutoRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        PlutoRecipes.put(2 , Materials.Beryllium.getMolten(1000));
        PlutoRecipes.put(3 , Materials.BlackPlutonium.getMolten(1000));
        PlutoRecipes.put(4 , Materials.Boron.getMolten(1000));
        PlutoRecipes.put(5 , Materials.Calcium.getMolten(1000));
        PlutoRecipes.put(6 , Materials.Chrome.getMolten(1000));
        PlutoRecipes.put(7 , Materials.Copper.getMolten(1000));
        PlutoRecipes.put(8 , Materials.DeepIron.getMolten(1000));
        PlutoRecipes.put(9 , Materials.Gold.getMolten(1000));
        PlutoRecipes.put(10, Materials.Iridium.getMolten(1000));
        PlutoRecipes.put(11, Materials.Iron.getMolten(1000));
        PlutoRecipes.put(12, Materials.Lead.getMolten(1000));
        PlutoRecipes.put(13, Materials.Lithium.getMolten(1000));
        PlutoRecipes.put(14, Materials.Magnesium.getMolten(1000));
        PlutoRecipes.put(15, Materials.Manganese.getMolten(1000));
        PlutoRecipes.put(16, Materials.Molybdenum.getMolten(1000));
        PlutoRecipes.put(17, Materials.Naquadah.getMolten(1000));
        PlutoRecipes.put(18, Materials.NaquadahEnriched.getMolten(1000));
        PlutoRecipes.put(19, Materials.Naquadria.getMolten(1000));
        PlutoRecipes.put(20, Materials.Neutronium.getMolten(1000));
        PlutoRecipes.put(21, Materials.Nickel.getMolten(1000));
        PlutoRecipes.put(22, Materials.Osmium.getMolten(1000));
        PlutoRecipes.put(23, Materials.Palladium.getMolten(1000));
        PlutoRecipes.put(24, Materials.Platinum.getMolten(1000));
        PlutoRecipes.put(25, Materials.Plutonium241.getMolten(1000));
        PlutoRecipes.put(26, Materials.Potassium.getMolten(1000));
        PlutoRecipes.put(27, WerkstoffLoader.Rhodium.getMolten(1000));
        PlutoRecipes.put(28, WerkstoffLoader.Ruthenium.getMolten(1000));
        PlutoRecipes.put(29, Materials.ShadowIron.getMolten(1000));
        PlutoRecipes.put(30, Materials.Silicon.getMolten(1000));
        PlutoRecipes.put(31, Materials.Thorium.getMolten(1000));
        PlutoRecipes.put(32, Materials.Titanium.getMolten(1000));
        PlutoRecipes.put(33, Materials.Trinium.getMolten(1000));
        PlutoRecipes.put(34, Materials.Tungsten.getMolten(1000));
        PlutoRecipes.put(35, Materials.Uranium.getMolten(1000));
        PlutoRecipes.put(36, Materials.Uranium235.getMolten(1000));
        PlutoRecipes.put(37, Materials.Vanadium.getMolten(1000));

        PlutoRecipes.put(38, Materials.LiquidAir.getFluid(1000));

        PlutoRecipes.put(39, Materials.Fluorine.getGas(1000));
        PlutoRecipes.put(40, Materials.Hydrogen.getGas(1000));
        PlutoRecipes.put(41, Materials.Nitrogen.getGas(1000));
        PlutoRecipes.put(42, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < PlutoRecipes.size(); i++) {
            FluidStack OutPutFluid = PlutoRecipes.get(i);
            addSingularityFluidRecipes("T7: Pluto", OutPutFluid);
        }

        //T8 - BarnardC - BC
        Map<Integer,FluidStack> BarnardCRecipes = new HashMap<>();
        BarnardCRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        BarnardCRecipes.put(1 , Materials.Antimony.getMolten(1000));
        BarnardCRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        BarnardCRecipes.put(3 , Materials.Bismuth.getMolten(1000));
        BarnardCRecipes.put(4 , Materials.BlackPlutonium.getMolten(1000));
        BarnardCRecipes.put(5 , Materials.Boron.getMolten(1000));
        BarnardCRecipes.put(6 , Materials.Caesium.getMolten(1000));
        BarnardCRecipes.put(7 , Materials.Calcium.getMolten(1000));
        BarnardCRecipes.put(8 , Materials.Cerium.getMolten(1000));
        BarnardCRecipes.put(9 , Materials.Chrome.getMolten(1000));
        BarnardCRecipes.put(10, Materials.DeepIron.getMolten(1000));
        BarnardCRecipes.put(11, Materials.Gadolinium.getMolten(1000));
        BarnardCRecipes.put(12, Materials.Holmium.getMolten(1000));
        BarnardCRecipes.put(13, Materials.Iridium.getMolten(1000));
        BarnardCRecipes.put(14, Materials.Iron.getMolten(1000));
        BarnardCRecipes.put(15, Materials.Lanthanum.getMolten(1000));
        BarnardCRecipes.put(16, Materials.Lithium.getMolten(1000));
        BarnardCRecipes.put(17, Materials.Magnesium.getMolten(1000));
        BarnardCRecipes.put(18, Materials.Manganese.getMolten(1000));
        BarnardCRecipes.put(19, Materials.Neodymium.getMolten(1000));
        BarnardCRecipes.put(20, Materials.Nickel.getMolten(1000));
        BarnardCRecipes.put(21, Materials.Potassium.getMolten(1000));
        BarnardCRecipes.put(22, Materials.Samarium.getMolten(1000));
        BarnardCRecipes.put(23, Materials.ShadowIron.getMolten(1000));
        BarnardCRecipes.put(24, Materials.Silicon.getMolten(1000));
        BarnardCRecipes.put(25, Materials.Tartarite.getMolten(1000));
        BarnardCRecipes.put(26, Materials.Thaumium.getMolten(1000));
        BarnardCRecipes.put(27, Materials.Tin.getMolten(1000));
        BarnardCRecipes.put(28, Materials.Tungsten.getMolten(1000));
        BarnardCRecipes.put(29, Materials.Osmium.getMolten(1000));

        BarnardCRecipes.put(30, Materials.OilExtraHeavy.getFluid(1000));
        BarnardCRecipes.put(31, Materials.OilHeavy.getFluid(1000));

        BarnardCRecipes.put(32, Materials.Chlorine.getGas(1000));
        BarnardCRecipes.put(33, Materials.Fluorine.getGas(1000));
        BarnardCRecipes.put(34, Materials.Hydrogen.getGas(1000));
        BarnardCRecipes.put(35, Materials.Nitrogen.getGas(1000));
        BarnardCRecipes.put(36, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < BarnardCRecipes.size(); i++) {
            FluidStack OutPutFluid = BarnardCRecipes.get(i);
            addSingularityFluidRecipes("T8: BarnardC", OutPutFluid);
        }

        //T8 - BarnardE - BE
        Map<Integer,FluidStack> BarnardERecipes = new HashMap<>();
        BarnardERecipes.put(0 , Materials.Adamantium.getMolten(1000));
        BarnardERecipes.put(1 , Materials.Aluminium.getMolten(1000));
        BarnardERecipes.put(2 , Materials.Cadmium.getMolten(1000));
        BarnardERecipes.put(3 , Materials.Caesium.getMolten(1000));
        BarnardERecipes.put(4 , Materials.Calcium.getMolten(1000));
        BarnardERecipes.put(5 , Materials.Cerium.getMolten(1000));
        BarnardERecipes.put(6 , Materials.Chrome.getMolten(1000));
        BarnardERecipes.put(7 , Materials.Copper.getMolten(1000));
        BarnardERecipes.put(8 , Materials.DeepIron.getMolten(1000));
        BarnardERecipes.put(9 , Materials.Gold.getMolten(1000));
        BarnardERecipes.put(10, Materials.InfusedGold.getMolten(1000));
        BarnardERecipes.put(11, Materials.Iron.getMolten(1000));
        BarnardERecipes.put(12, Materials.Lanthanum.getMolten(1000));
        BarnardERecipes.put(13, Materials.Lead.getMolten(1000));
        BarnardERecipes.put(14, Materials.Magnesium.getMolten(1000));
        BarnardERecipes.put(15, Materials.Manganese.getMolten(1000));
        BarnardERecipes.put(16, Materials.Molybdenum.getMolten(1000));
        BarnardERecipes.put(17, Materials.Naquadah.getMolten(1000));
        BarnardERecipes.put(18, Materials.NaquadahEnriched.getMolten(1000));
        BarnardERecipes.put(19, Materials.Naquadria.getMolten(1000));
        BarnardERecipes.put(20, Materials.Neutronium.getMolten(1000));
        BarnardERecipes.put(21, Materials.Platinum.getMolten(1000));
        BarnardERecipes.put(22, Materials.Plutonium241.getMolten(1000));
        BarnardERecipes.put(23, Materials.Potassium.getMolten(1000));
        BarnardERecipes.put(24, Materials.ShadowIron.getMolten(1000));
        BarnardERecipes.put(25, Materials.Silicon.getMolten(1000));
        BarnardERecipes.put(26, Materials.Tantalum.getMolten(1000));
        BarnardERecipes.put(27, Materials.Titanium.getMolten(1000));
        BarnardERecipes.put(28, Materials.Thaumium.getMolten(1000));
        BarnardERecipes.put(29, Materials.Thorium.getMolten(1000));
        BarnardERecipes.put(30, Materials.Tungsten.getMolten(1000));
        BarnardERecipes.put(31, Materials.Uranium.getMolten(1000));
        BarnardERecipes.put(32, Materials.Uranium235.getMolten(1000));
        BarnardERecipes.put(33, Materials.Vanadium.getMolten(1000));

        BarnardERecipes.put(34, Materials.LiquidAir.getFluid(1000));

        BarnardERecipes.put(35, Materials.Chlorine.getGas(1000));
        BarnardERecipes.put(36, Materials.Fluorine.getGas(1000));
        BarnardERecipes.put(37, Materials.Hydrogen.getGas(1000));
        BarnardERecipes.put(38, Materials.Nitrogen.getGas(1000));
        BarnardERecipes.put(39, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < BarnardERecipes.size(); i++) {
            FluidStack OutPutFluid = BarnardERecipes.get(i);
            addSingularityFluidRecipes("T8: BarnardE", OutPutFluid);
        }

        //T8 - BarnardF - BF
        Map<Integer,FluidStack> BarnardFRecipes = new HashMap<>();
        BarnardFRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        BarnardFRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        BarnardFRecipes.put(2 , Materials.Beryllium.getMolten(1000));
        BarnardFRecipes.put(3 , Materials.Cadmium.getMolten(1000));
        BarnardFRecipes.put(4 , Materials.Caesium.getMolten(1000));
        BarnardFRecipes.put(5 , Materials.Calcium.getMolten(1000));
        BarnardFRecipes.put(6 , Materials.Cerium.getMolten(1000));
        BarnardFRecipes.put(7 , Materials.Chrome.getMolten(1000));
        BarnardFRecipes.put(8 , Materials.Copper.getMolten(1000));
        BarnardFRecipes.put(9 , Materials.DeepIron.getMolten(1000));
        BarnardFRecipes.put(10, Materials.Gadolinium.getMolten(1000));
        BarnardFRecipes.put(11, Materials.Gallium.getMolten(1000));
        BarnardFRecipes.put(12, Materials.Gold.getMolten(1000));
        BarnardFRecipes.put(13, Materials.Holmium.getMolten(1000));
        BarnardFRecipes.put(14, Materials.Iron.getMolten(1000));
        BarnardFRecipes.put(15, Materials.Lanthanum.getMolten(1000));
        BarnardFRecipes.put(16, Materials.Lead.getMolten(1000));
        BarnardFRecipes.put(17, Materials.Magnesium.getMolten(1000));
        BarnardFRecipes.put(18, Materials.Manganese.getMolten(1000));
        BarnardFRecipes.put(19, Materials.Naquadah.getMolten(1000));
        BarnardFRecipes.put(20, Materials.NaquadahEnriched.getMolten(1000));
        BarnardFRecipes.put(21, Materials.Naquadria.getMolten(1000));
        BarnardFRecipes.put(22, Materials.Neodymium.getMolten(1000));
        BarnardFRecipes.put(23, Materials.Neutronium.getMolten(1000));
        BarnardFRecipes.put(24, Materials.Niobium.getMolten(1000));
        BarnardFRecipes.put(25, Materials.Plutonium241.getMolten(1000));
        BarnardFRecipes.put(26, Materials.Realgar.getMolten(1000));
        BarnardFRecipes.put(27, Materials.Samarium.getMolten(1000));
        BarnardFRecipes.put(28, Materials.ShadowIron.getMolten(1000));
        BarnardFRecipes.put(29, Materials.Silicon.getMolten(1000));
        BarnardFRecipes.put(30, Materials.Tantalum.getMolten(1000));
        BarnardFRecipes.put(31, Materials.Thaumium.getMolten(1000));
        BarnardFRecipes.put(32, Materials.Thorium.getMolten(1000));
        BarnardFRecipes.put(33, Materials.Tin.getMolten(1000));
        BarnardFRecipes.put(34, Materials.Titanium.getMolten(1000));
        BarnardFRecipes.put(35, Materials.Tungsten.getMolten(1000));
        BarnardFRecipes.put(36, Materials.Uranium.getMolten(1000));
        BarnardFRecipes.put(37, Materials.Uranium235.getMolten(1000));
        BarnardFRecipes.put(38, Materials.Vanadium.getMolten(1000));
        BarnardFRecipes.put(39, Materials.Yttrium.getMolten(1000));

        BarnardFRecipes.put(40, Materials.Mercury.getFluid(1000));

        BarnardFRecipes.put(41, Materials.Chlorine.getGas(1000));
        BarnardFRecipes.put(42, Materials.Fluorine.getGas(1000));
        BarnardFRecipes.put(43, Materials.Hydrogen.getGas(1000));
        BarnardFRecipes.put(44, Materials.Nitrogen.getGas(1000));
        BarnardFRecipes.put(45, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < BarnardFRecipes.size(); i++) {
            FluidStack OutPutFluid = BarnardFRecipes.get(i);
            addSingularityFluidRecipes("T8: BarnardF", OutPutFluid);
        }

        //T8 - α Centauri Bb - CB
        Map<Integer,FluidStack> CentauriBbRecipes = new HashMap<>();
        CentauriBbRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        CentauriBbRecipes.put(1 , Materials.Antimony.getMolten(1000));
        CentauriBbRecipes.put(2 , Materials.Barium.getMolten(1000));
        CentauriBbRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        CentauriBbRecipes.put(4 , Materials.BlackPlutonium.getMolten(1000));
        CentauriBbRecipes.put(5 , Materials.Boron.getMolten(1000));
        CentauriBbRecipes.put(6 , Materials.Cadmium.getMolten(1000));
        CentauriBbRecipes.put(7 , Materials.Caesium.getMolten(1000));
        CentauriBbRecipes.put(8 , Materials.Calcium.getMolten(1000));
        CentauriBbRecipes.put(9 , Materials.Cerium.getMolten(1000));
        CentauriBbRecipes.put(10, Materials.Chrome.getMolten(1000));
        CentauriBbRecipes.put(11, Materials.Copper.getMolten(1000));
        CentauriBbRecipes.put(12, Materials.Electrotine.getMolten(1000));
        CentauriBbRecipes.put(13, Materials.Gadolinium.getMolten(1000));
        CentauriBbRecipes.put(14, Materials.Holmium.getMolten(1000));
        CentauriBbRecipes.put(15, Materials.Iron.getMolten(1000));
        CentauriBbRecipes.put(16, Materials.Lanthanum.getMolten(1000));
        CentauriBbRecipes.put(17, Materials.Lead.getMolten(1000));
        CentauriBbRecipes.put(18, Materials.Magnesium.getMolten(1000));
        CentauriBbRecipes.put(19, Materials.Manganese.getMolten(1000));
        CentauriBbRecipes.put(20, Materials.Neodymium.getMolten(1000));
        CentauriBbRecipes.put(21, Materials.Potassium.getMolten(1000));
        CentauriBbRecipes.put(22, Materials.Samarium.getMolten(1000));
        CentauriBbRecipes.put(23, Materials.Silicon.getMolten(1000));
        CentauriBbRecipes.put(24, Materials.Tantalum.getMolten(1000));
        CentauriBbRecipes.put(25, Materials.Tartarite.getMolten(1000));
        CentauriBbRecipes.put(26, Materials.Thorium.getMolten(1000));
        CentauriBbRecipes.put(27, Materials.Tin.getMolten(1000));
        CentauriBbRecipes.put(28, Materials.Uranium.getMolten(1000));
        CentauriBbRecipes.put(29, Materials.Zinc.getMolten(1000));

        CentauriBbRecipes.put(30, Materials.Mercury.getFluid(1000));

        CentauriBbRecipes.put(31, Materials.Hydrogen.getGas(1000));
        CentauriBbRecipes.put(32, Materials.Nitrogen.getGas(1000));
        CentauriBbRecipes.put(33, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < CentauriBbRecipes.size(); i++) {
            FluidStack OutPutFluid = CentauriBbRecipes.get(i);
            addSingularityFluidRecipes("T8: α Centauri Bb", OutPutFluid);
        }

        //T8 - TCetiE - TE
        Map<Integer,FluidStack> TCetiERecipes = new HashMap<>();
        TCetiERecipes.put(0 , Materials.Aluminium.getMolten(1000));
        TCetiERecipes.put(1 , Materials.Barium.getMolten(1000));
        TCetiERecipes.put(2 , Materials.BlackPlutonium.getMolten(1000));
        TCetiERecipes.put(3 , Materials.Boron.getMolten(1000));
        TCetiERecipes.put(4 , Materials.Calcium.getMolten(1000));
        TCetiERecipes.put(5 , Materials.Chrome.getMolten(1000));
        TCetiERecipes.put(6 , Materials.Gold.getMolten(1000));
        TCetiERecipes.put(7 , Materials.Iron.getMolten(1000));
        TCetiERecipes.put(8 , Materials.Lithium.getMolten(1000));
        TCetiERecipes.put(9 , Materials.Magnesium.getMolten(1000));
        TCetiERecipes.put(10, Materials.Manganese.getMolten(1000));
        TCetiERecipes.put(11, Materials.Molybdenum.getMolten(1000));
        TCetiERecipes.put(12, Materials.Niobium.getMolten(1000));
        TCetiERecipes.put(13, Materials.Potassium.getMolten(1000));
        TCetiERecipes.put(14, Materials.Silicon.getMolten(1000));
        TCetiERecipes.put(15, Materials.Tin.getMolten(1000));
        TCetiERecipes.put(16, Materials.Titanium.getMolten(1000));
        TCetiERecipes.put(17, Materials.Tungsten.getMolten(1000));
        TCetiERecipes.put(18, Materials.Vanadium.getMolten(1000));

        TCetiERecipes.put(19, Materials.OilExtraHeavy.getFluid(1000));
        TCetiERecipes.put(20, Materials.OilHeavy.getFluid(1000));

        TCetiERecipes.put(21, Materials.Chlorine.getGas(1000));
        TCetiERecipes.put(22, Materials.Fluorine.getGas(1000));
        TCetiERecipes.put(23, Materials.Hydrogen.getGas(1000));
        TCetiERecipes.put(24, Materials.Nitrogen.getGas(1000));
        TCetiERecipes.put(25, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < TCetiERecipes.size(); i++) {
            FluidStack OutPutFluid = TCetiERecipes.get(i);
            addSingularityFluidRecipes("T8: TCetiE", OutPutFluid);
        }

        //T8 - VegaB - VB
        Map<Integer,FluidStack> VegaBRecipes = new HashMap<>();
        VegaBRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        VegaBRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        VegaBRecipes.put(2 , Materials.Antimony.getMolten(1000));
        VegaBRecipes.put(3 , Materials.Arsenic.getMolten(1000));
        VegaBRecipes.put(4 , Materials.Bismuth.getMolten(1000));
        VegaBRecipes.put(5 , Materials.Cadmium.getMolten(1000));
        VegaBRecipes.put(6 , Materials.Caesium.getMolten(1000));
        VegaBRecipes.put(7 , Materials.Calcium.getMolten(1000));
        VegaBRecipes.put(8 , Materials.Cerium.getMolten(1000));
        VegaBRecipes.put(9 , Materials.Chrome.getMolten(1000));
        VegaBRecipes.put(10, Materials.Copper.getMolten(1000));
        VegaBRecipes.put(11, Materials.Gallium.getMolten(1000));
        VegaBRecipes.put(12, Materials.Gold.getMolten(1000));
        VegaBRecipes.put(13, Materials.InfusedGold.getMolten(1000));
        VegaBRecipes.put(14, Materials.Iron.getMolten(1000));
        VegaBRecipes.put(15, Materials.Lanthanum.getMolten(1000));
        VegaBRecipes.put(16, Materials.Lead.getMolten(1000));
        VegaBRecipes.put(17, Materials.Lithium.getMolten(1000));
        VegaBRecipes.put(18, Materials.Magnesium.getMolten(1000));
        VegaBRecipes.put(19, Materials.Manganese.getMolten(1000));
        VegaBRecipes.put(20, Materials.Naquadah.getMolten(1000));
        VegaBRecipes.put(21, Materials.NaquadahEnriched.getMolten(1000));
        VegaBRecipes.put(22, Materials.Naquadria.getMolten(1000));
        VegaBRecipes.put(23, Materials.Neutronium.getMolten(1000));
        VegaBRecipes.put(24, Materials.Niobium.getMolten(1000));
        VegaBRecipes.put(25, Materials.Platinum.getMolten(1000));
        VegaBRecipes.put(26, Materials.Plutonium241.getMolten(1000));
        VegaBRecipes.put(27, Materials.Realgar.getMolten(1000));
        VegaBRecipes.put(28, Materials.Silicon.getMolten(1000));
        VegaBRecipes.put(29, Materials.Silver.getMolten(1000));
        VegaBRecipes.put(30, Materials.Thorium.getMolten(1000));
        VegaBRecipes.put(31, Materials.Titanium.getMolten(1000));
        VegaBRecipes.put(32, Materials.Tungsten.getMolten(1000));
        VegaBRecipes.put(33, Materials.Uranium.getMolten(1000));
        VegaBRecipes.put(34, Materials.Uranium235.getMolten(1000));
        VegaBRecipes.put(35, Materials.Vanadium.getMolten(1000));
        VegaBRecipes.put(36, Materials.Yttrium.getMolten(1000));

        VegaBRecipes.put(37, Materials.Mercury.getFluid(1000));

        VegaBRecipes.put(38, Materials.Chlorine.getGas(1000));
        VegaBRecipes.put(39, Materials.Hydrogen.getGas(1000));
        VegaBRecipes.put(40, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < VegaBRecipes.size(); i++) {
            FluidStack OutPutFluid = VegaBRecipes.get(i);
            addSingularityFluidRecipes("T8: VegaB", OutPutFluid);
        }

        //T9 - Anubis - An
        Map<Integer,FluidStack> AnubisRecipes = new HashMap<>();
        AnubisRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        AnubisRecipes.put(1 , Materials.Alduorite.getMolten(1000));
        AnubisRecipes.put(2 , Materials.Aluminium.getMolten(1000));
        AnubisRecipes.put(3 , Materials.Bedrockium.getMolten(1000));
        AnubisRecipes.put(4 , Materials.Caesium.getMolten(1000));
        AnubisRecipes.put(5 , Materials.Calcium.getMolten(1000));
        AnubisRecipes.put(6 , Materials.CallistoIce.getMolten(1000));
        AnubisRecipes.put(7 , Materials.Ceruclase.getMolten(1000));
        AnubisRecipes.put(8 , Materials.Desh.getMolten(1000));
        AnubisRecipes.put(9 , Materials.InfinityCatalyst.getMolten(1000));
        AnubisRecipes.put(10, Materials.Iron.getMolten(1000));
        AnubisRecipes.put(11, Materials.Lead.getMolten(1000));
        AnubisRecipes.put(12, Materials.Lithium.getMolten(1000));
        AnubisRecipes.put(13, Materials.Magnesium.getMolten(1000));
        AnubisRecipes.put(14, Materials.MeteoricIron.getMolten(1000));
        AnubisRecipes.put(15, Materials.Mytryl.getMolten(1000));
        AnubisRecipes.put(16, Materials.Neutronium.getMolten(1000));
        AnubisRecipes.put(17, Materials.Nickel.getMolten(1000));
        AnubisRecipes.put(18, Materials.Potassium.getMolten(1000));
        AnubisRecipes.put(19, Materials.Silicon.getMolten(1000));
        AnubisRecipes.put(20, Materials.Silver.getMolten(1000));
        AnubisRecipes.put(21, Materials.Tin.getMolten(1000));
        AnubisRecipes.put(22, Materials.Titanium.getMolten(1000));
        AnubisRecipes.put(23, Materials.Tungsten.getMolten(1000));
        AnubisRecipes.put(24, Materials.Vulcanite.getMolten(1000));
        AnubisRecipes.put(25, Materials.Zinc.getMolten(1000));

        AnubisRecipes.put(26, Materials.Chlorine.getGas(1000));
        AnubisRecipes.put(27, Materials.Fluorine.getGas(1000));
        AnubisRecipes.put(28, Materials.Hydrogen.getGas(1000));
        AnubisRecipes.put(29, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < AnubisRecipes.size(); i++) {
            FluidStack OutPutFluid = AnubisRecipes.get(i);
            addSingularityFluidRecipes("T9: Anubis", OutPutFluid);
        }

        //T9 - Horus - Ho
        Map<Integer,FluidStack> HorusRecipes = new HashMap<>();
        HorusRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        HorusRecipes.put(1 , Materials.Ardite.getMolten(1000));
        HorusRecipes.put(2 , Materials.Barium.getMolten(1000));
        HorusRecipes.put(3 , Materials.Bedrockium.getMolten(1000));
        HorusRecipes.put(4 , Materials.Boron.getMolten(1000));
        HorusRecipes.put(5 , Materials.BlackPlutonium.getMolten(1000));
        HorusRecipes.put(6 , Materials.Calcium.getMolten(1000));
        HorusRecipes.put(7 , Materials.Ceruclase.getMolten(1000));
        HorusRecipes.put(8 , Materials.Chrome.getMolten(1000));
        HorusRecipes.put(9 , Materials.CosmicNeutronium.getMolten(1000));
        HorusRecipes.put(10, Materials.Draconium.getMolten(1000));
        HorusRecipes.put(11, Materials.Electrotine.getMolten(1000));
        HorusRecipes.put(12, Materials.Iron.getMolten(1000));
        HorusRecipes.put(13, Materials.Ledox.getMolten(1000));
        HorusRecipes.put(14, Materials.Magnesium.getMolten(1000));
        HorusRecipes.put(15, Materials.Manganese.getMolten(1000));
        HorusRecipes.put(16, Materials.Mytryl.getMolten(1000));
        HorusRecipes.put(17, Materials.Neutronium.getMolten(1000));
        HorusRecipes.put(18, Materials.Orichalcum.getMolten(1000));
        HorusRecipes.put(19, Materials.Oriharukon.getMolten(1000));
        HorusRecipes.put(20, Materials.Quantium.getMolten(1000));
        HorusRecipes.put(21, Materials.Realgar.getMolten(1000));
        HorusRecipes.put(22, Materials.Rubracium.getMolten(1000));
        HorusRecipes.put(23, Materials.Silicon.getMolten(1000));
        HorusRecipes.put(24, Materials.Titanium.getMolten(1000));
        HorusRecipes.put(25, Materials.Vinteum.getMolten(1000));
        HorusRecipes.put(26, Materials.Vulcanite.getMolten(1000));
        HorusRecipes.put(27, Materials.Vyroxeres.getMolten(1000));

        HorusRecipes.put(28, Materials.Chlorine.getGas(1000));
        HorusRecipes.put(29, Materials.Hydrogen.getGas(1000));
        HorusRecipes.put(30, Materials.Nitrogen.getGas(1000));
        HorusRecipes.put(31, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < HorusRecipes.size(); i++) {
            FluidStack OutPutFluid = HorusRecipes.get(i);
            addSingularityFluidRecipes("T9: Horus", OutPutFluid);
        }

        //T9 - Maahes - Mh
        Map<Integer,FluidStack> MaahesRecipes = new HashMap<>();
        MaahesRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        MaahesRecipes.put(1 , Materials.Alduorite.getMolten(1000));
        MaahesRecipes.put(2 , Materials.Aluminium.getMolten(1000));
        MaahesRecipes.put(3 , Materials.Ardite.getMolten(1000));
        MaahesRecipes.put(4 , Materials.Calcium.getMolten(1000));
        MaahesRecipes.put(5 , Materials.CallistoIce.getMolten(1000));
        MaahesRecipes.put(6 , Materials.Chrome.getMolten(1000));
        MaahesRecipes.put(7 , Materials.Gold.getMolten(1000));
        MaahesRecipes.put(8 , Materials.Iridium.getMolten(1000));
        MaahesRecipes.put(9 , Materials.Iron.getMolten(1000));
        MaahesRecipes.put(10, Materials.Lead.getMolten(1000));
        MaahesRecipes.put(11, Materials.Lithium.getMolten(1000));
        MaahesRecipes.put(12, Materials.Magnesium.getMolten(1000));
        MaahesRecipes.put(13, Materials.Manganese.getMolten(1000));
        MaahesRecipes.put(14, Materials.Molybdenum.getMolten(1000));
        MaahesRecipes.put(15, Materials.Naquadah.getMolten(1000));
        MaahesRecipes.put(16, Materials.NaquadahEnriched.getMolten(1000));
        MaahesRecipes.put(17, Materials.Naquadria.getMolten(1000));
        MaahesRecipes.put(18, Materials.Neutronium.getMolten(1000));
        MaahesRecipes.put(19, Materials.Nickel.getMolten(1000));
        MaahesRecipes.put(20, Materials.Osmium.getMolten(1000));
        MaahesRecipes.put(21, Materials.Palladium.getMolten(1000));
        MaahesRecipes.put(22, Materials.Platinum.getMolten(1000));
        MaahesRecipes.put(23, Materials.Potassium.getMolten(1000));
        MaahesRecipes.put(24, Materials.Quantium.getMolten(1000));
        MaahesRecipes.put(25, WerkstoffLoader.Rhodium.getMolten(1000));
        MaahesRecipes.put(26, WerkstoffLoader.Ruthenium.getMolten(1000));
        MaahesRecipes.put(27, Materials.Silicon.getMolten(1000));
        MaahesRecipes.put(28, Materials.Silver.getMolten(1000));
        MaahesRecipes.put(29, Materials.Titanium.getMolten(1000));
        MaahesRecipes.put(30, Materials.Trinium.getMolten(1000));
        MaahesRecipes.put(31, Materials.Tungsten.getMolten(1000));
        MaahesRecipes.put(32, Materials.Vanadium.getMolten(1000));

        MaahesRecipes.put(33, Materials.Chlorine.getGas(1000));
        MaahesRecipes.put(34, Materials.Fluorine.getGas(1000));
        MaahesRecipes.put(35, Materials.Hydrogen.getGas(1000));
        MaahesRecipes.put(36, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MaahesRecipes.size(); i++) {
            FluidStack OutPutFluid = MaahesRecipes.get(i);
            addSingularityFluidRecipes("T9: Maahes", OutPutFluid);
        }

        //T9 - MehenBelt - MB
        Map<Integer,FluidStack> MehenBeltRecipes = new HashMap<>();
        MehenBeltRecipes.put(0 , Materials.Adamantium.getMolten(1000));
        MehenBeltRecipes.put(1 , Materials.Aluminium.getMolten(1000));
        MehenBeltRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        MehenBeltRecipes.put(3 , Materials.Calcium.getMolten(1000));
        MehenBeltRecipes.put(4 , Materials.Chrome.getMolten(1000));
        MehenBeltRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        MehenBeltRecipes.put(6 , Materials.Draconium.getMolten(1000));
        MehenBeltRecipes.put(7 , Materials.DraconiumAwakened.getMolten(1000));
        MehenBeltRecipes.put(8 , Materials.Iridium.getMolten(1000));
        MehenBeltRecipes.put(9 , Materials.Iron.getMolten(1000));
        MehenBeltRecipes.put(10, Materials.Magnesium.getMolten(1000));
        MehenBeltRecipes.put(11, Materials.Naquadah.getMolten(1000));
        MehenBeltRecipes.put(12, Materials.Neutronium.getMolten(1000));
        MehenBeltRecipes.put(13, Materials.Nickel.getMolten(1000));
        MehenBeltRecipes.put(14, Materials.Osmium.getMolten(1000));
        MehenBeltRecipes.put(15, Materials.Palladium.getMolten(1000));
        MehenBeltRecipes.put(16, Materials.Platinum.getMolten(1000));
        MehenBeltRecipes.put(17, Materials.Potassium.getMolten(1000));
        MehenBeltRecipes.put(18, WerkstoffLoader.Rhodium.getMolten(1000));
        MehenBeltRecipes.put(19, WerkstoffLoader.Ruthenium.getMolten(1000));
        MehenBeltRecipes.put(20, Materials.Silicon.getMolten(1000));
        MehenBeltRecipes.put(21, Materials.Tin.getMolten(1000));
        MehenBeltRecipes.put(22, Materials.Titanium.getMolten(1000));
        MehenBeltRecipes.put(23, Materials.Uranium.getMolten(1000));

        MehenBeltRecipes.put(24, Materials.Chlorine.getGas(1000));
        MehenBeltRecipes.put(25, Materials.Fluorine.getGas(1000));
        MehenBeltRecipes.put(26, Materials.Hydrogen.getGas(1000));
        MehenBeltRecipes.put(27, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < MehenBeltRecipes.size(); i++) {
            FluidStack OutPutFluid = MehenBeltRecipes.get(i);
            addSingularityFluidRecipes("T9: Mehen Belt", OutPutFluid);
        }

        //T9 - Neper - Np
        Map<Integer,FluidStack> NeperRecipes = new HashMap<>();
        NeperRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        NeperRecipes.put(1 , Materials.Antimony.getMolten(1000));
        NeperRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        NeperRecipes.put(3 , Materials.Barium.getMolten(1000));
        NeperRecipes.put(4 , Materials.Bismuth.getMolten(1000));
        NeperRecipes.put(5 , Materials.Caesium.getMolten(1000));
        NeperRecipes.put(6 , Materials.Calcium.getMolten(1000));
        NeperRecipes.put(7 , Materials.DeepIron.getMolten(1000));
        NeperRecipes.put(8 , Materials.Magnesium.getMolten(1000));
        NeperRecipes.put(9 , Materials.MysteriousCrystal.getMolten(1000));
        NeperRecipes.put(10, Materials.Potassium.getMolten(1000));
        NeperRecipes.put(11, Materials.ShadowIron.getMolten(1000));
        NeperRecipes.put(12, Materials.Silicon.getMolten(1000));
        NeperRecipes.put(13, Materials.Tin.getMolten(1000));
        NeperRecipes.put(14, Materials.Tungsten.getMolten(1000));
        NeperRecipes.put(15, Materials.Vinteum.getMolten(1000));

        NeperRecipes.put(16, Materials.Mercury.getFluid(1000));

        NeperRecipes.put(17, Materials.Fluorine.getGas(1000));
        NeperRecipes.put(18, Materials.Hydrogen.getGas(1000));
        NeperRecipes.put(19, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < NeperRecipes.size(); i++) {
            FluidStack OutPutFluid = NeperRecipes.get(i);
            addSingularityFluidRecipes("T9: Neper", OutPutFluid);
        }

        //T9 - Seth - Se
        Map<Integer,FluidStack> SethRecipes = new HashMap<>();
        SethRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        SethRecipes.put(1 , Materials.Caesium.getMolten(1000));
        SethRecipes.put(2 , Materials.Chrome.getMolten(1000));
        SethRecipes.put(3 , Materials.Draconium.getMolten(1000));
        SethRecipes.put(4 , Materials.Electrotine.getMolten(1000));
        SethRecipes.put(5 , Materials.Gadolinium.getMolten(1000));
        SethRecipes.put(6 , Materials.Gold.getMolten(1000));
        SethRecipes.put(7 , Materials.Holmium.getMolten(1000));
        SethRecipes.put(8 , Materials.Iridium.getMolten(1000));
        SethRecipes.put(9 , Materials.Iron.getMolten(1000));
        SethRecipes.put(10, Materials.Lanthanum.getMolten(1000));
        SethRecipes.put(11, Materials.Neodymium.getMolten(1000));
        SethRecipes.put(12, Materials.Nickel.getMolten(1000));
        SethRecipes.put(13, Materials.Osmium.getMolten(1000));
        SethRecipes.put(14, Materials.Palladium.getMolten(1000));
        SethRecipes.put(15, Materials.Platinum.getMolten(1000));
        SethRecipes.put(16, WerkstoffLoader.Rhodium.getMolten(1000));
        SethRecipes.put(17, WerkstoffLoader.Ruthenium.getMolten(1000));
        SethRecipes.put(18, Materials.Samarium.getMolten(1000));
        SethRecipes.put(19, Materials.Silicon.getMolten(1000));
        SethRecipes.put(20, Materials.Tartarite.getMolten(1000));
        SethRecipes.put(21, Materials.TengamPurified.getMolten(1000));
        SethRecipes.put(22, Materials.Tin.getMolten(1000));
        SethRecipes.put(23, Materials.Titanium.getMolten(1000));
        SethRecipes.put(24, Materials.Vanadium.getMolten(1000));
        SethRecipes.put(25, Materials.Vinteum.getMolten(1000));

        SethRecipes.put(26, Materials.Fluorine.getGas(1000));
        SethRecipes.put(27, Materials.Hydrogen.getGas(1000));
        SethRecipes.put(28, Materials.Oxygen.getGas(1000));

        for (int i = 0; i < SethRecipes.size(); i++) {
            FluidStack OutPutFluid = SethRecipes.get(i);
            addSingularityFluidRecipes("T9: Seth", OutPutFluid);
        }

        //T10 - DeepDark - DD
        Map<Integer,FluidStack> DeepDarkRecipes = new HashMap<>();
        DeepDarkRecipes.put(1, Materials.Hydrogen.getGas(1000));
        DeepDarkRecipes.put(2, Materials.OilExtraHeavy.getFluid(1000));
        //net.minecraftforge.fluids.FluidRegistry#getRegisteredFluids

        //T0
        VoidFliudRecipes.put("Ow", OverworldRecipes);
        VoidFliudRecipes.put("Ne", NetherRecipes);
        VoidFliudRecipes.put("TF", TwilightRecipes);
        VoidFliudRecipes.put("ED", TheEndRecipes);
        VoidFliudRecipes.put("EA", EndAsteroidRecipes);
        //T1
        VoidFliudRecipes.put("Mo", MoonRecipes);
        //T2
        VoidFliudRecipes.put("De", DeimosRecipes);
        VoidFliudRecipes.put("Ma", MarsRecipes);
        VoidFliudRecipes.put("Ph", PhobosRecipes);
        //T3
        VoidFliudRecipes.put("As", AsteroidsRecipes);
        VoidFliudRecipes.put("Ca", CallistoRecipes);
        VoidFliudRecipes.put("Ce", CeresRecipes);
        VoidFliudRecipes.put("Eu", EuropaRecipes);
        VoidFliudRecipes.put("Ga", GanymedeRecipes);
        VoidFliudRecipes.put("Rb", Ross128bRecipes);
        //T4
        VoidFliudRecipes.put("Io", IoRecipes);
        VoidFliudRecipes.put("Me", MercuryRecipes);
        VoidFliudRecipes.put("Ve", VenusRecipes);
        //T5
        VoidFliudRecipes.put("En", EnceladusRecipes);
        VoidFliudRecipes.put("Mi", MirandaRecipes);
        VoidFliudRecipes.put("Ob", OberonRecipes);
        VoidFliudRecipes.put("Ti", TitanRecipes);
        VoidFliudRecipes.put("Ra", Ross128baRecipes);
        //T6
        VoidFliudRecipes.put("Pr", ProteusRecipes);
        VoidFliudRecipes.put("Tr", TritonRecipes);
        //T7
        VoidFliudRecipes.put("Ha", HaumeaRecipes);
        VoidFliudRecipes.put("KB", KuiperbeltRecipes);
        VoidFliudRecipes.put("MM", MakemakeRecipes);
        VoidFliudRecipes.put("Pl", PlutoRecipes);
        //T8
        VoidFliudRecipes.put("BC", BarnardCRecipes);
        VoidFliudRecipes.put("BE", BarnardERecipes);
        VoidFliudRecipes.put("BF", BarnardFRecipes);
        VoidFliudRecipes.put("CB", CentauriBbRecipes);
        VoidFliudRecipes.put("TE", TCetiERecipes);
        VoidFliudRecipes.put("VB", VegaBRecipes);
        //T9
        VoidFliudRecipes.put("An", AnubisRecipes);
        VoidFliudRecipes.put("Ho", HorusRecipes);
        VoidFliudRecipes.put("Mh", MaahesRecipes);
        VoidFliudRecipes.put("MB", MehenBeltRecipes);
        VoidFliudRecipes.put("Np", NeperRecipes);
        VoidFliudRecipes.put("Se", SethRecipes);
        //T10
        VoidFliudRecipes.put("DD", DeepDarkRecipes);
    }
}
