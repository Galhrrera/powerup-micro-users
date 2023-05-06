package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.UserEntity;
import com.pragma.powerup.usermicroservice.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserEntityMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "surname", source = "surname")
    @Mapping(target = "document", source = "document_number")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "mail", source = "mail")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "role.id", source = "id_rol")
    UserEntity toEntity(User user);
/*    @Mapping(target = "person.id", source = "personEntity.id")
    @Mapping(target = "role.id", source = "roleEntity.id")
    User toUser(UserEntity userEntity);*/
    List<User> toUserList(List<UserEntity> userEntityList);
}
