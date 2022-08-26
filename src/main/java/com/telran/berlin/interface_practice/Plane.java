package com.telran.berlin.interface_practice;

public class Plane implements Flying, Running {

    @Override
    public void fly() {
        System.out.println("I am plane, I can fly!");
    }

    @Override
    public void fly(String str) {

    }

    public void fly(int n) {

    }

    @Override
    public boolean isFly() {
        return true;
    }

    @Override
    public void run() {
        System.out.println("I am plane, I can't run!");
    }

    @Override
    public boolean isRun() {
        return false;
    }
}
