package com.example.firstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayService1Application {

	public static void main(String[] args) {
		SpringApplication.run(GatewayService1Application.class, args);
	}
	
	/*  @Bean
    RouteLocator staticRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/customers/**").uri("http://localhost:8081/"))
                .route(r->r.path("/products/**").uri("http://localhost:8082/"))
                .build();
    } */

	   /*@Bean
	    RouteLocator staticRoutes(RouteLocatorBuilder builder){
	        return builder.routes()
	                .route(r->r.path("/customers/**").uri("lb://CUSTOMER-SERVICE"))
	                .route(r->r.path("/products/**").uri("lb://INVENTORY-SERVICE"))
	                .build();
	    } */ 
    @Bean
     DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp){
        return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
    } 
	 

}


