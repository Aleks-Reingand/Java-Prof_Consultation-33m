package com.telran.berlin.inheritance_practice.animal;

import lombok.Data;


public class Animal {
    protected int speed;

    public void printVoice() {
        System.out.println(speed);
    }

}
