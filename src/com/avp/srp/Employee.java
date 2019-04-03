package com.avp.srp;

public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;


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
