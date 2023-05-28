package com.example.smartmenu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartmenu.models.Meat;
import com.example.smartmenu.repos.MeatRepo;

@Service
public class MeatService {
    @Autowired
    private MeatRepo meatRepo;

    public List<Meat> getAll(){
        return meatRepo.findAll();
    }
}
