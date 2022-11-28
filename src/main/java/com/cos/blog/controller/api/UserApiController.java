package com.cos.blog.controller.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.service.UserService;

@RestController
public class UserApiController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/auth/joinProc") // 회원가입
	public ResponseDto<Integer> save(@RequestBody User user) {
//		System.out.println("UserApiController : save 호출됨");
		userService.save(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // 처리 응답
	}

	/* 기존 로그인 시스템
	@PostMapping("/api/user/login") 
	public ResponseDto<Integer> login(@RequestBody User user, HttpSession session) {
		System.out.println("UserApiController : login 호출됨");
		User principal = userService.login(user);

		if (principal != null)
			session.setAttribute("principal", principal);
		System.out.println(principal);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}
	*/

}
