package com.example.demospringboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car id", nullable = false)
    private Car car;

    private String model;

    @ManyToOne
    @JoinColumn(name = "manager id", nullable = false)
    private Manager manager;

    private int quantity;
}
