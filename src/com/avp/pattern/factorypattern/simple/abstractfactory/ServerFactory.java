package com.avp.pattern.factorypattern.simple.abstractfactory;

import com.avp.pattern.factorypattern.simple.Computer;
import com.avp.pattern.factorypattern.simple.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer create() {
        return new Server(ram, hdd, cpu);
    }

    @Override
    public String toString() {
        return "ServerFactory{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
