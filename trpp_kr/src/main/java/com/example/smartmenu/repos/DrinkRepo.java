package com.example.smartmenu.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Drink;

@Repository
public interface DrinkRepo extends JpaRepository<Drink, Long>{
    
}
