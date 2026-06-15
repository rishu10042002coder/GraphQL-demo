package com.demo.garphQL.Controller;

import com.demo.garphQL.Entity.Order;
import com.demo.garphQL.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @MutationMapping
    public Order createOrder(@Argument String orderDetails,@Argument Integer price,@Argument Integer userId) {
        return orderService.createorder(orderDetails,price,userId);
    }
    @QueryMapping
    public Order getOrder(@Argument Integer id) {
        return orderService.getOrder(id);

    }

    @QueryMapping
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
