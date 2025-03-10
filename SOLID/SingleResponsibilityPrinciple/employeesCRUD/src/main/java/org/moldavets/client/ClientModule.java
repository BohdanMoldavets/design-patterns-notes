package org.moldavets.client;

import org.moldavets.formatter.report.EmployeeReportFormatter;
import org.moldavets.model.Employee;
import org.moldavets.service.EmployeeService;
import org.moldavets.service.Impl.EmployeeServiceImpl;
import org.moldavets.util.FormatType;

public class ClientModule {

    private EmployeeService employeeService = new EmployeeServiceImpl();

    public void hireNewEmployee(Employee employee) {
        employeeService.save(employee);
    }

    public void terminateEmployee(Long employeeId) {
        employeeService.delete(employeeId);
    }

    public void printEmployeeReport(Employee employee, FormatType format) {
        System.out.println(new EmployeeReportFormatter(employee, format).getFormattedEmployee());
    }

}
