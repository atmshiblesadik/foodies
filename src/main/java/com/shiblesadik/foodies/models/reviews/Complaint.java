package com.shiblesadik.foodies.models.reviews;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "complaints")
public class Complaint extends Investigate {
    private boolean solved;

    public Complaint() {
    }

    public Complaint(Integer id, Integer customerId, Integer raiderId, Integer restaurantId,
                     Integer orderId, Integer details, boolean solved) {
        super(id, customerId, raiderId, restaurantId, orderId, details);
        this.solved = solved;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "solved=" + solved +
                '}';
    }
}
