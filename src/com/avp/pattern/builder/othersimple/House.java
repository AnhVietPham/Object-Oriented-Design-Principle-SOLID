package com.avp.pattern.builder.othersimple;

public class House {
    private int window;
    private int door;
    private int room;
    private boolean isGarage;
    private boolean isSwimPool;
    private boolean isGarden;

    House(int window, int door, int room) {
        this.window = window;
        this.door = door;
        this.room = room;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public boolean isGarage() {
        return isGarage;
    }

    void setGarage(boolean garage) {
        isGarage = garage;
    }

    public boolean isSwimPool() {
        return isSwimPool;
    }

    void setSwimPool(boolean swimPool) {
        isSwimPool = swimPool;
    }

    public boolean isGarden() {
        return isGarden;
    }

    void setGarden(boolean garden) {
        isGarden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "window=" + window +
                ", door=" + door +
                ", room=" + room +
                ", isGarage=" + isGarage +
                ", isSwimPool=" + isSwimPool +
                ", isGarden=" + isGarden +
                '}';
    }
}
