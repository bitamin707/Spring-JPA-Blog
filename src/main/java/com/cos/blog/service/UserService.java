package com.cos.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public void save(User user) { // 회원가입
		userRepository.save(user);
	}

	/* 기존 로그인 시스템
	@Transactional(readOnly = true)
	public User login(User user) { // 로그인
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
	*/
}
