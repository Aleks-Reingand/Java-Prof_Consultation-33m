package com.telran.berlin.interface_practice;

public class InterfacePractice {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        System.out.println(bird.getSpeed());
        Dog dog = new Dog();
        dog.fly();
        System.out.println(dog.getSpeed());

    }
}
