package com.avp.srp;

public class ReportFormatter {
    private String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        return "XML: " + object.toString();
    }

    private String convertObjectToCSV(Object object) {
        return "CSV: " + object.toString();
    }

    public String getFormattedOutput() {
        return formattedOutput;
    }
}
