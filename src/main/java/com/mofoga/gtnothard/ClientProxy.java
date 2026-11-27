package com.mofoga.gtnothard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;

import Recipes.SingularityNEICatalog;
import Tools.CheckEnumFluidList;
import Tools.CheckEnumItemList;
import Tools.RecipeExport;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import gregtech.GTMod;

public class ClientProxy extends CommonProxy {

    private NetHandlerPlayClient catalogConnection;

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        CheckEnumItemList.registerCommand();
        CheckEnumFluidList.registerCommand();
        if (Loader.isModLoaded("NotEnoughItems")) {
            RecipeExport.registerCommand();
            FMLCommonHandler.instance()
                .bus()
                .register(this);
        } else {
            MyMod.LOG.warn("NEI is not loaded; /ExportRecipe is unavailable.");
        }
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }

        Minecraft client = Minecraft.getMinecraft();
        NetHandlerPlayClient connection = client.getNetHandler();
        if (connection == null) {
            catalogConnection = null;
        } else if (connection != catalogConnection && client.theWorld != null && client.thePlayer != null) {
            SingularityNEICatalog.rebuild();
            GTMod.proxy.reloadNEICache();
            catalogConnection = connection;
        }
    }
}
