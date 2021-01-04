package com.example.firstSpringBoot.Entities;

import javax.persistence.*;
import lombok.*;

@Entity 
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Product{ 
@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long id; 
private String name; 
private double price; 
}
