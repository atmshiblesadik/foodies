package com.shiblesadik.foodies.models.orders;

public class OrderProcessing {
    private String customerPlaceOrder;
    private String restaurantReceiveOrder;
    private String raiderReceiveOrder;
    private String raiderReceiveFoods;
    private String customerReceiveOrder;

    public OrderProcessing() {
    }

    public OrderProcessing(String customerPlaceOrder, String restaurantReceiveOrder, String raiderReceiveOrder,
                           String raiderReceiveFoods, String customerReceiveOrder) {
        this.customerPlaceOrder = customerPlaceOrder;
        this.restaurantReceiveOrder = restaurantReceiveOrder;
        this.raiderReceiveOrder = raiderReceiveOrder;
        this.raiderReceiveFoods = raiderReceiveFoods;
        this.customerReceiveOrder = customerReceiveOrder;
    }

    public String getCustomerPlaceOrder() {
        return customerPlaceOrder;
    }

    public void setCustomerPlaceOrder(String customerPlaceOrder) {
        this.customerPlaceOrder = customerPlaceOrder;
    }

    public String getRestaurantReceiveOrder() {
        return restaurantReceiveOrder;
    }

    public void setRestaurantReceiveOrder(String restaurantReceiveOrder) {
        this.restaurantReceiveOrder = restaurantReceiveOrder;
    }

    public String getRaiderReceiveOrder() {
        return raiderReceiveOrder;
    }

    public void setRaiderReceiveOrder(String raiderReceiveOrder) {
        this.raiderReceiveOrder = raiderReceiveOrder;
    }

    public String getRaiderReceiveFoods() {
        return raiderReceiveFoods;
    }

    public void setRaiderReceiveFoods(String raiderReceiveFoods) {
        this.raiderReceiveFoods = raiderReceiveFoods;
    }

    public String getCustomerReceiveOrder() {
        return customerReceiveOrder;
    }

    public void setCustomerReceiveOrder(String customerReceiveOrder) {
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
