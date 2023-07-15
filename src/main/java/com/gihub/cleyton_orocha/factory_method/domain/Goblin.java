package com.gihub.cleyton_orocha.factory_method.domain;

import java.math.BigDecimal;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;

public class Goblin extends Monster {

    private Integer weapons;

    public Goblin(String name, String type, BigDecimal size, Integer weapons) {
        super(name, type, size);
        this.weapons = weapons;
    }

    public Integer getWeapons() {
        return weapons;
    }

    public void setWeapons(Integer weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Monster [name=" + getName() + ", type=" + getType() + ", size=" + getSize() + ", weapons=" + weapons+ "]";

    }

}
