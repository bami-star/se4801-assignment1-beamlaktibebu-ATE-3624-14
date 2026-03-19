// Student Name: Beamlak Tibebu
// Student ID: ATE/3624/14
package com.shopwave.shopwave_starter.repository;

import com.shopwave.shopwave_starter.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}