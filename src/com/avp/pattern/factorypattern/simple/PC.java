package com.avp.pattern.factorypattern.simple;

public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;
    private FileSystemConection fileSystemConection;
    private InventoryConnection inventoryConnection;

    public PC(String ram, String hdd, String cpu, FileSystemConection fileSystemConection, InventoryConnection inventoryConnection) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.fileSystemConection = fileSystemConection;
        this.inventoryConnection = inventoryConnection;
    }

    public boolean getFileSystemConection() {
        return fileSystemConection.getNameDepartment().equals("DC1");
    }

    public boolean isIventory() {
        return inventoryConnection.getCodeInventory().equals("DC1");
    }


    @Override
    String getRAM() {
        return this.ram;
    }

    @Override
    String getHDD() {
        return this.hdd;
    }

    @Override
    String getCPU() {
        return this.cpu;
    }
}
