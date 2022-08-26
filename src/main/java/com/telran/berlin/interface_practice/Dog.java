package com.telran.berlin.interface_practice;

public class Dog implements Flying, Running {

    @Override
    public void fly() {
        System.out.println("I am dog, I can't fly! I study!");
    }

    @Override
    public boolean isFly() {
        return false;
    }

    @Override
    public void run() {
        System.out.println("I am dog, I can run!");
    }

    @Override
    public boolean isRun() {
        return true;
    }

    @Override
    public void fly(String str) {

    }
}
