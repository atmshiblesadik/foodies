package com.shiblesadik.foodies.controllers.raider;

import com.google.common.hash.Hashing;
import com.shiblesadik.foodies.models.users.Raider;
import com.shiblesadik.foodies.models.users.Registration;
import com.shiblesadik.foodies.repository.users.RaiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/raider")
public class RaiderController {
    @Autowired
    private RaiderRepository raiderRepository;

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        model.addAttribute("registration", new Registration());
        model.addAttribute("title", "Raider Registration");
        model.addAttribute("action", "/raider/registration");
        model.addAttribute("login", "/raider/login");
        return "registration";
    }

    @PostMapping("/registration")
    public void postRegistration(@ModelAttribute Registration registration, HttpServletResponse httpServletResponse) {
        boolean username = registration.isValidUsername();
        boolean email = registration.isValidEmail();
        boolean pass = registration.isValidPassword();
        if (username && email && pass) {
            Raider raiderPhone = raiderRepository.findByPhone(registration.getPhone());
            Raider raiderEmail = raiderRepository.findByEmail(registration.getEmail());
            if (raiderPhone == null && raiderEmail == null) {
                Raider raider = new Raider();
                String passSha256 = Hashing.sha256()
                        .hashString(registration.getPassword(), StandardCharsets.UTF_8).toString();
                raider.prepareForRegistration(registration.getPhone(), registration.getEmail(), passSha256);
                raiderRepository.save(raider);
                httpServletResponse.setHeader("Location", "/raider/login");
            } else {
                if (raiderPhone != null) {
                    System.out.println("Phone already taken");
                }
                if (raiderEmail != null) {
                    System.out.println("Email already taken");
                }
                httpServletResponse.setHeader("Location", "/raider/registration");
            }
        } else {
            httpServletResponse.setHeader("Location", "/raider/registration");
        }
        httpServletResponse.setStatus(302);
    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("login", new Registration());
        model.addAttribute("title", "Raider Login");
        model.addAttribute("action", "/raider/login");
        model.addAttribute("forgotPass", "/raider/forgotpass");
        model.addAttribute("registration", "/raider/registration");
        return "login";
    }

    @PostMapping("/login")
    public void postLogin(@ModelAttribute Registration registration, HttpServletResponse httpServletResponse) {
        String passSha256 = Hashing.sha256()
                .hashString(registration.getPassword(), StandardCharsets.UTF_8).toString();
        Raider raider = raiderRepository.findByPhoneAndPassword(registration.getPhone(), passSha256);
        if (raider == null) {
            httpServletResponse.setHeader("Location", "/raider/login");
        } else {
            System.out.println("Login Success");
            System.out.println(raider.toString());
            httpServletResponse.setHeader("Location", "/");
        }
        httpServletResponse.setStatus(302);
    }
}
