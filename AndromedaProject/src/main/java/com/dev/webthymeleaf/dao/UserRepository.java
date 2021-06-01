package com.dev.webthymeleaf.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.dev.webthymeleaf.dto.UserDto;
import com.dev.webthymeleaf.entidades.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

	@Query(value = "select id,email from user;", nativeQuery = true)
	public List<UserDto> findByIdAndEmail();
}
