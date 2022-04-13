package com.company;

public class Hotel__Address {
    String street;
    String phoneNumber;
    String number;
    String mailAddress;


    public Hotel__Address(String street, String phoneNumber, String number, String mailAddress) {
        setStreet(street);
        setPhoneNumber(phoneNumber);
        setNumber(number);
        setMailAddress(mailAddress);

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "Hotel__Address{" +
                "street='" + street + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", number='" + number + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
