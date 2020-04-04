package com.eszdman.eshax.Wrapper;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;

public class Wrapper {
    public static Minecraft mc;
    public static PlayerControllerMP PlayerMP;
    public static void init(){
        mc = Minecraft.getMinecraft();
        PlayerMP = mc.playerController;
    }
}
