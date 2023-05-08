package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class PersonResponseDto {
    private  String name;
    private String surname;
    private String document_number;
    private String phone;
    private Date birth_date;
    private String email;
    private String password;
    private Long id_rol;
}
