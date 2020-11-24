package com.mesut.springWeb.service;

import com.mesut.springWeb.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findbyID(int id);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
