package com.avp.pattern.factorypattern.simple.program;

import com.avp.pattern.factorypattern.simple.FileSystemConection;
import com.avp.pattern.factorypattern.simple.InventoryConnection;
import com.avp.pattern.factorypattern.simple.PC;

public class ProgramFPT {
    public static void main(String args[]) {
        FileSystemConection fileSystemConnection2 = new FileSystemConection("DC1", "100");
        InventoryConnection inventoryConnection2 = new InventoryConnection("IC1", "100");
        PC pc2 = new PC("3 GB", "500 GB", "2.4 GHz", fileSystemConnection2, inventoryConnection2);
        pc2.getFileSystemConection();
        pc2.isIventory();
    }
}
