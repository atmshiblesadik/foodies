package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.orders.Order;
import com.shiblesadik.foodies.models.reviews.Complaint;
import com.shiblesadik.foodies.models.reviews.Review;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "customers")
public class Customer extends User {
    private boolean onOrder;
    private String currentOrderId;
    private Order currentOrder;
    private String lastOrderId;
    private Order lastOrder;
    private Integer numberOfOrder;
    private String[] ordersIds;
    private Order[] orders;
    private String[] reviewsIds;
    private Review[] reviews;
    private String[] complaintsIds;
    private Complaint[] complaints;

    public Customer() {
    }

    public Customer(String id, String name, String email, String[] phone, String avatar, String areaId, String areaCode,
                    boolean onOrder, String currentOrderId, String lastOrderId, Integer numberOfOrder,
                    String[] ordersIds, String[] reviewsIds, String[] complaintsIds) {
        super(id, name, email, phone, avatar, areaId, areaCode);
        this.onOrder = onOrder;
        this.currentOrderId = currentOrderId;
        this.lastOrderId = lastOrderId;
        this.numberOfOrder = numberOfOrder;
        this.ordersIds = ordersIds;
        this.reviewsIds = reviewsIds;
        this.complaintsIds = complaintsIds;
    }

    public boolean isOnOrder() {
        return onOrder;
    }

    public void setOnOrder(boolean onOrder) {
        this.onOrder = onOrder;
    }

    public String getCurrentOrderId() {
        return currentOrderId;
    }

    public void setCurrentOrderId(String currentOrderId) {
        this.currentOrderId = currentOrderId;
    }

    public String getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
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

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }

    public Order getLastOrder() {
        return lastOrder;
    }

    public void setLastOrder(Order lastOrder) {
        this.lastOrder = lastOrder;
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
        return "Customer{" +
                "onOrder=" + onOrder +
                ", currentOrderId='" + currentOrderId + '\'' +
                ", currentOrder=" + currentOrder +
                ", lastOrderId='" + lastOrderId + '\'' +
                ", lastOrder=" + lastOrder +
                ", numberOfOrder=" + numberOfOrder +
                ", ordersIds=" + Arrays.toString(ordersIds) +
                ", orders=" + Arrays.toString(orders) +
                ", reviewsIds=" + Arrays.toString(reviewsIds) +
                ", reviews=" + Arrays.toString(reviews) +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                ", complaints=" + Arrays.toString(complaints) +
                '}';
    }
}
