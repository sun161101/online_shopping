package com.sun.online_shopping.controller;

import com.sun.online_shopping.model.User;
import com.sun.online_shopping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zmzy on 2017/2/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public String list(){
        return "user/list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "user/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){
        userService.add(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/{id}/show")
    public String show(@PathVariable int id,Model model){
        User user = userService.load(id);
        model.addAttribute("show",user);
        return "user/show";
    }
}
