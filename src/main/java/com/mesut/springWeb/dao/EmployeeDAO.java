package com.mesut.springWeb.dao;

import com.mesut.springWeb.entity.Employee;

import java.util.List;

public interface EmployeeDAO  {

    public List<Employee> findAll();

    public Employee findbyID(int id);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
