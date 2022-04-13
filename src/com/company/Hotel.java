package com.company;

public  class Hotel {
    String name;
    Hotel__Address address;
    String rating;
    String yard;
    String pool;
    String bar;
    String restaurant;
    String playground;
    LuxeRoome luxeRoom;
    Room standartRoom;
    public Hotel(String name,Hotel__Address address, String rating, String yard, String pool, String bar,
                 String restaurant, String playground , LuxeRoome luxeRoom, Room standartRoom) {
        setName(name);
        setAddress(address);
        setRating(rating);
        setYard(yard);
        setPool(pool);
        setBar(bar);
        setRestaurant(restaurant);
        setPlayground(playground);
        setLuxeRoom(luxeRoom);
        setStandartRoom(standartRoom);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hotel__Address getAddress() {
        return address;
    }



    public void setAddress(Hotel__Address address) {
        this.address = address;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getPlayground() {
        return playground;
    }

    public void setPlayground(String playground) {
        this.playground = playground;
    }

    public LuxeRoome getLuxeRoom() {
        return luxeRoom;
    }

    public void setLuxeRoom(LuxeRoome luxeRoom) {
        this.luxeRoom = luxeRoom;
    }

    public Room getStandartRoom() {
        return standartRoom;
    }

    public void setStandartRoom(Room standartRoom) {
        this.standartRoom = standartRoom;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", rating='" + rating + '\'' +
                ", yard='" + yard + '\'' +
                ", pool='" + pool + '\'' +
                ", bar='" + bar + '\'' +
                ", restaurant='" + restaurant + '\'' +
                ", playground='" + playground + '\'' +
                '}';
    }
}
