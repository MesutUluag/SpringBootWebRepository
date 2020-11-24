package com.mesut.springWeb.dao;

import com.mesut.springWeb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAOSpringDataJPA extends JpaRepository <Employee,Integer> {
}
