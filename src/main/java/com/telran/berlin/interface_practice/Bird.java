package com.telran.berlin.interface_practice;

public class Bird implements Flying, Running {

    @Override
    public void fly() {

    }

    @Override
    public boolean isFly() {
        return false;
    }

    @Override
    public void run() {

    }

    @Override
    public boolean isRun() {
        return false;
    }

    @Override
    public int getSpeed() {
        return 15;
    }
}
