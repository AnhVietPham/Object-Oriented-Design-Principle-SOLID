package com.avp.ocp.assignment.devices;

public class SurroundSoundSystem implements Device {
    @Override
    public void turnOff() {
        lowerVolume();
        System.out.println("Surround Sound System has been turned off");
    }

    @Override
    public void turnOn() {
        increaseVolume();
        System.out.println("Surround Sound System has been turned on");
    }

    private void increaseVolume(){
        System.out.println("Volume has been inscreased");
    }

    private void lowerVolume(){
        System.out.println("Volume has been lowered");
    }
}
