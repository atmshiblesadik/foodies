package com.shiblesadik.foodies.controllers.restaurants;

import com.shiblesadik.foodies.models.restaurants.Restaurant;
import com.shiblesadik.foodies.repository.restaurants.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/restaurant")
public class RestaurantsController {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("/all")
    public String viewAllRestaurants(Model model) {
        model.addAttribute("type", "restaurants");
        model.addAttribute("title", "Restaurants");
        List<Restaurant> restaurants = restaurantRepository.findAll();
        System.out.println("Size: " + restaurants.size());
        System.out.println(restaurants.toString());
        model.addAttribute(restaurants);
        return "restaurants";
    }

    @GetMapping("/view/{id}")
    public String viewRestaurant(Model model, @PathVariable String id) {
        Restaurant restaurant = restaurantRepository.findRestaurantById(id);
        model.addAttribute("type", "restaurant");
        model.addAttribute("title", "Restaurant-" + restaurant.getName());
        model.addAttribute(restaurant);
        return "restaurants";
    }

    @GetMapping("/find/{name}")
    public String findRestaurant(Model model, @PathVariable String name) {
        return "restaurants";
    }

    @GetMapping("/view/{name}/{foods}")
    public String viewAllFoods(Model model, @PathVariable String name, @PathVariable String foods) {
        model.addAttribute("type", "foods");
        model.addAttribute("title", "All Foods");
        return "restaurants";
    }

    @GetMapping("/view/{name}/category/all")
    public String viewAllCategories(Model model, @PathVariable String name) {
        model.addAttribute("type", "categories");
        model.addAttribute("title", "All Categories");
        return "restaurants";
    }

    @GetMapping("/category/{name}/category/{categoryName}")
    public String viewCategoryByName(Model model, @PathVariable String name, @PathVariable String categoryName) {
        model.addAttribute("type", "Category");
        model.addAttribute("title", "Category-" + name);
        return "restaurants";
    }

    @GetMapping("/add")
    public String addFoodGetRequest(Model model) {
        model.addAttribute("entity", new Restaurant());
        model.addAttribute("type", "add-restaurants");
        model.addAttribute("title", "Add Restaurant");
        model.addAttribute("modalTitle", "Add Restaurant");
        return "restaurants";
    }

    @PostMapping("/add")
    public void addFoodPostRequest(@ModelAttribute Restaurant restaurant, HttpServletResponse httpServletResponse) {
        restaurantRepository.save(restaurant);
        System.out.println("Restaurant Add Success");
        httpServletResponse.setHeader("Location", "/restaurant/all");
        httpServletResponse.setStatus(302);
    }
}
