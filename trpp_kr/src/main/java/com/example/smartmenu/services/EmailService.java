package com.example.smartmenu.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    @Async
    public void sendEmail(String objectName, String UserName){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("ivanlatysheff@gmail.com");
        message.setTo(objectName);
        System.out.println(objectName);
        message.setSubject("SmartMenu Delivery");
        String order = "";
        message.setText("Dear " + UserName + ",\n" + "Your order will be delivered within 1 hour");
        try {
            mailSender.send(message);
            System.out.println("Email sent successfully");
        } catch (MailException e) {
            System.out.println("Error sending email: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

