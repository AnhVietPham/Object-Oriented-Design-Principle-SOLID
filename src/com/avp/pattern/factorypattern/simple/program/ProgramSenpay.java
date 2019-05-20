package com.avp.pattern.factorypattern.simple.program;

import com.avp.pattern.factorypattern.simple.FileSystemConection;
import com.avp.pattern.factorypattern.simple.InventoryConnection;
import com.avp.pattern.factorypattern.simple.PC;

public class ProgramSenpay {
    public static void main(String args[]){
        FileSystemConection fileSystemConnection = new FileSystemConection("DC1","100");
        InventoryConnection inventoryConnection = new InventoryConnection("IC1","100");
        PC pc1 = new PC("3 GB", "500 GB", "2.4 GHz", fileSystemConnection, inventoryConnection);
        pc1.getFileSystemConection();
        pc1.isIventory();
    }
}
