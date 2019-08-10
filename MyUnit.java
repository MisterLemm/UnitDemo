package com.company;

import java.util.Random;

public class MyUnit {
    int health = 5;
    int maxDamage;
    static int minDamage = 1;
    String name;
    static Random random = new Random();

    @Override
    public String toString() {
        return "My name is "+ name+ " i have "+ health+ " HP and "+ maxDamage +" damage.";
    }

    public MyUnit(int health, int damage, String name) {
        this.health = health;
        this.maxDamage = damage;
        this.name = name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int hit(MyUnit target) {
        int generatedDamage = this.minDamage + this.random.nextInt(this.maxDamage);
        target.getHit(generatedDamage);
        System.out.println(" deals " + generatedDamage);
        if (target.health == 0) {
            System.out.println(this.name + " killed " +target.name);
        }
        return target.health;
    }

    public int getHit(int damage) {
        this.health = this.health - damage;
        return this.health;
    }
}
