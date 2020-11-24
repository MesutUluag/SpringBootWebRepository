package com.mesut.springWeb.restControllers;

import com.mesut.springWeb.dao.EmployeeDAO;
import com.mesut.springWeb.entity.Employee;
import com.mesut.springWeb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        return employeeService.findbyID(employeeId);
    }

    @PostMapping("/employees")
    public void createNewEmployee(@RequestBody Employee employee){
        employee.setId(0);
        employeeService.updateEmployee(employee);
    }

    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId){
        employeeService.deleteEmployee(employeeId);
    }
}
