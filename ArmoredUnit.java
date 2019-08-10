package com.company;

public class ArmoredUnit extends MyUnit {

    private int armour = 1;

    @Override
    public int getHit(int damage) {
        System.out.println("Armour activated");
        if (armour >= damage) {
            return super.getHit(0);
        } else return super.getHit(damage - armour);
    }

    public ArmoredUnit(int health, int damage, String name, int armour) {
        super(health, damage, name);
        this.armour = armour;
    }
}
