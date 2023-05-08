package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.repositories.IUserRepository;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.PrincipalUser;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.RoleEntity;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String documentID) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByDocument(documentID).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
        List<UserEntity> userEntity = userRepository.findAllById(user.getId());
        if (userEntity.isEmpty()) {
            throw new UsernameNotFoundException("User not found with documentID: " + documentID);
        }
        List<RoleEntity> roles = new ArrayList<>();

        for (UserEntity u : userEntity) {
            roles.add(u.getRole());
        }

        return PrincipalUser.build(user, roles);
    }
}
