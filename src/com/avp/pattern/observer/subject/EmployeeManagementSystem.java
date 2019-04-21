package com.avp.pattern.observer.subject;

import com.avp.pattern.observer.domain.Employee;
import com.avp.pattern.observer.domain.EmployeeDAO;
import com.avp.pattern.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    private List<IObserver> observers;
    private List<Employee> employees;

    private Employee employee;
    private EmployeeDAO employeeDAO;
    private String msg;


    public EmployeeManagementSystem() {
        observers = new ArrayList<>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (IObserver department : observers) {
            department.callMe(employee, msg);
        }
    }

    public void hireEmployee(Employee employee) {
        this.employee = employee;
        msg = "New hire: ";
        employees.add(employee);
        notifyObserver();
    }

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;

        for (Employee emp : employees) {
            if (id == emp.getEmployeeID()){
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name has been modified";
                notify = true;
            }
        }

        if (notify){
            notifyObserver();
        }
    }
}
