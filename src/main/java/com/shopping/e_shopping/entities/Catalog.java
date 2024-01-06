package com.shopping.e_shopping.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "catalog")
    private List<Product> products;
    private String catalogName;

    public Catalog() {
    }

    public Catalog(Integer id, String catalogName) {
        this.id = id;
        this.catalogName = catalogName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
}
