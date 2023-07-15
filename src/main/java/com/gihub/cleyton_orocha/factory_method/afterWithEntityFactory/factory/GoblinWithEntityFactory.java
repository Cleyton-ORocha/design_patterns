package com.gihub.cleyton_orocha.factory_method.afterWithEntityFactory.factory;

import java.math.BigDecimal;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;
import com.gihub.cleyton_orocha.factory_method.domain.Goblin;

public class GoblinWithEntityFactory implements MonsterFactoryEntityFactory {

    @Override
    public Monster createMonster() {
        return new Goblin("Lindoval", "biped", BigDecimal.valueOf(1.2), 2);
    }

}
