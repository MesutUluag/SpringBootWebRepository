package com.mesut.springWeb.dao;

import com.mesut.springWeb.entity.Employee;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    EntityManager entityManager;

    @Autowired
    EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        Session currentSession= entityManager.unwrap(Session.class);

        Query<Employee> theQuery= currentSession.createQuery("from Employee", Employee.class);

        List<Employee> result= theQuery.getResultList();

        return result;
    }

    @Override
    public Employee findbyID(int id) {
        Session currentSession= entityManager.unwrap(Session.class);

        Employee employee= currentSession.get(Employee.class, id);

        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        Session currentSession= entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(employee);

    }

    @Override
    public void deleteEmployee(int id) {
        Session currentSession= entityManager.unwrap(Session.class);
        Query theQuery= currentSession.createQuery("delete from Employee where id=:employeeID");
        theQuery.setParameter("employeeID", id);
        theQuery.executeUpdate();
    }
}
