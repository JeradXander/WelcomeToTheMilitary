package com.welcomeToTheMilitary.boss;

import java.util.Random;

public class FortBlissFinalBoss extends Boss {
    public FortBlissFinalBoss(String rank, String name, int _strength, int _vitality) {
        super(rank, name, _strength, _vitality);
    }

    @Override
    public int attack(){
        int max = 70;
        int min = 30;
        Random damage = new Random();
        int x = damage.nextInt((max - min) +1) +min;
        System.out.println(x);
        int att = super.getStrength()/x;
        Math.round(att);
        System.out.println(super.getRank() +" "+ super.getName() + " attacked you for " + att + " points of damage");
        return att;
    }

    @Override
    public String toString() {
        return "FortBliss Final Boss: {  Rank: " + super.getRank() +
                ", Name: " + super.getName() +
                ", Strength: " + super.getStrength() +
                ", Vitality: " + super.getVitality() +
                '}';
    }
}
