package com.example.springstarter.service;

import com.example.springstarter.dto.company.CompanyReadDto;
import com.example.springstarter.dto.user.UserReadDto;
import com.example.springstarter.dto.user.UserWriteUpdateDto;
import com.example.springstarter.entity.User;
import com.example.springstarter.mappers.user.UserReadMapper;
import com.example.springstarter.mappers.user.UserWriteUpdateMapper;
import com.example.springstarter.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
class UserServiceTest {

//    private static final  String TEST = "test";

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserReadMapper userReadMapper;
    @Autowired
    private UserWriteUpdateMapper userWriteMapper;
    @Autowired
    private UserService userService;

    @Test
    void shouldGetAllUsers(){

//        when(userRepository.findAll()).thenReturn(List.of(new User(), new User()));
//        when(userReadMapper.map(any())).thenReturn(new UserReadDto(TEST, TEST, TEST, LocalDate.of(1,1,1), new CompanyReadDto(TEST)));

        List<UserReadDto> expectedList = userService.findAll();

        Assertions.assertEquals(6, expectedList.size());
    }

}