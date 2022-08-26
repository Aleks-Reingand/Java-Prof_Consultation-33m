package com.telran.berlin.interface_practice.game;

import com.github.javafaker.Faker;

public class Test {
    public static void main(String[] args) {

        Faker faker = new Faker();

        Orc orc = new Orc(faker.gameOfThrones().character());
        System.out.println(orc.getName());
        System.out.println(orc.isAlive());

    }
}
