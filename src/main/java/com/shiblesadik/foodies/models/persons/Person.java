package com.shiblesadik.foodies.models.persons;

import com.shiblesadik.foodies.models.areas.Location;

public class Person {
    private String id;
    private String name;
    private String phone;
    private String email;
    private String role;
    private Location homeAddress;

    public Person() {
    }

    public Person(String id, String name, String phone, String email, String role, Location homeAddress) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.homeAddress = homeAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Location getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Location homeAddress) {
        this.homeAddress = homeAddress;
    }
}
