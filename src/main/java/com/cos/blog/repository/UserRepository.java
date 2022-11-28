package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cos.blog.model.User;

//DAO
public interface UserRepository extends JpaRepository<User, Integer>{

}

//JPA Naming쿼리
//SELECT * FROM user WHERE username = ?(username) AND password = ?(password)
//User findByUsernameAndPassword(String username, String password);

//@Query(value="SELECT * FROM user WHERE username = username AND password = password", nativeQuery = true)
//User login(String username, String password);