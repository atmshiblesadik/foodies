package com.shiblesadik.foodies.models.users;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "admins")
public class Admin extends User {
    private String numberOfComplaint;
    private String[] complaintsIds;

    public Admin() {
    }

    public Admin(String id, String name, String email, String phone, String avatar, String areaId,
                 String numberOfComplaint, String[] complaintsIds) {
        super(id, name, email, phone, avatar, areaId);
        this.numberOfComplaint = numberOfComplaint;
        this.complaintsIds = complaintsIds;
    }

    public String getNumberOfComplaint() {
        return numberOfComplaint;
    }

    public void setNumberOfComplaint(String numberOfComplaint) {
        this.numberOfComplaint = numberOfComplaint;
    }

    public String[] getComplaintsIds() {
        return complaintsIds;
    }

    public void setComplaintsIds(String[] complaintsIds) {
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
