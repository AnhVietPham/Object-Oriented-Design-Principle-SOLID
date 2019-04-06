package com.avp.srp.domain;

import com.avp.srp.database.DatabaseConnectionManager;

public class EmployeeDAO {
    private DatabaseConnectionManager connectionDBManager;

    public EmployeeDAO(){
        connectionDBManager = DatabaseConnectionManager.getInstance();
    }

    public void saveEmployee(Employee emp) {
        /*
        * This method will use to save employee to DB
        * connectionDBManager.connect()
        *    // To do something
        * connectionDBManager.disconnect()
        * */
        connectionDBManager.connect();
        System.out.println("Employee saved to DB");
        connectionDBManager.disConnect();
    }

    public void deleteEmployee(Employee emp) {
        /*
        * This method will remove from DB
        * connectionDBManager.connect()
        *    // To do something
        * connectionDBManager.disconnect()
        * */
        connectionDBManager.connect();
        System.out.println("Employee removed from DB");
        connectionDBManager.disConnect();
    }
}
