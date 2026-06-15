package com.demo.garphQL.Repository;

import com.demo.garphQL.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.DocFlavor;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
