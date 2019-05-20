package com.avp.pattern.observer.observer;

import com.avp.pattern.observer.domain.Employee;

public class HRDepartment implements IObserver {
    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("HR FileSystemConection notified...");
        System.out.println(msg + " " + employee.getName());
    }
}
