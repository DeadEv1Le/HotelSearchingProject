package com.company;

public abstract class City {
    String name;
    String street;

    public City(String name, String street) {
        setName(name);
        setStreet(street);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
