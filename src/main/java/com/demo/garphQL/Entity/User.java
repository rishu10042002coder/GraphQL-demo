package com.demo.garphQL.Entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.util.List;

@Entity(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String password;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user", orphanRemoval = true)
    private List<Order>  orders;

}
