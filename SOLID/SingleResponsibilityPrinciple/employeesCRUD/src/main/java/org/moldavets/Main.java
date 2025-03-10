package org.moldavets;

import org.moldavets.client.ClientModule;
import org.moldavets.model.Employee;
import org.moldavets.util.FormatType;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jack","IT",true);

        ClientModule clientModule = new ClientModule();
        clientModule.hireNewEmployee(employee);
        clientModule.printEmployeeReport(employee, FormatType.XML);
        clientModule.terminateEmployee(employee.getId());

    }
}