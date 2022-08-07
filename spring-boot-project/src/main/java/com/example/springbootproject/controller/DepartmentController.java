package com.example.springbootproject.controller;

import com.example.springbootproject.entity.Department;
import com.example.springbootproject.model.DeptDTO;
import com.example.springbootproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping(value = "add-department", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    private Department addDepartment(@RequestBody DeptDTO deptDTO){
        return departmentService.addDept(deptDTO);
    }

}
