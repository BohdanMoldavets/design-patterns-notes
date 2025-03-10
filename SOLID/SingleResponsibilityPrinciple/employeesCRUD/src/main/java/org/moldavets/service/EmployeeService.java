package org.moldavets.service;

import org.moldavets.model.Employee;

public interface EmployeeService {
    void save(Employee employee);
    void delete(Long id);
}
