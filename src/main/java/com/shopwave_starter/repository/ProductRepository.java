// Student Name: Beamlak Tibebu
// Student ID: ATE/3624/14
package com.shopwave_starter.repository;

import com.shopwave_starter.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// basic repository for product databse operations 
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}