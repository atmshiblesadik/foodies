package com.shiblesadik.foodies.models.areas;

public class Address extends Area {
    private String road;
    private String house;
    private String floor;
    private String other;

    public Address() {
    }

    public Address(Integer id, String name, String city,
                   String road, String house, String floor, String other) {
        super(id, name, city);
        this.road = road;
        this.house = house;
        this.floor = floor;
        this.other = other;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Address{" +
                "rood='" + road + '\'' +
                ", house='" + house + '\'' +
                ", floor='" + floor + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
