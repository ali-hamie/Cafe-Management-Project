package com.example.swen261cafemanagement.controllers;


import com.example.swen261cafemanagement.models.User;
import com.example.swen261cafemanagement.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        if (userService.authenticate(email, password)) {
            return "redirect:/dashboard"; // Redirection propre
        } else {
            model.addAttribute("errorMsg", "Email or password incorrect");
            return "login";
        }

    }
}
