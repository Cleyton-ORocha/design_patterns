package com.gihub.cleyton_orocha.factory_method.domain;

import java.math.BigDecimal;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;

public class Spyder extends Monster {

    private Integer amountOfWeb;

    public Spyder(String name, String type, BigDecimal size, Integer amountOfWeb) {
        super(name, type, size);
        this.amountOfWeb = amountOfWeb;
    }

    public Integer getAmountOfWeb() {
        return amountOfWeb;
    }

    public void setAmountOfWeb(Integer amountOfWeb) {
        this.amountOfWeb = amountOfWeb;
    }

    @Override
    public String toString() {
        return "Monster [name=" + getName() + ", type=" + getType() + ", size=" + getSize() + ", amountOfWeb=" + amountOfWeb + "]";
    }

}
