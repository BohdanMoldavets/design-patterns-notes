package org.moldavets.service.Impl;

import org.moldavets.dao.DatabaseConnectionManager;
import org.moldavets.model.Employee;
import org.moldavets.service.EmployeeService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeServiceImpl implements EmployeeService {

    private static final DatabaseConnectionManager connectionManager = new DatabaseConnectionManager().getManagerInstance();

    public EmployeeServiceImpl() {
    }

    @Override
    public void save(Employee employee) {
        connectionManager.connect();

        String sql = "insert into employees values(?,?,?,?)";
        try (PreparedStatement preparedStatement = connectionManager.getConnectionObject().prepareStatement(sql)) {
            preparedStatement.setLong(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getDepartment());
            preparedStatement.setBoolean(4, employee.getWorking());
            preparedStatement.executeUpdate();

            System.out.println("Employee saved successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connectionManager.disconnect();
        }
    }

    @Override
    public void delete(Long id) {
        connectionManager.connect();

        String sql = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement preparedStatement = connectionManager.getConnectionObject().prepareStatement(sql)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

            System.out.println("Employee deleted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connectionManager.disconnect();
        }
    }

}
