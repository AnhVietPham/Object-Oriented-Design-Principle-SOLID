package com.avp.srp.reporting;

import com.avp.srp.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    public EmployeeReportFormatter(Employee emp, FormatType formatType) {
        super(emp, formatType);
    }

    public String getEmployeeFormatter() {
        return getFormattedOutput();
    }
}
