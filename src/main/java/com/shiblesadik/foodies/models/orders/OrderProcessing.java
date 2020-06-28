package com.shiblesadik.foodies.models.orders;

import com.shiblesadik.foodies.models.datetime.DateTime;

public class OrderProcessing {
    private DateTime orderPlaced;
    private DateTime raiderReceiveOrder;
    private DateTime restaurantReceiveOrder;
    private DateTime foodComplete;
    private DateTime raiderReceiveFood;
    private DateTime orderDelivery;

    public OrderProcessing() {
    }

    public OrderProcessing(DateTime orderPlaced, DateTime raiderReceiveOrder, DateTime restaurantReceiveOrder,
                           DateTime foodComplete, DateTime raiderReceiveFood, DateTime orderDelivery) {
        this.orderPlaced = orderPlaced;
        this.raiderReceiveOrder = raiderReceiveOrder;
        this.restaurantReceiveOrder = restaurantReceiveOrder;
        this.foodComplete = foodComplete;
        this.raiderReceiveFood = raiderReceiveFood;
        this.orderDelivery = orderDelivery;
    }

    public DateTime getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(DateTime orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public DateTime getRaiderReceiveOrder() {
        return raiderReceiveOrder;
    }

    public void setRaiderReceiveOrder(DateTime raiderReceiveOrder) {
        this.raiderReceiveOrder = raiderReceiveOrder;
    }

    public DateTime getRestaurantReceiveOrder() {
        return restaurantReceiveOrder;
    }

    public void setRestaurantReceiveOrder(DateTime restaurantReceiveOrder) {
        this.restaurantReceiveOrder = restaurantReceiveOrder;
    }

    public DateTime getFoodComplete() {
        return foodComplete;
    }

    public void setFoodComplete(DateTime foodComplete) {
        this.foodComplete = foodComplete;
    }

    public DateTime getRaiderReceiveFood() {
        return raiderReceiveFood;
    }

    public void setRaiderReceiveFood(DateTime raiderReceiveFood) {
        this.raiderReceiveFood = raiderReceiveFood;
    }

    public DateTime getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(DateTime orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    @Override
    public String toString() {
        return "OrderProcessing{" +
                "orderPlaced=" + orderPlaced +
                ", raiderReceiveOrder=" + raiderReceiveOrder +
                ", restaurantReceiveOrder=" + restaurantReceiveOrder +
                ", foodComplete=" + foodComplete +
                ", raiderReceiveFood=" + raiderReceiveFood +
                ", orderDelivery=" + orderDelivery +
                '}';
    }
}
