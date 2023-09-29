package com.example.springstarter.controller;

import com.example.springstarter.dto.company.CompanyReadDto;
import com.example.springstarter.dto.company.CompanyWriteUpdateDto;
import com.example.springstarter.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/companies")
public class CompanyContoller {

    private final CompanyService companyService;
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyReadDto create (@RequestBody CompanyWriteUpdateDto companyDto){
        return companyService.create(companyDto);
    }
}
