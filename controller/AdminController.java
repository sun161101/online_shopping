package com.sun.online_shopping.controller;

import com.sun.online_shopping.model.Admin;
import com.sun.online_shopping.service.IAdminService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @RequestMapping(value = "{id}/show",method = RequestMethod.GET)
    public String load(@PathVariable int id, Model model){
        Admin admin = adminService.load(id);
        model.addAttribute(admin);
        return "admin/list";
    }
}
