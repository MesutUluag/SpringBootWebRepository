package com.mesut.springWeb.service;

import com.mesut.springWeb.dao.EmployeeDAOSpringDataJPA;
import com.mesut.springWeb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDAOSpringDataJPA employeeDAOSpringDataJPA;

    @Override
    public List<Employee> findAll() {

        return employeeDAOSpringDataJPA.findAll();
    }

    @Override
    public Optional<Employee> findbyID(int id) {
        Optional<Employee> employee=employeeDAOSpringDataJPA.findById(id);
        if(employee.isPresent()){
            return employee;
        } else throw new RuntimeException("Employee Do not Exists");
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDAOSpringDataJPA.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAOSpringDataJPA.deleteById(id);
    }
}
