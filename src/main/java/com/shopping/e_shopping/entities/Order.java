package com.shopping.e_shopping.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrder;
    private  String orderName;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    //@JoinTable(name = "students_subjects",joinColumns = @JoinColumn(name = "student_id"),inverseJoinColumns = @JoinColumn(name = "subject_id"))
    @ManyToMany(mappedBy = "orders")
    private List<Product> products;

    public Order() {
    }

    public Order(Integer id, String orderName) {
        this.idOrder = id;
        this.orderName = orderName;
    }

    public Integer getId() {
        return idOrder;
    }

    public void setId(Integer id) {
        this.idOrder = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
