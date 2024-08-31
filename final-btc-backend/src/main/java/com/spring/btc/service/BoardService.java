package com.spring.btc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.btc.vo.BoardVO;

@Service
public interface BoardService {
	public List<BoardVO> getBoardList();
}
