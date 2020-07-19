package com.shiblesadik.foodies.models.orders;

import com.shiblesadik.foodies.models.datetime.DateTime;
import com.shiblesadik.foodies.models.foods.Food;

import java.util.Arrays;

public class Order extends OrderProcessing {
    private String id;
    private String userId;
    private String raiderId;
    private String restaurantId;
    private Food[] foods;
    private String instruction;
    private Double totalAmount;
    private Double discountAmount;
    private Double finalAmount;
    private Integer raiderRating;
    private Integer foodRating;
    private String complaintAgainstRaiderId;
    private String complaintAgainstFoodId;
    private String complaintAgainstRestaurantId;
    private String reviewId;

    public Order() {
    }

    public Order(DateTime orderPlaced, DateTime raiderReceiveOrder, DateTime restaurantReceiveOrder, DateTime foodComplete,
                 DateTime raiderReceiveFood, DateTime orderDelivery, String id, String userId, String raiderId,
                 String restaurantId, Food[] foods, String instruction, Double totalAmount, Double discountAmount,
                 Double finalAmount, Integer raiderRating, Integer foodRating, String complaintAgainstRaiderId,
                 String complaintAgainstFoodId, String complaintAgainstRestaurantId, String reviewId) {
        super(orderPlaced, raiderReceiveOrder, restaurantReceiveOrder, foodComplete, raiderReceiveFood, orderDelivery);
        this.id = id;
        this.userId = userId;
        this.raiderId = raiderId;
        this.restaurantId = restaurantId;
        this.foods = foods;
        this.instruction = instruction;
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.finalAmount = finalAmount;
        this.raiderRating = raiderRating;
        this.foodRating = foodRating;
        this.complaintAgainstRaiderId = complaintAgainstRaiderId;
        this.complaintAgainstFoodId = complaintAgainstFoodId;
        this.complaintAgainstRestaurantId = complaintAgainstRestaurantId;
        this.reviewId = reviewId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRaiderId() {
        return raiderId;
    }

    public void setRaiderId(String raiderId) {
        this.raiderId = raiderId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Integer getRaiderRating() {
        return raiderRating;
    }

    public void setRaiderRating(Integer raiderRating) {
        this.raiderRating = raiderRating;
    }

    public Integer getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(Integer foodRating) {
        this.foodRating = foodRating;
    }

    public String getComplaintAgainstRaiderId() {
        return complaintAgainstRaiderId;
    }

    public void setComplaintAgainstRaiderId(String complaintAgainstRaiderId) {
        this.complaintAgainstRaiderId = complaintAgainstRaiderId;
    }

    public String getComplaintAgainstFoodId() {
        return complaintAgainstFoodId;
    }

    public void setComplaintAgainstFoodId(String complaintAgainstFoodId) {
        this.complaintAgainstFoodId = complaintAgainstFoodId;
    }

    public String getComplaintAgainstRestaurantId() {
        return complaintAgainstRestaurantId;
    }

    public void setComplaintAgainstRestaurantId(String complaintAgainstRestaurantId) {
        this.complaintAgainstRestaurantId = complaintAgainstRestaurantId;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", raiderId='" + raiderId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", foods=" + Arrays.toString(foods) +
                ", instruction='" + instruction + '\'' +
                ", totalAmount=" + totalAmount +
                ", discountAmount=" + discountAmount +
                ", finalAmount=" + finalAmount +
                ", raiderRating=" + raiderRating +
                ", foodRating=" + foodRating +
                ", complaintAgainstRaiderId='" + complaintAgainstRaiderId + '\'' +
                ", complaintAgainstFoodId='" + complaintAgainstFoodId + '\'' +
                ", complaintAgainstRestaurantId='" + complaintAgainstRestaurantId + '\'' +
                ", reviewId='" + reviewId + '\'' +
                super.toString() + " " +
                '}';
    }
}
