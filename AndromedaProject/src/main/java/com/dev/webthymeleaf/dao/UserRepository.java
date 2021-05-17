package com.dev.webthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.webthymeleaf.entidades.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
