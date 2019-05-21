package com.avp.pattern.factorypattern.simple.abstractfactory;

import com.avp.pattern.factorypattern.simple.Computer;
import com.avp.pattern.factorypattern.simple.FileSystemConection;
import com.avp.pattern.factorypattern.simple.InventoryConnection;
import com.avp.pattern.factorypattern.simple.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;
    private FileSystemConection fileSystemConection;
    private InventoryConnection inventoryConnection;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.fileSystemConection = new FileSystemConection("DC1", "100");
        this.inventoryConnection = new InventoryConnection("IC1", "100");
    }

    @Override
    public Computer create() {
        return new PC(ram, hdd, cpu, fileSystemConection, inventoryConnection);
    }
}
