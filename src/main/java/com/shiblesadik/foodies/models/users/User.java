package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.areas.Location;
import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String avatar;
    private String role;
    private Location homeAddress;

    public User() {
    }

    public User(String id, String name, String phone, String email, String avatar, String role, Location homeAddress) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.avatar = avatar;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    @Override
    public String toString() {
        return "UserRepository{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role='" + role + '\'' +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
