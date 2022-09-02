package com.telran.berlin.inheritance_practice.fruit;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Arrays;

@EqualsAndHashCode
@ToString
public class Ananas extends Fruit {

    public Ananas(int sugar, String[] vitamins) {
        super(sugar, vitamins);

        System.out.println("subclass constructor");
        System.out.println("subclass hashcode " + this.hashCode());
        System.out.println(this.getClass().getSimpleName());
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String[] getVitamins() {
        return vitamins;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Ananas)) return false;
//        if (!super.equals(o)) return false;
//
//        Ananas ananas = (Ananas) o;
//
//        return callulose == ananas.callulose;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = this.sugar;
//        result = result + Arrays.hashCode(this.vitamins);
//        result = 31 * result + this.callulose;
//        return result;
//    }

//    @Override
//    public String toString() {
//        return "Ananas{" +
//                "callulose=" + callulose +
//                ", sugar=" + sugar +
//                ", vitamins=" + Arrays.toString(vitamins) +
//                '}';
//    }
}
