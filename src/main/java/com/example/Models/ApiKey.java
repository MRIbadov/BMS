package com.example.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "api_keys")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String key;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
