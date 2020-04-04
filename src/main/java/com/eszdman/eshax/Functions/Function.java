package com.eszdman.eshax.Functions;

import com.eszdman.eshax.EsHaxMod;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
public class Function {
    public boolean active = false;
    public String name = "Defaulttt";
    public KeyBinding keybind;
    public boolean AddBind = true;
    public Function(){
        override();
    }
    public void override(){

    }
    public void turn(){
        active = !active;
        if(active) enable();
        else disable();
}
    public void enable(){

    }
    public void disable(){

    }
    public void addkeybind(int key){
        KeyBinding keyb =  new KeyBinding(name, key,EsHaxMod.MODID);
        ClientRegistry.registerKeyBinding(keyb);
        keybind = keyb;
    }
}
