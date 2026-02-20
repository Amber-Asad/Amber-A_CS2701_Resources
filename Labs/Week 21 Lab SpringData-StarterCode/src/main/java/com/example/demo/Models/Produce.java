package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Produce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "produce")
    private List<SellerProduce> sellerProduces;

    public Produce() {}

    public Produce(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<SellerProduce> getSellerProduces() { return sellerProduces; }

    public void setSellerProduces(List<SellerProduce> sellerProduces) {
        this.sellerProduces = sellerProduces;
    }
}