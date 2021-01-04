package com.example.firstSpringBoot.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
public class Customer{ 
private Long id; 
private String name; 
private String email; 
}
