package com.shiblesadik.foodies.models.reviews;

import org.springframework.data.annotation.Id;

public class Investigate {
    @Id
    private Integer id;
    private Integer customerId;
    private Integer raiderId;
    private Integer restaurantId;
    private Integer orderId;
    private Integer details;

    public Investigate() {
    }

    public Investigate(Integer id, Integer customerId, Integer raiderId, Integer restaurantId, Integer orderId, Integer details) {
        this.id = id;
        this.customerId = customerId;
        this.raiderId = raiderId;
        this.restaurantId = restaurantId;
        this.orderId = orderId;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getRaiderId() {
        return raiderId;
    }

    public void setRaiderId(Integer raiderId) {
        this.raiderId = raiderId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDetails() {
        return details;
    }

    public void setDetails(Integer details) {
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
