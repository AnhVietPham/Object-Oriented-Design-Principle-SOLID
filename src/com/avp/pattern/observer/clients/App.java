package com.avp.pattern.observer.clients;

import com.avp.pattern.observer.domain.Employee;
import com.avp.pattern.observer.observer.HRDepartment;
import com.avp.pattern.observer.observer.IObserver;
import com.avp.pattern.observer.observer.PayrollDepartment;
import com.avp.pattern.observer.subject.EmployeeManagementSystem;

import java.util.Date;

public class App {
    public static void main(String args[]){
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireEmployee(bob);
        ems.removeObserver(hrSystem);
        ems.modifyEmployeeName(5, "Imtiaz");

    }
}
