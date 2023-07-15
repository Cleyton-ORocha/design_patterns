package com.gihub.cleyton_orocha.factory_method.abstracts;

import java.math.BigDecimal;

public abstract class Monster {
    private String name;
    private String type;
    private BigDecimal size;

    protected Monster(String name, String type, BigDecimal size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

}
