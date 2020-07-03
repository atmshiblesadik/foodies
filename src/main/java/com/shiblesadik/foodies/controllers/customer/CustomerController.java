package com.shiblesadik.foodies.controllers.customer;

import com.shiblesadik.foodies.models.users.Registration;
import com.shiblesadik.foodies.models.users.User;
import com.shiblesadik.foodies.repository.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        model.addAttribute("registration", new Registration());
        model.addAttribute("title", "Customer Registration");
        model.addAttribute("action", "/customer/registration");
        model.addAttribute("login", "/customer/login");
        return "registration";
    }

    @PostMapping("/registration")
    public void postRegistration(@ModelAttribute Registration registration, HttpServletResponse httpServletResponse) {
        boolean username = registration.isValidUsername();
        boolean email = registration.isValidEmail();
        boolean pass = registration.isValidPassword();
        if (username && email && pass) {
            User user = new User();
            user.prepareForRegistration(registration.getUsername(), registration.getEmail(), registration.getPassword());
            userRepository.insert(user);
            httpServletResponse.setHeader("Location", "/customer/login");
        } else {
            httpServletResponse.setHeader("Location", "/customer/registration");
        }
        httpServletResponse.setStatus(302);
    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("login", new Registration());
        model.addAttribute("title", "Customer Login");
        model.addAttribute("action", "/customer/login");
        model.addAttribute("forgotPass", "/customer/forgotpass");
        model.addAttribute("registration", "/customer/registration");
        return "login";
    }

    @PostMapping("/login")
    public void postLogin(@ModelAttribute Registration registration, HttpServletResponse httpServletResponse) {
        User user = userRepository.findByPhoneAndPassword(registration.getUsername(), registration.getPassword());
        if (user == null) {
            httpServletResponse.setHeader("Location", "/customer/login");
        } else {
            System.out.println("Login Success");
            httpServletResponse.setHeader("Location", "/");
        }
        httpServletResponse.setStatus(302);
    }
}
