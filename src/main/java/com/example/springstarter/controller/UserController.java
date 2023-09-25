package com.example.springstarter.controller;

import com.example.springstarter.dto.UserReadDto;
import com.example.springstarter.dto.UserWriteDto;
import com.example.springstarter.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserReadDto findById(@PathVariable Long id) {
        return userService.getById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/All")
    public List<UserReadDto> findAll() {
        return userService.findAll();
    }

    @PostMapping(value = "/", consumes = APPLICATION_JSON_VALUE)
    public UserReadDto create(@RequestBody UserWriteDto userWriteDto){
        return userService.create(userWriteDto);
    }
}

