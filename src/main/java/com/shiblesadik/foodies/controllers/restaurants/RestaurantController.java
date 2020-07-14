package com.shiblesadik.foodies.controllers.restaurants;

import com.shiblesadik.foodies.repository.restaurants.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("/food/all")
    public String viewAllFoods(Model model) {
        model.addAttribute("type", "items");
        model.addAttribute("title", "All Foods");
        return "list-views";
    }

    @GetMapping("/food/{id}")
    public String viewFoodById(Model model, @PathVariable String id) {
        return "list-views";
    }

    @GetMapping("/category/all")
    public String viewAllCategories(Model model) {
        return "list-views";
    }

    @GetMapping("/category/{id}")
    public String viewCategoryById(Model model, @PathVariable String id) {
        return "list-views";
    }
}
