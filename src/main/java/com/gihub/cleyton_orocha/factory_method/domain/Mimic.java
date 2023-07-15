package com.gihub.cleyton_orocha.factory_method.domain;

import java.math.BigDecimal;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;

public class Mimic extends Monster {

    private Integer treasures;

    public Mimic(String name, String type, BigDecimal size, Integer treasures) {
        super(name, type, size);
        this.treasures = treasures;
    }

    public Integer getTreasures() {
        return treasures;
    }

    public void setTreasures(Integer treasures) {
        this.treasures = treasures;
    }

    @Override
    public String toString() {
        return "Monster [name=" + getName() + ", type=" + getType() + ", size=" + getSize() + ", treasures=" + treasures + "]";
    }

}
