package cn.cdp.rjfy.controller;

import cn.cdp.rjfy.dao.Dao;
import cn.cdp.rjfy.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    Dao dao;


    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute Admin admin, HttpSession session, Model model){
        Admin admin1 = dao.getAdmin(admin.getAccount(),admin.getPassword());
        if(admin1 != null){
            session.setAttribute("admin",admin1);
            return "redirect:test";
        }else {
            model.addAttribute("error","用户名或密码错误！！");
            return "login";
        }
    }
}
