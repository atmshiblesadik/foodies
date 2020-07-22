package com.shiblesadik.foodies.models.orders;

import com.shiblesadik.foodies.models.areas.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.TimeZone;

@Document(collection = "orders")
public class Order extends OrderProcessing {
    @Id
    private Integer id;
    private Integer customerId;
    private Integer restaurantId;
    private Integer raiderId;
    private boolean restaurantTakeOrder;
    private boolean raiderTakeOrder;
    private Double totalAmount;
    private Double discountAmount;
    private Double finalAmount;
    private Integer[] foodsIds;
    private boolean raiderReceiveAmount;
    private boolean complete;
    private Integer reviewId;
    private Integer complaintId;
    private TimeZone totalTime;
    private Address address;

    public Order() {
    }

    public Order(TimeZone customerPlaceOrder, TimeZone restaurantReceiveOrder, TimeZone raiderReceiveOrder,
                 TimeZone raiderReceiveFoods, TimeZone customerReceiveOrder, Integer id, Integer customerId,
                 Integer restaurantId, Integer raiderId, boolean restaurantTakeOrder, boolean raiderTakeOrder,
                 Double totalAmount, Double discountAmount, Double finalAmount, Integer[] foodsIds,
                 boolean raiderReceiveAmount, boolean complete, Integer reviewId, Integer complaintId,
                 TimeZone totalTime, Address address) {
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

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getRaiderId() {
        return raiderId;
    }

    public void setRaiderId(Integer raiderId) {
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

    public Integer[] getFoodsIds() {
        return foodsIds;
    }

    public void setFoodsIds(Integer[] foodsIds) {
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

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    public TimeZone getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(TimeZone totalTime) {
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
