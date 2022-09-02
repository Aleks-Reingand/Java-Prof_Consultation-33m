package com.telran.berlin.inheritance_practice.animal;

import lombok.Data;

@Data
public class Dog {
    private int speed;
    private int age;

    public Dog(int speed) {
        super();
        this.speed = speed;
        this.age = 20;

        // dog.setSpeed(50);
    }
}
