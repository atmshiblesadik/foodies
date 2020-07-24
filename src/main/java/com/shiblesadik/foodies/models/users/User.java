package com.shiblesadik.foodies.models.users;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String avatar;
    private String areaId;
    private String password;

    public User() {
    }

    public User(String id, String name, String email, String phone, String avatar, String areaId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
        this.areaId = areaId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void preparedForRegistration(UserRegistrationModel userRegistrationModel) {
        setPhone(userRegistrationModel.getPhone());
        setName(userRegistrationModel.getName());
        setPassword(userRegistrationModel.getPassword());
        setEmail(null);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", avatar='" + avatar + '\'' +
                ", areaId='" + areaId + '\'' +
                '}';
    }
}
