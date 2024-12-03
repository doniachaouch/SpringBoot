package edu.polytech.springboot_tp.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private String streetName;
    private String houseNumber;
    private String zipCode;

    @OneToOne
    @JoinColumn(name="employee_id")
    private Employee employee;
}
