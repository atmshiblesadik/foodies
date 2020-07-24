package com.shiblesadik.foodies.models.users;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "raiders")
public class Raider extends User {
    private Double rating;
    private boolean available;
    private boolean onDuty;
    private String numberOfOrder;
    private String[] ordersIds;
    private String[] reviewsIds;
    private String[] complaintsIds;
    private String lastOrderId;

    public Raider() {
    }

    public Raider(String id, String name, String email, String phone, String avatar, String areaId,
                  Double rating, boolean available, boolean onDuty, String numberOfOrder, String[] ordersIds,
                  String[] reviewsIds, String[] complaintsIds, String lastOrderId) {
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

    public String getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(String numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
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

    public String getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(String lastOrderId) {
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
