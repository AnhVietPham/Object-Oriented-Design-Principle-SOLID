package com.avp.pattern.factorypattern.simple;

public class ComputerFactory {
    public static Computer getComputer(TypeComputer typeComputer, String ram, String
            hdd, String cpu) {
        switch (typeComputer) {
            case PC: {
                FileSystemConection fileSystemConnection = new FileSystemConection("DC1", "100");
                InventoryConnection inventoryConnection = new InventoryConnection("IC1", "100");
                return new PC(ram, hdd, cpu, fileSystemConnection, inventoryConnection);
            }
            case SERVER:
                return new Server(ram, hdd, cpu);
            default:
                return null;
        }
    }
}
