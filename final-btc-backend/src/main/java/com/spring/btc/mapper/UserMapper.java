package com.spring.btc.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.spring.btc.vo.UserVO;

@Mapper
public interface UserMapper {
	
	@Select("select * from user3")
	public List<UserVO> findAll();
	
	@Update("update user3 set name = #{name}, pwd = ${pwd}, gender = #{gender} where no = #{no}")
	public int editById(UserVO uservo);
	
	
	public int delete(int no);
	public int save(UserVO uservo);
	
}
