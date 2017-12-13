package com.andrewgoss;

public class House {
    private int walls;
    private int windows;
    private int roof;
    private Room room;

    public House(int walls, int windows, int roof, Room room) {
        this.walls = walls;
        this.windows = windows;
        this.roof = roof;
        this.room = room;
    }

    public void setUpRoom() {
        room.addFurniture();
    }

    public int getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    public int getRoof() {
        return roof;
    }

    public Room getRoom() {
        return room;
    }
}
