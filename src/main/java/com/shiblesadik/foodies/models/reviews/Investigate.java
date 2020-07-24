package com.shiblesadik.foodies.models.reviews;

import org.springframework.data.annotation.Id;

public class Investigate {
    @Id
    private String id;
    private String customerId;
    private String raiderId;
    private String restaurantId;
    private String orderId;
    private String details;

    public Investigate() {
    }

    public Investigate(String id, String customerId, String raiderId, String restaurantId, String orderId, String details) {
        this.id = id;
        this.customerId = customerId;
        this.raiderId = raiderId;
        this.restaurantId = restaurantId;
        this.orderId = orderId;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Investigate{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", raiderId='" + raiderId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
