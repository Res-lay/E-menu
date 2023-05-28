package com.example.smartmenu.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Desert;

@Repository
public interface DesertRepo extends JpaRepository<Desert, Long>{
    
}
