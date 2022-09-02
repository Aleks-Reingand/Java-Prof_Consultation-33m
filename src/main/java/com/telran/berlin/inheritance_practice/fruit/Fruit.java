package com.telran.berlin.inheritance_practice.fruit;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Arrays;

@EqualsAndHashCode
public class Fruit {
    protected int sugar;
    protected String[] vitamins;

    public Fruit(int sugar, String[] vitamins) {
        this.sugar = sugar;
        this.vitamins = vitamins;

        System.out.println("super constructor");
        System.out.println("super hashcode " + this.hashCode());
        System.out.println(this.getClass().getSimpleName());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Fruit)) return false;
//
//        Fruit fruit = (Fruit) o;
//
//        if (sugar != fruit.sugar) return false;
//        // Probably incorrect - comparing Object[] arrays with Arrays.equals
//        return Arrays.equals(vitamins, fruit.vitamins);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = sugar;
//        result = 31 * result + Arrays.hashCode(vitamins);
//        return result;
//    }

    @Override
    public String toString() {
        return "Fruit{" +
                "sugar=" + sugar +
                ", vitamins=" + Arrays.toString(vitamins) +
                '}';
    }
}

