package com.example.smartmenu.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cartitems")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;


    @ManyToOne(fetch = FetchType.LAZY)
    private Dish dish;

    @Column(name = "QUANTITY")
    private int quantity;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Drink drink; 

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Soup soup;
    
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Seafood seafood;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Bbqbeaf bbqbeaf;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Desert desert;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Meat meat;
}
