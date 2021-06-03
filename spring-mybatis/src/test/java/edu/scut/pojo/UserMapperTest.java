package edu.scut.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.scut.mapper.UserMapper;


public class UserMapperTest {
	static Logger Logger = org.apache.log4j.Logger.getLogger(UserMapperTest.class);

	@Test
	public void test1() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserMapper userMapper=(UserMapper) context.getBean("userMapper");
		for (User user : userMapper.getUsers()) {
			System.out.println(user);
		}
	}

}
