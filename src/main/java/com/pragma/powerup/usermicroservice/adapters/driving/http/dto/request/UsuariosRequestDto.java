package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class UsuariosRequestDto {
    private String nombre;
    private String apellido;
    private String numero_documento;
    private String celular;
    private Date fecha_nacimiento;
    private String correo;
    private String clave;
    private String id_rol;
}
