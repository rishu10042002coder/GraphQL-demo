package com.demo.garphQL.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name="orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String orderDetails;
    private int price;
    @ManyToOne()
    private User user;
}
