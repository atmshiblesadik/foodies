package com.shiblesadik.foodies.models.foods;

import java.util.Arrays;

public class Item {
    private String name;
    private Double price;
    private String[] categoriesId;
    private String avatar;
    private String details;

    public Item() {
    }

    public Item(String name, Double price, String[] categoriesId, String avatar, String details) {
        this.name = name;
        this.price = price;
        this.categoriesId = categoriesId;
        this.avatar = avatar;
        this.details = details;
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
        this.price = price;
    }

    public String[] getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(String[] categoriesId) {
        this.categoriesId = categoriesId;
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
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoriesId=" + Arrays.toString(categoriesId) +
                ", details='" + details + '\'' +
                '}';
    }
}
