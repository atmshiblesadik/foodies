package com.shiblesadik.foodies.models.areas;

public class Address {
    private Area area;
    private String flat;
    private String floor;
    private String house;
    private String road;
    private String other;

    public Address() {
    }

    public Address(Area area, String flat, String floor, String house, String road, String other) {
        this.area = area;
        this.flat = flat;
        this.floor = floor;
        this.house = house;
        this.road = road;
        this.other = other;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
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
                "area=" + area.toString() +
                ", flat='" + flat + '\'' +
                ", floor='" + floor + '\'' +
                ", house='" + house + '\'' +
                ", road='" + road + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
