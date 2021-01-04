package com.example.firstSpringBoot;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient; 
import com.example.firstSpringBoot.Entities.Product;
import com.example.firstSpringBoot.Repo.ProductRepository; 
@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication 	 implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		productRepository.save(new Product(1L,"Enset",20)); 
		productRepository.save(new Product(2L,"FSTM",30)); 
		productRepository.save(new Product(3L,"ENSAM",400)); 
		productRepository.findAll().forEach(System.out::println); 
	}
	
	}	
 
