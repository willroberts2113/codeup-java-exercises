package oop.game;

import oop.enemies.Zombie;

public class GameRunner {

    public static void main(String[] args) {

//        CREATING A NEW INSTANCE OF ZOMBIE CLASS AND SAVING IT IN A VARIABLE
        Zombie zombie = new Zombie(75, 25, true);
        Zombie otherZombie = new Zombie(100, 50, false);
        Zombie emptyZombie = new Zombie();

        otherZombie.attack();



    }


}
