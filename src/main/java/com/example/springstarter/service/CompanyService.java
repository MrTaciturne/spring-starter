package com.example.springstarter.service;

import com.example.springstarter.dto.company.CompanyReadDto;
import com.example.springstarter.dto.company.CompanyWriteUpdateDto;
import com.example.springstarter.mappers.company.CompanyReadMapper;
import com.example.springstarter.mappers.company.CompanyWriteUpdateMapper;
import com.example.springstarter.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyReadMapper companyReadMapper;
    private final CompanyWriteUpdateMapper companyWriteUpdateMapper;

    public CompanyReadDto create(CompanyWriteUpdateDto companyWriteUpdateDto) {
        return Optional.of(companyWriteUpdateDto)
                .map(companyWriteUpdateMapper::map)
                .map(companyRepository::save)
                .map(companyReadMapper::map)
                .orElseThrow(RuntimeException::new);
    }
}
