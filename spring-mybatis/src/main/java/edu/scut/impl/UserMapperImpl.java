package edu.scut.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import edu.scut.mapper.UserMapper;
import edu.scut.pojo.User;

public class UserMapperImpl implements UserMapper{
	private SqlSessionTemplate sqlSession;

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		return userMapper.getUsers();
	}

	public List<User> getUsersByName(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
