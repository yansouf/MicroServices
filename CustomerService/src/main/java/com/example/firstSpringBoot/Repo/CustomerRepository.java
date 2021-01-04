package com.example.firstSpringBoot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.firstSpringBoot.Entities.Customer;

@RepositoryRestResource 
public interface CustomerRepository extends JpaRepository<Customer,Long> { } 


