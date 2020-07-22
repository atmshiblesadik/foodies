package com.shiblesadik.foodies.models.orders;

import java.util.TimeZone;

public class OrderProcessing {
    private TimeZone customerPlaceOrder;
    private TimeZone restaurantReceiveOrder;
    private TimeZone raiderReceiveOrder;
    private TimeZone raiderReceiveFoods;
    private TimeZone customerReceiveOrder;

    public OrderProcessing() {
    }

    public OrderProcessing(TimeZone customerPlaceOrder, TimeZone restaurantReceiveOrder, TimeZone raiderReceiveOrder,
                           TimeZone raiderReceiveFoods, TimeZone customerReceiveOrder) {
        this.customerPlaceOrder = customerPlaceOrder;
        this.restaurantReceiveOrder = restaurantReceiveOrder;
        this.raiderReceiveOrder = raiderReceiveOrder;
        this.raiderReceiveFoods = raiderReceiveFoods;
        this.customerReceiveOrder = customerReceiveOrder;
    }

    public TimeZone getCustomerPlaceOrder() {
        return customerPlaceOrder;
    }

    public void setCustomerPlaceOrder(TimeZone customerPlaceOrder) {
        this.customerPlaceOrder = customerPlaceOrder;
    }

    public TimeZone getRestaurantReceiveOrder() {
        return restaurantReceiveOrder;
    }

    public void setRestaurantReceiveOrder(TimeZone restaurantReceiveOrder) {
        this.restaurantReceiveOrder = restaurantReceiveOrder;
    }

    public TimeZone getRaiderReceiveOrder() {
        return raiderReceiveOrder;
    }

    public void setRaiderReceiveOrder(TimeZone raiderReceiveOrder) {
        this.raiderReceiveOrder = raiderReceiveOrder;
    }

    public TimeZone getRaiderReceiveFoods() {
        return raiderReceiveFoods;
    }

    public void setRaiderReceiveFoods(TimeZone raiderReceiveFoods) {
        this.raiderReceiveFoods = raiderReceiveFoods;
    }

    public TimeZone getCustomerReceiveOrder() {
        return customerReceiveOrder;
    }

    public void setCustomerReceiveOrder(TimeZone customerReceiveOrder) {
        this.customerReceiveOrder = customerReceiveOrder;
    }

    @Override
    public String toString() {
        return "OrderProcessing{" +
                "customerPlaceOrder=" + customerPlaceOrder +
                ", restaurantReceiveOrder=" + restaurantReceiveOrder +
                ", raiderReceiveOrder=" + raiderReceiveOrder +
                ", raiderReceiveFoods=" + raiderReceiveFoods +
                ", customerReceiveOrder=" + customerReceiveOrder +
                '}';
    }
}
