package com.spring.btc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.btc.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getBoardList();
}
