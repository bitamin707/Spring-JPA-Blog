package com.cos.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	@Transactional(readOnly = true)
	public Page<Board> list(Pageable pageable) { // 글목록
		return boardRepository.findAll(pageable);
	}

	@Transactional(readOnly = true)
	public Board content(int id) { // 글 상세보기
		return boardRepository.findById(id)
				.orElseThrow(() -> { // 영속화
					return new IllegalArgumentException("글 상세보기 실패 : 아이디를 찾을 수 없습니다.");
				});
	}
	
	@Transactional
	public void delete(int id) { // 글 삭제
		boardRepository.deleteById(id);
	}
	
	@Transactional
	public void update(int id, Board requestBoard) { // 글 수정
		Board board = boardRepository.findById(id)
			.orElseThrow(() -> { // 영속화
				return new IllegalArgumentException("글 찾기 실패 : 아이디를 찾을 수 없습니다.");
			});
		board.setTitle(requestBoard.getTitle());
		board.setContent(requestBoard.getContent());
	}
}
