package com.example.springstarter.repository;

import com.example.springstarter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//@Repository Избыточно
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query(value = "SELECT * FROM users u JOIN company c ON u.company_id = c.id WHERE c.name = :name",
//    nativeQuery = true)  Нативный SQL
    @Query("select u from User u join u.company c where c.name = :name ")
    public List<User> findAllByCompanyName(String name); //Благодаря Query мы можем задать другое имя методу
}
