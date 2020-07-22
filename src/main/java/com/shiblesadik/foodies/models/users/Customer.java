package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.areas.Address;
import com.shiblesadik.foodies.models.orders.Order;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "customers")
public class Customer extends User {
    private Address address;
    private boolean onOrder;
    private Integer currentOrderId;
    private Order currentOrder;
    private Integer lastOrderId;
    private Order lastOrder;
    private Integer numberOfOrder;
    private Integer[] ordersIds;
    private Integer[] reviewsIds;
    private Integer[] complaintsIds;

    public Customer() {
    }

    public Customer(Integer id, String name, String email, String[] phone, String avatar, Integer areaId,
                    boolean onOrder, Integer currentOrderId, Integer lastOrderId, Integer numberOfOrder,
                    Integer[] ordersIds, Integer[] reviewsIds, Integer[] complaintsIds) {
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

    public Integer getCurrentOrderId() {
        return currentOrderId;
    }

    public void setCurrentOrderId(Integer currentOrderId) {
        this.currentOrderId = currentOrderId;
    }

    public Integer getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(Integer lastOrderId) {
        this.lastOrderId = lastOrderId;
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

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address.toString() +
                "onOrder=" + onOrder +
                ", currentOrderId='" + currentOrderId + '\'' +
                ", currentOrder=" + currentOrder +
                ", lastOrderId='" + lastOrderId + '\'' +
                ", lastOrder=" + lastOrder +
                ", numberOfOrder=" + numberOfOrder +
                ", ordersIds=" + Arrays.toString(ordersIds) +
                ", reviewsIds=" + Arrays.toString(reviewsIds) +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                '}';
    }
}
