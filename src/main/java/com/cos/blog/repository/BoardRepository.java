package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.Board;

//DAO
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
