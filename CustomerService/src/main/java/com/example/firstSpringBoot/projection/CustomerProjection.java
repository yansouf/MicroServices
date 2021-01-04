package com.example.firstSpringBoot.projection;

import org.springframework.data.rest.core.config.Projection;

import com.example.firstSpringBoot.Entities.Customer;

@Projection(name = "fullCustomer",types =  Customer.class) 
interface CustomerProjection extends Projection{ 
public Long getId(); 
public String getName();   
public String getEmail(); 
}
