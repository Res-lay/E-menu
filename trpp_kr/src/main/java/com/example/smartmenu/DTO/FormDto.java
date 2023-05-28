package com.example.smartmenu.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class FormDto {
    @NotEmpty
    private String name;

    @Email
    private String address;

}
