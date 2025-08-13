package com.struts.strutsdemoproject.controller;

import com.struts.strutsdemoproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/username")
    public String index(Model model) {
        model.addAttribute("user", new User());

        return "index";
    }

    @PostMapping("/username")
    public String submitForm(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);

        if (!user.getUsername().equals("Shradha")) {
            return "redirect:/error";
        }

        return "welcome";
    }

}
