package com.example.springstarter.mappers.user;

import com.example.springstarter.dto.company.CompanyReadDto;
import com.example.springstarter.dto.user.UserReadDto;
import com.example.springstarter.entity.User;
import com.example.springstarter.mappers.Mapper;
import com.example.springstarter.mappers.company.CompanyReadMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserReadMapper implements Mapper<User, UserReadDto> {

    private final CompanyReadMapper companyReadMapper;
    @Override
    public UserReadDto map(User from) {
        CompanyReadDto companyReadDto = Optional.ofNullable(from.getCompany())
                .map(companyReadMapper::map)
                .orElse(null);

        return new UserReadDto(from.getUsername(), from.getFirstname(),
                from.getLastname(), from.getBirthDate(), companyReadDto);
    }
}
