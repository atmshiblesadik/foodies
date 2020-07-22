package com.shiblesadik.foodies.models.foods;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "foods")
public class Food {
    @Id
    private Integer id;
    private String name;
    private Double price;
    private Integer categoryId;
    private Integer areaId;
    private Integer restaurantId;
    private String avatar;
    private String details;

    public Food() {
    }

    public Food(Integer id, String name, Double price, Integer categoryId, Integer areaId, Integer restaurantId,
                String avatar, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.areaId = areaId;
        this.restaurantId = restaurantId;
        this.avatar = avatar;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
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
