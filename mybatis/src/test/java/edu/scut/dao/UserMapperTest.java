package edu.scut.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import edu.scut.pojo.User;
import edu.scut.utils.Mybatis;

public class UserMapperTest {
	static Logger Logger = org.apache.log4j.Logger.getLogger(UserMapperTest.class);
//	@Test
//	public void test1() {
//		SqlSession sqlSession = Mybatis.getSqlSession();
//		UserMapper userDao = sqlSession.getMapper(UserMapper.class);
//		List<User> users = userDao.getUsers();
//		for (User user : users) {
//			System.out.println(user);
//		}
//		sqlSession.close();
//	}
//	
//	@Test
//	public void test2() {
//		SqlSession sqlSession = Mybatis.getSqlSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("name", "–°");
//		List<User> users = userMapper.getUsersByName(map);
//		for (User user : users) {
//			System.out.println(user);
//		}
//		sqlSession.close();
//	}
	@Test
	public void testLog4j() {
		Logger.info("info");
		Logger.debug("debug");
		Logger.error("error");
	}
	
//	@Test
//	public void test3() {
//		SqlSession sqlSession = Mybatis.getSqlSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = new User(0,"–°¿Ó","2324354");
//		userMapper.insertUser(user);
//		sqlSession.commit();
//		sqlSession.close();
//	}
}
