package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String login(User user, String kaptcha, HttpSession session){
        String yzm=(String) session.getAttribute("kaptcha");
        user=userService.selectOneUser(user);
        if(yzm.equalsIgnoreCase(kaptcha)){
            session.setAttribute("user",user);
            return "redirect:/main/main.jsp";
        }
        return null;
    }



}
