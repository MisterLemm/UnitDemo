package com.company;

public class Main {

    public static void main(String[] args) {
        MyUnit unit0 = new ArmoredUnit(100, 7, "Soldier", 2);
        MyUnit unit1 = new BlackKnight(80, 10, "BK", 1);
        System.out.println(unit0.toString());
        System.out.println(unit1.toString());
        int i = 0;
        while (unit0.isAlive() && unit1.isAlive()){
            System.out.println();
            System.out.println("Round " + (++i) + " starts ");

            logAttacc(unit0, unit1);
            logAttacc(unit1, unit0);
        }
    }

    private static void logAttacc(MyUnit unit0, MyUnit unit1) {
        System.out.println();
        System.out.println(unit0.name + " Hits the " + unit1.name );
        int remainHealthUnit1 = unit0.hit(unit1);
        System.out.println(unit1.name + " has " + remainHealthUnit1 + " health last");
    }
}
