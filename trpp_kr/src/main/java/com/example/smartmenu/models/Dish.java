package com.example.smartmenu.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "dish", fetch = FetchType.LAZY)
    private List<Meat> meats;

    @JsonManagedReference
    @OneToMany(mappedBy = "dish", fetch = FetchType.LAZY)
    private List<Bbqbeaf> bbqbeaf;

    @JsonManagedReference
    @OneToMany(mappedBy = "dish", fetch = FetchType.LAZY)
    private List<Drink> drinks;

    @JsonManagedReference
    @OneToMany(mappedBy = "dish", fetch = FetchType.LAZY)
    private List<Soup> soups;

    @JsonManagedReference
    @OneToMany(mappedBy = "dish", fetch = FetchType.LAZY)
    private List<Seafood> seafoods;

    @JsonManagedReference
    @OneToMany(mappedBy = "dish", fetch = FetchType.LAZY)
    private List<Desert> desert;



}
