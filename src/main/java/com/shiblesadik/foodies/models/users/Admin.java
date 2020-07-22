package com.shiblesadik.foodies.models.users;

import com.shiblesadik.foodies.models.reviews.Complaint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "admins")
public class Admin extends User {
    private Integer numberOfComplaint;
    private String[] complaintsIds;
    private Complaint[] complaints;

    public Admin() {
    }

    public Admin(String id, String name, String email, String[] phone, String avatar, String areaId, String areaCode,
                 Integer numberOfComplaint, String[] complaintsIds) {
        super(id, name, email, phone, avatar, areaId, areaCode);
        this.numberOfComplaint = numberOfComplaint;
        this.complaintsIds = complaintsIds;
    }

    public Integer getNumberOfComplaint() {
        return numberOfComplaint;
    }

    public void setNumberOfComplaint(Integer numberOfComplaint) {
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
                ", complaints=" + Arrays.toString(complaints) +
                '}';
    }
}
