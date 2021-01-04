package com.example.firstSpringBoot.entities;
 
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

public class Bill{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
 
    @Transient
    private Long customerId;
}