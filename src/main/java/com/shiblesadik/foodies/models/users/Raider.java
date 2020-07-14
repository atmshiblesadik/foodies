package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.areas.Address;
import com.shiblesadik.foodies.models.areas.Location;
import com.shiblesadik.foodies.models.orders.Order;
import com.shiblesadik.foodies.models.reviews.Complaint;
import com.shiblesadik.foodies.models.reviews.Review;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "raider")
public class Raider extends User {
    private Double rating;
    private boolean available;
    private boolean onRide;
    private String password;
    private Address[] addresses;
    private Order[] orders;
    private Order[] cancelOrders;
    private Review[] reviews;
    private Complaint[] complaints;
    private Location currentLocation;

    public Raider() {
    }

    public Raider(String id, String name, String phone, String email, String avatar, String role, Location homeAddress, Double rating,
                  boolean available, boolean onRide, Address[] addresses, Order[] orders, Order[] cancelOrders,
                  Review[] reviews, Complaint[] complaints, Location currentLocation) {
        super(id, name, phone, email, avatar, role, homeAddress);
        this.rating = rating;
        this.available = available;
        this.onRide = onRide;
        this.addresses = addresses;
        this.orders = orders;
        this.cancelOrders = cancelOrders;
        this.reviews = reviews;
        this.complaints = complaints;
        this.currentLocation = currentLocation;
    }

    public void prepareForRegistration(String username, String email, String password) {
        this.setPhone(username);
        this.setEmail(email);
        this.password = password;
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

    public boolean isOnRide() {
        return onRide;
    }

    public void setOnRide(boolean onRide) {
        this.onRide = onRide;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Order[] getCancelOrders() {
        return cancelOrders;
    }

    public void setCancelOrders(Order[] cancelOrders) {
        this.cancelOrders = cancelOrders;
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

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Raider{" +
                super.toString() + " " +
                "rating=" + rating +
                ", available=" + available +
                ", onRide=" + onRide +
                ", addresses=" + Arrays.toString(addresses) +
                ", orders=" + Arrays.toString(orders) +
                ", cancelOrders=" + Arrays.toString(cancelOrders) +
                ", reviews=" + Arrays.toString(reviews) +
                ", complaints=" + Arrays.toString(complaints) +
                ", currentLocation=" + currentLocation +
                '}';
    }
}
