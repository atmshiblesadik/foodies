package com.shiblesadik.foodies.models.users;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "admins")
public class Admin extends User {
    private Integer numberOfComplaint;
    private Integer[] complaintsIds;

    public Admin() {
    }

    public Admin(Integer id, String name, String email, String[] phone, String avatar, Integer areaId,
                 Integer numberOfComplaint, Integer[] complaintsIds) {
        super(id, name, email, phone, avatar, areaId);
        this.numberOfComplaint = numberOfComplaint;
        this.complaintsIds = complaintsIds;
    }

    public Integer getNumberOfComplaint() {
        return numberOfComplaint;
    }

    public void setNumberOfComplaint(Integer numberOfComplaint) {
        this.numberOfComplaint = numberOfComplaint;
    }

    public Integer[] getComplaintsIds() {
        return complaintsIds;
    }

    public void setComplaintsIds(Integer[] complaintsIds) {
        this.complaintsIds = complaintsIds;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "numberOfComplaint=" + numberOfComplaint +
                ", complaintsIds=" + Arrays.toString(complaintsIds) +
                '}';
    }
}
