package com.example.springstarter.mappers.company;

import com.example.springstarter.dto.company.CompanyWriteUpdateDto;
import com.example.springstarter.entity.Company;
import com.example.springstarter.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class CompanyWriteUpdateMapper implements Mapper<CompanyWriteUpdateDto, Company> {
    @Override
    public Company map(CompanyWriteUpdateDto from) {
        return Company.builder()
                .name(from.getName())
                .build();

    }

    @Override
    public Company map(CompanyWriteUpdateDto from, Company toObject) {
        toObject.setName (from.getName());
        return toObject;
    }
}
