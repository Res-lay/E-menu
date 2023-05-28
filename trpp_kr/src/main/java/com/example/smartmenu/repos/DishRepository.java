package com.example.smartmenu.repos;

 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Dish;



@Repository
public interface DishRepository extends JpaRepository<Dish, Long>{

}
