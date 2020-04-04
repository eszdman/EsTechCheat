package com.eszdman.eshax.Wrapper;
import com.eszdman.eshax.Functions.Function;
import com.eszdman.eshax.Functions.Functions;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiScreenEvent;
public class Events {
    @SubscribeEvent
    public void onGuiScreenDraw(GuiScreenEvent.DrawScreenEvent.Pre event) {
            if (event.gui instanceof GuiMainMenu) {
            GuiMainMenu menu = (GuiMainMenu) event.gui;
            ReflectionHelper.setPrivateValue(GuiMainMenu.class, menu, "Eszdman's Technologies", "splashText");
        }
    }
    @SubscribeEvent
    public void tick(InputEvent.KeyInputEvent event){
        for(Function func : Functions.functionList){
            if(func.keybind != null && func.keybind.isPressed()) func.turn();
        }
    }

}
