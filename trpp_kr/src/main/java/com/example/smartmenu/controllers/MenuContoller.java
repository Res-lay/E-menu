package com.example.smartmenu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.smartmenu.models.Bbqbeaf;
import com.example.smartmenu.models.Desert;
import com.example.smartmenu.models.Drink;
import com.example.smartmenu.models.Meat;
import com.example.smartmenu.models.Seafood;
import com.example.smartmenu.models.Soup;
import com.example.smartmenu.services.BbqbeafService;
import com.example.smartmenu.services.DesertService;
import com.example.smartmenu.services.DrinkService;
import com.example.smartmenu.services.MeatService;
import com.example.smartmenu.services.SeafoodService;
import com.example.smartmenu.services.SoupService;



@Controller
@RequestMapping("/api")
public class MenuContoller {
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private DesertService desertService;
    @Autowired
    private MeatService meatService;
    @Autowired
    private BbqbeafService bbqbeafService;
    @Autowired
    private SoupService soupService;
    @Autowired
    private SeafoodService seafoodService;

    
    @GetMapping("/drinks")
    @ResponseBody   
    public List<Drink> getDrinks(){
        return drinkService.getAll();
    } 
    @GetMapping("/desert")
    @ResponseBody   
    public List<Desert> getDeserts(){
        return desertService.getAll();
    } 
    @GetMapping("/meat")
    @ResponseBody   
    public List<Meat> getMeat(){
        return meatService.getAll();
    } 
    @GetMapping("/bbqbeaf")
    @ResponseBody   
    public List<Bbqbeaf> getBbqbeaf(){
        return bbqbeafService.getAll();
    } 
    @GetMapping("/soup")
    @ResponseBody   
    public List<Soup> getSoups(){
        return soupService.getAll();
    } 
    @GetMapping("/seafood")
    @ResponseBody   
    public List<Seafood> getSeafood(){
        return seafoodService.getAll();
    } 
}
