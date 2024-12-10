package org.enset.billingservic.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String id;
    private String description;
    private double price;
    private int quantity;
}
