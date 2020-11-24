package com.mesut.springWeb.service;

import com.mesut.springWeb.dao.EmployeeDAO;
import com.mesut.springWeb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> findAll() {

        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findbyID(int id) {
        return employeeDAO.findbyID(id);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
