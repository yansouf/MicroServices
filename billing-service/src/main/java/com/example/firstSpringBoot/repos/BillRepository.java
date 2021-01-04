package com.example.firstSpringBoot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.firstSpringBoot.entities.Bill;

 

@RepositoryRestResource
interface BillRepository extends JpaRepository<Bill,Long>{

}