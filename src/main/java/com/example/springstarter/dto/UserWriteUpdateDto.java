package com.example.springstarter.dto;

import jakarta.validation.constraints.*;
import lombok.Value;

import java.time.LocalDate;

@Value
public class UserWriteUpdateDto {

    @Email
    String username;

    @NotNull
    @Size(min = 2, max = 15)
    String firstname;
    @NotNull
    String lastname;
    @Past
    LocalDate birthDate;

}
