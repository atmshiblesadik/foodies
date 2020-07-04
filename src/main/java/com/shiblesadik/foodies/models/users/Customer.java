package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.areas.Address;
import com.shiblesadik.foodies.models.areas.Location;
import com.shiblesadik.foodies.models.orders.Order;
import com.shiblesadik.foodies.models.reviews.Complaint;
import com.shiblesadik.foodies.models.reviews.Review;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "customers")
public class Customer extends User {
    private Address[] addresses;
    private Order[] orders;
    private Review[] reviews;
    private Complaint[] complaints;
    private String password;
    private Location currentLocation;

    public Customer() {
    }

    public Customer(String id, String name, String phone, String email, String role, Location homeAddress,
                    Address[] addresses, Order[] orders, Review[] reviews, Complaint[] complaints, Location currentLocation) {
        super(id, name, phone, email, role, homeAddress);
        this.addresses = addresses;
        this.orders = orders;
        this.reviews = reviews;
        this.complaints = complaints;
        this.currentLocation = currentLocation;
    }

    public void prepareForRegistration(String username, String email, String password) {
        this.setPhone(username);
        this.setEmail(email);
        this.password = password;
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
        return "Customer{" +
                super.toString() + " " +
                "addresses=" + Arrays.toString(addresses) +
                ", orders=" + Arrays.toString(orders) +
                ", reviews=" + Arrays.toString(reviews) +
                ", complaints=" + Arrays.toString(complaints) +
                ", currentLocation=" + currentLocation +
                ", Password=" + password +
                '}';
    }
}
