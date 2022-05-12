package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.User;

public interface UserService {
	User saveUser(User user);
	
	List<User> fetchUserList();

	User updateUser(User user, Long id);

	void deleteUserById(Long id);

	Optional<User> findById(Long id);



	}
