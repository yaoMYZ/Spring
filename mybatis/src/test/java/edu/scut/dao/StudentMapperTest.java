package edu.scut.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import edu.scut.pojo.Student;
import edu.scut.utils.Mybatis;

public class StudentMapperTest {
//	static Logger Logger = org.apache.log4j.Logger.getLogger(StudentMapperTest.class);
//	@Test
//	public void testLog4j() {
//		Logger.info("info");
//		Logger.debug("debug");
//		Logger.error("error");
//	}
	
	@Test
	public void test() {
		SqlSession sqlSession = Mybatis.getSqlSession();
		StudentMapper stMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> stsList = stMapper.getStudents2();
		for (Student student : stsList) {
			System.out.println(student.toString());
		}
		sqlSession.close();
	}
}
