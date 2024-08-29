package com.spring.btc.mapper;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import com.spring.btc.vo.UserVO;

@Mapper
public interface UserMapper {
    UserVO getUserById(String userId);
    void insertUser(UserVO user);
}