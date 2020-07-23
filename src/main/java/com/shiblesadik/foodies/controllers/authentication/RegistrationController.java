package com.shiblesadik.foodies.controllers.authentication;

import com.google.common.hash.Hashing;
import com.shiblesadik.foodies.models.areas.Area;
import com.shiblesadik.foodies.models.users.Customer;
import com.shiblesadik.foodies.models.users.UserRegistrationModel;
import com.shiblesadik.foodies.repositories.areas.AreaRepository;
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
import java.util.List;

@Controller
@RequestMapping("/auth/registration")
public class RegistrationController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AreaRepository areaRepository;

    /* Customers */
    @GetMapping("/customer")
    public String customerRegistrationGetRequest(Model model) {
        model.addAttribute("registration", new UserRegistrationModel());
        model.addAttribute("title", "Customer Registration");
        model.addAttribute("id", "customer-registration");
        model.addAttribute("action", "/auth/registration/customer");
        model.addAttribute("login", "/auth/login/customer");
        return "customer";
    }

    @PostMapping("/customer")
    public void customerRegistrationPostRequest(@ModelAttribute UserRegistrationModel userRegistrationModel,
                                                HttpServletResponse httpServletResponse) {
        Customer checkCustomer = customerRepository.findByPhone(userRegistrationModel.getPhone());
        boolean alreadyExists = true;
        if (checkCustomer == null) {
            alreadyExists = false;
        }
        if (!alreadyExists) {
            String passSha256 = Hashing.sha256()
                    .hashString(userRegistrationModel.getPassword(), StandardCharsets.UTF_8).toString();
            userRegistrationModel.setPassword(passSha256);
            userRegistrationModel.setConfirmPassword(null);
            Customer customer = new Customer();
            customer.preparedForRegistration(userRegistrationModel);;
            customerRepository.save(customer);
            System.out.println("Customer Registration Successfully: " + customer.toString());
            httpServletResponse.setHeader("Location", "/auth/login/customer");
        } else {
            System.out.println("Phone Number Already Used");
            httpServletResponse.setHeader("Location", "/auth/registration/customer");
        }
        httpServletResponse.setStatus(302);
    }
    /* Customers */

    /* Raiders */
    /* Raiders */

    /* Admins */
    /* Admins */

    /* Restaurants */
    /* Restaurants */

    /* Categories */
    /* Categories */

    /* Foods */
    /* Foods */

    /* Orders */
    /* Orders */

    /* Reviews */
    /* Reviews */

    /* Complaints */
    /* Complaints */

    /* Area */
    @GetMapping("/area")
    public String areaRegistrationGetRequest(Model model) {
        model.addAttribute("registration", new Area());
        model.addAttribute("title", "Area Registration");
        model.addAttribute("id", "area-registration");
        model.addAttribute("action", "/auth/registration/area");
        return "area";
    }

    @PostMapping("/area")
    public void areaRegistrationPostRequest(@ModelAttribute Area area, HttpServletResponse httpServletResponse) {
        List<Area> areas = areaRepository.findAllByCity(area.getCity());
        boolean alreadyExists = false;
        for (Area a: areas) {
            if (a.getName().toLowerCase().equals(area.getName().toLowerCase())) {
                alreadyExists = true;
                break;
            }
        }
        if (!alreadyExists) {
            areaRepository.save(area);
            System.out.println("Area Insert Successfully: " + area.toString());
            httpServletResponse.setHeader("Location", "/");
        } else {
            System.out.println("Already Exists This Area");
            httpServletResponse.setHeader("Location", "/auth/registration/area");
        }
        httpServletResponse.setStatus(302);
    }
    /* Area */
}
