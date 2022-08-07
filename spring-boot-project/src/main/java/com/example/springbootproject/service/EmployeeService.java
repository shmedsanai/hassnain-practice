package com.example.springbootproject.service;

import com.example.springbootproject.entity.Department;
import com.example.springbootproject.entity.Employee;
import com.example.springbootproject.model.EmpDTO;
import com.example.springbootproject.respository.DepartmentRepository;
import com.example.springbootproject.respository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    public Employee addEmpl(EmpDTO empDTO) {
        Employee employee = new Employee();
        Optional<Department> department = departmentRepository.findById(empDTO.getDepartmentId());
        if(department.isPresent()) {
            employee.setDepartmentEmployee(department.get());

            employee.setName(empDTO.getName());
            employee.setAge(empDTO.getAge());
            employee.setSingle(employee.isSingle());
            employee.setHeight(empDTO.getHeight());
            employeeRepository.save(employee);
            return employee;
        }
        return null;
    }
}
