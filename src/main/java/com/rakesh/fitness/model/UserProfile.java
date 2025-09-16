package com.rakesh.fitness.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}