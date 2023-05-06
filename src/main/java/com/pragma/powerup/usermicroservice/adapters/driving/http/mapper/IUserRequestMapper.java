package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.UserRequestDto;
import com.pragma.powerup.usermicroservice.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    //@Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "surname", source = "surname")
    @Mapping(target = "document_number", source = "document_number")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "mail", source = "mail")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "id_rol", source = "id_rol")
    User toUser(UserRequestDto userRequestDto);
}
