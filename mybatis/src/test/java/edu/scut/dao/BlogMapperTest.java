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
//		blog.setAuthor("李婷");
//		blog.setCreateTime(new Date());
//		blog.setTitle("mybatis学习");
//		blog.setViews(2);
//		bMapper.insertBlog(blog);
//		
//		blog.setAuthor("史蒂夫");
//		blog.setCreateTime(new Date());
//		blog.setTitle("java学习");
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
//		map.put("author", "李");
//		map.put("title", "学习");
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
