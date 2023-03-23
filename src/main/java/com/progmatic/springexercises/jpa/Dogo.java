package com.progmatic.springexercises.jpa;

import jakarta.persistence.*;

@Entity
@Table(name = "spring_dogo")
public class Dogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
