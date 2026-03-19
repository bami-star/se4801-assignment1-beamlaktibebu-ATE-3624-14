// Student Name: Beamlak Tibebu
// Student ID: ATE/3624/
package com.shopwave_starter.model; 

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank; 
import lombok.*;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Category name is required")
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;
}