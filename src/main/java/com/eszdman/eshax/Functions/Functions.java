package com.eszdman.eshax.Functions;

import com.eszdman.eshax.Functions.FuncList.FullBright;
import com.eszdman.eshax.Functions.FuncList.Teleport;
import com.eszdman.eshax.Functions.FuncList.XRay;
import com.eszdman.eshax.Gui.Gui;

import java.util.ArrayList;

public class Functions {
    public static ArrayList<Function> functionList;
    public static void InitAll(){
        functionList = new ArrayList<>();
        functionList.add(new FullBright());
        functionList.add(new XRay());
        functionList.add(new Gui());
        functionList.add(new Teleport());
    }
}
