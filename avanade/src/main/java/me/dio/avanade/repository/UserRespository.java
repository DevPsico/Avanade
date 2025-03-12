package me.dio.avanade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.avanade.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

}
