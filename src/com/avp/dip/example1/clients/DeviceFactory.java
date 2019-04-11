package com.avp.dip.example1.clients;

import com.avp.dip.example1.processes.GeneralManufacturingProcess;
import com.avp.dip.example1.processes.LaptopManufacturingProcess;
import com.avp.dip.example1.processes.SmartPhoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String args[]) {
        GeneralManufacturingProcess iphoneManufacturer = new SmartPhoneManufacturingProcess("Iphone");
        iphoneManufacturer.launchProcess();

        System.out.println();

        GeneralManufacturingProcess acerManufacturer = new LaptopManufacturingProcess("Acer");
        acerManufacturer.launchProcess();
    }
}
