// Student Name: Beamlak Tibebu
// Student ID: ATE/3624/14
package com.shopwave.shopwave_starter.repository;

import com.shopwave.shopwave_starter.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}