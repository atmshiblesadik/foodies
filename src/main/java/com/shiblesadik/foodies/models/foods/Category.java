package com.shiblesadik.foodies.models.foods;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "categories")
public class Category {
    @Id
    private String id;
    private String name;
    private String details;
    private String avatar;
    private String numberOfFoods;
    private String numberOfRestaurants;
    private String[] foodsIds;
    private String[] restaurantsIds;

    public Category() {
    }

    public Category(String id, String name, String details, String avatar, String numberOfRestaurants, String numberOfFoods) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.avatar = avatar;
        this.numberOfRestaurants = numberOfRestaurants;
        this.numberOfFoods = numberOfFoods;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNumberOfRestaurants() {
        return numberOfRestaurants;
    }

    public void setNumberOfRestaurants(String numberOfRestaurants) {
        this.numberOfRestaurants = numberOfRestaurants;
    }

    public String getNumberOfFoods() {
        return numberOfFoods;
    }

    public void setNumberOfFoods(String numberOfFoods) {
        this.numberOfFoods = numberOfFoods;
    }

    public String[] getFoodsIds() {
        return foodsIds;
    }

    public void setFoodsIds(String[] foodsIds) {
        this.foodsIds = foodsIds;
    }

    public String[] getRestaurantsIds() {
        return restaurantsIds;
    }

    public void setRestaurantsIds(String[] restaurantsIds) {
        this.restaurantsIds = restaurantsIds;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", avatar='" + avatar + '\'' +
                ", numberOfRestaurants=" + numberOfRestaurants +
                ", numberOfFoods=" + numberOfFoods +
                ", foodsIds=" + Arrays.toString(foodsIds) +
                ", restaurantsIds=" + Arrays.toString(restaurantsIds) +
                '}';
    }
}
