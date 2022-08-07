package com.example.springbootproject.service;

import com.example.springbootproject.entity.Department;
import com.example.springbootproject.entity.Desk;
import com.example.springbootproject.entity.Employee;
import com.example.springbootproject.model.DeskDTO;
import com.example.springbootproject.respository.DepartmentRepository;
import com.example.springbootproject.respository.DeskRepository;
import com.example.springbootproject.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeskService {
    @Autowired
    private DeskRepository deskRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Desk> getAllDesks()
    {
       return deskRepository.findAll();
    }

    public Desk create(DeskDTO desk2) {
        Desk desk1 = new Desk();

        Optional<Department> department = departmentRepository.findById(desk2.getDepartmentId());
        if(department.isPresent()) {
          desk1.setBooked(desk2.isBooked());
          desk1.setDepartment(department.get());
          deskRepository.save(desk1);
          return desk1;
        }
        return null;
    }
}
