package com.avp.dip.example1.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println(process + " Assembled laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println(process + " Test laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println(process + " Package laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println(process + " Store laptop");
    }
}
