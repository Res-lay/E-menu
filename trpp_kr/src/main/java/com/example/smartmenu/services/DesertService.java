package com.example.smartmenu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartmenu.repos.DesertRepo;
import com.example.smartmenu.models.Desert;

@Service
public class DesertService {
    @Autowired
    private DesertRepo desertRepo;

    public List<Desert> getAll(){
        return desertRepo.findAll();
    }
}
