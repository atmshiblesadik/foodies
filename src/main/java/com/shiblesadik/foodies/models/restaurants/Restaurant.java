package com.shiblesadik.foodies.models.restaurants;

import com.shiblesadik.foodies.models.areas.Area;
import com.shiblesadik.foodies.models.foods.Category;
import com.shiblesadik.foodies.models.foods.Food;
import com.shiblesadik.foodies.models.orders.Order;
import com.shiblesadik.foodies.models.reviews.Complaint;
import com.shiblesadik.foodies.models.reviews.Review;
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
    private String avatar;
    private String areaId;
    private String areaCode;
    private Area area;
    private Double rating;
    private Integer numberOfFoods;
    private Integer numberOfCategories;
    private Integer numberOfOrders;
    private String[] foodsIds;
    private Food[] foods;
    private String[] categoriesIds;
    private Category[] categories;
    private String[] ordersIds;
    private Order[] orders;
    private String[] reviewsIds;
    private Review[] reviews;
    private String[] complaintsIds;
    private Complaint[] complaints;

    public Restaurant() {
    }

    public Restaurant(String id, String name, String email, String[] phones, String avatar, String areaId,
                      String areaCode, Double rating, Integer numberOfFoods, Integer numberOfCategories,
                      Integer numberOfOrders, String[] foodsIds, String[] categoriesIds, String[] ordersIds,
                      String[] reviewsIds, String[] complaintsIds) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phones = phones;
        this.avatar = avatar;
        this.areaId = areaId;
        this.areaCode = areaCode;
        this.rating = rating;
        this.numberOfFoods = numberOfFoods;
        this.numberOfCategories = numberOfCategories;
        this.numberOfOrders = numberOfOrders;
        this.foodsIds = foodsIds;
        this.categoriesIds = categoriesIds;
        this.ordersIds = ordersIds;
        this.reviewsIds = reviewsIds;
        this.complaintsIds = complaintsIds;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getNumberOfFoods() {
        return numberOfFoods;
    }

    public void setNumberOfFoods(Integer numberOfFoods) {
        this.numberOfFoods = numberOfFoods;
    }

    public Integer getNumberOfCategories() {
        return numberOfCategories;
    }

    public void setNumberOfCategories(Integer numberOfCategories) {
        this.numberOfCategories = numberOfCategories;
    }

    public Integer getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(Integer numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public String[] getFoodsIds() {
        return foodsIds;
    }

    public void setFoodsIds(String[] foodsIds) {
        this.foodsIds = foodsIds;
    }

    public String[] getCategoriesIds() {
        return categoriesIds;
    }

    public void setCategoriesIds(String[] categoriesIds) {
        this.categoriesIds = categoriesIds;
    }

    public String[] getOrdersIds() {
        return ordersIds;
    }

    public void setOrdersIds(String[] ordersIds) {
        this.ordersIds = ordersIds;
    }

    public String[] getReviewsIds() {
        return reviewsIds;
    }

    public void setReviewsIds(String[] reviewsIds) {
        this.reviewsIds = reviewsIds;
    }

    public String[] getComplaintsIds() {
        return complaintsIds;
    }

    public void setComplaintsIds(String[] complaintsIds) {
        this.complaintsIds = complaintsIds;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public Complaint[] getComplaints() {
        return complaints;
    }

    public void setComplaints(Complaint[] complaints) {
        this.complaints = complaints;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", avatar='" + avatar + '\'' +
                ", areaId='" + areaId + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", rating=" + rating +
                ", numberOfFoods=" + numberOfFoods +
                ", numberOfCategories=" + numberOfCategories +
                ", numberOfOrders=" + numberOfOrders +
                ", foodsIds=" + Arrays.toString(foodsIds) +
                ", categoriesIds=" + Arrays.toString(categoriesIds) +
                ", ordersIds=" + Arrays.toString(ordersIds) +
                ", reviewsIds=" + Arrays.toString(reviewsIds) +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                '}';
    }
}
