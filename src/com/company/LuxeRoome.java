package com.company;

public class LuxeRoome extends Room{



    public LuxeRoome(String bedSize, String bathRoom, String armchair, String sofa, String freeWiFi,
                     String terrace, String balcon, String safe, String tvSet,
                     String miniRefregerator, float squareFeet) {
        super(bedSize, bathRoom, armchair, sofa, freeWiFi, terrace, balcon, safe,
                tvSet,  miniRefregerator, squareFeet);}

        String miniBar;
        String jacuzzi;
        String workingRoom;
        String seatingRoom;
        String diningRoom;
        String pianino;
        String view;
        String homeTheatre;
        String pool;

    public LuxeRoome(String bedSize, String bathRoom, String armchair, String sofa,
                     String freeWiFi, String terrace, String balcon, String safe, String tvSet, String miniRefregerator,
                     float squareFeet, String miniBar, String jacuzzi, String workingRoom,
                     String seatingRoom, String diningRoom, String pianino, String view, String homeTheatre, String pool) {
        super(bedSize, bathRoom, armchair, sofa, freeWiFi, terrace, balcon, safe, tvSet, miniRefregerator, squareFeet);
            setDiningRoom(diningRoom);
            setMiniBar(miniBar);
            setJacuzzi(jacuzzi);
            setWorkingRoom(workingRoom);
            setPianino(pianino);
            setView(view);
            setHomeTheatre(homeTheatre);
            setPool(pool);
            setSeatingRoom(seatingRoom);
    }

    public String getMiniBar() {
        return miniBar;
    }

    public void setMiniBar(String miniBar) {
        this.miniBar = miniBar;
    }

    public String getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(String jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getWorkingRoom() {
        return workingRoom;
    }

    public void setWorkingRoom(String workingRoom) {
        this.workingRoom = workingRoom;
    }

    public String getSeatingRoom() {
        return seatingRoom;
    }

    public void setSeatingRoom(String seatingRoom) {
        this.seatingRoom = seatingRoom;
    }

    public String getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(String diningRoom) {
        this.diningRoom = diningRoom;
    }

    public String getPianino() {
        return pianino;
    }

    public void setPianino(String pianino) {
        this.pianino = pianino;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getHomeTheatre() {
        return homeTheatre;
    }

    public void setHomeTheatre(String homeTheatre) {
        this.homeTheatre = homeTheatre;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }
}
