package com.eszdman.eshax;

import com.eszdman.eshax.Functions.FuncList.FullBright;
import com.eszdman.eshax.Wrapper.Events;
import com.eszdman.eshax.Wrapper.Wrapper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;

import java.awt.*;
import java.io.File;

@Mod(modid = EsHaxMod.MODID, version = EsHaxMod.VERSION)
public class EsHaxMod {
    public static final String MODID = "EsHaxMod";
    public static final String VERSION = "1.0";
    public static EsHaxMod INSTANCE;
    public static boolean loaded = false;
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        INSTANCE = this;
        EventRegister.register(MinecraftForge.EVENT_BUS,new Events());
        EventRegister.register(FMLCommonHandler.instance().bus(), new Events());
        Wrapper.init();
        loaded = true;
    }
}