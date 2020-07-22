package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.orders.Order;
import com.shiblesadik.foodies.models.reviews.Complaint;
import com.shiblesadik.foodies.models.reviews.Review;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "raiders")
public class Raider extends User {
    private Double rating;
    private boolean available;
    private boolean onDuty;
    private Integer numberOfOrder;
    private String[] ordersIds;
    private Order[] orders;
    private String[] reviewsIds;
    private Review[] reviews;
    private String[] complaintsIds;
    private Complaint[] complaints;
    private String lastOrderId;
    private Order lastOrder;

    public Raider() {
    }

    public Raider(String id, String name, String email, String[] phone, String avatar, String areaId, String areaCode,
                  Double rating, boolean available, boolean onDuty, Integer numberOfOrder, String[] ordersIds,
                  String[] reviewsIds, String[] complaintsIds, String lastOrderId) {
        super(id, name, email, phone, avatar, areaId, areaCode);
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

    public Order getLastOrder() {
        return lastOrder;
    }

    public void setLastOrder(Order lastOrder) {
        this.lastOrder = lastOrder;
    }

    @Override
    public String toString() {
        return "Raider{" +
                "rating=" + rating +
                ", available=" + available +
                ", onDuty=" + onDuty +
                ", numberOfOrder=" + numberOfOrder +
                ", ordersIds=" + Arrays.toString(ordersIds) +
                ", orders=" + Arrays.toString(orders) +
                ", reviewsIds=" + Arrays.toString(reviewsIds) +
                ", reviews=" + Arrays.toString(reviews) +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                ", complaints=" + Arrays.toString(complaints) +
                ", lastOrderId='" + lastOrderId + '\'' +
                ", lastOrder=" + lastOrder +
                '}';
    }
}
