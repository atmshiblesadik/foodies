package com.shiblesadik.foodies.controllers.customer;

import com.shiblesadik.foodies.models.users.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        model.addAttribute("registration", new Registration());
        model.addAttribute("title", "Customer Registration");
        model.addAttribute("action", "/customer/registration");
        model.addAttribute("login", "/customer/login");
        return "registration";
    }

    @PostMapping("/registration")
    public void postRegistration(@ModelAttribute Registration registration,
                                 HttpServletResponse httpServletResponse) {
        boolean username = registration.isValidUsername();
        boolean email = registration.isValidEmail();
        boolean pass = registration.isValidPassword();
        if (username && email && pass) {
            httpServletResponse.setHeader("Location", "/customer/login");
        } else {
            httpServletResponse.setHeader("Location", "/customer/registration");
        }
        httpServletResponse.setStatus(302);
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
