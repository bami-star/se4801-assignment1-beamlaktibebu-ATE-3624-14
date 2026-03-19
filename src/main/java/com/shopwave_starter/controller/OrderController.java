// Student Name: Beamlak Tibebu
// Student ID: ATE/3624/14

package com.shopwave.shopwave_starter.controller;

import com.shopwave.shopwave_starter.model.Order;
import com.shopwave.shopwave_starter.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}