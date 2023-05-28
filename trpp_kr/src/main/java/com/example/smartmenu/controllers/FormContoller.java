package com.example.smartmenu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartmenu.DTO.FormDto;
import com.example.smartmenu.services.EmailService;

@RestController
public class FormContoller {

    @Autowired
    private EmailService emailService;

    @PostMapping("/submit-order")
    public  ResponseEntity<String> submitForm(@RequestBody FormDto formDto) {
        emailService.sendEmail(formDto.getAddress(), formDto.getName());
        return ResponseEntity.ok("Form submitted successfully");
    }
    
}
