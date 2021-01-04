package com.example.firstSpringBoot.projection;

import org.springframework.data.rest.core.config.Projection;

import com.example.firstSpringBoot.Entities.Product;

@Projection(name = "fullCustomer",types =  Product.class) 
interface ProductProjection extends Projection{ 
public Long getId(); 
public String getName();   
public String getEmail(); 
}
