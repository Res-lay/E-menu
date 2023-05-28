package com.example.smartmenu.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Bbqbeaf;

@Repository
public interface BbqbeafRepo extends JpaRepository<Bbqbeaf, Long>{
    
}
