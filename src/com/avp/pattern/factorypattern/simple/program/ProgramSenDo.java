package com.avp.pattern.factorypattern.simple.program;

import com.avp.pattern.factorypattern.simple.FileSystemConection;
import com.avp.pattern.factorypattern.simple.InventoryConnection;
import com.avp.pattern.factorypattern.simple.PC;

public class ProgramSenDo {
    public static void main(String args[]) {
//        Computer pc = ComputerFactory.getComputer(TypeComputer.PC, "3 GB", "500 GB", "2.4 GHz");
//        Computer server = ComputerFactory.getComputer(TypeComputer.SERVER, "10 GB", "5000 GB", "5.4 GHz");
//
//        System.out.println("Factory PC config:: " + pc);
//        System.out.println("Factory Server config:: " + server);

        FileSystemConection fileSystemConection = new FileSystemConection("DC1","100");
        InventoryConnection inventoryConnection = new InventoryConnection("IC1","100");
        PC pc = new PC("3 GB", "500 GB", "2.4 GHz", fileSystemConection, inventoryConnection);
        pc.getFileSystemConection();
        pc.isIventory();




    }
}
