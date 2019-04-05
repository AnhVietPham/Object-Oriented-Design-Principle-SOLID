package com.avp.srp;

public class EmployeeReportFormatter extends ReportFormatter {
    public EmployeeReportFormatter(Employee emp, FormatType formatType) {
        super(emp, formatType);
    }

    public String getEmployeeFormatter() {
        return getFormattedOutput();
    }
}
