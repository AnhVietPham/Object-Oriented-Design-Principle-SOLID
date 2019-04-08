package com.avp.ocp.assignment.devices;

public class Projector implements Device {
    @Override
    public void turnOff() {
        pullUpProjectorScreen();
        System.out.println("Projector has been turned off");
    }

    @Override
    public void turnOn() {
        pullDownProjectorScreen();
        System.out.println("Projector has been turned on");
    }

    private void pullDownProjectorScreen(){
        System.out.println("Screen has been lowered for viewing");
    }

    private void pullUpProjectorScreen(){
        System.out.println("Screen raise back up to close");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
