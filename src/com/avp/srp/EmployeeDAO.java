package com.avp.srp;

public class EmployeeDAO {
    private DatabaseConnectionManager connectionDBManager;

    EmployeeDAO(){
        connectionDBManager = DatabaseConnectionManager.getInstance();
    }

    public void saveEmployee(Employee emp) {
        /*
        * This method will use to save employee to DB
        * connectionDBManager.connect()
        *    // To do something
        * connectionDBManager.disconnect()
        * */
        System.out.println("Employee saved to DB");
    }

    public void deleteEmployee(Employee emp) {
        /*
        * This method will remove from DB
        * connectionDBManager.connect()
        *    // To do something
        * connectionDBManager.disconnect()
        * */
        System.out.println("Employee removed from DB");
    }
}
