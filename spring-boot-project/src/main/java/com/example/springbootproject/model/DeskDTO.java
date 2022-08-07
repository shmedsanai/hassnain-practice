package com.example.springbootproject.model;


import com.example.springbootproject.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class DeskDTO {

    private boolean booked;

    private long departmentId;
}
