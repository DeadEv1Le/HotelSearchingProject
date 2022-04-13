package com.company;

public class Room {
    String bedSize;
    String bathRoom;
    String armchair;
    String sofa;
    String freeWiFi;

    String terrace;
    String balcon;
    String safe;
    String tvSet;

    String miniRefregerator;
    float squareFeet;

    public Room(String bedSize, String bathRoom, String armchair, String sofa, String freeWiFi, String terrace,
                String balcon, String safe, String tvSet,  String miniRefregerator, float squareFeet) {
        setBedSize(bedSize);
        setBathRoom(bathRoom);
        setArmchair(armchair);
        setSofa(sofa);
        setFreeWiFi(freeWiFi);
        setTerrace(terrace);
        setBalcon(balcon);
        setSafe(safe);
        setTvSet(tvSet);

        setMiniRefregerator(miniRefregerator);
        setSquareFeet(squareFeet);
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    public String getBathRoom() {
        return bathRoom;
    }

    public void setBathRoom(String bathRoom) {
        this.bathRoom = bathRoom;
    }

    public String getArmchair() {
        return armchair;
    }

    public void setArmchair(String armchair) {
        this.armchair = armchair;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public String getFreeWiFi() {
        return freeWiFi;
    }

    public void setFreeWiFi(String freeWiFi) {
        this.freeWiFi = freeWiFi;
    }

    public String getTerrace() {
        return terrace;
    }

    public void setTerrace(String terrace) {
        this.terrace = terrace;
    }

    public String getBalcon() {
        return balcon;
    }

    public void setBalcon(String balcon) {
        this.balcon = balcon;
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe;
    }

    public String getTvSet() {
        return tvSet;
    }

    public void setTvSet(String tvSet) {
        this.tvSet = tvSet;
    }
    public String getMiniRefregerator() {
        return miniRefregerator;
    }

    public void setMiniRefregerator(String miniRefregerator) {
        this.miniRefregerator = miniRefregerator;
    }

    public float getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(float squareFeet) {
        this.squareFeet = squareFeet;
    }
}
