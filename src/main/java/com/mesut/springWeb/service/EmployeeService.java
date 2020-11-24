package com.mesut.springWeb.service;

import com.mesut.springWeb.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> findAll();

    public Optional<Employee> findbyID(int id);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
