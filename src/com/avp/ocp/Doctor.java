package com.avp.ocp;

class Doctor extends Employee {

    Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }

    @Override
    void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
}
