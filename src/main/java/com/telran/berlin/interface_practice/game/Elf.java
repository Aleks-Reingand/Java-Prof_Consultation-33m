package com.telran.berlin.interface_practice.game;


public class Elf extends Hero {

    private boolean isMagic;

    public Elf(String name) {
        super(name, 10, 50);
    }

    @Override
    public KickResult kick(Hero hero) {
        return null;
    }
}
