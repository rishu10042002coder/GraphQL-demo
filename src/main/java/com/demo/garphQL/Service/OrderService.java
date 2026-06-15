package com.demo.garphQL.Service;

import com.demo.garphQL.Entity.Order;
import com.demo.garphQL.Entity.User;
import com.demo.garphQL.Repository.OrderRepository;
import com.demo.garphQL.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    public Order createorder(String orderDetails, Integer price, Integer userId) {
        Order order = new Order();

        order.setOrderDetails(orderDetails);
        order.setPrice(price);
        User user = userRepository.findById(userId).get();
        order.setUser(user);
        return orderRepository.save(order);
    }

    public Order getOrder(Integer orderId) {
        return orderRepository.findById(orderId).get();
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
