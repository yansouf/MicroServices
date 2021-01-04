package com.example.firstSpringBoot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.firstSpringBoot.Entities.Product;

@RepositoryRestResource 
public interface ProductRepository extends JpaRepository<Product,Long> { } 


