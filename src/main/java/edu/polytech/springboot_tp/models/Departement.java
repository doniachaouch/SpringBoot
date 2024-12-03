package edu.polytech.springboot_tp.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Departement {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "departement")
    private List<Employee> employees;
}
