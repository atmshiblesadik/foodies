package com.shiblesadik.foodies.controllers.customer;

import com.shiblesadik.foodies.services.RegistrationValidation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        model.addAttribute("registrationValidation", new RegistrationValidation());
        model.addAttribute("title", "Customer Registration");
        model.addAttribute("action", "/customer/registration");
        model.addAttribute("login", "/customer/login");
        return "registration";
    }

    @PostMapping("/registration")
    public String postRegistration(@ModelAttribute RegistrationValidation registrationValidation) {
        System.out.println("username: " + registrationValidation.getUsername());
        System.out.println("email: " + registrationValidation.getEmail());
        System.out.println("password: " + registrationValidation.getPassword());
        System.out.println("confirm password: " + registrationValidation.getConfirmPassword());
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("title", "Customer Login");
        model.addAttribute("action", "/customer/login");
        model.addAttribute("forgotPass", "/customer/forgotpass");
        model.addAttribute("registration", "/customer/registration");
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(Model model) {
        model.addAttribute("title", "Customer Login");
        return "index";
    }
}
