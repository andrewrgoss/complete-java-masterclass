package com.andrewgoss;

public class Main {

    public static void main(String[] args) {
	    // encapsulation - mechanism for restricting access to certain components of objects you are creating. Protect members of a class from external access in order to guard against unauthorized access
        // outside classes/code cannot access the inner workings of a class

//        Player player = new Player();
//        player.name = "Andrew";
//        // player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Andrew", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
