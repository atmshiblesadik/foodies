package com.shiblesadik.foodies.models.users;

import org.springframework.data.annotation.Id;

import java.util.Arrays;

public class User {
    @Id
    private Integer id;
    private String name;
    private String email;
    private String[] phone;
    private String avatar;
    private Integer areaId;

    public User() {
    }

    public User(Integer id, String name, String email, String[] phone, String avatar, Integer areaId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
        this.areaId = areaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + Arrays.toString(phone) +
                ", avatar='" + avatar + '\'' +
                ", areaId='" + areaId + '\'' +
                '}';
    }
}
