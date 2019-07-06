package com.kyro.provider.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyro.provider.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
