package com.example.smartmenu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartmenu.models.Soup;
import com.example.smartmenu.repos.SoupRepo;

@Service
public class SoupService {
    @Autowired
    private SoupRepo soupRepo;

    public List<Soup> getAll(){
        return soupRepo.findAll();
    }
    
}