package com.shiblesadik.foodies.models.restaurants;

import com.shiblesadik.foodies.models.areas.Address;
import com.shiblesadik.foodies.models.foods.Item;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "restaurants")
public class Restaurant {
    @Id
    private String id;
    private String name;
    private String email;
    private String[] phones;
    private String location;
    private Address address;
    private Item[] items;
    private Double rating;
    private String avatar;
    private String[] reviews;
    private String[] orders;
    private String details;
    private String[] openingTime;

    public Restaurant() {
    }

    public Restaurant(String id, String name, String email, String[] phones, String location, Address address, Item[] items,
                      Double rating, String avatar, String[] reviews, String[] orders, String details,
                      String[] openingTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phones = phones;
        this.location = location;
        this.address = address;
        this.items = items;
        this.rating = rating;
        this.avatar = avatar;
        this.reviews = reviews;
        this.orders = orders;
        this.details = details;
        this.openingTime = openingTime;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String[] getReviews() {
        return reviews;
    }

    public void setReviews(String[] reviews) {
        this.reviews = reviews;
    }

    public String[] getOrders() {
        return orders;
    }

    public void setOrders(String[] orders) {
        this.orders = orders;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String[] getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String[] openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", address=" + address +
                ", items=" + Arrays.toString(items) +
                ", rating=" + rating +
                ", avatar='" + avatar + '\'' +
                ", reviews=" + Arrays.toString(reviews) +
                ", orders=" + Arrays.toString(orders) +
                ", details='" + details + '\'' +
                ", openingTime=" + Arrays.toString(openingTime) +
                '}';
    }
}
