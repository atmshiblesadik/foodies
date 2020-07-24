package com.shiblesadik.foodies.controllers.authentication;

import com.google.common.hash.Hashing;
import com.shiblesadik.foodies.models.users.Customer;
import com.shiblesadik.foodies.models.users.UserRegistrationModel;
import com.shiblesadik.foodies.repositories.users.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/auth/login/")
public class LoginController {
    @Autowired
    private CustomerRepository customerRepository;

    /* Customers */
    @GetMapping("/customer")
    public String customerLoginGetRequest(Model model) {
        model.addAttribute("login", new UserRegistrationModel());
        model.addAttribute("title", "Customer Login");
        model.addAttribute("id", "customer-login");
        model.addAttribute("action", "/auth/login/customer");
        model.addAttribute("forgotPass", "/auth/recover/customer");
        model.addAttribute("registration", "/auth/registration/customer");
        return "customer";
    }

    @PostMapping("/customer")
    public void customerLoginPostRequest(@ModelAttribute UserRegistrationModel userRegistrationModel,
                                         HttpServletResponse httpServletResponse) {
        String passSha256 = Hashing.sha256()
                .hashString(userRegistrationModel.getPassword(), StandardCharsets.UTF_8).toString();
        Customer customer = customerRepository.findByPhoneAndAndPassword(userRegistrationModel.getPhone(), passSha256);
        if (customer != null && customer.getPhone().equals(userRegistrationModel.getPhone())) {
            System.out.println("Login successfully");
            httpServletResponse.setHeader("Location", "/");
        } else {
            System.out.println("Credential not matching");
            httpServletResponse.setHeader("Location", "/auth/login/customer");
        }
        httpServletResponse.setStatus(302);
    }
    /* Customers */
}
