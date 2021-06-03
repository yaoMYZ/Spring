package com.wsl.controller;

import com.wsl.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
public class LoginController {

    @RequestMapping("/login")
    public String login(User user, Model model) {
        //用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getUsername(),
                user.getPassword()
        );
        String msg=null;
        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(usernamePasswordToken);

        } catch (UnknownAccountException e) {
            log.error("用户名不存在！", e);
            msg = "用户名不存在！";
        } catch (AuthenticationException e) {
            log.error("密码错误！", e);
            msg = "密码错误！";
        } catch (AuthorizationException e) {
            log.error("没有权限！", e);
            msg = "没有权限";
        }
        if(msg==null)
            return "redirect:index";
        else{
            model.addAttribute("msg", msg);
            return "login";
        }
    }

    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    @RequiresRoles("admin")
    @GetMapping("/admin")
    public String admin() {
        return "util/admin";
    }

    @GetMapping("/index")
    public String index() {
        return "util/index";
    }

    @RequiresPermissions("add")
    @GetMapping("/add")
    public String add() {
        return "util/add";
    }

    @RequestMapping("/unauth")
    public String unauthorized() {
        return "util/myerror";
    }

}
