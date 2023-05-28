package com.example.smartmenu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartmenu.models.Drink;
import com.example.smartmenu.repos.DrinkRepo;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepo drinkRepo;

    public List<Drink> getAll(){
        return drinkRepo.findAll();
    }
}
