package com.avp.pattern.factorypattern.simple;

public class FileSystemConection {
    private String nameDepartment;
    private String codeDepartment;

    public FileSystemConection(String nameDepartment, String codeDepartment) {
        this.nameDepartment = nameDepartment;
        this.codeDepartment = codeDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getCodeDepartment() {
        return codeDepartment;
    }

    public void setCodeDepartment(String codeDepartment) {
        this.codeDepartment = codeDepartment;
    }
}
