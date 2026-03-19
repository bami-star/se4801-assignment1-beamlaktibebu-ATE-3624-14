// Student Name: Beamlak Tibebu
// Student ID: ATE/3624/14

package com.shopwave.shopwave_starter.service;

import com.shopwave.shopwave_starter.model.Order;
import com.shopwave.shopwave_starter.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        // Here you could add logic like calculating tax or checking stock
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}