package com.eszdman.eshax.Wrapper;
import com.eszdman.eshax.EsHaxMod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.GuiScreenEvent;
import org.lwjgl.input.Keyboard;

import java.awt.*;
import java.util.ArrayList;

public class Events {
    private  ArrayList<KeyBinding> getBinds() {
        //KeyBinding keys[] = new KeyBinding[4];
        ArrayList<KeyBinding> keys = new ArrayList<>();
        keys.add(new KeyBinding("TurnGui", Keyboard.KEY_H,EsHaxMod.MODID));
        keys.add(new KeyBinding("TurnXray", Keyboard.KEY_H,EsHaxMod.MODID));
        return keys;
    }
    @SubscribeEvent
    public void onGuiScreenDraw(GuiScreenEvent.DrawScreenEvent.Pre event) {
            if (event.gui instanceof GuiMainMenu) {
            GuiMainMenu menu = (GuiMainMenu) event.gui;
            ReflectionHelper.setPrivateValue(GuiMainMenu.class, menu, "Eszdman's Technologies", "splashText");
        }
    }
    @SubscribeEvent
    public void tick(InputEvent.KeyInputEvent event){

    }

}
