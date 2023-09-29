package com.example.springstarter.mappers.company;

import com.example.springstarter.dto.company.CompanyReadDto;
import com.example.springstarter.entity.Company;
import com.example.springstarter.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class CompanyReadMapper implements Mapper<Company, CompanyReadDto> {

    @Override
    public CompanyReadDto map(Company from) {
        return new CompanyReadDto(from.getName());
    }
}
