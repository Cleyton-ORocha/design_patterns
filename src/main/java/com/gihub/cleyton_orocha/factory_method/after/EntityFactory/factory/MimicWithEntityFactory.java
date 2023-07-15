package com.gihub.cleyton_orocha.factory_method.after.EntityFactory.factory;

import java.math.BigDecimal;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;
import com.gihub.cleyton_orocha.factory_method.domain.Mimic;

public class MimicWithEntityFactory implements MonsterFactoryEntityFactory {

    @Override
    public Monster createMonster() {
        return new Mimic("CoolChest", "chest", BigDecimal.valueOf(2.0), 5);
    }

}
