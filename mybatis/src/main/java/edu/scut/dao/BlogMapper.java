package edu.scut.dao;

import java.util.List;
import java.util.Map;

import edu.scut.pojo.Blog;

public interface BlogMapper {
	public void insertBlog(Blog blog);
	public List<Blog> findBlogs(Map<String,Object> map);
	public List<Blog> findBlogsForeach(Map<String,Object> map);
}
