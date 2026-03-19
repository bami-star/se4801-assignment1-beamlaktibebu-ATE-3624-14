// Student Name: Beamlak Tibebu
// Student ID: ATE/3624/14
package com.shopwave_starter.repository;

import com.shopwave_starter.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // This interface allows us to save and find Categories in the database
}