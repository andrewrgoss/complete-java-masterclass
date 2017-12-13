package com.andrewgoss;

public class EnhancedPlayer {
    // private keyword - fields within class are not accessible to outside classes
    private String name;
    private int hitPoints = 100; // default value, if health parameter value falls outside the required range
    private String weapon;

    // constructor checks for valid inputs
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
