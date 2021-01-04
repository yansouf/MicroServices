package com.example.firstSpringBoot.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.firstSpringBoot.entities.ProductItem;
import com.example.firstSpringBoot.models.*;

@FeignClient(name="PRODUCT-SERVICE")
public class ProductServiceRest {
	@GetMapping(path="/product/")
	 PagedModel<ProductItem> pageProduct(@RequestParam(name="id") int  page,@RequestParam(name="size") int  size);
	@GetMapping(path="/product/{id}")
	 Customer getProductById(@PathVariable(name="id")Long id);
}
 	 