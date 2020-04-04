package com.eszdman.eshax.Functions.FuncList;

import com.eszdman.eshax.Functions.Function;
import com.eszdman.eshax.Wrapper.Wrapper;
import org.lwjgl.input.Keyboard;

public class FullBright extends Function {
    @Override
    public void override() {
        name = "FullBright";
        addkeybind(Keyboard.KEY_C);
        AddBind = true;
    }

    @Override
    public void enable() {
        Wrapper.mc.gameSettings.gammaSetting = 500;
        System.out.println("Fullbright enabled");
    }

    @Override
    public void disable() {
        System.out.println("Fullbright disabled");
    }
}
