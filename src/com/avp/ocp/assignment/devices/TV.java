package com.avp.ocp.assignment.devices;

public class TV implements Device {
    @Override
    public void turnOff() {
        setUpTVAlarm();
        System.out.println("TV has been turned off");
    }

    @Override
    public void turnOn() {
        openFavoriteChannel();
        System.out.println("TV has been turned on");
    }

    private void openFavoriteChannel() {
        System.out.println("Prepare opening favorite channel");
    }

    private void setUpTVAlarm() {
        System.out.println("Turn on TV Alarm for in the morning");
    }
}
