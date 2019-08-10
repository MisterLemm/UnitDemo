package com.company;

public class EnragedUnit extends MyUnit {

    private int rage = 0;

    @Override
    public int hit(MyUnit target){
        int generatedDamage = (this.minDamage + this.random.nextInt(this.maxDamage))*2;
        target.getHit(generatedDamage);
        System.out.println(" deals " + generatedDamage);
        if (target.health == 0) {
            System.out.println(this.name + " killed " +target.name);
        }
        return target.health;

    }

    public EnragedUnit(int health, int damage, String name, int rage) {
        super(health, damage, name);
        this.rage = rage;
    }

}
