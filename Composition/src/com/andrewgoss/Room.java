package com.andrewgoss;

public class Room {
    private int bed;
    private int bureau;
    private int nightStand;

    public Room(int bed, int bureau, int nightStand) {
        this.bed = bed;
        this.bureau = bureau;
        this.nightStand = nightStand;
    }

    public void addFurniture() {
        System.out.println("Furniture added to room");
    }

    public int getBed() {
        return bed;
    }

    public int getBureau() {
        return bureau;
    }

    public int getNightStand() {
        return nightStand;
    }
}
