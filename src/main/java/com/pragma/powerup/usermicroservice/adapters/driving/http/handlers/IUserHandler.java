package com.pragma.powerup.usermicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.UserRequestDto;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);
/*
    void deleteUser(UserRequestDto userRequestDto);
    List<PersonResponseDto> getProvider(Integer page);
    PersonResponseDto getProvider(Long id);
    PersonResponseDto getEmployee(Long id);
    PersonResponseDto getClient(Long id);*/

    //void saveOwner(UserRequestDto userRequestDto);
}
