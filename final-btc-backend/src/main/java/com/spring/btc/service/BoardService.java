package com.spring.btc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.btc.vo.BoardVO;

@Service
public interface BoardService {
	public List<BoardVO> getBoardList();
	
	public boolean registBoard(BoardVO vo);

	public BoardVO getBoardDetail(BoardVO vo);
	
	public boolean editBoard(BoardVO vo);
	
	public boolean deleteBoard(BoardVO vo);
	
}
