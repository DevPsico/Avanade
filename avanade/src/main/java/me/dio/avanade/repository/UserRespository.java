package me.dio.avanade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.avanade.model.User;

public interface UserRespository extends JpaRepository<User, Long>{

}
