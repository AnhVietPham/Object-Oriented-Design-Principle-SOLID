package com.avp.ocp;

abstract public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    Employee(long id, String name, String department, boolean working){
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    abstract void performDuties();


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
