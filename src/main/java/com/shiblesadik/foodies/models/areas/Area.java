package com.shiblesadik.foodies.models.areas;

public class Area {
    private String id;
    private Integer code;
    private String name;
    private String city;
    private Integer numberOfRestaurants;
    private Integer numberOfRaider;
    private Integer numberOfCustomer;
    private Integer numberOfAdmin;

    public Area() {
    }

    public Area(String id, Integer code, String name, String city, Integer numberOfRestaurants, Integer numberOfRaider,
                Integer numberOfCustomer, Integer numberOfAdmin) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.city = city;
        this.numberOfRestaurants = numberOfRestaurants;
        this.numberOfRaider = numberOfRaider;
        this.numberOfCustomer = numberOfCustomer;
        this.numberOfAdmin = numberOfAdmin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumberOfRestaurants() {
        return numberOfRestaurants;
    }

    public void setNumberOfRestaurants(Integer numberOfRestaurants) {
        this.numberOfRestaurants = numberOfRestaurants;
    }

    public Integer getNumberOfRaider() {
        return numberOfRaider;
    }

    public void setNumberOfRaider(Integer numberOfRaider) {
        this.numberOfRaider = numberOfRaider;
    }

    public Integer getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(Integer numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public Integer getNumberOfAdmin() {
        return numberOfAdmin;
    }

    public void setNumberOfAdmin(Integer numberOfAdmin) {
        this.numberOfAdmin = numberOfAdmin;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id='" + id + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", numberOfRestaurants=" + numberOfRestaurants +
                ", numberOfRaider=" + numberOfRaider +
                ", numberOfCustomer=" + numberOfCustomer +
                ", numberOfAdmin=" + numberOfAdmin +
                '}';
    }
}
