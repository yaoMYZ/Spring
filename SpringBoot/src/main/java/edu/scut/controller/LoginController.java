package edu.scut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        if (!StringUtils.isEmpty(email) && "123".equals(password)) {
            session.setAttribute("loginUser",email);
            return "redirect:main.html";
        } else {
            model.addAttribute("msg", "用户名或者名密码错误");
            return "index";
        }
    }
}
