package com.avp.dip.processes;

public abstract class GeneralManufacturingProcess {
    String process;

    GeneralManufacturingProcess(String name) {
        this.process = name;
    }

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    public void launchProcess() {
        if (process != null && !process.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No process name was specified");
        }
    }
}
