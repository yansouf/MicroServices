package com.example.firstSpringBoot.Entities;

import javax.persistence.*;
import lombok.*;

@Entity 
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Customer{ 
@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long id; 
private String name; 
private String email; 
}
