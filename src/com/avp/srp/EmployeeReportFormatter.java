package com.avp.srp;

class EmployeeReportFormatter extends ReportFormatter {
    EmployeeReportFormatter(Employee emp, FormatType formatType) {
        super(emp, formatType);
    }

    String getEmployeeFormatter() {
        return getFormattedOutput();
    }
}
