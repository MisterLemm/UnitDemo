package com.company;

public class BlackKnight extends MyUnit {

    int immune = 0;

    @Override
    public int getHit(int damage){
        System.out.println("This target is immune, sowwy");
        return super.getHit(0);
        }
    public BlackKnight(int health, int damage, String name, int immune) {
        super(health, damage, name);
        this.immune = immune;
        }
    }
