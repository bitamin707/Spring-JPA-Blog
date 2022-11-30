package com.cos.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.model.Board;
import com.cos.blog.model.User;
import com.cos.blog.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	
	@Transactional
	public void save(Board board, User user) { // 글쓰기
		board.setCount(0);
		board.setUser(user);
		boardRepository.save(board);
	}

	public List<Board> list() {
		return boardRepository.findAll();
	}
	
}
