package com.mofoga.gtnothard;

import Tools.CheckEnumFluidList;
import Tools.CheckEnumItemList;
import Tools.RecipeExport;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        CheckEnumItemList.registerCommand();
        CheckEnumFluidList.registerCommand();
        if (Loader.isModLoaded("NotEnoughItems")) {
            RecipeExport.registerCommand();
        } else {
            MyMod.LOG.warn("NEI is not loaded; /ExportRecipe is unavailable.");
        }
    }
}
