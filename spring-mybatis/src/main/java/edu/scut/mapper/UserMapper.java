package edu.scut.mapper;

import java.util.List;
import java.util.Map;

import edu.scut.pojo.User;

public interface UserMapper {
	public List<User> getUsers();
	public List<User> getUsersByName(Map<String,Object> map);
	public void insertUser(User user);
}
