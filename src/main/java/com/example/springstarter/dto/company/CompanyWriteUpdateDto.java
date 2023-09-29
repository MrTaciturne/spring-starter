package com.example.springstarter.dto.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class CompanyWriteUpdateDto {
    String name;

    @JsonCreator
    public CompanyWriteUpdateDto(@JsonProperty("name") String name){
        this.name = name;
    }
}
