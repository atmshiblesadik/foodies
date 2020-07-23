package com.shiblesadik.foodies.models.orders;

import com.shiblesadik.foodies.models.areas.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "orders")
public class Order extends OrderProcessing {
    @Id
    private String id;
    private String customerId;
    private String restaurantId;
    private String raiderId;
    private boolean restaurantTakeOrder;
    private boolean raiderTakeOrder;
    private Double totalAmount;
    private Double discountAmount;
    private Double finalAmount;
    private String[] foodsIds;
    private boolean raiderReceiveAmount;
    private boolean complete;
    private String reviewId;
    private String complaintId;
    private String totalTime;
    private Address address;

    public Order() {
    }

    public Order(String customerPlaceOrder, String restaurantReceiveOrder, String raiderReceiveOrder,
                 String raiderReceiveFoods, String customerReceiveOrder, String id, String customerId,
                 String restaurantId, String raiderId, boolean restaurantTakeOrder, boolean raiderTakeOrder,
                 Double totalAmount, Double discountAmount, Double finalAmount, String[] foodsIds,
                 boolean raiderReceiveAmount, boolean complete, String reviewId, String complaintId,
                 String totalTime, Address address) {
        super(customerPlaceOrder, restaurantReceiveOrder, raiderReceiveOrder, raiderReceiveFoods, customerReceiveOrder);
        this.id = id;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.raiderId = raiderId;
        this.restaurantTakeOrder = restaurantTakeOrder;
        this.raiderTakeOrder = raiderTakeOrder;
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.finalAmount = finalAmount;
        this.foodsIds = foodsIds;
        this.raiderReceiveAmount = raiderReceiveAmount;
        this.complete = complete;
        this.reviewId = reviewId;
        this.complaintId = complaintId;
        this.totalTime = totalTime;
        this.address = address;
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

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRaiderId() {
        return raiderId;
    }

    public void setRaiderId(String raiderId) {
        this.raiderId = raiderId;
    }

    public boolean isRestaurantTakeOrder() {
        return restaurantTakeOrder;
    }

    public void setRestaurantTakeOrder(boolean restaurantTakeOrder) {
        this.restaurantTakeOrder = restaurantTakeOrder;
    }

    public boolean isRaiderTakeOrder() {
        return raiderTakeOrder;
    }

    public void setRaiderTakeOrder(boolean raiderTakeOrder) {
        this.raiderTakeOrder = raiderTakeOrder;
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

    public String[] getFoodsIds() {
        return foodsIds;
    }

    public void setFoodsIds(String[] foodsIds) {
        this.foodsIds = foodsIds;
    }

    public boolean isRaiderReceiveAmount() {
        return raiderReceiveAmount;
    }

    public void setRaiderReceiveAmount(boolean raiderReceiveAmount) {
        this.raiderReceiveAmount = raiderReceiveAmount;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", restaurantId=" + restaurantId +
                ", raiderId=" + raiderId +
                ", restaurantTakeOrder=" + restaurantTakeOrder +
                ", raiderTakeOrder=" + raiderTakeOrder +
                ", totalAmount=" + totalAmount +
                ", discountAmount=" + discountAmount +
                ", finalAmount=" + finalAmount +
                ", foodsIds=" + Arrays.toString(foodsIds) +
                ", raiderReceiveAmount=" + raiderReceiveAmount +
                ", complete=" + complete +
                ", reviewId=" + reviewId +
                ", complaintId=" + complaintId +
                ", totalTime=" + totalTime +
                '}';
    }
}
