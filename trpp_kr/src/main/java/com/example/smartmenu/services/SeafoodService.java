package com.example.smartmenu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartmenu.models.Seafood;
import com.example.smartmenu.repos.SeafoodRepo;

@Service
public class SeafoodService {
    @Autowired
    private SeafoodRepo seafoodRepo;

    public List<Seafood> getAll(){
        return seafoodRepo.findAll();
    }
}
