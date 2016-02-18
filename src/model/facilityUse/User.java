package model.facilityUse;

import model.facility.*;

public class User {
    private int userID;
    private String fName;
    private String lName;
    private String gender;
    private Address address;

    public int getUserID() {
        return userID;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }
}
