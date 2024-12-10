package org.enset.inventoryservic.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter
public class Product {
    @Id
    private String id;
    private String description;
    private double price;
    private int quantity;
}
