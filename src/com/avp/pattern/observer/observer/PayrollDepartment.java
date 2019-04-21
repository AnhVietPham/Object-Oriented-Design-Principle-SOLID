package com.avp.pattern.observer.observer;

import com.avp.pattern.observer.domain.Employee;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("Payroll Department notified...");
        System.out.println(msg + " " + employee.getName());
    }
}
