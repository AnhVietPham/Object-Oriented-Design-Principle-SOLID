package com.avp.dip.example1.processes;

public class SmartPhoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartPhoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println(process + " Assembled smart phone");
    }

    @Override
    protected void testDevice() {
        System.out.println(process + " Test smart phone");
    }

    @Override
    protected void packageDevice() {
        System.out.println(process + " Package smart phone");
    }

    @Override
    protected void storeDevice() {
        System.out.println(process + " Store smart phone");
    }
}
