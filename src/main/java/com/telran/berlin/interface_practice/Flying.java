package com.telran.berlin.interface_practice;

public interface Flying {
    void fly();

    default void fly(String str) {

    }

    default void fly(int num) {

    }

    boolean isFly();

    default int getSpeed() {
        return 0;
    }
}
