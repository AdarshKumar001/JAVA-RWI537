package com.mavelhiber.ProjectWithMavel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Column;

@Entity
@Table(name = "address")  // Optional: specify table name if different
public class Address {

    @Id
    private int houseNo;  // Renamed to follow camel case convention

    private String street;

    private int pincode;

    // No-argument constructor
    public Address() {
        super();
    }

    // Parameterized constructor
    public Address(int houseNo, String street, int pincode) {
        this.houseNo = houseNo;
        this.street = street;
        this.pincode = pincode;
    }

    // Getters and Setters
    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    // toString method
    @Override
    public String toString() {
        return this.houseNo + " - " + this.street + " : " + this.pincode;
    }
}
