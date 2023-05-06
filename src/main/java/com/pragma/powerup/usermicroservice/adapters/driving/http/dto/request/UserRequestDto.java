package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@Getter
public class UserRequestDto {
    private String name;
    private String surname;
    private String document_number;
    private String phone;
    @DateTimeFormat(pattern = "dd-MM-YYYY")
    private Date birthdate;
    private String mail;
    private String password;
    private String id_rol;
}
