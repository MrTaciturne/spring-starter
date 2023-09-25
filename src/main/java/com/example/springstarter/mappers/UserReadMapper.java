package com.example.springstarter.mappers;

import com.example.springstarter.dto.UserReadDto;
import com.example.springstarter.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserReadMapper implements Mapper<User, UserReadDto> {
    @Override
    public UserReadDto map(User from) {
        return new UserReadDto(from.getUsername(), from.getFirstname(), from.getLastname(), from.getBirthDate());
    }
}
