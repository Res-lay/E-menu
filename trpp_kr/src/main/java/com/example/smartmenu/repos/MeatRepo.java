package com.example.smartmenu.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Meat;

@Repository
public interface MeatRepo extends JpaRepository<Meat, Long>{
    
}
