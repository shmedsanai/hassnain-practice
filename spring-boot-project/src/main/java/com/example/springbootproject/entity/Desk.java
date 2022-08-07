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
@Table(name ="desk")
public class Desk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="desk_id")
    private long id;

    @Column(name="booked")
    private boolean booked;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="department_id", referencedColumnName = "id")
    private Department department;

}
