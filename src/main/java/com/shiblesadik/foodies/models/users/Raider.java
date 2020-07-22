package com.shiblesadik.foodies.models.users;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "raiders")
public class Raider extends User {
    private Double rating;
    private boolean available;
    private boolean onDuty;
    private Integer numberOfOrder;
    private Integer[] ordersIds;
    private Integer[] reviewsIds;
    private Integer[] complaintsIds;
    private Integer lastOrderId;

    public Raider() {
    }

    public Raider(Integer id, String name, String email, String[] phone, String avatar, Integer areaId,
                  Double rating, boolean available, boolean onDuty, Integer numberOfOrder, Integer[] ordersIds,
                  Integer[] reviewsIds, Integer[] complaintsIds, Integer lastOrderId) {
        super(id, name, email, phone, avatar, areaId);
        this.rating = rating;
        this.available = available;
        this.onDuty = onDuty;
        this.numberOfOrder = numberOfOrder;
        this.ordersIds = ordersIds;
        this.reviewsIds = reviewsIds;
        this.complaintsIds = complaintsIds;
        this.lastOrderId = lastOrderId;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public Integer getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(Integer numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public Integer[] getOrdersIds() {
        return ordersIds;
    }

    public void setOrdersIds(Integer[] ordersIds) {
        this.ordersIds = ordersIds;
    }

    public Integer[] getReviewsIds() {
        return reviewsIds;
    }

    public void setReviewsIds(Integer[] reviewsIds) {
        this.reviewsIds = reviewsIds;
    }

    public Integer[] getComplaintsIds() {
        return complaintsIds;
    }

    public void setComplaintsIds(Integer[] complaintsIds) {
        this.complaintsIds = complaintsIds;
    }

    public Integer getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(Integer lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    @Override
    public String toString() {
        return "Raider{" +
                "rating=" + rating +
                ", available=" + available +
                ", onDuty=" + onDuty +
                ", numberOfOrder=" + numberOfOrder +
                ", ordersIds=" + Arrays.toString(ordersIds) +
                ", reviewsIds=" + Arrays.toString(reviewsIds) +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                ", lastOrderId='" + lastOrderId + '\'' +
                '}';
    }
}
