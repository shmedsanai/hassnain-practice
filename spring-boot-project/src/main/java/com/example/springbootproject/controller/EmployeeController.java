package com.example.springbootproject.controller;

import com.example.springbootproject.entity.Department;
import com.example.springbootproject.entity.Employee;
import com.example.springbootproject.model.DeptDTO;
import com.example.springbootproject.model.EmpDTO;
import com.example.springbootproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "add-employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    private Employee addDepartment(@RequestBody EmpDTO empDTO){
        return employeeService.addEmpl(empDTO);
    }
}
