package com.example.firstSpringBoot;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient; 
import com.example.firstSpringBoot.Entities.Customer;
import com.example.firstSpringBoot.Repo.CustomerRepository; 
@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication 	 implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.save(new Customer(1L,"Enset","contact@enset-media.ma")); 
		customerRepository.save(new Customer(2L,"FSTM","contact@fstm.ma")); 
		customerRepository.save(new Customer(3L,"ENSAM","contact@ensam.ma")); 
		customerRepository.findAll().forEach(System.out::println); 
	}
	
	}	
 
