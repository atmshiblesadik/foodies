package com.shiblesadik.foodies.models.foods;

import com.shiblesadik.foodies.models.restaurants.Restaurant;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "foods")
public class Food {
    @Id
    private String id;
    private String name;
    private Double price;
    private String categoryId;
    private Category category;
    private String restaurantId;
    private Restaurant restaurant;
    private String avatar;
    private String details;

    public Food() {
    }

    public Food(String id, String name, Double price, String categoryId, String restaurantId, String avatar,
                String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.restaurantId = restaurantId;
        this.avatar = avatar;
        this.details = details;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryId=" + categoryId +
                ", details='" + details + '\'' +
                '}';
    }
}
