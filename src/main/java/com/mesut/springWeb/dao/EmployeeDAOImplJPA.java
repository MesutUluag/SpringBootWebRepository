package com.mesut.springWeb.dao;

import com.mesut.springWeb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class EmployeeDAOImplJPA implements EmployeeDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        TypedQuery <Employee> theQuery= entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employees= theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findbyID(int id) {
        Employee employee= entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee employee1= entityManager.merge(employee);
        employee.setId(employee1.getId());
    }

    @Override
    public void deleteEmployee(int id) {
        Query query= entityManager.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
