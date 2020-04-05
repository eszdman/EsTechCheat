package com.eszdman.eshax.Wrapper;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.PlayerControllerMP;

public class Wrapper {
    public static Minecraft mc;
    public static void init(){
        mc = Minecraft.getMinecraft();
    }
    public static EntityClientPlayerMP PlayerMP(){
        return mc.thePlayer;
    }
    public static PlayerControllerMP PlayerConMP(){
        return mc.playerController;
    }
}
