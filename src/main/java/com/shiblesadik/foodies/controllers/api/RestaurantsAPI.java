package com.shiblesadik.foodies.controllers.api;

import com.google.common.hash.Hashing;
import com.shiblesadik.foodies.models.areas.Area;
import com.shiblesadik.foodies.models.restaurants.Restaurant;
import com.shiblesadik.foodies.repositories.areas.AreaRepository;
import com.shiblesadik.foodies.repositories.restaurants.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantsAPI {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private AreaRepository areaRepository;

    @GetMapping("/view/all")
    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    @GetMapping("/view/id/{id}")
    public Optional<Restaurant> getById(@PathVariable String id) {
        return restaurantRepository.findById(id);
    }

    @GetMapping("/view/city/{cityId}")
    public List<Restaurant> getAllByCityId(@PathVariable String cityId) {
        List<Area> areaList = areaRepository.findAllByCityId(cityId);
        List<Restaurant> restaurantList = new LinkedList<>();
        for (Area area: areaList) {
            List<Restaurant> restaurantList1 = restaurantRepository.findAllByAreaId(area.getId());
            if (restaurantList1 != null) {
                restaurantList.addAll(restaurantList1);
            }
        }
        return restaurantList;
    }

    @GetMapping("/view/area/{areId}")
    public List<Restaurant> getAllByAreaId(@PathVariable String areaId) {
        return restaurantRepository.findAllByAreaId(areaId);
    }

    @GetMapping("/find/{name}")
    public List<Restaurant> getAllByName(@PathVariable String name) {
        return restaurantRepository.findAllByNameIsLike(name);
    }

    @PostMapping("/insert")
    public Restaurant insert(@RequestBody Restaurant restaurant) {
        Restaurant restaurant1 = restaurantRepository.findByPhone(restaurant.getPhone());
        if (restaurant1 != null) return null;
        restaurant1 = restaurantRepository.findByEmail((restaurant.getEmail()));
        if (restaurant1 != null) return null;
        if (!restaurant.getPassword().equals(restaurant.getConfirmPassword()) || restaurant.getPassword().length() < 6)
            return null;
        String passSha256 = Hashing.sha256()
                .hashString(restaurant.getPassword(), StandardCharsets.UTF_8).toString();
        restaurant.setPassword(passSha256);
        restaurant.setConfirmPassword(null);
        restaurant.setNumberOfOrders(0);
        restaurant.setNumberOfFoods(0);
        restaurant.setNumberOfCategories(0);
        restaurant.setRating(0.00);
        restaurantRepository.save(restaurant);
        return restaurant;
    }
}
