package com.spring.btc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.btc.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getBoardList();
	
	public int registBoard(BoardVO vo);
	
	public BoardVO getBoardDetail(int bno);
	
	public int editBoard(BoardVO vo);
	
	public int deleteBoard(BoardVO vo);
}
