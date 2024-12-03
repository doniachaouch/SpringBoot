package edu.polytech.springboot_tp.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Mission {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private  int duration;

    @ManyToMany(mappedBy = "missions")

    private List<Employee> employees;
}
