package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
	log.info("user {}",user);
	
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		return (List<User>) userRepository.findAll();

	}

	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User updateUser(User user, Long id) {
		log.info("user {}",user);
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

}
