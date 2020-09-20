package edu.scut.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import edu.scut.pojo.Blog;
import edu.scut.utils.Mybatis;

public class BlogMapperTest {
	
//	@Test
//	public void test() {
//		SqlSession sqlSession = Mybatis.getSqlSession();
//		BlogMapper bMapper = sqlSession.getMapper(BlogMapper.class);
//		Blog blog= new Blog();
//		blog.setAuthor("����");
//		blog.setCreateTime(new Date());
//		blog.setTitle("mybatisѧϰ");
//		blog.setViews(2);
//		bMapper.insertBlog(blog);
//		
//		blog.setAuthor("ʷ�ٷ�");
//		blog.setCreateTime(new Date());
//		blog.setTitle("javaѧϰ");
//		blog.setViews(3);
//		bMapper.insertBlog(blog);
//		
//		sqlSession.commit();
//		sqlSession.close();
//	}
	
//	@Test
//	public void test() {
//		SqlSession sqlSession = Mybatis.getSqlSession();
//		BlogMapper bMapper = sqlSession.getMapper(BlogMapper.class);
//		
//		Map<String, Object> map = new HashMap<String,Object>();
//		map.put("author", "��");
//		map.put("title", "ѧϰ");
//	    List<Blog> blogs = bMapper.findBlogs(map);
//	    for (Blog blog : blogs) {
//	    	System.out.println(blog);
//		}
//		sqlSession.close();
//	}
	
	@Test
	public void test() {
		SqlSession sqlSession = Mybatis.getSqlSession();
		BlogMapper bMapper = sqlSession.getMapper(BlogMapper.class);
		
		Map<String, Object> map = new HashMap<String,Object>();
		ArrayList<Integer> idsArrayList = new ArrayList<Integer>();
		idsArrayList.add(1);
		map.put("ids", idsArrayList);
	    List<Blog> blogs = bMapper.findBlogsForeach(map);
	    for (Blog blog : blogs) {
	    	System.out.println(blog);
		}
		sqlSession.close();
	}
}
