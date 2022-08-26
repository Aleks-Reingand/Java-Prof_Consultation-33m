package com.telran.berlin.interface_practice.game;

import com.telran.berlin.interface_practice.Flying;

public class Orc extends Hero implements Flying {

    private int age;

    public Orc(String name) {
        super(name, 20, 80);
    }

    @Override
    public KickResult kick(Hero hero) {
        return null;
    }

    @Override
    public void fly() {

    }

    @Override
    public boolean isFly() {
        return false;
    }
}
