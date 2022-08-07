package com.example.springbootproject.service;

import com.example.springbootproject.entity.Department;
import com.example.springbootproject.model.DeptDTO;
import com.example.springbootproject.respository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addDept(DeptDTO deptDTO) {
        Department department = new Department();
        department.setName(deptDTO.getName());
        departmentRepository.save(department);
        return department;
    }
}
