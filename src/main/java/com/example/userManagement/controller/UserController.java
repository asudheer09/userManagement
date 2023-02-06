package com.example.userManagement.controller;

import com.example.userManagement.UserTO;
import com.example.userManagement.entity.User;
import com.example.userManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("welcome")
    public String welcomePage(){
        return "welcome";
    }

    @RequestMapping("userRegistration")
    public String userRegistration(Model model){
        model.addAttribute("command",new UserTO());
        return "userRegistration";
    }

    @RequestMapping("saveUserRegistration")
    public String saveUserRegistration(@ModelAttribute("userTO") UserTO userTO){
        User user= new User();
        user.setFirsName(userTO.getFirsName());
        user.setLastName(userTO.getLastName());
        user.setAddress(userTO.getAddress());

        userService.saveUser(user);

        return "success";

    }

}
