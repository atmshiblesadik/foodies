package com.shiblesadik.foodies.controllers.customer;

import com.google.common.hash.Hashing;
import com.shiblesadik.foodies.models.users.Customer;
import com.shiblesadik.foodies.models.users.Registration;
import com.shiblesadik.foodies.repository.users.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

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
            Customer customerPhone = customerRepository.findByPhone(registration.getPhone());
            Customer customerEmail = customerRepository.findByEmail(registration.getEmail());
            if (customerPhone == null && customerEmail == null) {
                Customer customer = new Customer();
                String passSha256 = Hashing.sha256()
                        .hashString(registration.getPassword(), StandardCharsets.UTF_8).toString();
                customer.prepareForRegistration(registration.getPhone(), registration.getEmail(), passSha256);
                customerRepository.save(customer);
                httpServletResponse.setHeader("Location", "/customer/login");
            } else {
                if (customerPhone != null) {
                    System.out.println("Phone already taken");
                }
                if (customerEmail != null) {
                    System.out.println("Email already taken");
                }
                httpServletResponse.setHeader("Location", "/customer/registration");
            }
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
        String passSha256 = Hashing.sha256()
                .hashString(registration.getPassword(), StandardCharsets.UTF_8).toString();
        Customer customer = customerRepository.findByPhoneAndPassword(registration.getPhone(), passSha256);
        if (customer == null) {
            httpServletResponse.setHeader("Location", "/customer/login");
        } else {
            System.out.println("Login Success");
            System.out.println(customer.toString());
            httpServletResponse.setHeader("Location", "/");
        }
        httpServletResponse.setStatus(302);
    }
}
