package com.avp.srp.clients;

import com.avp.srp.domain.Employee;
import com.avp.srp.domain.EmployeeDAO;
import com.avp.srp.reporting.EmployeeReportFormatter;
import com.avp.srp.reporting.FormatType;

public class Client {
    public static void main(String[] args) {
        Employee employeeAVP = new Employee(10, "Anh Viet Pham", "Android Developer", true);
        hireNewEmployee(employeeAVP);
        printEmployeeReport(employeeAVP, FormatType.CSV);
        terminateEmployee(employeeAVP);
    }

    private static void hireNewEmployee(Employee emp) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(emp);

    }

    private static void terminateEmployee(Employee emp) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(emp);
    }

    private static void printEmployeeReport(Employee emp, FormatType formatType) {
        EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(emp, formatType);
        System.out.println(employeeReportFormatter.getEmployeeFormatter());
    }
}
