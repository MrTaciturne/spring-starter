package com.example.springstarter.service;

import com.example.springstarter.dto.UserReadDto;
import com.example.springstarter.dto.UserWriteUpdateDto;
import com.example.springstarter.entity.User;
import com.example.springstarter.mappers.UserReadMapper;
import com.example.springstarter.mappers.UserWriteUpdateMapper;
import com.example.springstarter.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserReadMapper userReadMapper;
    private final UserWriteUpdateMapper userWriteUpdateMapper;

    public Optional<UserReadDto> getById(Long id) {
        return userRepository.findById(id)
                .map(userReadMapper::map);
    }

    public List<UserReadDto> findAll() {
        return userRepository.findAll()
                .stream()
                .map(userReadMapper::map)
                .collect(Collectors.toList());
    }

    public UserReadDto create(UserWriteUpdateDto userWriteUpdateDto) {
        return Optional.of(userWriteUpdateDto)
                .map(userWriteUpdateMapper::map)
                .map(userRepository::save)
                .map(userReadMapper::map)
                .orElseThrow(RuntimeException::new);
    }

    public Optional<UserReadDto> update(Long id, UserWriteUpdateDto userDto) {
        return userRepository
                .findById(id)
                .map(entity -> userWriteUpdateMapper.map(userDto, entity))
                .map(userRepository::saveAndFlush)
                .map(userReadMapper::map);
    }


    public boolean delete(Long id) {
        return userRepository.findById(id)
                .map(entity -> {
                    userRepository.delete(entity);
                    return true;
                }).orElse(false);
    }
}
