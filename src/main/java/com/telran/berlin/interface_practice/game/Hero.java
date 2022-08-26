package com.telran.berlin.interface_practice.game;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Hero {
    private String name;
    private int power;
    private int lifePoint;

    public Hero(String name, int power, int lifePoint) {
        this.name = name;
        this.power = power;
        this.lifePoint = lifePoint;
    }

    public void decreaseLifePoint(int value) {
        this.setLifePoint(this.getLifePoint() - value);
    }

    public boolean isAlive() {
        return lifePoint > 0;
    }

    public abstract KickResult kick(Hero hero);

}
