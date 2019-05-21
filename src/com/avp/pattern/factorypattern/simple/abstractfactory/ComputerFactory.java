package com.avp.pattern.factorypattern.simple.abstractfactory;

import com.avp.pattern.factorypattern.simple.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.create();
    }
}
