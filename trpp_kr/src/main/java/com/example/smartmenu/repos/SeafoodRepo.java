package com.example.smartmenu.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Seafood;

@Repository
public interface SeafoodRepo extends JpaRepository<Seafood, Long>{
    
}
