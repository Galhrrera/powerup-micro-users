package com.pragma.powerup.usermicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.UsuariosRequestDto;

public interface IUsuariosHandler {
    void saveOwner(UsuariosRequestDto usuariosRequestDto);
}
