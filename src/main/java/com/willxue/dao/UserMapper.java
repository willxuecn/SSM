package com.willxue.dao;

import com.willxue.entity.User;

public interface UserMapper {
	int deleteByPrimaryKey(Integer uid);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer uid);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}