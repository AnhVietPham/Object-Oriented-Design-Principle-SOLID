package com.avp.ocp.assignment.remotes;

import com.avp.ocp.assignment.devices.Device;

public class RemoteControl {
    private static RemoteControl instance;
    private Device device;

    private RemoteControl() {

    }

    public static RemoteControl getInstance() {
        if (instance == null) {
            instance = new RemoteControl();
        }
        return instance;
    }

    public void connectToDevice(Device device) {
        this.device = device;
        System.out.println("---- connected to: "+ this.device + "----");
    }

    public void onClickButton() {
        device.turnOn();
    }

    public void offClickButton() {
        device.turnOff();
    }
}
