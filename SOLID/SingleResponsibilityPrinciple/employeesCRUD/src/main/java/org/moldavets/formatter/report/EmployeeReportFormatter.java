package org.moldavets.formatter.report;

import org.moldavets.model.Employee;
import org.moldavets.util.FormatType;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {
        return super.getFormattedValue();
    }
}
