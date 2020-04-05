package com.eszdman.eshax.Functions.FuncList;

import com.eszdman.eshax.Functions.Function;
import com.eszdman.eshax.Wrapper.Wrapper;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.util.Vec3;
import org.lwjgl.input.Keyboard;

public class Teleport extends Function {
    int length = 4;
    @Override
    public void override() {
        name = "Teleport";
        addkeybind(Keyboard.KEY_Y);
        AddBind = true;
    }

    @Override
    public void enable() {
        System.out.println("Teleport UP :"+Wrapper.PlayerMP().posX+","+Wrapper.PlayerMP().posY+","+Wrapper.PlayerMP().posZ);
        active = false;
        Vec3 vector = Wrapper.PlayerMP().getLookVec();
        vector.normalize();
        LegalTeleport(vector);
    }
    void setPos(Vec3 newPos){
        Wrapper.PlayerMP().setPosition(newPos.xCoord,newPos.yCoord,newPos.zCoord);
    }
    void move(Vec3 vector){
        Wrapper.PlayerMP().setPosition(Wrapper.PlayerMP().posX+vector.xCoord,Wrapper.PlayerMP().posY+vector.yCoord,Wrapper.PlayerMP().posZ+vector.zCoord);
    }
    void LegalTeleport(Vec3 vector){
        vector.normalize();
        for(int i = 0; i<length; i++){
            move(vector);
        }
    }
}
