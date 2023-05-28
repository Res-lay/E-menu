package com.example.smartmenu.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Soup;

@Repository
public interface SoupRepo extends JpaRepository<Soup, Long>{
    
}
