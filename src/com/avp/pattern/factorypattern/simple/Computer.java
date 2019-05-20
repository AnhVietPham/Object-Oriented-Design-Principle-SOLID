package com.avp.pattern.factorypattern.simple;

public abstract class Computer {
    abstract String getRAM();

    abstract String getHDD();

    abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
