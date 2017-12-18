package com.andrewgoss;

public class HealthyBurger extends Hamburger {
    private int kale;
    private int carrot;

    public HealthyBurger(String breadRollType, String meat, int kale, int carrot) {
        super(breadRollType, meat);
        this.kale = kale;
        this.carrot = carrot;
    }

    @Override
    public void completeOrder(int lettuce, int tomato, int onion, int cheese) {
        super.completeOrder(lettuce, tomato, onion, cheese);
    }
}
