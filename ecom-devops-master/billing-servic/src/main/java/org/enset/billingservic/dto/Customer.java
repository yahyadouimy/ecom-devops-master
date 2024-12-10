package org.enset.billingservic.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Customer {
    private long id;
    private String lastName;
    private String firstName;
    private String email;
}