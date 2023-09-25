package com.example.springstarter.repository;

import com.example.springstarter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository Избыточно
public interface UserRepository extends JpaRepository<User, Long> {

}
