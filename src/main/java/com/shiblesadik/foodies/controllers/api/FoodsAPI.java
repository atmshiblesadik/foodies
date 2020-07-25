package com.shiblesadik.foodies.controllers.api;

import com.shiblesadik.foodies.models.areas.Area;
import com.shiblesadik.foodies.models.foods.Category;
import com.shiblesadik.foodies.models.foods.Food;
import com.shiblesadik.foodies.models.restaurants.Restaurant;
import com.shiblesadik.foodies.repositories.areas.AreaRepository;
import com.shiblesadik.foodies.repositories.foods.CategoryRepository;
import com.shiblesadik.foodies.repositories.foods.FoodRepository;
import com.shiblesadik.foodies.repositories.restaurants.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/food")
public class FoodsAPI {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private AreaRepository areaRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("/category/all")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/category/view/{id}")
    public Optional<Category> getCategoryById(@PathVariable String id) {
        return categoryRepository.findById(id);
    }

    @GetMapping("/category/find/{name}")
    public List<Category> findCategoryByName(@PathVariable String name) {
        return categoryRepository.findAllByNameIsLike(name);
    }

    @PostMapping("/category/insert")
    public Category insertCategory(@RequestBody Category category) {
        category.setNumberOfFoods(0);
        category.setNumberOfRestaurants(0);
        List<Category> categoryList = categoryRepository.findAllByNameIsLike(category.getName());
        for (Category cat: categoryList) {
            if (cat.getName().equals(category.getName())) {
                return null;
            }
        }
        categoryRepository.save(category);
        return category;
    }

    @GetMapping("/view/all")
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    @GetMapping("/view/{id}")
    public Optional<Food> getFoodById(@PathVariable String id) {
        return foodRepository.findById(id);
    }

    @GetMapping("/find/{name}")
    public List<Food> findFoodByName(@PathVariable String name) {
        return foodRepository.findAllByNameIsLike(name);
    }

    @GetMapping("/restaurant/{id}/view")
    public List<Food> viewFoodByRestaurantId(@PathVariable String id) {
        return foodRepository.findAllByRestaurantId(id);
    }

    @GetMapping("/restaurant/{id}/find/{name}")
    public List<Food> findFoodByRestaurantIdAndName(@PathVariable String id, @PathVariable String name) {
        return foodRepository.findAllByRestaurantIdAndNameIsLike(id, name);
    }

    @GetMapping("/area/{id}/view")
    public List<Food> findFoodByAreaId(@PathVariable String id) {
        return foodRepository.findAllByAreaId(id);
    }

    @GetMapping("/area/{id}/find/{name}")
    public List<Food> findFoodByAreaIdAndName(@PathVariable String id, @PathVariable String name) {
        return foodRepository.findAllByAreaIdAndNameIsLike(id, name);
    }

    @GetMapping("/category/{id}/view")
    public List<Food> findFoodByCategoryId(@PathVariable String id) {
        return foodRepository.findAllByCategoryId(id);
    }

    @GetMapping("/category/{id}/find/{name}")
    public List<Food> findFoodByCategoryIdAndName(@PathVariable String id, @PathVariable String name) {
        return foodRepository.findAllByCategoryIdAndNameIsLike(id, name);
    }

    @GetMapping("/restaurant/{resId}/category/{catId}")
    public List<Food> findFoodByRestaurantIdAndCategoryId(@PathVariable String resId, @PathVariable String catId) {
        return foodRepository.findAllByRestaurantIdAndCategoryId(resId, catId);
    }

    @GetMapping("/area/{areaId}/category/{catId}")
    public List<Food> findFoodByAreaIdAndCategoryId(@PathVariable String areaId, @PathVariable String catId) {
        return foodRepository.findAllByAreaIdAndCategoryId(areaId, catId);
    }

    @PostMapping("/insert")
    public Food insertFood(@RequestBody Food food) {
        Optional<Category> category = categoryRepository.findAllById(food.getCategoryId());
        Optional<Area> area = areaRepository.findById(food.getAreaId());
        Optional<Restaurant> restaurant = restaurantRepository.findById(food.getRestaurantId());
        if (category.toString().equals("Optional.empty") || area.toString().equals("Optional.empty")
                || restaurant.toString().equals("Optional.empty") || food.getPrice() < 1.0) {
            return null;
        }
        foodRepository.save(food);
        return food;
    }
}
