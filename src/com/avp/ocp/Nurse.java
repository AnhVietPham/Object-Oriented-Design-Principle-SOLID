package com.avp.ocp;

public class Nurse extends Employee {

    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    private void checkVitalSigns(){
        System.out.println("Checking Vitals");
    }

    private void drawBlood(){
        System.out.println("drawing blood");
    }

    private void cleanPatientArea(){
        System.out.println("cleaning Patient Area");
    }

    @Override
    void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

}
