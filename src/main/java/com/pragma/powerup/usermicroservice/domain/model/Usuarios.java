package com.pragma.powerup.usermicroservice.domain.model;

import java.util.Date;

public class Usuarios {
    private Long id;
    private String nombre;
    private String apellido;
    private String numero_documento;
    private String celular;
    private Date fecha_nacimiento;
    private String correo;
    private String clave;
    private String id_rol;

    public Usuarios(Long id, String nombre, String apellido, String numero_documento, String celular, Date fecha_nacimiento, String correo, String clave, String id_rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_documento = numero_documento;
        this.celular = celular;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.clave = clave;
        this.id_rol = id_rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

}
