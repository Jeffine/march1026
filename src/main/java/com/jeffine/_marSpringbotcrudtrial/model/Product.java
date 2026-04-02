package com.jeffine._marSpringbotcrudtrial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    public int id;
    private  String name;
    private String description;
    private String vendor;
    private int price;
    private int stock;
    private String currency;
    private  String image_url;
    private String SKU;
}
