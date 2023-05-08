package com.pragma.powerup.usermicroservice.domain.model;

import java.util.Date;

public class User {
    private Long id;
    private  String name;
    private String surname;
    private String document_number;
    private String phone;
    private Date birth_date;
    private String email;
    private String password;
    private Long id_rol;

    public User(Long id, String name, String surname, String document_number, String phone, Date birth_date, String email, String password, Long id_rol) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.document_number = document_number;
        this.phone = phone;
        this.birth_date = birth_date;
        this.email = email;
        this.password = password;
        this.id_rol = id_rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    /*    private Long id;
    private Person person;
    private Role role;

    public User(Long id, Person person, Role role) {
        this.id = id;
        this.person = person;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }*/
}
