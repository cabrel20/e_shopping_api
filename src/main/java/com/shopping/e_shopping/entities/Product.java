package com.shopping.e_shopping.entities;


import jakarta.persistence.*;

import java.util.List;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "id_catalog")
    private Catalog catalog;


    @ManyToMany
    @JoinTable(name = "order_product",joinColumns = @JoinColumn(name = "id_product"),inverseJoinColumns = @JoinColumn(name = "id_order"))
    private List<Order> orders;

    public Product() {
    }

    public Product(Integer id, String productName, Double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
