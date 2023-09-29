package com.example.springstarter.dto.user;

import com.example.springstarter.dto.company.CompanyReadDto;
import lombok.Value;

import java.time.LocalDate;

@Value
public class UserReadDto {

    String username;
    String firstname;
    String lastname;
    LocalDate birthDate;
    CompanyReadDto companyReadDto;
}
