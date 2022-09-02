package com.telran.berlin.inheritance_practice.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog(50);
        System.out.println(dog.getSpeed());

        dog.getSpeed();

        Turtle turtle = new Turtle();
        System.out.println(turtle.getSpeed());

        Cat cat = new Cat();
        cat.printVoice();

    }

}
