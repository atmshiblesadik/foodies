package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.areas.Address;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "customers")
public class Customer extends User {
    private Address address;
    private boolean onOrder;
    private String currentOrderId;
    private String lastOrderId;
    private String numberOfOrder;
    private String[] ordersIds;
    private String[] reviewsIds;
    private String[] complaintsIds;

    public Customer() {
    }

    public Customer(String id, String name, String email, String phone, String avatar, String areaId,
                    boolean onOrder, String currentOrderId, String lastOrderId, String numberOfOrder,
                    String[] ordersIds, String[] reviewsIds, String[] complaintsIds) {
        super(id, name, email, phone, avatar, areaId);
        this.onOrder = onOrder;
        this.currentOrderId = currentOrderId;
        this.lastOrderId = lastOrderId;
        this.numberOfOrder = numberOfOrder;
        this.ordersIds = ordersIds;
        this.reviewsIds = reviewsIds;
        this.complaintsIds = complaintsIds;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address.toString() +
                "onOrder=" + onOrder +
                ", currentOrderId='" + currentOrderId + '\'' +
                ", lastOrderId='" + lastOrderId + '\'' +
                ", numberOfOrder=" + numberOfOrder +
                ", ordersIds=" + Arrays.toString(ordersIds) +
                ", reviewsIds=" + Arrays.toString(reviewsIds) +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                '}';
    }
}
