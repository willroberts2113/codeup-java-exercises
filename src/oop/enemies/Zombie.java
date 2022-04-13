package oop.enemies;

public class Zombie {

//    PROPERTIES

    private int maxHealth;
    private int attackDamage;
    private boolean isHungryForBrains;

//    CONSTRUCTORS

    public Zombie() {

    }

    public Zombie(int maxHealth, int attackDamage, boolean isHungryForBrains) {
        System.out.println("You've created a zombie!");
        this.maxHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.isHungryForBrains = isHungryForBrains;
    }

//    GETTERS AND SETTERS

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }


    //    CUSTOM METHODS

    public void attack() {
        printAttackMessage();
    }

    private void printAttackMessage() {
        System.out.println("Attacking and eating brains!");
    }



}