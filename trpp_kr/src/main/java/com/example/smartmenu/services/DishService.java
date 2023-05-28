package com.example.smartmenu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartmenu.models.Dish;
import com.example.smartmenu.repos.DishRepository;


@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;

    public List<Dish> getAll(){
        return dishRepository.findAll();
    }

    public void getById(Long Id){
        dishRepository.deleteById(Id);
    }

    public Optional<Dish> filterById(Long Id){
        return dishRepository.findById(Id);
    }
}
