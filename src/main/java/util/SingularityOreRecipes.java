package util;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes {

    public static final Map<String, Map<Integer, ItemStack>> VoidOreRecipes = new HashMap<>();

    public static void addVoidOreRecipes() {
        // T0 - Overworld - Ow
        {
            Map<Integer, ItemStack> OverworldRecipes = new HashMap<>();

            // Diamond Vein
            OverworldRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            OverworldRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            OverworldRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Lapis Vein
            OverworldRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            OverworldRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            OverworldRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            OverworldRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Vermiculite Vein
            OverworldRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            OverworldRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 932)); // Vermiculite
            OverworldRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore
            OverworldRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 911)); // Alunite Ore

            // Oilsands Vein
            OverworldRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 878)); // Oilsands Ore

            // Coal Vein
            OverworldRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore
            OverworldRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 538)); // Lignite Coal Ore

            // Manganese Vein
            OverworldRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            OverworldRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            OverworldRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            OverworldRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Redstone Vein
            OverworldRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            OverworldRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            OverworldRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Mica Vein
            OverworldRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 924)); // Kyanite Ore
            OverworldRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 901)); // Mica Ore
            OverworldRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore
            OverworldRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 919)); // Pollucite Ore

            // Dolomite Vein
            OverworldRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 914)); // Dolomite Ore
            OverworldRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 915)); // Wollastonite Ore
            OverworldRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 903)); // Trona Ore
            OverworldRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 821)); // Andradite Ore

            // Copper Vein
            OverworldRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            OverworldRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            OverworldRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            OverworldRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Soapstone Vein
            OverworldRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 877)); // Soapstone Ore
            OverworldRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 902)); // Talc
            OverworldRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore
            OverworldRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Gold Vein
            OverworldRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            OverworldRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            OverworldRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Kaolinite Vein
            OverworldRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 929)); // Kaolinite
            OverworldRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 916)); // Zeolite Ore
            OverworldRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            OverworldRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 949)); // Glauconite Sand

            // Iron Vein
            OverworldRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            OverworldRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            OverworldRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            OverworldRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Lignite Coal Vein
            OverworldRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 538)); // Lignite Coal Ore
            OverworldRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Apatite Vein
            OverworldRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 530)); // Apatite Ore
            OverworldRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 534)); // Tricalcium Phosphate Ore
            OverworldRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 607)); // Pyrochlore Ore

            // Basaltic Mineral Sand Vein
            OverworldRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 935)); // Basaltic Mineral Sand
            OverworldRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 936)); // Granitic Mineral Sand
            OverworldRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            OverworldRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 934)); // Gypsum Ore

            // Magnetite Vein
            OverworldRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            OverworldRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            OverworldRecipes.put(59, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Tin Vein
            OverworldRecipes.put(60, getModItem(GregTech.ID, "gt.blockores", 1L, 937)); // Cassiterite Sand
            OverworldRecipes.put(61, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            OverworldRecipes.put(62, getModItem(GregTech.ID, "gt.blockores", 1L, 946)); // Asbestos Ore
            OverworldRecipes.put(63, getModItem(GregTech.ID, "gt.blockores", 1L, 948)); // Diatomite Ore

            // Salt Vein
            OverworldRecipes.put(64, getModItem(GregTech.ID, "gt.blockores", 1L, 944)); // Rock Salt Ore
            OverworldRecipes.put(65, getModItem(GregTech.ID, "gt.blockores", 1L, 817)); // Salt Ore
            OverworldRecipes.put(66, getModItem(GregTech.ID, "gt.blockores", 1L, 907)); // Lepidolite Ore
            OverworldRecipes.put(67, getModItem(GregTech.ID, "gt.blockores", 1L, 920)); // Spodumene Ore

            // Cassiterite Vein
            OverworldRecipes.put(68, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            OverworldRecipes.put(69, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            OverworldRecipes.put(70, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            OverworldRecipes.put(71, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            OverworldRecipes.put(72, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            OverworldRecipes.put(73, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            OverworldRecipes.put(74, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            OverworldRecipes.put(75, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            OverworldRecipes.put(76, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            OverworldRecipes.put(77, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            OverworldRecipes.put(78, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore
            OverworldRecipes.put(79, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            OverworldRecipes.put(80, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore

            VoidOreRecipes.put("Ow", OverworldRecipes);
        }

        // T0 - Nether - Ne
        {
            Map<Integer, ItemStack> NetherRecipes = new HashMap<>();

            // Sulfur Vein
            NetherRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            NetherRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            NetherRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Molybdenum Vein
            NetherRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            NetherRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            NetherRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            NetherRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Manganese Vein
            NetherRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            NetherRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            NetherRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            NetherRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Quartzite Vein
            NetherRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            NetherRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            NetherRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Redstone Vein
            NetherRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            NetherRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            NetherRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Copper Vein
            NetherRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            NetherRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            NetherRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            NetherRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Iron Vein
            NetherRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            NetherRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            NetherRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            NetherRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Beryllium Vein
            NetherRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            NetherRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            NetherRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Electrotine Vein
            NetherRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            NetherRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 948)); // Diatomite Ore
            NetherRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            NetherRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 911)); // Alunite Ore

            // Tetrahedrite Vein
            NetherRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            NetherRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            NetherRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Nether Quartz Vein
            NetherRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 522)); // Nether Quartz Ore
            NetherRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore

            // Small Ore Stats
            NetherRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            NetherRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            NetherRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            NetherRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            NetherRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            NetherRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            NetherRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            NetherRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore
            NetherRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            NetherRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 522)); // Nether Quartz Ore
            NetherRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            NetherRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            NetherRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 913)); // Realgar Ore

            VoidOreRecipes.put("Ne", NetherRecipes);
        }

        // T0 - Twilight - TF
        {
            Map<Integer, ItemStack> TwilightRecipes = new HashMap<>();

            // Diamond Vein
            TwilightRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            TwilightRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            TwilightRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Lapis Vein
            TwilightRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            TwilightRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            TwilightRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            TwilightRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Molybdenum Vein
            TwilightRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            TwilightRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            TwilightRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            TwilightRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Olivine Vein
            TwilightRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            TwilightRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            TwilightRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            TwilightRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Terra & Aer Vein
            TwilightRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 542)); // Terra Infused Stone
            TwilightRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 540)); // Aer Infused Stone
            TwilightRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            TwilightRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Coal Vein
            TwilightRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore
            TwilightRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 538)); // Lignite Coal Ore

            // Sapphire Vein
            TwilightRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 820)); // Almandine Ore
            TwilightRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 835)); // Pyrope Ore
            TwilightRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 503)); // Sapphire Ore
            TwilightRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 504)); // Green Sapphire Ore

            // Cryolite Vein
            TwilightRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            TwilightRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            TwilightRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            TwilightRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 699)); // Cryolite Ore

            // Nickel Vein
            TwilightRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            TwilightRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            TwilightRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            TwilightRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Soapstone Vein
            TwilightRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 877)); // Soapstone Ore
            TwilightRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 902)); // Talc
            TwilightRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore
            TwilightRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Perditio & Ordo Vein
            TwilightRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 544)); // Perditio Infused Stone
            TwilightRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 545)); // Ordo Infused Stone
            TwilightRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            TwilightRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Gold Vein
            TwilightRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            TwilightRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            TwilightRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Iron Vein
            TwilightRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            TwilightRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            TwilightRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            TwilightRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Apatite Vein
            TwilightRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 530)); // Apatite Ore
            TwilightRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 534)); // Tricalcium Phosphate Ore
            TwilightRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 607)); // Pyrochlore Ore

            // Magnetite Vein
            TwilightRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            TwilightRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            TwilightRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Salt Vein
            TwilightRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 944)); // Rock Salt Ore
            TwilightRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 817)); // Salt Ore
            TwilightRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 907)); // Lepidolite Ore
            TwilightRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 920)); // Spodumene Ore

            // Cassiterite Vein
            TwilightRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            TwilightRecipes.put(59, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Aqua & Ignis Vein
            TwilightRecipes.put(60, getModItem(GregTech.ID, "gt.blockores", 1L, 543)); // Aqua Infused Stone
            TwilightRecipes.put(61, getModItem(GregTech.ID, "gt.blockores", 1L, 541)); // Ignis Infused Stone
            TwilightRecipes.put(62, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            TwilightRecipes.put(63, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Small Ore Stats
            TwilightRecipes.put(64, getModItem(GregTech.ID, "gt.blockores", 1L, 509)); // Amethyst Ore
            TwilightRecipes.put(65, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            TwilightRecipes.put(66, getModItem(GregTech.ID, "gt.blockores", 1L, 508)); // Tanzanite Ore
            TwilightRecipes.put(67, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            TwilightRecipes.put(68, getModItem(GregTech.ID, "gt.blockores", 1L, 512)); // Spinel Ore
            TwilightRecipes.put(69, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore
            TwilightRecipes.put(70, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            TwilightRecipes.put(71, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            TwilightRecipes.put(72, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            TwilightRecipes.put(73, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            TwilightRecipes.put(74, getModItem(GregTech.ID, "gt.blockores", 1L, 513)); // Blue Topaz Ore
            TwilightRecipes.put(75, getModItem(GregTech.ID, "gt.blockores", 1L, 507)); // Topaz Ore
            TwilightRecipes.put(76, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            TwilightRecipes.put(77, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            TwilightRecipes.put(78, getModItem(GregTech.ID, "gt.blockores", 1L, 504)); // Green Sapphire Ore
            TwilightRecipes.put(79, getModItem(GregTech.ID, "gt.blockores", 1L, 503)); // Sapphire Ore
            TwilightRecipes.put(80, getModItem(GregTech.ID, "gt.blockores", 1L, 511)); // Jasper Ore
            TwilightRecipes.put(81, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore

            VoidOreRecipes.put("TF", TwilightRecipes);
        }

        // T0 - TheEnd - ED
        {
            Map<Integer, ItemStack> TheEndRecipes = new HashMap<>();

            // Molybdenum Vein
            TheEndRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            TheEndRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            TheEndRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            TheEndRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Nickel Vein
            TheEndRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            TheEndRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            TheEndRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            TheEndRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Copper Vein
            TheEndRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            TheEndRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            TheEndRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            TheEndRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Gold Vein
            TheEndRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            TheEndRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            TheEndRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Beryllium Vein
            TheEndRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            TheEndRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            TheEndRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Tetrahedrite Vein
            TheEndRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            TheEndRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            TheEndRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Cassiterite Vein
            TheEndRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            TheEndRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            TheEndRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            TheEndRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            TheEndRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            TheEndRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            TheEndRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            TheEndRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            TheEndRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            TheEndRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore

            VoidOreRecipes.put("ED", TheEndRecipes);
        }

        // T0 - EndAsteroid - EA
        {
            Map<Integer, ItemStack> EndAsteroidRecipes = new HashMap<>();

            // Tungstate Vein
            EndAsteroidRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            EndAsteroidRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            EndAsteroidRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Lapis Vein
            EndAsteroidRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            EndAsteroidRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            EndAsteroidRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            EndAsteroidRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Molybdenum Vein
            EndAsteroidRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            EndAsteroidRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            EndAsteroidRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            EndAsteroidRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Olivine Vein
            EndAsteroidRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            EndAsteroidRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            EndAsteroidRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            EndAsteroidRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Manganese Vein
            EndAsteroidRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            EndAsteroidRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            EndAsteroidRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            EndAsteroidRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Nickel Vein
            EndAsteroidRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            EndAsteroidRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            EndAsteroidRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            EndAsteroidRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Copper Vein
            EndAsteroidRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            EndAsteroidRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            EndAsteroidRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            EndAsteroidRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Gold Vein
            EndAsteroidRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            EndAsteroidRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            EndAsteroidRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Beryllium Vein
            EndAsteroidRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            EndAsteroidRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            EndAsteroidRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Platinum Vein
            EndAsteroidRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            EndAsteroidRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            EndAsteroidRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            EndAsteroidRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Tetrahedrite Vein
            EndAsteroidRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            EndAsteroidRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            EndAsteroidRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Naquadah Vein
            EndAsteroidRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            EndAsteroidRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Cassiterite Vein
            EndAsteroidRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            EndAsteroidRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            EndAsteroidRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            EndAsteroidRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            EndAsteroidRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            EndAsteroidRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            EndAsteroidRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            EndAsteroidRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore

            VoidOreRecipes.put("EA", EndAsteroidRecipes);
        }

        // T1 - Moon - Mo
        {
            Map<Integer, ItemStack> MoonRecipes = new HashMap<>();

            // Molybdenum Vein
            MoonRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            MoonRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            MoonRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            MoonRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Quartz Vein
            MoonRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            MoonRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            MoonRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Monazite Vein
            MoonRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            MoonRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            MoonRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Ilmenite Vein
            MoonRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            MoonRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MoonRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            MoonRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Copper Vein
            MoonRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            MoonRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            MoonRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            MoonRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Bauxite Vein
            MoonRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            MoonRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            MoonRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Galena Vein
            MoonRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            MoonRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            MoonRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore

            // Cassiterite Vein
            MoonRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            MoonRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            MoonRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore

            VoidOreRecipes.put("Mo", MoonRecipes);
        }

        // T2 - Deimos - De
        {
            Map<Integer, ItemStack> DeimosRecipes = new HashMap<>();

            // Uranium 238 Vein
            DeimosRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            DeimosRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Tungstate Vein
            DeimosRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            DeimosRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            DeimosRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Sulfur Vein
            DeimosRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            DeimosRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            DeimosRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Lapis Vein
            DeimosRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            DeimosRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            DeimosRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            DeimosRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Draconium Vein
            DeimosRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            DeimosRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            DeimosRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            DeimosRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore

            // Monazite Vein
            DeimosRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            DeimosRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            DeimosRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Nickel Vein
            DeimosRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            DeimosRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            DeimosRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            DeimosRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Tetrahedrite Vein
            DeimosRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            DeimosRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            DeimosRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Oriharukon Vein
            DeimosRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            DeimosRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 508)); // Tanzanite Ore
            DeimosRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 951)); // Vyroxeres Ore
            DeimosRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 900)); // Mirabilite Ore

            // Magnetite Vein
            DeimosRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            DeimosRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            DeimosRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Small Ore Stats
            DeimosRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            DeimosRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            DeimosRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            DeimosRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            DeimosRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            DeimosRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            DeimosRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            DeimosRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            DeimosRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore
            DeimosRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            DeimosRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore

            VoidOreRecipes.put("De", DeimosRecipes);
        }

        // T2 - Mars - Ma
        {
            Map<Integer, ItemStack> MarsRecipes = new HashMap<>();

            // Tungstate Vein
            MarsRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            MarsRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            MarsRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Sulfur Vein
            MarsRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            MarsRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            MarsRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Desh Vein
            MarsRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            MarsRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            MarsRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore

            // Pitchblende Vein
            MarsRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            MarsRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Quartz Vein
            MarsRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            MarsRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            MarsRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Redstone Vein
            MarsRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            MarsRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            MarsRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Nickel Vein
            MarsRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            MarsRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MarsRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            MarsRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Arsenic Vein
            MarsRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            MarsRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            MarsRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore

            // Gold Vein
            MarsRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            MarsRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            MarsRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Iron Vein
            MarsRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            MarsRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            MarsRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            MarsRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Beryllium Vein
            MarsRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            MarsRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            MarsRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Tetrahedrite Vein
            MarsRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            MarsRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            MarsRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Galena Vein
            MarsRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            MarsRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            MarsRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore

            // Salt Vein
            MarsRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 944)); // Rock Salt Ore
            MarsRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 817)); // Salt Ore
            MarsRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 907)); // Lepidolite Ore
            MarsRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 920)); // Spodumene Ore

            // Small Ore Stats
            MarsRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            MarsRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            MarsRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            MarsRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            MarsRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            MarsRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            MarsRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            MarsRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            MarsRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            MarsRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MarsRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            MarsRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore
            MarsRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            MarsRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            MarsRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore

            VoidOreRecipes.put("Ma", MarsRecipes);
        }

        // T2 - Phobos - Ph
        {
            Map<Integer, ItemStack> PhobosRecipes = new HashMap<>();

            // Uranium 238 Vein
            PhobosRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            PhobosRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Sulfur Vein
            PhobosRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            PhobosRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            PhobosRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Diamond Vein
            PhobosRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            PhobosRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            PhobosRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Molybdenum Vein
            PhobosRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            PhobosRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            PhobosRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            PhobosRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Pitchblende Vein
            PhobosRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            PhobosRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Quartz Vein
            PhobosRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            PhobosRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            PhobosRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Draconium Vein
            PhobosRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            PhobosRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            PhobosRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            PhobosRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore

            // Nickel Vein
            PhobosRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            PhobosRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            PhobosRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            PhobosRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Arsenic Vein
            PhobosRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            PhobosRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            PhobosRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore

            // Bauxite Vein
            PhobosRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            PhobosRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            PhobosRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Gold Vein
            PhobosRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            PhobosRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            PhobosRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Oriharukon Vein
            PhobosRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            PhobosRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 508)); // Tanzanite Ore
            PhobosRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 951)); // Vyroxeres Ore
            PhobosRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 900)); // Mirabilite Ore

            // Small Ore Stats
            PhobosRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            PhobosRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            PhobosRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            PhobosRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            PhobosRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            PhobosRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            PhobosRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            PhobosRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore
            PhobosRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            PhobosRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore

            VoidOreRecipes.put("Ph", PhobosRecipes);
        }

        // T3 - Asteroids - As
        {
            Map<Integer, ItemStack> AsteroidsRecipes = new HashMap<>();

            // Tungstate Vein
            AsteroidsRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            AsteroidsRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            AsteroidsRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Ilmenite Vein
            AsteroidsRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            AsteroidsRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            AsteroidsRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            AsteroidsRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Bauxite Vein
            AsteroidsRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            AsteroidsRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            AsteroidsRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Gold Vein
            AsteroidsRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            AsteroidsRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            AsteroidsRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Tetrahedrite Vein
            AsteroidsRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            AsteroidsRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            AsteroidsRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Naquadah Vein
            AsteroidsRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            AsteroidsRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Small Ore Stats
            AsteroidsRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            AsteroidsRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            AsteroidsRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            AsteroidsRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            AsteroidsRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            AsteroidsRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            AsteroidsRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            AsteroidsRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore

            VoidOreRecipes.put("As", AsteroidsRecipes);
        }

        // T3 - Callisto - Ca
        {
            Map<Integer, ItemStack> CallistoRecipes = new HashMap<>();

            // Tungstate Vein
            CallistoRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            CallistoRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            CallistoRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Plutonium 239 Vein
            CallistoRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            CallistoRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 100)); // Plutonium 239 Ore
            CallistoRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Monazite Vein
            CallistoRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            CallistoRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            CallistoRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Ilmenite Vein
            CallistoRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            CallistoRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            CallistoRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            CallistoRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Palladium Vein
            CallistoRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            CallistoRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            CallistoRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            CallistoRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Callisto Ice Vein
            CallistoRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 389)); // Callisto Ice Ore
            CallistoRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 507)); // Topaz Ore
            CallistoRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 513)); // Blue Topaz Ore
            CallistoRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 485)); // Alduorite Ore

            // Copper Vein
            CallistoRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            CallistoRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            CallistoRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            CallistoRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Gold Vein
            CallistoRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            CallistoRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            CallistoRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Iron Vein
            CallistoRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            CallistoRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            CallistoRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            CallistoRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Small Ore Stats
            CallistoRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            CallistoRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            CallistoRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            CallistoRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            CallistoRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            CallistoRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            CallistoRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            CallistoRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            CallistoRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            CallistoRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore

            VoidOreRecipes.put("Ca", CallistoRecipes);
        }

        // T3 - Ceres - Ce
        {
            Map<Integer, ItemStack> CeresRecipes = new HashMap<>();

            // Uranium 238 Vein
            CeresRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            CeresRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Plutonium 239 Vein
            CeresRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            CeresRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 100)); // Plutonium 239 Ore
            CeresRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Lapis Vein
            CeresRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            CeresRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            CeresRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            CeresRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Molybdenum Vein
            CeresRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            CeresRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            CeresRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            CeresRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Olivine Vein
            CeresRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            CeresRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            CeresRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            CeresRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Manganese Vein
            CeresRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            CeresRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            CeresRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            CeresRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Palladium Vein
            CeresRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            CeresRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            CeresRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            CeresRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Copper Vein
            CeresRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            CeresRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            CeresRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            CeresRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Soapstone Vein
            CeresRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 877)); // Soapstone Ore
            CeresRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 902)); // Talc
            CeresRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore
            CeresRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Iron Vein
            CeresRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            CeresRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            CeresRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            CeresRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Beryllium Vein
            CeresRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            CeresRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            CeresRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Electrotine Vein
            CeresRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            CeresRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 948)); // Diatomite Ore
            CeresRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            CeresRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 911)); // Alunite Ore

            // Magnetite Vein
            CeresRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            CeresRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            CeresRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Small Ore Stats
            CeresRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            CeresRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            CeresRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            CeresRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            CeresRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            CeresRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            CeresRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            CeresRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            CeresRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            CeresRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore
            CeresRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("Ce", CeresRecipes);
        }

        // T3 - Europa - Eu
        {
            Map<Integer, ItemStack> EuropaRecipes = new HashMap<>();

            // Magnesite Vein
            EuropaRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            EuropaRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            EuropaRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            EuropaRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore

            // Basaltic Mineral Sand Vein
            EuropaRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 935)); // Basaltic Mineral Sand
            EuropaRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 936)); // Granitic Mineral Sand
            EuropaRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            EuropaRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 934)); // Gypsum Ore

            // Chrome Vein
            EuropaRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            EuropaRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            EuropaRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            EuropaRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 31)); // Manganese Ore

            // Ledox Vein
            EuropaRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            EuropaRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore
            EuropaRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 966)); // Orichalcum Ore
            EuropaRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 488)); // Rubracium Ore

            // Tin Vein
            EuropaRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 937)); // Cassiterite Sand
            EuropaRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            EuropaRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 946)); // Asbestos Ore
            EuropaRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 948)); // Diatomite Ore

            VoidOreRecipes.put("Eu", EuropaRecipes);
        }

        // T3 - Ganymede - Ga
        {
            Map<Integer, ItemStack> GanymedeRecipes = new HashMap<>();

            // Uranium 238 Vein
            GanymedeRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            GanymedeRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Tungstate Vein
            GanymedeRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            GanymedeRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            GanymedeRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Plutonium 239 Vein
            GanymedeRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            GanymedeRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 100)); // Plutonium 239 Ore
            GanymedeRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Diamond Vein
            GanymedeRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            GanymedeRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            GanymedeRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Redstone Vein
            GanymedeRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            GanymedeRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            GanymedeRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Ilmenite Vein
            GanymedeRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            GanymedeRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            GanymedeRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            GanymedeRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Palladium Vein
            GanymedeRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            GanymedeRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            GanymedeRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            GanymedeRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Bauxite Vein
            GanymedeRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            GanymedeRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            GanymedeRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Iron Vein
            GanymedeRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            GanymedeRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            GanymedeRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            GanymedeRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Tetrahedrite Vein
            GanymedeRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            GanymedeRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            GanymedeRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Galena Vein
            GanymedeRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            GanymedeRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            GanymedeRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore

            // Small Ore Stats
            GanymedeRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            GanymedeRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            GanymedeRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            GanymedeRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            GanymedeRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            GanymedeRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            GanymedeRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            GanymedeRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            GanymedeRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            GanymedeRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            GanymedeRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore

            VoidOreRecipes.put("Ga", GanymedeRecipes);
        }

        // T3 - Ross128b - Rb
        {
            Map<Integer, ItemStack> Ross128bRecipes = new HashMap<>();

            // Bismutite & Bismuthinite Vein
            Ross128bRecipes.put(0, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 2)); // Bismuthinite Ore
            Ross128bRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore
            Ross128bRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            Ross128bRecipes.put(3, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 1)); // Bismutite Ore

            // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein
            Ross128bRecipes.put(4, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9)); // Olenite Ore
            Ross128bRecipes.put(5, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5)); // Fluor-Buergerite Ore
            Ross128bRecipes.put(6, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7)); // Chromo-Alumino-Povondraite
                                                                                        // Ore
            Ross128bRecipes.put(7, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8)); // Vanadio-Oxy-Dravite Ore

            // Arsenopyrite & Ferberite & Loellingite & Roquesite Vein
            Ross128bRecipes.put(8, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10)); // Arsenopyrite Ore
            Ross128bRecipes.put(9, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11)); // Ferberite Ore
            Ross128bRecipes.put(10, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12)); // Loellingite Ore
            Ross128bRecipes.put(11, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 13)); // Roquesite Ore

            // Ferberite & Huebnerite & Loellingite Vein
            Ross128bRecipes.put(12, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11)); // Ferberite Ore
            Ross128bRecipes.put(13, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 17)); // Huebnerite Ore
            Ross128bRecipes.put(14, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12)); // Loellingite Ore
            Ross128bRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore

            // Djurleite & Bornite & Wittichenite Vein
            Ross128bRecipes.put(16, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 16)); // Djurleite Ore
            Ross128bRecipes.put(17, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 14)); // Bornite Ore
            Ross128bRecipes.put(18, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 15)); // Wittichenite Ore
            Ross128bRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore

            // Thorianite Vein
            Ross128bRecipes.put(20, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 18)); // Thorianite Ore
            Ross128bRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            Ross128bRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 907)); // Lepidolite Ore
            Ross128bRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 920)); // Spodumene Ore

            // Fayalite & Green Fuchsite & Red Zircon & Red Fuchsite Vein
            Ross128bRecipes.put(24, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23)); // Fayalite Ore
            Ross128bRecipes.put(25, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 28)); // Green Fuchsite Ore
            Ross128bRecipes.put(26, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 19)); // Red Zircon Ore
            Ross128bRecipes.put(27, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 29)); // Red Fuchsite Ore

            // Forsterite & Fayalite & Orange Descloizite & Red Descloizite Vein
            Ross128bRecipes.put(28, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 24)); // Forsterite Ore
            Ross128bRecipes.put(29, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23)); // Fayalite Ore
            Ross128bRecipes.put(30, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27)); // Orange Descloizite Ore
            Ross128bRecipes.put(31, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26)); // Red Descloizite Ore

            VoidOreRecipes.put("Rb", Ross128bRecipes);
        }

        // T4 - Io - Io
        {
            Map<Integer, ItemStack> IoRecipes = new HashMap<>();

            // Plutonium 239 Vein
            IoRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            IoRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 100)); // Plutonium 239 Ore
            IoRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Sulfur Vein
            IoRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            IoRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            IoRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Manganese Vein
            IoRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            IoRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            IoRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            IoRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Pitchblende Vein
            IoRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            IoRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Quartz Vein
            IoRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            IoRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            IoRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Pyrolusite Vein
            IoRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            IoRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 530)); // Apatite Ore
            IoRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore
            IoRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 607)); // Pyrochlore Ore

            // Infused Gold Vein
            IoRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            IoRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 323)); // Infused Gold Ore
            IoRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore

            // Monazite Vein
            IoRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            IoRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            IoRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Palladium Vein
            IoRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            IoRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            IoRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            IoRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Mytryl Vein
            IoRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            IoRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 511)); // Jasper Ore
            IoRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 952)); // Ceruclase Ore
            IoRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 489)); // Vulcanite Ore

            // Magnetite Vein
            IoRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            IoRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            IoRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Iridium Vein
            IoRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            IoRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            IoRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            IoRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Cassiterite Vein
            IoRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            IoRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            IoRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            IoRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            IoRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            IoRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            IoRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            IoRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            IoRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            IoRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore
            IoRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 347)); // Firestone Ore
            IoRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            IoRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            IoRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            IoRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            IoRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore
            IoRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("Io", IoRecipes);

        }

        // T4 - Mercury - Me
        {
            Map<Integer, ItemStack> MercuryRecipes = new HashMap<>();

            // Diamond Vein
            MercuryRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            MercuryRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            MercuryRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Molybdenum Vein
            MercuryRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            MercuryRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            MercuryRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            MercuryRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Draconium Vein
            MercuryRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            MercuryRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            MercuryRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            MercuryRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore

            // Redstone Vein
            MercuryRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            MercuryRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            MercuryRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Ilmenite Vein
            MercuryRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            MercuryRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MercuryRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            MercuryRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Palladium Vein
            MercuryRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            MercuryRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            MercuryRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            MercuryRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Arsenic Vein
            MercuryRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            MercuryRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            MercuryRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore

            // Bauxite Vein
            MercuryRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            MercuryRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            MercuryRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Iron Vein
            MercuryRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            MercuryRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            MercuryRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            MercuryRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Naquadah Vein
            MercuryRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            MercuryRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Iridium Vein
            MercuryRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MercuryRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            MercuryRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            MercuryRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Small Ore Stats
            MercuryRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            MercuryRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            MercuryRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            MercuryRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            MercuryRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            MercuryRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            MercuryRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MercuryRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            MercuryRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            MercuryRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            MercuryRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            MercuryRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MercuryRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("Me", MercuryRecipes);

        }

        // T4 - Venus - Ve
        {
            Map<Integer, ItemStack> VenusRecipes = new HashMap<>();

            // Sulfur Vein
            VenusRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            VenusRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            VenusRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Pitchblende Vein
            VenusRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            VenusRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Quartz Vein
            VenusRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            VenusRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            VenusRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Redstone Vein
            VenusRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            VenusRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            VenusRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Monazite Vein
            VenusRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            VenusRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            VenusRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Nickel Vein
            VenusRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            VenusRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            VenusRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            VenusRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Beryllium Vein
            VenusRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            VenusRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            VenusRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Tetrahedrite Vein
            VenusRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            VenusRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            VenusRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Galena Vein
            VenusRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            VenusRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            VenusRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore

            // Naquadah Vein
            VenusRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            VenusRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Rutile Vein
            VenusRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 375)); // Rutile Ore
            VenusRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            VenusRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            VenusRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore

            // Quantium Vein
            VenusRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore
            VenusRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 509)); // Amethyst Ore
            VenusRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 375)); // Rutile Ore
            VenusRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 382)); // Ardite Ore

            // Iridium Vein
            VenusRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            VenusRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            VenusRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            VenusRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Cassiterite Vein
            VenusRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            VenusRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            VenusRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            VenusRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            VenusRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            VenusRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            VenusRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            VenusRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            VenusRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            VenusRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            VenusRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            VenusRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore
            VenusRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 47)); // Firestone Ore
            VenusRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            VenusRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            VenusRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("Ve", VenusRecipes);

        }

        // T5 - Enceladus - En
        {
            Map<Integer, ItemStack> EnceladusRecipes = new HashMap<>();

            // Uranium 238 Vein
            EnceladusRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            EnceladusRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Tungstate Vein
            EnceladusRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            EnceladusRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            EnceladusRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Lapis Vein
            EnceladusRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            EnceladusRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            EnceladusRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            EnceladusRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Osmium Vein
            EnceladusRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            EnceladusRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            EnceladusRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Monazite Vein
            EnceladusRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            EnceladusRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            EnceladusRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Copper Vein
            EnceladusRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            EnceladusRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            EnceladusRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            EnceladusRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Vanadium Vein
            EnceladusRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 29)); // Vanadium Ore
            EnceladusRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            EnceladusRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            EnceladusRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore

            // Ledox Vein
            EnceladusRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            EnceladusRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore
            EnceladusRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 966)); // Orichalcum Ore
            EnceladusRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 488)); // Rubracium Ore

            // Iridium Vein
            EnceladusRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            EnceladusRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            EnceladusRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            EnceladusRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Small Ore Stats
            EnceladusRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            EnceladusRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            EnceladusRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            EnceladusRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            EnceladusRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            EnceladusRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            EnceladusRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            EnceladusRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            EnceladusRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            EnceladusRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            EnceladusRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("En", EnceladusRecipes);
        }

        // T5 - Miranda - Mi
        {
            Map<Integer, ItemStack> MirandaRecipes = new HashMap<>();

            // Diamond Vein
            MirandaRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            MirandaRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            MirandaRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Osmium Vein
            MirandaRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MirandaRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            MirandaRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Desh Vein
            MirandaRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            MirandaRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            MirandaRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore

            // Draconium Vein
            MirandaRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            MirandaRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            MirandaRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            MirandaRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore

            // Redstone Vein
            MirandaRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            MirandaRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            MirandaRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Pyrolusite Vein
            MirandaRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            MirandaRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 530)); // Apatite Ore
            MirandaRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore
            MirandaRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 607)); // Pyrochlore Ore

            // Ilmenite Vein
            MirandaRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            MirandaRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MirandaRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            MirandaRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Tetrahedrite Vein
            MirandaRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            MirandaRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            MirandaRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Iridium Vein
            MirandaRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MirandaRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            MirandaRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            MirandaRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Cassiterite Vein
            MirandaRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            MirandaRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            MirandaRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            MirandaRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            MirandaRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            MirandaRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            MirandaRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            MirandaRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore

            VoidOreRecipes.put("Mi", MirandaRecipes);
        }

        // T5 - Oberon - Ob
        {
            Map<Integer, ItemStack> OberonRecipes = new HashMap<>();

            // Tungstate Vein
            OberonRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            OberonRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            OberonRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Osmium Vein
            OberonRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            OberonRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            OberonRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Tungsten Vein
            OberonRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            OberonRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            OberonRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            OberonRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Manganese Vein
            OberonRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            OberonRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            OberonRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            OberonRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Pitchblende Vein
            OberonRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            OberonRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Palladium Vein
            OberonRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            OberonRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            OberonRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            OberonRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Iron Vein
            OberonRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            OberonRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            OberonRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            OberonRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Galena Vein
            OberonRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            OberonRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            OberonRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore

            // Naquadah Vein
            OberonRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            OberonRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Small Ore Stats
            OberonRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            OberonRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            OberonRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            OberonRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            OberonRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            OberonRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            OberonRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            OberonRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            OberonRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            OberonRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore

            VoidOreRecipes.put("Ob", OberonRecipes);
        }

        // T5 - Titan - Ti
        {
            Map<Integer, ItemStack> TitanRecipes = new HashMap<>();

            // Diamond Vein
            TitanRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            TitanRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            TitanRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Molybdenum Vein
            TitanRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            TitanRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            TitanRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            TitanRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Osmium Vein
            TitanRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            TitanRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            TitanRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Manganese Vein
            TitanRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            TitanRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            TitanRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            TitanRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Infused Gold Vein
            TitanRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            TitanRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 323)); // Infused Gold Ore
            TitanRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore

            // Monazite Vein
            TitanRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            TitanRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            TitanRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Nickel Vein
            TitanRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            TitanRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            TitanRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            TitanRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Ilmenite Vein
            TitanRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            TitanRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            TitanRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            TitanRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Arsenic Vein
            TitanRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            TitanRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            TitanRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore

            // Bauxite Vein
            TitanRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            TitanRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            TitanRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Beryllium Vein
            TitanRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            TitanRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            TitanRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Naquadah Vein
            TitanRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            TitanRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Rutile Vein
            TitanRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 375)); // Rutile Ore
            TitanRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            TitanRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            TitanRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore

            // Iridium Vein
            TitanRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            TitanRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            TitanRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            TitanRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Small Ore Stats
            TitanRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            TitanRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            TitanRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            TitanRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            TitanRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            TitanRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            TitanRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            TitanRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            TitanRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            TitanRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            TitanRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            TitanRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore

            VoidOreRecipes.put("Ti", TitanRecipes);
        }

        // T5 - Ross128ba - Ra
        {
            Map<Integer, ItemStack> Ross128baRecipes = new HashMap<>();

            // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein Vein
            Ross128baRecipes.put(0, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9)); // Olenite Ore
            Ross128baRecipes.put(1, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5)); // Fluor-Buergerite Ore
            Ross128baRecipes.put(2, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7)); // Chromo-Alumino-Povondraite
                                                                                         // Ore
            Ross128baRecipes.put(3, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8)); // Vanadio-Oxy-Dravite Ore

            // Ferberite & Huebnerite & Loellingite Vein
            Ross128baRecipes.put(4, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11)); // Ferberite Ore
            Ross128baRecipes.put(5, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 17)); // Huebnerite Ore
            Ross128baRecipes.put(6, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12)); // Loellingite Ore
            Ross128baRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore

            // Hedenbergite & Fayalite & Orange Descloizite & Red Descloizite Vein
            Ross128baRecipes.put(8, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 25)); // Hedenbergite Ore
            Ross128baRecipes.put(9, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23)); // Fayalite Ore
            Ross128baRecipes.put(10, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27)); // Orange Descloizite Ore
            Ross128baRecipes.put(11, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26)); // Red Descloizite Ore

            // Prasiolite & Hedenbergite Vein
            Ross128baRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 509)); // Amethyst Ore
            Ross128baRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            Ross128baRecipes.put(14, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 35)); // Prasiolite Ore
            Ross128baRecipes.put(15, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 25)); // Hedenbergite Ore

            // BArTiMaEuSNeK Vein
            Ross128baRecipes.put(16, getModItem(BartWorks.ID, "bw.blockores.01", 43)); // BArTiMaEuSNeK Ore

            // Tiberium Vein
            Ross128baRecipes.put(17, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 89)); // Tiberium Ore
            Ross128baRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Fluorspar Vein
            Ross128baRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            Ross128baRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore
            Ross128baRecipes.put(21, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 91)); // Fluorspar Ore
            Ross128baRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore

            VoidOreRecipes.put("Ra", Ross128baRecipes);
        }

        // T6 - Proteus - Pr
        {
            Map<Integer, ItemStack> ProteusRecipes = new HashMap<>();

            // Uranium 238 Vein
            ProteusRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            ProteusRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Diamond Vein
            ProteusRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            ProteusRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            ProteusRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Molybdenum Vein
            ProteusRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            ProteusRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            ProteusRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            ProteusRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Osmium Vein
            ProteusRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            ProteusRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            ProteusRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Tungsten Vein
            ProteusRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            ProteusRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            ProteusRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            ProteusRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Quartz Vein
            ProteusRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            ProteusRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            ProteusRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Infused Gold Vein
            ProteusRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            ProteusRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 323)); // Infused Gold Ore
            ProteusRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore

            // Ilmenite Vein
            ProteusRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            ProteusRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            ProteusRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            ProteusRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Copper Vein
            ProteusRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            ProteusRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            ProteusRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            ProteusRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Vanadium Vein
            ProteusRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 29)); // Vanadium Ore
            ProteusRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            ProteusRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            ProteusRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore

            // Bauxite Vein
            ProteusRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            ProteusRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            ProteusRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Neutronium Vein
            ProteusRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            ProteusRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            ProteusRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            ProteusRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Small Ore Stats
            ProteusRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            ProteusRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            ProteusRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            ProteusRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            ProteusRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            ProteusRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            ProteusRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            ProteusRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            ProteusRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            ProteusRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            ProteusRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            ProteusRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            ProteusRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            ProteusRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("Pr", ProteusRecipes);
        }

        // T6 - Triton - Tr
        {
            Map<Integer, ItemStack> TritonRecipes = new HashMap<>();

            // Tungstate Vein
            TritonRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            TritonRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            TritonRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Tungsten Vein
            TritonRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            TritonRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            TritonRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            TritonRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Manganese Vein
            TritonRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            TritonRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            TritonRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            TritonRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Monazite Vein
            TritonRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            TritonRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            TritonRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Nickel Vein
            TritonRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            TritonRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            TritonRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            TritonRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Thorium Vein
            TritonRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore
            TritonRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            TritonRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 101)); // Plutonium 241 Ore
            TritonRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 97)); // Uranium 235 Ore

            // Neutronium Vein
            TritonRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            TritonRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            TritonRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            TritonRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Gold Vein
            TritonRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            TritonRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            TritonRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Galena Vein
            TritonRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            TritonRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            TritonRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore

            // Niobium Vein
            TritonRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 47)); // Niobium Ore
            TritonRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 45)); // Yttrium Ore
            TritonRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 37)); // Gallium Ore

            // Iridium Vein
            TritonRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            TritonRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            TritonRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            TritonRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Small Ore Stats
            TritonRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            TritonRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            TritonRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            TritonRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            TritonRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            TritonRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            TritonRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            TritonRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            TritonRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            TritonRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            TritonRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            TritonRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore

            VoidOreRecipes.put("Tr", TritonRecipes);
        }

        // T7 - Haumea - Ha
        {
            Map<Integer, ItemStack> HaumeaRecipes = new HashMap<>();

            // Uranium 238 Vein
            HaumeaRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            HaumeaRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Tungstate Vein
            HaumeaRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            HaumeaRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            HaumeaRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Olivine Vein
            HaumeaRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            HaumeaRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            HaumeaRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            HaumeaRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Pitchblende Vein
            HaumeaRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            HaumeaRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Infused Gold Vein
            HaumeaRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            HaumeaRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 323)); // Infused Gold Ore
            HaumeaRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore

            // Monazite Vein
            HaumeaRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            HaumeaRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            HaumeaRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Thorium Vein
            HaumeaRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore
            HaumeaRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            HaumeaRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 101)); // Plutonium 241 Ore
            HaumeaRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 97)); // Uranium 235 Ore

            // Bauxite Vein
            HaumeaRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            HaumeaRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            HaumeaRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Neutronium Vein
            HaumeaRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            HaumeaRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            HaumeaRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            HaumeaRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Nether Star Vein
            HaumeaRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            HaumeaRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 506)); // Nether Star Ore
            HaumeaRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            HaumeaRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore

            // Beryllium Vein
            HaumeaRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            HaumeaRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            HaumeaRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Naquadah Vein
            HaumeaRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            HaumeaRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Small Ore Stats
            HaumeaRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            HaumeaRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            HaumeaRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            HaumeaRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            HaumeaRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            HaumeaRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            HaumeaRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            HaumeaRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            HaumeaRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            HaumeaRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Znic Ore
            HaumeaRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore

            VoidOreRecipes.put("Ha", HaumeaRecipes);
        }

        // T7 - Kuiperbelt - KB
        {
            Map<Integer, ItemStack> KuiperbeltRecipes = new HashMap<>();

            // Uranium 238 Vein
            KuiperbeltRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            KuiperbeltRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Tungstate Vein
            KuiperbeltRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            KuiperbeltRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            KuiperbeltRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Diamond Vein
            KuiperbeltRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            KuiperbeltRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            KuiperbeltRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Osmium Vein
            KuiperbeltRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            KuiperbeltRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            KuiperbeltRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Pitchblende Vein
            KuiperbeltRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            KuiperbeltRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Nickel Vein
            KuiperbeltRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            KuiperbeltRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            KuiperbeltRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            KuiperbeltRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Palladium Vein
            KuiperbeltRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            KuiperbeltRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            KuiperbeltRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            KuiperbeltRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Bauxite Vein
            KuiperbeltRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            KuiperbeltRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            KuiperbeltRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Neutronium Vein
            KuiperbeltRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            KuiperbeltRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            KuiperbeltRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            KuiperbeltRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Tetrahedrite Vein
            KuiperbeltRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            KuiperbeltRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            KuiperbeltRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Naquadah Vein
            KuiperbeltRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            KuiperbeltRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Iridium Vein
            KuiperbeltRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            KuiperbeltRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            KuiperbeltRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            KuiperbeltRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Small Ore Stats
            KuiperbeltRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            KuiperbeltRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            KuiperbeltRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            KuiperbeltRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            KuiperbeltRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            KuiperbeltRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            KuiperbeltRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            KuiperbeltRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            KuiperbeltRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            KuiperbeltRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("KB", KuiperbeltRecipes);
        }

        // T7 - Makemake - MM
        {
            Map<Integer, ItemStack> MakemakeRecipes = new HashMap<>();

            // Uranium 238 Vein
            MakemakeRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            MakemakeRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Tungstate Vein
            MakemakeRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            MakemakeRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            MakemakeRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Olivine Vein
            MakemakeRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            MakemakeRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            MakemakeRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            MakemakeRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Pitchblende Vein
            MakemakeRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            MakemakeRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Monazite Vein
            MakemakeRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            MakemakeRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            MakemakeRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Black Plutonium Vein
            MakemakeRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            MakemakeRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            MakemakeRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            MakemakeRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 941)); // Borax Ore

            // Vanadium Vein
            MakemakeRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 29)); // Vanadium Ore
            MakemakeRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            MakemakeRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            MakemakeRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore

            // Bauxite Vein
            MakemakeRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            MakemakeRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            MakemakeRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Neutronium Vein
            MakemakeRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            MakemakeRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            MakemakeRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            MakemakeRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Beryllium Vein
            MakemakeRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            MakemakeRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            MakemakeRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Red Garnet Vein
            MakemakeRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            MakemakeRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            MakemakeRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 912)); // Chrysotile Ore
            MakemakeRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 913)); // Realgar Ore

            // Niobium Vein
            MakemakeRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 47)); // Niobium Ore
            MakemakeRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 45)); // Yttrium Ore
            MakemakeRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 37)); // Gallium Ore

            // Magnetite Vein
            MakemakeRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            MakemakeRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            MakemakeRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Small Ore Stats
            MakemakeRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            MakemakeRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            MakemakeRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            MakemakeRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            MakemakeRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            MakemakeRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            MakemakeRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            MakemakeRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MakemakeRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            MakemakeRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            MakemakeRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MakemakeRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore

            VoidOreRecipes.put("MM", MakemakeRecipes);
        }

        // T7 - Pluto - Pl
        {
            Map<Integer, ItemStack> PlutoRecipes = new HashMap<>();

            // Tungstate Vein
            PlutoRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            PlutoRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            PlutoRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Diamond Vein
            PlutoRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            PlutoRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            PlutoRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Molybdenum Vein
            PlutoRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            PlutoRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            PlutoRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            PlutoRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Osmium Vein
            PlutoRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            PlutoRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            PlutoRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Tungsten Vein
            PlutoRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            PlutoRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            PlutoRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            PlutoRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Black Plutonium Vein
            PlutoRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            PlutoRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            PlutoRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            PlutoRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 941)); // Borax Ore

            // Ilmenite Vein
            PlutoRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            PlutoRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            PlutoRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            PlutoRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Palladium Vein
            PlutoRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            PlutoRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            PlutoRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            PlutoRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Thorium Vein
            PlutoRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore
            PlutoRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            PlutoRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 101)); // Plutonium 241 Ore
            PlutoRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 97)); // Uranium 235 Ore

            // Bauxite Vein
            PlutoRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            PlutoRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            PlutoRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Neutronium Vein
            PlutoRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            PlutoRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            PlutoRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            PlutoRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Gold Vein
            PlutoRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            PlutoRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            PlutoRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Iron Vein
            PlutoRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            PlutoRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            PlutoRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            PlutoRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore

            // Beryllium Vein
            PlutoRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            PlutoRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            PlutoRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Naquadah Vein
            PlutoRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            PlutoRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Small Ore Stats
            PlutoRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            PlutoRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            PlutoRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            PlutoRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            PlutoRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            PlutoRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            PlutoRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            PlutoRecipes.put(59, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            PlutoRecipes.put(60, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            PlutoRecipes.put(61, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            PlutoRecipes.put(62, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore
            PlutoRecipes.put(63, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            PlutoRecipes.put(64, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore
            PlutoRecipes.put(65, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("Pl", PlutoRecipes);
        }

        // T8 - BarnardC - BC
        {
            Map<Integer, ItemStack> BarnardCRecipes = new HashMap<>();

            // Oilsands Vein
            BarnardCRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 878)); // Oilsands Ore

            // Osmium Vein
            BarnardCRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            BarnardCRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            BarnardCRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Tungsten Vein
            BarnardCRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            BarnardCRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            BarnardCRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            BarnardCRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Samarium Vein
            BarnardCRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 69)); // Samarium Ore
            BarnardCRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore
            BarnardCRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 956)); // Tartarite Ore

            // Mica Vein
            BarnardCRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 924)); // Kyanite Ore
            BarnardCRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 901)); // Mica Ore
            BarnardCRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore
            BarnardCRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 919)); // Pollucite Ore

            // Black Plutonium Vein
            BarnardCRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            BarnardCRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            BarnardCRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            BarnardCRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 941)); // Borax Ore

            // Arsenic Vein
            BarnardCRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            BarnardCRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            BarnardCRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore

            // Lignite Coal Vein
            BarnardCRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 538)); // Lignite Coal Ore
            BarnardCRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Basaltic Mineral Sand Vein
            BarnardCRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 935)); // Basaltic Mineral Sand
            BarnardCRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 936)); // Granitic Mineral Sand
            BarnardCRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            BarnardCRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 934)); // Gypsum Ore

            // Salt Vein
            BarnardCRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 944)); // Rock Salt Ore
            BarnardCRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 817)); // Salt Ore
            BarnardCRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 907)); // Lepidolite Ore
            BarnardCRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 920)); // Spodumene Ore

            VoidOreRecipes.put("BC", BarnardCRecipes);
        }

        // T8 - BarnardE - BE
        {
            Map<Integer, ItemStack> BarnardERecipes = new HashMap<>();

            // Uranium 238 Vein
            BarnardERecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            BarnardERecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Molybdenum Vein
            BarnardERecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            BarnardERecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            BarnardERecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            BarnardERecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore

            // Olivine Vein
            BarnardERecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            BarnardERecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            BarnardERecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            BarnardERecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Tungsten Vein
            BarnardERecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            BarnardERecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            BarnardERecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            BarnardERecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Manganese Vein
            BarnardERecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            BarnardERecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            BarnardERecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            BarnardERecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Infused Gold Vein
            BarnardERecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            BarnardERecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 323)); // Infused Gold Ore
            BarnardERecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore

            // Rare Earth Vein
            BarnardERecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 55)); // Cadmium Ore
            BarnardERecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 62)); // Caesium Ore
            BarnardERecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 64)); // Lanthanum Ore
            BarnardERecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 65)); // Cerium Ore

            // Thorium Vein
            BarnardERecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore
            BarnardERecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            BarnardERecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 101)); // Plutonium 241 Ore
            BarnardERecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 97)); // Uranium 235 Ore

            // Copper Vein
            BarnardERecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            BarnardERecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            BarnardERecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            BarnardERecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Neutronium Vein
            BarnardERecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            BarnardERecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            BarnardERecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            BarnardERecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Nether Star Vein
            BarnardERecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            BarnardERecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 506)); // Nether Star Ore
            BarnardERecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            BarnardERecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore

            // Naquadah Vein
            BarnardERecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            BarnardERecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Magnetite Vein
            BarnardERecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            BarnardERecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            BarnardERecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Small Ore Stats
            BarnardERecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 976)); // Awakened Draconium Ore
            BarnardERecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            BarnardERecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            BarnardERecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            BarnardERecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            BarnardERecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            BarnardERecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            BarnardERecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore

            VoidOreRecipes.put("BE", BarnardERecipes);
        }

        // T8 - BarnardF - BF
        {
            Map<Integer, ItemStack> BarnardFRecipes = new HashMap<>();

            // Diamond Vein
            BarnardFRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            BarnardFRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            BarnardFRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore

            // Tungsten Vein
            BarnardFRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            BarnardFRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            BarnardFRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            BarnardFRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Manganese Vein
            BarnardFRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            BarnardFRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            BarnardFRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            BarnardFRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Pitchblende Vein
            BarnardFRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            BarnardFRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Redstone Vein
            BarnardFRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            BarnardFRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            BarnardFRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Monazite Vein
            BarnardFRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            BarnardFRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            BarnardFRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Rare Earth Vein
            BarnardFRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 55)); // Cadmium Ore
            BarnardFRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 62)); // Caesium Ore
            BarnardFRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 64)); // Lanthanum Ore
            BarnardFRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 65)); // Cerium Ore

            // Thorium Vein
            BarnardFRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore
            BarnardFRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            BarnardFRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 101)); // Plutonium 241 Ore
            BarnardFRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 97)); // Uranium 235 Ore

            // Copper Vein
            BarnardFRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            BarnardFRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            BarnardFRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            BarnardFRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore

            // Vanadium Vein
            BarnardFRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 29)); // Vanadium Ore
            BarnardFRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            BarnardFRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            BarnardFRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore

            // Neutronium Vein
            BarnardFRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            BarnardFRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            BarnardFRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            BarnardFRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Gold Vein
            BarnardFRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            BarnardFRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            BarnardFRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Beryllium Vein
            BarnardFRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            BarnardFRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            BarnardFRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Red Garnet Vein
            BarnardFRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            BarnardFRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            BarnardFRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 912)); // Chrysotile Ore
            BarnardFRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 913)); // Realgar Ore

            // Naquadah Vein
            BarnardFRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            BarnardFRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Niobium Vein
            BarnardFRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 47)); // Niobium Ore
            BarnardFRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 45)); // Yttrium Ore
            BarnardFRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 37)); // Gallium Ore

            // Vein
            BarnardFRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 976)); // Awakened Draconium Ore
            BarnardFRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            BarnardFRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            BarnardFRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            BarnardFRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            BarnardFRecipes.put(59, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            BarnardFRecipes.put(60, getModItem(GregTech.ID, "gt.blockores", 1L, 913)); // Realgar Ore
            BarnardFRecipes.put(61, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            BarnardFRecipes.put(62, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            BarnardFRecipes.put(63, getModItem(GregTech.ID, "gt.blockores", 1L, 395)); // Bedrockium Ore

            VoidOreRecipes.put("BF", BarnardFRecipes);

        }

        // T8 - α Centauri Bb - CB
        {
            Map<Integer, ItemStack> CentauriBbRecipes = new HashMap<>();

            // Sulfur Vein
            CentauriBbRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            CentauriBbRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            CentauriBbRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Manganese Vein
            CentauriBbRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            CentauriBbRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            CentauriBbRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            CentauriBbRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore

            // Samarium Vein
            CentauriBbRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 69)); // Samarium Ore
            CentauriBbRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore
            CentauriBbRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 956)); // Tartarite Ore

            // Pitchblende Vein
            CentauriBbRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            CentauriBbRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Quartz Vein
            CentauriBbRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            CentauriBbRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            CentauriBbRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Redstone Vein
            CentauriBbRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            CentauriBbRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            CentauriBbRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Black Plutonium Vein
            CentauriBbRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            CentauriBbRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            CentauriBbRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            CentauriBbRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 941)); // Borax Ore

            // Rare Earth Vein
            CentauriBbRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 55)); // Cadmium Ore
            CentauriBbRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 62)); // Caesium Ore
            CentauriBbRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 64)); // Lanthanum Ore
            CentauriBbRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 65)); // Cerium Ore

            // Beryllium Vein
            CentauriBbRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            CentauriBbRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            CentauriBbRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore

            // Electrotine Vein
            CentauriBbRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            CentauriBbRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 948)); // Diatomite Ore
            CentauriBbRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            CentauriBbRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 911)); // Alunite Ore

            // Tetrahedrite Vein
            CentauriBbRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            CentauriBbRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            CentauriBbRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Tin Vein
            CentauriBbRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 937)); // Cassiterite Sand
            CentauriBbRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            CentauriBbRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 946)); // Asbestos Ore
            CentauriBbRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 948)); // Diatomite Ore

            // Nether Quartz Vein
            CentauriBbRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 522)); // Nether Quartz Ore
            CentauriBbRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore

            VoidOreRecipes.put("CB", CentauriBbRecipes);
        }

        // T8 - TCetiE - TE
        {
            Map<Integer, ItemStack> TCetiERecipes = new HashMap<>();

            // Oilsands Vein
            TCetiERecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 878)); // Oilsands Ore

            // Magnesite Vein
            TCetiERecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            TCetiERecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            TCetiERecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            TCetiERecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore

            // Quartz Vein
            TCetiERecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            TCetiERecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            TCetiERecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Black Plutonium Vein
            TCetiERecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            TCetiERecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            TCetiERecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            TCetiERecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 941)); // Borax Ore

            // Ilmenite Vein
            TCetiERecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            TCetiERecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            TCetiERecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            TCetiERecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Bauxite Vein
            TCetiERecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            TCetiERecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            TCetiERecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Gold Vein
            TCetiERecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            TCetiERecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            TCetiERecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Kaolinite Vein
            TCetiERecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 929)); // Kaolinite
            TCetiERecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 916)); // Zeolite Ore
            TCetiERecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            TCetiERecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 949)); // Glauconite Sand

            // Nether Star Vein
            TCetiERecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            TCetiERecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 506)); // Nether Star Ore
            TCetiERecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            TCetiERecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore

            // Apatite Vein
            TCetiERecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 530)); // Apatite Ore
            TCetiERecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 534)); // Tricalcium Phosphate Ore
            TCetiERecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 607)); // Pyrochlore Ore

            // Chrome Vein
            TCetiERecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            TCetiERecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            TCetiERecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            TCetiERecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 31)); // Manganese Ore

            // Magnetite Vein
            TCetiERecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            TCetiERecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            TCetiERecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Salt Vein
            TCetiERecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 944)); // Rock Salt Ore
            TCetiERecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 817)); // Salt Ore
            TCetiERecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 907)); // Lepidolite Ore
            TCetiERecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 920)); // Spodumene Ore

            // Cassiterite Vein
            TCetiERecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            TCetiERecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            TCetiERecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 976)); // Awakened Draconium Ore
            TCetiERecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            TCetiERecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore

            VoidOreRecipes.put("TE", TCetiERecipes);
        }

        // T8 - VegaB - VB
        {
            Map<Integer, ItemStack> VegaBRecipes = new HashMap<>();

            // Tungstate Vein
            VegaBRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            VegaBRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            VegaBRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore

            // Lapis Vein
            VegaBRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            VegaBRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            VegaBRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            VegaBRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Pitchblende Vein
            VegaBRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            VegaBRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore

            // Redstone Vein
            VegaBRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            VegaBRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            VegaBRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Infused Gold Vein
            VegaBRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            VegaBRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 323)); // Infused Gold Ore
            VegaBRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore

            // Rare Earth Vein
            VegaBRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 55)); // Cadmium Ore
            VegaBRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 62)); // Caesium Ore
            VegaBRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 64)); // Lanthanum Ore
            VegaBRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 65)); // Cerium Ore

            // Thorium Vein
            VegaBRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore
            VegaBRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            VegaBRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 101)); // Plutonium 241 Ore
            VegaBRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 97)); // Uranium 235 Ore

            // Arsenic Vein
            VegaBRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            VegaBRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            VegaBRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore

            // Vanadium Vein
            VegaBRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 29)); // Vanadium Ore
            VegaBRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            VegaBRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            VegaBRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore

            // Neutronium Vein
            VegaBRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            VegaBRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            VegaBRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            VegaBRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Gold Vein
            VegaBRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            VegaBRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            VegaBRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Nether Star Vein
            VegaBRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            VegaBRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 506)); // Nether Star Ore
            VegaBRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            VegaBRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore

            // Red Garnet Vein
            VegaBRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            VegaBRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            VegaBRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 912)); // Chrysotile Ore
            VegaBRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 913)); // Realgar Ore

            // Tetrahedrite Vein
            VegaBRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            VegaBRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            VegaBRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore

            // Galena Vein
            VegaBRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            VegaBRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            VegaBRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore

            // Naquadah Vein
            VegaBRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            VegaBRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Niobium Vein
            VegaBRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 47)); // Niobium Ore
            VegaBRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 45)); // Yttrium Ore
            VegaBRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 37)); // Gallium Ore

            // Small Ore Stats
            VegaBRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 976)); // Awakened Draconium Ore
            VegaBRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            VegaBRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            VegaBRecipes.put(59, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            VegaBRecipes.put(60, getModItem(GregTech.ID, "gt.blockores", 1L, 394)); // Infinity Catalyst Ore
            VegaBRecipes.put(61, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            VegaBRecipes.put(62, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            VegaBRecipes.put(63, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            VegaBRecipes.put(64, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore

            VoidOreRecipes.put("VB", VegaBRecipes);
        }

        // T9 - Anubis - An
        {
            Map<Integer, ItemStack> AnubisRecipes = new HashMap<>();

            // Sulfur Vein
            AnubisRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            AnubisRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            AnubisRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore

            // Infinity Catalyst Vein
            AnubisRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            AnubisRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            AnubisRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 394)); // Infinity Catalyst Ore
            AnubisRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 395)); // Bedrockium Ore

            // Olivine Vein
            AnubisRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            AnubisRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            AnubisRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            AnubisRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Desh Vein
            AnubisRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            AnubisRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            AnubisRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore

            // Mica Vein
            AnubisRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 924)); // Kyanite Ore
            AnubisRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 901)); // Mica Ore
            AnubisRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore
            AnubisRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 919)); // Pollucite Ore

            // Cryolite Vein
            AnubisRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            AnubisRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            AnubisRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            AnubisRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 699)); // Cryolite Ore

            // Dolomite Vein
            AnubisRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 914)); // Dolomite Ore
            AnubisRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 915)); // Wollastonite Ore
            AnubisRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 903)); // Trona Ore
            AnubisRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 821)); // Andradite Ore

            // Callisto Ice Vein
            AnubisRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 389)); // Callisto Ice Ore
            AnubisRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 507)); // Topaz Ore
            AnubisRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 513)); // Blue Topaz Ore
            AnubisRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 485)); // Alduorite Ore

            // Soapstone Vein
            AnubisRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 877)); // Soapstone Ore
            AnubisRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 902)); // Talc
            AnubisRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore
            AnubisRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Mytryl Vein
            AnubisRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            AnubisRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 511)); // Jasper Ore
            AnubisRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 952)); // Ceruclase Ore
            AnubisRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 489)); // Vulcanite Ore

            // Rutile Vein
            AnubisRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 375)); // Rutile Ore
            AnubisRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            AnubisRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            AnubisRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore

            // Basaltic Mineral Sand Vein
            AnubisRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 935)); // Basaltic Mineral Sand
            AnubisRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 936)); // Granitic Mineral Sand
            AnubisRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            AnubisRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 934)); // Gypsum Ore

            // Small Ore Stats
            AnubisRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 394)); // Infinity Catalyst Ore

            VoidOreRecipes.put("An", AnubisRecipes);
        }

        // T9 - Horus - Ho
        {
            Map<Integer, ItemStack> HorusRecipes = new HashMap<>();

            // Magnesite Vein
            HorusRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            HorusRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            HorusRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            HorusRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore

            // Certus Quartz Vein
            HorusRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore
            HorusRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 517)); // Charged Certus Quartz Ore
            HorusRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 939)); // Quartz Sand

            // Quartz Vein
            HorusRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            HorusRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            HorusRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Draconium Vein
            HorusRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            HorusRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            HorusRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            HorusRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore

            // Sapphire Vein
            HorusRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 820)); // Almandine Ore
            HorusRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 835)); // Pyrope Ore
            HorusRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 503)); // Sapphire Ore
            HorusRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 504)); // Green Sapphire Ore

            // Black Plutonium Vein
            HorusRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            HorusRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            HorusRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            HorusRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 941)); // Borax Ore

            // Cosmic Neutronium Vein
            HorusRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            HorusRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 982)); // Cosmic Neutronium Ore
            HorusRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            HorusRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 395)); // Bedrockium Ore

            // Mytryl Vein
            HorusRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            HorusRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 511)); // Jasper Ore
            HorusRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 952)); // Ceruclase Ore
            HorusRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 489)); // Vulcanite Ore

            // Nether Star Vein
            HorusRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            HorusRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 506)); // Nether Star Ore
            HorusRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            HorusRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore

            // Red Garnet Vein
            HorusRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            HorusRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            HorusRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 912)); // Chrysotile Ore
            HorusRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 913)); // Realgar Ore

            // Oriharukon Vein
            HorusRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            HorusRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 508)); // Tanzanite Ore
            HorusRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 951)); // Vyroxeres Ore
            HorusRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 900)); // Mirabilite Ore

            // Quantium Vein
            HorusRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore
            HorusRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 509)); // Amethyst Ore
            HorusRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 375)); // Rutile Ore
            HorusRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 382)); // Ardite Ore

            // Ledox Vein
            HorusRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            HorusRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore
            HorusRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 966)); // Orichalcum Ore
            HorusRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 488)); // Rubracium Ore

            // Vein
            HorusRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 509)); // Amethyst Ore
            HorusRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            HorusRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            HorusRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 508)); // Tanzanite Ore
            HorusRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 512)); // Spinel Ore
            HorusRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore
            HorusRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 517)); // Charged Certus Quartz Ore
            HorusRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            HorusRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            HorusRecipes.put(59, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            HorusRecipes.put(60, getModItem(GregTech.ID, "gt.blockores", 1L, 513)); // Blue Topaz Ore
            HorusRecipes.put(61, getModItem(GregTech.ID, "gt.blockores", 1L, 507)); // Topaz Ore
            HorusRecipes.put(62, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore
            HorusRecipes.put(63, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            HorusRecipes.put(64, getModItem(GregTech.ID, "gt.blockores", 1L, 504)); // Green Sapphire Ore
            HorusRecipes.put(65, getModItem(GregTech.ID, "gt.blockores", 1L, 503)); // Sapphire Ore
            HorusRecipes.put(66, getModItem(GregTech.ID, "gt.blockores", 1L, 511)); // Jasper Ore
            HorusRecipes.put(67, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore

            VoidOreRecipes.put("Ho", HorusRecipes);
        }

        // T9 - Maahes - Mh
        {
            Map<Integer, ItemStack> MaahesRecipes = new HashMap<>();

            // Naquadria Vein
            MaahesRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            MaahesRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore
            MaahesRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 327)); // Naquadria Ore
            MaahesRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 868)); // Trinium Ore

            // Cryolite Vein
            MaahesRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            MaahesRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            MaahesRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            MaahesRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 699)); // Cryolite Ore

            // Callisto Ice Vein
            MaahesRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 389)); // Callisto Ice Ore
            MaahesRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 507)); // Topaz Ore
            MaahesRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 513)); // Blue Topaz Ore
            MaahesRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 485)); // Alduorite Ore

            // Vanadium Vein
            MaahesRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 29)); // Vanadium Ore
            MaahesRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            MaahesRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            MaahesRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore

            // Soapstone Vein
            MaahesRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 877)); // Soapstone Ore
            MaahesRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 902)); // Talc
            MaahesRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore
            MaahesRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Neutronium Vein
            MaahesRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            MaahesRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            MaahesRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            MaahesRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Platinum Vein
            MaahesRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            MaahesRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            MaahesRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            MaahesRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Naquadah Vein
            MaahesRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            MaahesRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore

            // Basaltic Mineral Sand Vein
            MaahesRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 935)); // Basaltic Mineral Sand
            MaahesRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 936)); // Granitic Mineral Sand
            MaahesRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            MaahesRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 934)); // Gypsum Ore

            // Quantium Vein
            MaahesRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore
            MaahesRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 509)); // Amethyst Ore
            MaahesRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 375)); // Rutile Ore
            MaahesRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 382)); // Ardite Ore

            // Chrome Vein
            MaahesRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            MaahesRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            MaahesRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            MaahesRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 31)); // Manganese Ore

            VoidOreRecipes.put("Mh", MaahesRecipes);
        }

        // T9 - MehenBelt - MB
        {
            Map<Integer, ItemStack> MehenBeltRecipes = new HashMap<>();

            // Uranium 238 Vein
            MehenBeltRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            MehenBeltRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore

            // Lapis Vein
            MehenBeltRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            MehenBeltRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            MehenBeltRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            MehenBeltRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore

            // Awakened Draconium Vein
            MehenBeltRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            MehenBeltRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 976)); // Awakened Draconium Ore
            MehenBeltRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 506)); // Nether Star Ore

            // Olivine Vein
            MehenBeltRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            MehenBeltRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            MehenBeltRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            MehenBeltRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore

            // Osmium Vein
            MehenBeltRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MehenBeltRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            MehenBeltRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Nickel Vein
            MehenBeltRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            MehenBeltRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MehenBeltRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            MehenBeltRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore

            // Ilmenite Vein
            MehenBeltRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            MehenBeltRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MehenBeltRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            MehenBeltRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore

            // Palladium Vein
            MehenBeltRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            MehenBeltRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            MehenBeltRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            MehenBeltRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Neutronium Vein
            MehenBeltRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            MehenBeltRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            MehenBeltRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            MehenBeltRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore

            // Platinum Vein
            MehenBeltRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            MehenBeltRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            MehenBeltRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            MehenBeltRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Iridium Vein
            MehenBeltRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MehenBeltRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            MehenBeltRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            MehenBeltRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Cassiterite Vein
            MehenBeltRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            MehenBeltRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            MehenBeltRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            MehenBeltRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            MehenBeltRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            MehenBeltRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            MehenBeltRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            MehenBeltRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            MehenBeltRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore

            VoidOreRecipes.put("MB", MehenBeltRecipes);
        }

        // T9 - Neper - Np
        {
            Map<Integer, ItemStack> NeperRecipes = new HashMap<>();

            // Tungsten Vein
            NeperRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            NeperRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            NeperRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            NeperRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore

            // Terra & Aer Vein
            NeperRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 542)); // Terra Infused Stone
            NeperRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 540)); // Aer Infused Stone
            NeperRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            NeperRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Certus Quartz Vein
            NeperRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore
            NeperRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 517)); // Charged Certus Quartz Ore
            NeperRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 939)); // Quartz Sand

            // Quartzite Vein
            NeperRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            NeperRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            NeperRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore

            // Dilithium Vein
            NeperRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 515)); // Dilithium Ore
            NeperRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 398)); // Mysterious Crystal Ore
            NeperRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore

            // Mica Vein
            NeperRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 924)); // Kyanite Ore
            NeperRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 901)); // Mica Ore
            NeperRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore
            NeperRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 919)); // Pollucite Ore

            // Dolomite Vein
            NeperRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 914)); // Dolomite Ore
            NeperRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 915)); // Wollastonite Ore
            NeperRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 903)); // Trona Ore
            NeperRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 821)); // Andradite Ore

            // Arsenic Vein
            NeperRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            NeperRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            NeperRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore

            // Perditio & Ordo Vein
            NeperRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 544)); // Perditio Infused Stone
            NeperRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 545)); // Ordo Infused Stone
            NeperRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            NeperRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Kaolinite Vein
            NeperRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 929)); // Kaolinite
            NeperRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 916)); // Zeolite Ore
            NeperRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            NeperRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 949)); // Glauconite Sand

            // Aqua & Ignis Vein
            NeperRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 543)); // Aqua Infused Stone
            NeperRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 541)); // Ignis Infused Stone
            NeperRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            NeperRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore

            // Nether Quartz Vein
            NeperRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 522)); // Nether Quartz Ore
            NeperRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore

            VoidOreRecipes.put("Np", NeperRecipes);
        }

        // T9 - Seth - Se
        {
            Map<Integer, ItemStack> SethRecipes = new HashMap<>();

            // Osmium Vein
            SethRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            SethRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            SethRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore

            // Samarium Vein
            SethRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 69)); // Samarium Ore
            SethRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore
            SethRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 956)); // Tartarite Ore

            // Draconium Vein
            SethRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            SethRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            SethRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            SethRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore

            // Monazite Vein
            SethRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            SethRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            SethRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore

            // Palladium Vein
            SethRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            SethRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            SethRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            SethRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore

            // Bauxite Vein
            SethRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            SethRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            SethRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore

            // Gold Vein
            SethRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            SethRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            SethRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore

            // Raw Tengam Vein
            SethRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 110)); // Raw Tengam Ore
            SethRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            SethRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 69)); // Samarium Ore

            // Magnetite Vein
            SethRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            SethRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            SethRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore

            // Iridium Vein
            SethRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            SethRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            SethRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            SethRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore

            // Cassiterite Vein
            SethRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            SethRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore

            // Small Ore Stats
            SethRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 976)); // Awakened Draconium Ore
            SethRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore

            VoidOreRecipes.put("Se", SethRecipes);
        }

        // T10 - DeepDark - DD
        {
            Map<Integer, ItemStack> DeepDarkRecipes = new HashMap<>();

            // GregTech
            DeepDarkRecipes.put(0, getModItem(GregTech.ID, "gt.blockores", 1L, 6)); // Lithium Ore
            DeepDarkRecipes.put(1, getModItem(GregTech.ID, "gt.blockores", 1L, 8)); // Beryllium Ore
            DeepDarkRecipes.put(2, getModItem(GregTech.ID, "gt.blockores", 1L, 18)); // Magnesium Ore
            DeepDarkRecipes.put(3, getModItem(GregTech.ID, "gt.blockores", 1L, 19)); // Aluminium Ore
            DeepDarkRecipes.put(4, getModItem(GregTech.ID, "gt.blockores", 1L, 20)); // Raw Silicon Ore
            DeepDarkRecipes.put(5, getModItem(GregTech.ID, "gt.blockores", 1L, 22)); // Sulfur Ore
            DeepDarkRecipes.put(6, getModItem(GregTech.ID, "gt.blockores", 1L, 27)); // Scandium Ore
            DeepDarkRecipes.put(7, getModItem(GregTech.ID, "gt.blockores", 1L, 28)); // Titanium Ore
            DeepDarkRecipes.put(8, getModItem(GregTech.ID, "gt.blockores", 1L, 29)); // Vanadium Ore
            DeepDarkRecipes.put(9, getModItem(GregTech.ID, "gt.blockores", 1L, 30)); // Chrome Ore
            DeepDarkRecipes.put(10, getModItem(GregTech.ID, "gt.blockores", 1L, 31)); // Manganese Ore
            DeepDarkRecipes.put(11, getModItem(GregTech.ID, "gt.blockores", 1L, 32)); // Iron Ore
            DeepDarkRecipes.put(12, getModItem(GregTech.ID, "gt.blockores", 1L, 33)); // Cobalt Ore
            DeepDarkRecipes.put(13, getModItem(GregTech.ID, "gt.blockores", 1L, 34)); // Nickel Ore
            DeepDarkRecipes.put(14, getModItem(GregTech.ID, "gt.blockores", 1L, 35)); // Copper Ore
            DeepDarkRecipes.put(15, getModItem(GregTech.ID, "gt.blockores", 1L, 36)); // Zinc Ore
            DeepDarkRecipes.put(16, getModItem(GregTech.ID, "gt.blockores", 1L, 37)); // Gallium Ore
            DeepDarkRecipes.put(17, getModItem(GregTech.ID, "gt.blockores", 1L, 39)); // Arsenic Ore
            DeepDarkRecipes.put(18, getModItem(GregTech.ID, "gt.blockores", 1L, 43)); // Rubidium Ore
            DeepDarkRecipes.put(19, getModItem(GregTech.ID, "gt.blockores", 1L, 44)); // Strontium Ore
            DeepDarkRecipes.put(20, getModItem(GregTech.ID, "gt.blockores", 1L, 45)); // Yttrium Ore
            DeepDarkRecipes.put(21, getModItem(GregTech.ID, "gt.blockores", 1L, 47)); // Niobium Ore
            DeepDarkRecipes.put(22, getModItem(GregTech.ID, "gt.blockores", 1L, 48)); // Molybdenum Ore
            DeepDarkRecipes.put(23, getModItem(GregTech.ID, "gt.blockores", 1L, 52)); // Palladium Ore
            DeepDarkRecipes.put(24, getModItem(GregTech.ID, "gt.blockores", 1L, 54)); // Silver Ore
            DeepDarkRecipes.put(25, getModItem(GregTech.ID, "gt.blockores", 1L, 55)); // Cadmium Ore
            DeepDarkRecipes.put(26, getModItem(GregTech.ID, "gt.blockores", 1L, 56)); // Indium Ore
            DeepDarkRecipes.put(27, getModItem(GregTech.ID, "gt.blockores", 1L, 57)); // Tin Ore
            DeepDarkRecipes.put(28, getModItem(GregTech.ID, "gt.blockores", 1L, 58)); // Antimony Ore
            DeepDarkRecipes.put(29, getModItem(GregTech.ID, "gt.blockores", 1L, 59)); // Tellurium Ore
            DeepDarkRecipes.put(30, getModItem(GregTech.ID, "gt.blockores", 1L, 62)); // Caesium Ore
            DeepDarkRecipes.put(31, getModItem(GregTech.ID, "gt.blockores", 1L, 63)); // Barium Ore
            DeepDarkRecipes.put(32, getModItem(GregTech.ID, "gt.blockores", 1L, 64)); // Lanthanum Ore
            DeepDarkRecipes.put(33, getModItem(GregTech.ID, "gt.blockores", 1L, 65)); // Cerium Ore
            DeepDarkRecipes.put(34, getModItem(GregTech.ID, "gt.blockores", 1L, 66)); // Praseodymium Ore
            DeepDarkRecipes.put(35, getModItem(GregTech.ID, "gt.blockores", 1L, 67)); // Neodymium Ore
            DeepDarkRecipes.put(36, getModItem(GregTech.ID, "gt.blockores", 1L, 68)); // Promethium Ore
            DeepDarkRecipes.put(37, getModItem(GregTech.ID, "gt.blockores", 1L, 69)); // Samarium Ore
            DeepDarkRecipes.put(38, getModItem(GregTech.ID, "gt.blockores", 1L, 70)); // Europium Ore
            DeepDarkRecipes.put(39, getModItem(GregTech.ID, "gt.blockores", 1L, 71)); // Gadolinium Ore
            DeepDarkRecipes.put(40, getModItem(GregTech.ID, "gt.blockores", 1L, 72)); // Terbium Ore
            DeepDarkRecipes.put(41, getModItem(GregTech.ID, "gt.blockores", 1L, 73)); // Dysprosium Ore
            DeepDarkRecipes.put(42, getModItem(GregTech.ID, "gt.blockores", 1L, 74)); // Holmium Ore
            DeepDarkRecipes.put(43, getModItem(GregTech.ID, "gt.blockores", 1L, 75)); // Erbium Ore
            DeepDarkRecipes.put(44, getModItem(GregTech.ID, "gt.blockores", 1L, 76)); // Thulium Ore
            DeepDarkRecipes.put(45, getModItem(GregTech.ID, "gt.blockores", 1L, 77)); // Ytterbium Ore
            DeepDarkRecipes.put(46, getModItem(GregTech.ID, "gt.blockores", 1L, 78)); // Lutetium Ore
            DeepDarkRecipes.put(47, getModItem(GregTech.ID, "gt.blockores", 1L, 80)); // Tantalum Ore
            DeepDarkRecipes.put(48, getModItem(GregTech.ID, "gt.blockores", 1L, 81)); // Tungsten Ore
            DeepDarkRecipes.put(49, getModItem(GregTech.ID, "gt.blockores", 1L, 83)); // Osmium Ore
            DeepDarkRecipes.put(50, getModItem(GregTech.ID, "gt.blockores", 1L, 84)); // Iridium Ore
            DeepDarkRecipes.put(51, getModItem(GregTech.ID, "gt.blockores", 1L, 85)); // Platinum Ore
            DeepDarkRecipes.put(52, getModItem(GregTech.ID, "gt.blockores", 1L, 86)); // Gold Ore
            DeepDarkRecipes.put(53, getModItem(GregTech.ID, "gt.blockores", 1L, 89)); // Lead Ore
            DeepDarkRecipes.put(54, getModItem(GregTech.ID, "gt.blockores", 1L, 90)); // Bismuth Ore
            DeepDarkRecipes.put(55, getModItem(GregTech.ID, "gt.blockores", 1L, 96)); // Thorium Ore
            DeepDarkRecipes.put(56, getModItem(GregTech.ID, "gt.blockores", 1L, 97)); // Uranium 235 Ore
            DeepDarkRecipes.put(57, getModItem(GregTech.ID, "gt.blockores", 1L, 98)); // Uranium 238 Ore
            DeepDarkRecipes.put(58, getModItem(GregTech.ID, "gt.blockores", 1L, 100)); // Plutonium 239 Ore
            DeepDarkRecipes.put(59, getModItem(GregTech.ID, "gt.blockores", 1L, 101)); // Plutonium 241 Ore
            DeepDarkRecipes.put(60, getModItem(GregTech.ID, "gt.blockores", 1L, 103)); // Americium Ore
            DeepDarkRecipes.put(61, getModItem(GregTech.ID, "gt.blockores", 1L, 110)); // Raw Tengam Ore
            DeepDarkRecipes.put(62, getModItem(GregTech.ID, "gt.blockores", 1L, 129)); // Neutronium Ore
            DeepDarkRecipes.put(63, getModItem(GregTech.ID, "gt.blockores", 1L, 303)); // Electrum Ore
            DeepDarkRecipes.put(64, getModItem(GregTech.ID, "gt.blockores", 1L, 307)); // Pig Iron Ore
            DeepDarkRecipes.put(65, getModItem(GregTech.ID, "gt.blockores", 1L, 319)); // Adamantium Ore
            DeepDarkRecipes.put(66, getModItem(GregTech.ID, "gt.blockores", 1L, 320)); // Fluxed Electrum Ore
            DeepDarkRecipes.put(67, getModItem(GregTech.ID, "gt.blockores", 1L, 323)); // Infused Gold Ore
            DeepDarkRecipes.put(68, getModItem(GregTech.ID, "gt.blockores", 1L, 324)); // Naquadah Ore
            DeepDarkRecipes.put(69, getModItem(GregTech.ID, "gt.blockores", 1L, 326)); // Enriched Naquadah Ore
            DeepDarkRecipes.put(70, getModItem(GregTech.ID, "gt.blockores", 1L, 327)); // Naquadria Ore
            DeepDarkRecipes.put(71, getModItem(GregTech.ID, "gt.blockores", 1L, 329)); // Tritanium Ore
            DeepDarkRecipes.put(72, getModItem(GregTech.ID, "gt.blockores", 1L, 331)); // Mithril Ore
            DeepDarkRecipes.put(73, getModItem(GregTech.ID, "gt.blockores", 1L, 336)); // Shadow Iron Ore
            DeepDarkRecipes.put(74, getModItem(GregTech.ID, "gt.blockores", 1L, 340)); // Meteoric Iron Ore
            DeepDarkRecipes.put(75, getModItem(GregTech.ID, "gt.blockores", 1L, 342)); // Deep Dark Iron Ore
            DeepDarkRecipes.put(76, getModItem(GregTech.ID, "gt.blockores", 1L, 347)); // Firestone Ore
            DeepDarkRecipes.put(77, getModItem(GregTech.ID, "gt.blockores", 1L, 368)); // Shadow Metal Ore
            DeepDarkRecipes.put(78, getModItem(GregTech.ID, "gt.blockores", 1L, 375)); // Rutile Ore
            DeepDarkRecipes.put(79, getModItem(GregTech.ID, "gt.blockores", 1L, 382)); // Ardite Ore
            DeepDarkRecipes.put(80, getModItem(GregTech.ID, "gt.blockores", 1L, 386)); // Manyullyn Ore
            DeepDarkRecipes.put(81, getModItem(GregTech.ID, "gt.blockores", 1L, 387)); // Mytryl Ore
            DeepDarkRecipes.put(82, getModItem(GregTech.ID, "gt.blockores", 1L, 388)); // Black Plutonium Ore
            DeepDarkRecipes.put(83, getModItem(GregTech.ID, "gt.blockores", 1L, 389)); // Callisto Ice Ore
            DeepDarkRecipes.put(84, getModItem(GregTech.ID, "gt.blockores", 1L, 390)); // Ledox Ore
            DeepDarkRecipes.put(85, getModItem(GregTech.ID, "gt.blockores", 1L, 391)); // Quantium Ore
            DeepDarkRecipes.put(86, getModItem(GregTech.ID, "gt.blockores", 1L, 392)); // Duralumin Ore
            DeepDarkRecipes.put(87, getModItem(GregTech.ID, "gt.blockores", 1L, 393)); // Oriharukon Ore
            DeepDarkRecipes.put(88, getModItem(GregTech.ID, "gt.blockores", 1L, 394)); // Infinity Catalyst Ore
            DeepDarkRecipes.put(89, getModItem(GregTech.ID, "gt.blockores", 1L, 395)); // Bedrockium Ore
            DeepDarkRecipes.put(90, getModItem(GregTech.ID, "gt.blockores", 1L, 398)); // Mysterious Crystal Ore
            DeepDarkRecipes.put(91, getModItem(GregTech.ID, "gt.blockores", 1L, 485)); // Alduorite Ore
            DeepDarkRecipes.put(92, getModItem(GregTech.ID, "gt.blockores", 1L, 488)); // Rubracium Ore
            DeepDarkRecipes.put(93, getModItem(GregTech.ID, "gt.blockores", 1L, 489)); // Vulcanite Ore
            DeepDarkRecipes.put(94, getModItem(GregTech.ID, "gt.blockores", 1L, 500)); // Diamond Ore
            DeepDarkRecipes.put(95, getModItem(GregTech.ID, "gt.blockores", 1L, 501)); // Emerald Ore
            DeepDarkRecipes.put(96, getModItem(GregTech.ID, "gt.blockores", 1L, 502)); // Ruby Ore
            DeepDarkRecipes.put(97, getModItem(GregTech.ID, "gt.blockores", 1L, 503)); // Sapphire Ore
            DeepDarkRecipes.put(98, getModItem(GregTech.ID, "gt.blockores", 1L, 504)); // Green Sapphire Ore
            DeepDarkRecipes.put(99, getModItem(GregTech.ID, "gt.blockores", 1L, 505)); // Olivine Ore
            DeepDarkRecipes.put(100, getModItem(GregTech.ID, "gt.blockores", 1L, 506)); // Nether Star Ore
            DeepDarkRecipes.put(101, getModItem(GregTech.ID, "gt.blockores", 1L, 507)); // Topaz Ore
            DeepDarkRecipes.put(102, getModItem(GregTech.ID, "gt.blockores", 1L, 508)); // Tanzanite Ore
            DeepDarkRecipes.put(103, getModItem(GregTech.ID, "gt.blockores", 1L, 509)); // Amethyst Ore
            DeepDarkRecipes.put(104, getModItem(GregTech.ID, "gt.blockores", 1L, 510)); // Opal Ore
            DeepDarkRecipes.put(105, getModItem(GregTech.ID, "gt.blockores", 1L, 511)); // Jasper Ore
            DeepDarkRecipes.put(106, getModItem(GregTech.ID, "gt.blockores", 1L, 512)); // Spinel Ore
            DeepDarkRecipes.put(107, getModItem(GregTech.ID, "gt.blockores", 1L, 513)); // Blue Topaz Ore
            DeepDarkRecipes.put(108, getModItem(GregTech.ID, "gt.blockores", 1L, 514)); // Amber Ore
            DeepDarkRecipes.put(109, getModItem(GregTech.ID, "gt.blockores", 1L, 515)); // Dilithium Ore
            DeepDarkRecipes.put(110, getModItem(GregTech.ID, "gt.blockores", 1L, 516)); // Certus Quartz Ore
            DeepDarkRecipes.put(111, getModItem(GregTech.ID, "gt.blockores", 1L, 517)); // Charged Certus Quartz Ore
            DeepDarkRecipes.put(112, getModItem(GregTech.ID, "gt.blockores", 1L, 518)); // Forcicium Ore
            DeepDarkRecipes.put(113, getModItem(GregTech.ID, "gt.blockores", 1L, 519)); // Forcillium Ore
            DeepDarkRecipes.put(114, getModItem(GregTech.ID, "gt.blockores", 1L, 520)); // Monazite Ore
            DeepDarkRecipes.put(115, getModItem(GregTech.ID, "gt.blockores", 1L, 521)); // Force Ore
            DeepDarkRecipes.put(116, getModItem(GregTech.ID, "gt.blockores", 1L, 522)); // Nether Quartz Ore
            DeepDarkRecipes.put(117, getModItem(GregTech.ID, "gt.blockores", 1L, 523)); // Quartzite Ore
            DeepDarkRecipes.put(118, getModItem(GregTech.ID, "gt.blockores", 1L, 524)); // Lazurite Ore
            DeepDarkRecipes.put(119, getModItem(GregTech.ID, "gt.blockores", 1L, 525)); // Sodalite Ore
            DeepDarkRecipes.put(120, getModItem(GregTech.ID, "gt.blockores", 1L, 526)); // Lapis Ore
            DeepDarkRecipes.put(121, getModItem(GregTech.ID, "gt.blockores", 1L, 527)); // Red Garnet Ore
            DeepDarkRecipes.put(122, getModItem(GregTech.ID, "gt.blockores", 1L, 528)); // Yellow Garnet Ore
            DeepDarkRecipes.put(123, getModItem(GregTech.ID, "gt.blockores", 1L, 529)); // Vinteum Ore
            DeepDarkRecipes.put(124, getModItem(GregTech.ID, "gt.blockores", 1L, 530)); // Apatite Ore
            DeepDarkRecipes.put(125, getModItem(GregTech.ID, "gt.blockores", 1L, 531)); // Niter Ore
            DeepDarkRecipes.put(126, getModItem(GregTech.ID, "gt.blockores", 1L, 534)); // Tricalcium Phosphate Ore
            DeepDarkRecipes.put(127, getModItem(GregTech.ID, "gt.blockores", 1L, 535)); // Coal Ore
            DeepDarkRecipes.put(128, getModItem(GregTech.ID, "gt.blockores", 1L, 537)); // Jade Ore
            DeepDarkRecipes.put(129, getModItem(GregTech.ID, "gt.blockores", 1L, 538)); // Lignite Coal Ore
            DeepDarkRecipes.put(130, getModItem(GregTech.ID, "gt.blockores", 1L, 540)); // Aer Infused Stone
            DeepDarkRecipes.put(131, getModItem(GregTech.ID, "gt.blockores", 1L, 541)); // Ignis Infused Stone
            DeepDarkRecipes.put(132, getModItem(GregTech.ID, "gt.blockores", 1L, 542)); // Terra Infused Stone
            DeepDarkRecipes.put(133, getModItem(GregTech.ID, "gt.blockores", 1L, 543)); // Aqua Infused Stone
            DeepDarkRecipes.put(134, getModItem(GregTech.ID, "gt.blockores", 1L, 544)); // Perditio Infused Stone
            DeepDarkRecipes.put(135, getModItem(GregTech.ID, "gt.blockores", 1L, 545)); // Ordo Infused Stone
            DeepDarkRecipes.put(136, getModItem(GregTech.ID, "gt.blockores", 1L, 548)); // Roasted Iron Ore
            DeepDarkRecipes.put(137, getModItem(GregTech.ID, "gt.blockores", 1L, 549)); // Roasted Nickel Ore
            DeepDarkRecipes.put(138, getModItem(GregTech.ID, "gt.blockores", 1L, 607)); // Pyrochlore Ore
            DeepDarkRecipes.put(139, getModItem(GregTech.ID, "gt.blockores", 1L, 699)); // Cryolite Ore
            DeepDarkRecipes.put(140, getModItem(GregTech.ID, "gt.blockores", 1L, 770)); // Endium Ore
            DeepDarkRecipes.put(141, getModItem(GregTech.ID, "gt.blockores", 1L, 797)); // Calcium Hydride Ore
            DeepDarkRecipes.put(142, getModItem(GregTech.ID, "gt.blockores", 1L, 810)); // Redstone Ore
            DeepDarkRecipes.put(143, getModItem(GregTech.ID, "gt.blockores", 1L, 812)); // Electrotine Ore
            DeepDarkRecipes.put(144, getModItem(GregTech.ID, "gt.blockores", 1L, 817)); // Salt Ore
            DeepDarkRecipes.put(145, getModItem(GregTech.ID, "gt.blockores", 1L, 820)); // Almandine Ore
            DeepDarkRecipes.put(146, getModItem(GregTech.ID, "gt.blockores", 1L, 821)); // Andradite Ore
            DeepDarkRecipes.put(147, getModItem(GregTech.ID, "gt.blockores", 1L, 822)); // Bauxite Ore
            DeepDarkRecipes.put(148, getModItem(GregTech.ID, "gt.blockores", 1L, 823)); // Calcite Ore
            DeepDarkRecipes.put(149, getModItem(GregTech.ID, "gt.blockores", 1L, 824)); // Cassiterite Ore
            DeepDarkRecipes.put(150, getModItem(GregTech.ID, "gt.blockores", 1L, 825)); // Chromite Ore
            DeepDarkRecipes.put(151, getModItem(GregTech.ID, "gt.blockores", 1L, 826)); // Cinnabar Ore
            DeepDarkRecipes.put(152, getModItem(GregTech.ID, "gt.blockores", 1L, 827)); // Cobaltite Ore
            DeepDarkRecipes.put(153, getModItem(GregTech.ID, "gt.blockores", 1L, 828)); // Sheldonite Ore
            DeepDarkRecipes.put(154, getModItem(GregTech.ID, "gt.blockores", 1L, 829)); // Deep Iron Ore
            DeepDarkRecipes.put(155, getModItem(GregTech.ID, "gt.blockores", 1L, 830)); // Galena Ore
            DeepDarkRecipes.put(156, getModItem(GregTech.ID, "gt.blockores", 1L, 831)); // Grossular Ore
            DeepDarkRecipes.put(157, getModItem(GregTech.ID, "gt.blockores", 1L, 833)); // Phosphate Ore
            DeepDarkRecipes.put(158, getModItem(GregTech.ID, "gt.blockores", 1L, 834)); // Pyrite Ore
            DeepDarkRecipes.put(159, getModItem(GregTech.ID, "gt.blockores", 1L, 835)); // Pyrope Ore
            DeepDarkRecipes.put(160, getModItem(GregTech.ID, "gt.blockores", 1L, 836)); // Saltpeter Ore
            DeepDarkRecipes.put(161, getModItem(GregTech.ID, "gt.blockores", 1L, 838)); // Spessartine Ore
            DeepDarkRecipes.put(162, getModItem(GregTech.ID, "gt.blockores", 1L, 839)); // Sphalerite Ore
            DeepDarkRecipes.put(163, getModItem(GregTech.ID, "gt.blockores", 1L, 840)); // Tetrahedrite Ore
            DeepDarkRecipes.put(164, getModItem(GregTech.ID, "gt.blockores", 1L, 841)); // Tungstate Ore
            DeepDarkRecipes.put(165, getModItem(GregTech.ID, "gt.blockores", 1L, 842)); // Uvarovite Ore
            DeepDarkRecipes.put(166, getModItem(GregTech.ID, "gt.blockores", 1L, 855)); // Chalcopyrite Ore
            DeepDarkRecipes.put(167, getModItem(GregTech.ID, "gt.blockores", 1L, 856)); // Silicon Solar Grade (Poly SI)
                                                                                        // Ore
            DeepDarkRecipes.put(168, getModItem(GregTech.ID, "gt.blockores", 1L, 861)); // Emery Ore
            DeepDarkRecipes.put(169, getModItem(GregTech.ID, "gt.blockores", 1L, 865)); // Graphite Ore
            DeepDarkRecipes.put(170, getModItem(GregTech.ID, "gt.blockores", 1L, 868)); // Trinium Ore
            DeepDarkRecipes.put(171, getModItem(GregTech.ID, "gt.blockores", 1L, 870)); // Magnetite Ore
            DeepDarkRecipes.put(172, getModItem(GregTech.ID, "gt.blockores", 1L, 871)); // Malachite Ore
            DeepDarkRecipes.put(173, getModItem(GregTech.ID, "gt.blockores", 1L, 873)); // Pitchblende
            DeepDarkRecipes.put(174, getModItem(GregTech.ID, "gt.blockores", 1L, 877)); // Soapstone Ore
            DeepDarkRecipes.put(175, getModItem(GregTech.ID, "gt.blockores", 1L, 878)); // Oilsands Ore
            DeepDarkRecipes.put(176, getModItem(GregTech.ID, "gt.blockores", 1L, 882)); // Wulfenite Ore
            DeepDarkRecipes.put(177, getModItem(GregTech.ID, "gt.blockores", 1L, 883)); // Powellite Ore
            DeepDarkRecipes.put(178, getModItem(GregTech.ID, "gt.blockores", 1L, 884)); // Desh Ore
            DeepDarkRecipes.put(179, getModItem(GregTech.ID, "gt.blockores", 1L, 894)); // Cheese Ore
            DeepDarkRecipes.put(180, getModItem(GregTech.ID, "gt.blockores", 1L, 900)); // Mirabilite Ore
            DeepDarkRecipes.put(181, getModItem(GregTech.ID, "gt.blockores", 1L, 901)); // Mica Ore
            DeepDarkRecipes.put(182, getModItem(GregTech.ID, "gt.blockores", 1L, 902)); // Talc
            DeepDarkRecipes.put(183, getModItem(GregTech.ID, "gt.blockores", 1L, 903)); // Trona Ore
            DeepDarkRecipes.put(184, getModItem(GregTech.ID, "gt.blockores", 1L, 904)); // Barite Ore
            DeepDarkRecipes.put(185, getModItem(GregTech.ID, "gt.blockores", 1L, 905)); // Bastnasite Ore
            DeepDarkRecipes.put(186, getModItem(GregTech.ID, "gt.blockores", 1L, 906)); // Garnierite Ore
            DeepDarkRecipes.put(187, getModItem(GregTech.ID, "gt.blockores", 1L, 907)); // Lepidolite Ore
            DeepDarkRecipes.put(188, getModItem(GregTech.ID, "gt.blockores", 1L, 908)); // Magnesite Ore
            DeepDarkRecipes.put(189, getModItem(GregTech.ID, "gt.blockores", 1L, 909)); // Pentlandite Ore
            DeepDarkRecipes.put(190, getModItem(GregTech.ID, "gt.blockores", 1L, 910)); // Scheelite Ore
            DeepDarkRecipes.put(191, getModItem(GregTech.ID, "gt.blockores", 1L, 911)); // Alunite Ore
            DeepDarkRecipes.put(192, getModItem(GregTech.ID, "gt.blockores", 1L, 912)); // Chrysotile Ore
            DeepDarkRecipes.put(193, getModItem(GregTech.ID, "gt.blockores", 1L, 913)); // Realgar Ore
            DeepDarkRecipes.put(194, getModItem(GregTech.ID, "gt.blockores", 1L, 914)); // Dolomite Ore
            DeepDarkRecipes.put(195, getModItem(GregTech.ID, "gt.blockores", 1L, 915)); // Wollastonite Ore
            DeepDarkRecipes.put(196, getModItem(GregTech.ID, "gt.blockores", 1L, 916)); // Zeolite Ore
            DeepDarkRecipes.put(197, getModItem(GregTech.ID, "gt.blockores", 1L, 917)); // Banded Iron Ore
            DeepDarkRecipes.put(198, getModItem(GregTech.ID, "gt.blockores", 1L, 918)); // Ilmenite Ore
            DeepDarkRecipes.put(199, getModItem(GregTech.ID, "gt.blockores", 1L, 919)); // Pollucite Ore
            DeepDarkRecipes.put(200, getModItem(GregTech.ID, "gt.blockores", 1L, 920)); // Spodumene Ore
            DeepDarkRecipes.put(201, getModItem(GregTech.ID, "gt.blockores", 1L, 921)); // Tantalite Ore
            DeepDarkRecipes.put(202, getModItem(GregTech.ID, "gt.blockores", 1L, 922)); // Uraninite Ore
            DeepDarkRecipes.put(203, getModItem(GregTech.ID, "gt.blockores", 1L, 923)); // Vanadium Magnetite Ore
            DeepDarkRecipes.put(204, getModItem(GregTech.ID, "gt.blockores", 1L, 924)); // Kyanite Ore
            DeepDarkRecipes.put(205, getModItem(GregTech.ID, "gt.blockores", 1L, 925)); // Perlite Ore
            DeepDarkRecipes.put(206, getModItem(GregTech.ID, "gt.blockores", 1L, 926)); // Pumice Ore
            DeepDarkRecipes.put(207, getModItem(GregTech.ID, "gt.blockores", 1L, 927)); // Bentonite
            DeepDarkRecipes.put(208, getModItem(GregTech.ID, "gt.blockores", 1L, 928)); // Fullers Earth
            DeepDarkRecipes.put(209, getModItem(GregTech.ID, "gt.blockores", 1L, 929)); // Kaolinite
            DeepDarkRecipes.put(210, getModItem(GregTech.ID, "gt.blockores", 1L, 930)); // Brown Limonite Ore
            DeepDarkRecipes.put(211, getModItem(GregTech.ID, "gt.blockores", 1L, 931)); // Yellow Limonite Ore
            DeepDarkRecipes.put(212, getModItem(GregTech.ID, "gt.blockores", 1L, 932)); // Vermiculite
            DeepDarkRecipes.put(213, getModItem(GregTech.ID, "gt.blockores", 1L, 933)); // Glauconite Ore
            DeepDarkRecipes.put(214, getModItem(GregTech.ID, "gt.blockores", 1L, 934)); // Gypsum Ore
            DeepDarkRecipes.put(215, getModItem(GregTech.ID, "gt.blockores", 1L, 935)); // Basaltic Mineral Sand
            DeepDarkRecipes.put(216, getModItem(GregTech.ID, "gt.blockores", 1L, 936)); // Granitic Mineral Sand
            DeepDarkRecipes.put(217, getModItem(GregTech.ID, "gt.blockores", 1L, 937)); // Cassiterite Sand
            DeepDarkRecipes.put(218, getModItem(GregTech.ID, "gt.blockores", 1L, 938)); // Garnet Sand
            DeepDarkRecipes.put(219, getModItem(GregTech.ID, "gt.blockores", 1L, 939)); // Quartz Sand
            DeepDarkRecipes.put(220, getModItem(GregTech.ID, "gt.blockores", 1L, 941)); // Borax Ore
            DeepDarkRecipes.put(221, getModItem(GregTech.ID, "gt.blockores", 1L, 942)); // Molybdenite Ore
            DeepDarkRecipes.put(222, getModItem(GregTech.ID, "gt.blockores", 1L, 943)); // Pyrolusite Ore
            DeepDarkRecipes.put(223, getModItem(GregTech.ID, "gt.blockores", 1L, 944)); // Rock Salt Ore
            DeepDarkRecipes.put(224, getModItem(GregTech.ID, "gt.blockores", 1L, 945)); // Stibnite Ore
            DeepDarkRecipes.put(225, getModItem(GregTech.ID, "gt.blockores", 1L, 946)); // Asbestos Ore
            DeepDarkRecipes.put(226, getModItem(GregTech.ID, "gt.blockores", 1L, 948)); // Diatomite Ore
            DeepDarkRecipes.put(227, getModItem(GregTech.ID, "gt.blockores", 1L, 949)); // Glauconite Sand
            DeepDarkRecipes.put(228, getModItem(GregTech.ID, "gt.blockores", 1L, 951)); // Vyroxeres Ore
            DeepDarkRecipes.put(229, getModItem(GregTech.ID, "gt.blockores", 1L, 952)); // Ceruclase Ore
            DeepDarkRecipes.put(230, getModItem(GregTech.ID, "gt.blockores", 1L, 956)); // Tartarite Ore
            DeepDarkRecipes.put(231, getModItem(GregTech.ID, "gt.blockores", 1L, 966)); // Orichalcum Ore
            DeepDarkRecipes.put(232, getModItem(GregTech.ID, "gt.blockores", 1L, 969)); // Aluminium Fluoride Ore
            DeepDarkRecipes.put(233, getModItem(GregTech.ID, "gt.blockores", 1L, 971)); // Calcium Disilicide Ore
            DeepDarkRecipes.put(234, getModItem(GregTech.ID, "gt.blockores", 1L, 975)); // Draconium Ore
            DeepDarkRecipes.put(235, getModItem(GregTech.ID, "gt.blockores", 1L, 976)); // Awakened Draconium Ore
            DeepDarkRecipes.put(236, getModItem(GregTech.ID, "gt.blockores", 1L, 978)); // Ichorium Ore
            DeepDarkRecipes.put(237, getModItem(GregTech.ID, "gt.blockores", 1L, 982)); // Cosmic Neutronium Ore
            DeepDarkRecipes.put(238, getModItem(GregTech.ID, "gt.blockores", 1L, 984)); // Flerovium Ore

            // BartWorks
            DeepDarkRecipes.put(239, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 1)); // Bismutite Ore
            DeepDarkRecipes.put(240, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 2)); // Bismuthinite Ore
            DeepDarkRecipes.put(241, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5)); // Fluor-Buergerite Ore
            DeepDarkRecipes.put(242, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7)); // Chromo-Alumino-Povondraite
                                                                                          // Ore
            DeepDarkRecipes.put(243, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8)); // Vanadio-Oxy-Dravite Ore
            DeepDarkRecipes.put(244, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9)); // Olenite Ore
            DeepDarkRecipes.put(245, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10)); // Arsenopyrite Ore
            DeepDarkRecipes.put(246, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11)); // Ferberite Ore
            DeepDarkRecipes.put(247, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12)); // Loellingite Ore
            DeepDarkRecipes.put(248, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 13)); // Roquesite Ore
            DeepDarkRecipes.put(249, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 14)); // Bornite Ore
            DeepDarkRecipes.put(250, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 15)); // Wittichenite Ore
            DeepDarkRecipes.put(251, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 16)); // Djurleite Ore
            DeepDarkRecipes.put(252, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 17)); // Huebnerite Ore
            DeepDarkRecipes.put(253, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 18)); // Thorianite Ore
            DeepDarkRecipes.put(254, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 19)); // Red Zircon Ore
            DeepDarkRecipes.put(255, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23)); // Fayalite Ore
            DeepDarkRecipes.put(256, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 24)); // Forsterite Ore
            DeepDarkRecipes.put(257, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 25)); // Hedenbergite Ore
            DeepDarkRecipes.put(258, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26)); // Red Descloizite Ore
            DeepDarkRecipes.put(259, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27)); // Orange Descloizite Ore
            DeepDarkRecipes.put(260, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 28)); // Green Fuchsite Ore
            DeepDarkRecipes.put(261, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 29)); // Red Fuchsite Ore
            DeepDarkRecipes.put(262, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 35)); // Prasiolite Ore
            DeepDarkRecipes.put(263, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 43)); // BArTiMaEuSNeK Ore
            DeepDarkRecipes.put(264, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 47)); // Platinum Metallic Powder
                                                                                           // Ore
            DeepDarkRecipes.put(265, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 53)); // Palladium Metallic Powder
                                                                                           // Ore
            DeepDarkRecipes.put(266, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 60)); // Leach Residue Ore
            DeepDarkRecipes.put(267, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 69)); // Rarest Metal Residue Ore
            DeepDarkRecipes.put(268, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 70)); // Iridium Metal Residue Ore
            DeepDarkRecipes.put(269, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 79)); // Crude Rhodium Metal Ore
            DeepDarkRecipes.put(270, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 89)); // Tiberium Ore
            DeepDarkRecipes.put(271, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 91)); // Fluorspar Ore
            DeepDarkRecipes.put(272, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 93)); // Atheneite Ore
            DeepDarkRecipes.put(273, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 94)); // Temagamite Ore
            DeepDarkRecipes.put(274, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 95)); // Terlinguaite Ore
            DeepDarkRecipes.put(275, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10023)); // Orundum Ore
            DeepDarkRecipes.put(276, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10054)); // Naquadah Oxide Mixture
                                                                                              // Ore
            DeepDarkRecipes.put(277, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10067)); // Enriched-Naquadah Oxide
                                                                                              // Mixture Ore
            DeepDarkRecipes.put(278, getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10072)); // Naquadria Oxide Mixture
                                                                                              // Ore

            // GTPlusPlus
            DeepDarkRecipes.put(279, getModItem(GTPlusPlus.ID, "oreFluoriteF", 1L)); // Fluorite (F) Ore
            DeepDarkRecipes.put(280, getModItem(GTPlusPlus.ID, "oreKoboldite", 1L)); // Koboldite Ore
            DeepDarkRecipes.put(281, getModItem(GTPlusPlus.ID, "oreCrocoite", 1L)); // Crocoite Ore
            DeepDarkRecipes.put(282, getModItem(GTPlusPlus.ID, "oreGeikielite", 1L)); // Geikielite Ore
            DeepDarkRecipes.put(283, getModItem(GTPlusPlus.ID, "oreNichromite", 1L)); // Nichromite Ore
            DeepDarkRecipes.put(284, getModItem(GTPlusPlus.ID, "oreTitanite", 1L)); // Titanite Ore
            DeepDarkRecipes.put(285, getModItem(GTPlusPlus.ID, "oreZimbabweite", 1L)); // Zimbabweite Ore
            DeepDarkRecipes.put(286, getModItem(GTPlusPlus.ID, "oreZirconolite", 1L)); // Zirconolite Ore
            DeepDarkRecipes.put(287, getModItem(GTPlusPlus.ID, "oreGadoliniteCe", 1L)); // Gadolinite (Ce) Ore
            DeepDarkRecipes.put(288, getModItem(GTPlusPlus.ID, "oreGadoliniteY", 1L)); // Gadolinite (Y) Ore
            DeepDarkRecipes.put(289, getModItem(GTPlusPlus.ID, "oreLepersonnite", 1L)); // Lepersonnite Ore
            DeepDarkRecipes.put(290, getModItem(GTPlusPlus.ID, "oreSamarskiteY", 1L)); // Samarskite (Y) Ore
            DeepDarkRecipes.put(291, getModItem(GTPlusPlus.ID, "oreSamarskiteYb", 1L)); // Samarskite (Yb) Ore
            DeepDarkRecipes.put(292, getModItem(GTPlusPlus.ID, "oreXenotime", 1L)); // Xenotime Ore
            DeepDarkRecipes.put(293, getModItem(GTPlusPlus.ID, "oreYttriaite", 1L)); // Yttriaite Ore
            DeepDarkRecipes.put(294, getModItem(GTPlusPlus.ID, "oreYttrialite", 1L)); // Yttrialite Ore
            DeepDarkRecipes.put(295, getModItem(GTPlusPlus.ID, "oreYttrocerite", 1L)); // Yttrocerite Ore
            DeepDarkRecipes.put(296, getModItem(GTPlusPlus.ID, "oreZircon", 1L)); // Zircon Ore
            DeepDarkRecipes.put(297, getModItem(GTPlusPlus.ID, "orePolycrase", 1L)); // Polycrase Ore
            DeepDarkRecipes.put(298, getModItem(GTPlusPlus.ID, "oreZircophyllite", 1L)); // Zircophyllite Ore
            DeepDarkRecipes.put(299, getModItem(GTPlusPlus.ID, "oreZirkelite", 1L)); // Zirkelite Ore
            DeepDarkRecipes.put(300, getModItem(GTPlusPlus.ID, "oreLanthaniteLa", 1L)); // Lanthanite (La) Ore
            DeepDarkRecipes.put(301, getModItem(GTPlusPlus.ID, "oreLanthaniteCe", 1L)); // Lanthanite (Ce) Ore
            DeepDarkRecipes.put(302, getModItem(GTPlusPlus.ID, "oreLanthaniteNd", 1L)); // Lanthanite (Nd) Ore
            DeepDarkRecipes.put(303, getModItem(GTPlusPlus.ID, "oreAgarditeY", 1L)); // Agardite (Y) Ore
            DeepDarkRecipes.put(304, getModItem(GTPlusPlus.ID, "oreAgarditeCd", 1L)); // Agardite (Cd) Ore
            DeepDarkRecipes.put(305, getModItem(GTPlusPlus.ID, "oreAgarditeLa", 1L)); // Agardite (La) Ore
            DeepDarkRecipes.put(306, getModItem(GTPlusPlus.ID, "oreAgarditeNd", 1L)); // Agardite (Nd) Ore
            DeepDarkRecipes.put(307, getModItem(GTPlusPlus.ID, "oreHibonite", 1L)); // Hibonite Ore
            DeepDarkRecipes.put(308, getModItem(GTPlusPlus.ID, "oreCerite", 1L)); // Cerite Ore
            DeepDarkRecipes.put(309, getModItem(GTPlusPlus.ID, "oreFluorcaphite", 1L)); // Fluorcaphite Ore
            DeepDarkRecipes.put(310, getModItem(GTPlusPlus.ID, "oreFlorencite", 1L)); // Florencite Ore
            DeepDarkRecipes.put(311, getModItem(GTPlusPlus.ID, "oreCryoliteF", 1L)); // Cryolite (F) Ore
            DeepDarkRecipes.put(312, getModItem(GTPlusPlus.ID, "oreLautarite", 1L)); // Lautarite Ore
            DeepDarkRecipes.put(313, getModItem(GTPlusPlus.ID, "oreLafossaite", 1L)); // Lafossaite Ore
            DeepDarkRecipes.put(314, getModItem(GTPlusPlus.ID, "oreDemicheleiteBr", 1L)); // Demicheleite (Br) Ore
            DeepDarkRecipes.put(315, getModItem(GTPlusPlus.ID, "oreComancheite", 1L)); // Comancheite Ore
            DeepDarkRecipes.put(316, getModItem(GTPlusPlus.ID, "orePerroudite", 1L)); // Perroudite Ore
            DeepDarkRecipes.put(317, getModItem(GTPlusPlus.ID, "oreHoneaite", 1L)); // Honeaite Ore
            DeepDarkRecipes.put(318, getModItem(GTPlusPlus.ID, "oreAlburnite", 1L)); // Alburnite Ore
            DeepDarkRecipes.put(319, getModItem(GTPlusPlus.ID, "oreMiessiite", 1L)); // Miessiite Ore
            DeepDarkRecipes.put(320, getModItem(GTPlusPlus.ID, "oreKashinite", 1L)); // Kashinite Ore
            DeepDarkRecipes.put(321, getModItem(GTPlusPlus.ID, "oreIrarsite", 1L)); // Irarsite Ore
            DeepDarkRecipes.put(322, getModItem(GTPlusPlus.ID, "oreGreenockite", 1L)); // Greenockite Ore
            DeepDarkRecipes.put(323, getModItem(GTPlusPlus.ID, "oreRadioactiveMineralMix", 1L)); // Strange Ore
            DeepDarkRecipes.put(324, getModItem(GTPlusPlus.ID, "oreAncientGranite", 1L)); // Ancient Granite Ore
            DeepDarkRecipes.put(325, getModItem(GTPlusPlus.ID, "oreRunite", 1L)); // Runite Ore
            DeepDarkRecipes.put(326, getModItem(GTPlusPlus.ID, "oreBariteRa", 1L)); // Barite (Ra) Ore

            VoidOreRecipes.put("DD", DeepDarkRecipes);
        }

    }
}
