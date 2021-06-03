package edu.scut.controller;

import edu.scut.dao.UserMapper;
import edu.scut.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("allUsers")
    public String getAllUsers(){
        return userMapper.getAllUsers().toString();
    }

    @GetMapping("user/{id}")
    public String getUser(@PathVariable("id") int id){
        User user=userMapper.getUserById(id);
        if(user==null)
            return "null";
        else
            return user.toString();
    }

    @RequestMapping("addUser")
    public String addUser(){
        userMapper.addUser(new User(4,"五五","1234"));
        return userMapper.getAllUsers().toString();
    }

    @RequestMapping("upUser")
    public String updateUser(){
        userMapper.updateUser(new User(3,"小凯","1234"));
        return userMapper.getAllUsers().toString();
    }

    @RequestMapping("delUser")
    public String deleteUser(){
        userMapper.deleteUser(4);
        return userMapper.getAllUsers().toString();
    }
}
