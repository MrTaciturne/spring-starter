package com.example.springstarter.mappers.user;

import com.example.springstarter.dto.user.UserWriteUpdateDto;
import com.example.springstarter.entity.User;
import com.example.springstarter.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class UserWriteUpdateMapper implements Mapper<UserWriteUpdateDto, User> {
    @Override
    public User map(UserWriteUpdateDto from) {
        return User.builder()
                .username(from.getUsername())
                .firstname(from.getFirstname())
                .lastname(from.getLastname())
                .birthDate(from.getBirthDate())
                .build();

    }

    @Override
    public User map(UserWriteUpdateDto from, User toObject) {
        toObject.setUsername(from.getUsername());
        toObject.setFirstname(from.getFirstname());
        toObject.setLastname(from.getLastname());
        toObject.setBirthDate(from.getBirthDate());

        return toObject;
    }
}
