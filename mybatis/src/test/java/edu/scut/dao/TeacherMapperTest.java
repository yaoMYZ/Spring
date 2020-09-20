package edu.scut.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import edu.scut.pojo.Teacher;
import edu.scut.utils.Mybatis;

public class TeacherMapperTest {
	@Test
	public void test() {
		SqlSession sqlSession = Mybatis.getSqlSession();
		TeacherMapper tMapper = sqlSession.getMapper(TeacherMapper.class);
		Teacher teacher = tMapper.getTeacher2(1);
		System.out.println(teacher);
		sqlSession.close();
	}
}
