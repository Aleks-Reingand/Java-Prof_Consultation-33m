package com.telran.berlin.inheritance_practice.fruit;

public class FruitPractice {
    public static void main(String[] args) {
        Ananas ananas = new Ananas(20, new String[]{"A", "C"});
//        ananas.setCallulose(20);
//        ananas.setSugar(10);
//        ananas.setVitamins(new String[]{"A", "C"});
        System.out.println(ananas);

        System.out.println(ananas.hashCode());

    }
}
