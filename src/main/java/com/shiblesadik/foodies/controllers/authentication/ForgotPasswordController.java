package com.shiblesadik.foodies.controllers.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth/recover/")
public class ForgotPasswordController {

    /* Customers */
    @GetMapping("/customer")
    public String customer() {
        return "index";
    }
    /* Customers */
}
