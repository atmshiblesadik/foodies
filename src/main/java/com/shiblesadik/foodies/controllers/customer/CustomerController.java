package com.shiblesadik.foodies.controllers.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        model.addAttribute("title", "Customer Registration");
        return "registration";
    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("title", "Customer Login");
        return "login";
    }
}
