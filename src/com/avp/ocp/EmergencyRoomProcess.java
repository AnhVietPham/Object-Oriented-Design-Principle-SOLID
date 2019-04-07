package com.avp.ocp;

public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement CEO = new HospitalManagement();
        Employee avp = new Doctor(1, "Anh Viet Pham", "Doctor", true);
        CEO.callUpon(avp);

        System.out.println();

        Employee linda = new Nurse(2, "LinDa", "Nurse", true);
        CEO.callUpon(linda);
    }
}
