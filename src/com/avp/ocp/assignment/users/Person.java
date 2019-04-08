package com.avp.ocp.assignment.users;

import com.avp.ocp.assignment.devices.Projector;
import com.avp.ocp.assignment.devices.SurroundSoundSystem;
import com.avp.ocp.assignment.devices.TV;
import com.avp.ocp.assignment.remotes.RemoteControl;

public class Person {
    public static void main(String[] args){
        Projector projector = new Projector();
        TV tv = new TV();
        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();

        RemoteControl remoteControl = RemoteControl.getInstance();

        System.out.println("Projector is ready!");
        remoteControl.connectToDevice(projector);
        remoteControl.onClickButton();
        remoteControl.offClickButton();

        System.out.println("TV is ready!");

        remoteControl.connectToDevice(tv);
        remoteControl.onClickButton();
        remoteControl.offClickButton();

        System.out.println("Surround sound system is ready!");
        remoteControl.connectToDevice(surroundSoundSystem);
        remoteControl.onClickButton();
        remoteControl.offClickButton();
    }
}
