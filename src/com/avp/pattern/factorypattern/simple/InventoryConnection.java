package com.avp.pattern.factorypattern.simple;

public class InventoryConnection {
    private String nameInventory;
    private String codeInventory;

    public InventoryConnection(String nameInventory, String codeInventory) {
        this.nameInventory = nameInventory;
        this.codeInventory = codeInventory;
    }

    public String getNameInventory() {
        return nameInventory;
    }

    public void setNameInventory(String nameInventory) {
        this.nameInventory = nameInventory;
    }

    public String getCodeInventory() {
        return codeInventory;
    }

    public void setCodeInventory(String codeInventory) {
        this.codeInventory = codeInventory;
    }
}
