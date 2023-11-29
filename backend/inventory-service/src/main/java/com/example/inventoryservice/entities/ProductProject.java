package com.example.inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullProduct",types = Product.class)
public interface ProductProject {
    public Long getId();
    public String getName();
    public double getPrice();
    public int getQuantity();
}
