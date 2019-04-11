package com.avp.dip.clients;

import com.avp.dip.processes.GeneralManufacturingProcess;
import com.avp.dip.processes.LaptopManufacturingProcess;
import com.avp.dip.processes.SmartPhoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String args[]) {
        GeneralManufacturingProcess iphoneManufacturer = new SmartPhoneManufacturingProcess("Iphone");
        iphoneManufacturer.launchProcess();

        System.out.println();

        GeneralManufacturingProcess acerManufacturer = new LaptopManufacturingProcess("Acer");
        acerManufacturer.launchProcess();
    }
}
