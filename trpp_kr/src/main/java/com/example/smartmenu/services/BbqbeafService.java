package com.example.smartmenu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartmenu.models.Bbqbeaf;
import com.example.smartmenu.repos.BbqbeafRepo;

@Service
public class BbqbeafService {
    @Autowired
    private BbqbeafRepo bbqbeafRepo;

    public List<Bbqbeaf> getAll(){
        return bbqbeafRepo.findAll();
    }
}
