package com.mesut.springWeb.service;

import com.mesut.springWeb.dao.EmployeeDAOImplJPA;
import com.mesut.springWeb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDAOImplJPA employeeDAOImplJPA;

    @Override
    @Transactional
    public List<Employee> findAll() {

        return employeeDAOImplJPA.findAll();
    }

    @Override
    @Transactional
    public Employee findbyID(int id) {
        return employeeDAOImplJPA.findbyID(id);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAOImplJPA.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAOImplJPA.deleteEmployee(id);
    }
}
