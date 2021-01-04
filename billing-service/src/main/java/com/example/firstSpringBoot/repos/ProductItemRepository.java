package com.example.firstSpringBoot.repos;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.firstSpringBoot.entities.ProductItem;
 

@RepositoryRestResource
interface ProductItemRepository extends JpaRepository<ProductItem,Long>{
	public Collection<ProductItem> findByBillId(Long id);
}