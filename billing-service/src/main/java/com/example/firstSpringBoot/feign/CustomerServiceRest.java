package com.example.firstSpringBoot.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.firstSpringBoot.models.Customer;

@FeignClient(name="CUSTOMER-SERVICE")
public class CustomerServiceRest {
	@GetMapping(path="/customer/{id}")
	 Customer getCustomerById(@PathVariable(name="id")Long id);
}
 	 