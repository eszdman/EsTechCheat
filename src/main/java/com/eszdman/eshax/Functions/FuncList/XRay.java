package com.eszdman.eshax.Functions.FuncList;

import com.eszdman.eshax.Functions.Function;
import com.eszdman.eshax.Wrapper.Wrapper;
import org.lwjgl.input.Keyboard;

public class XRay extends Function {
    @Override
    public void override() {
        name = "XRay";
        addkeybind(Keyboard.KEY_X);
        AddBind = true;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }
}
