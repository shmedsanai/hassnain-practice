package com.example.springbootproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name ="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="single")
    private boolean single;

    @Column(name="height")
    private float height;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="department_id", referencedColumnName = "id")
    private Department departmentEmployee;

}
