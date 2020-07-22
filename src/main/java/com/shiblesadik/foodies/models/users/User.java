package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.areas.Area;
import org.springframework.data.annotation.Id;

import java.util.Arrays;

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String[] phone;
    private String avatar;
    private String areaId;
    private String areaCode;
    private Area area;

    public User() {
    }

    public User(String id, String name, String email, String[] phone, String avatar, String areaId, String areaCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
        this.areaId = areaId;
        this.areaCode = areaCode;
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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
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
                ", areaCode='" + areaCode + '\'' +
                ", area=" + area +
                '}';
    }
}
