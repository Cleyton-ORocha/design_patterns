package com.gihub.cleyton_orocha.factory_method.after.EntityFactory.factory;

import java.math.BigDecimal;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;
import com.gihub.cleyton_orocha.factory_method.domain.Spyder;

public class SpyderWithEntityFactory implements MonsterFactoryEntityFactory {

    @Override
    public Monster createMonster() {
        return new Spyder("Mosco", "arachnid", BigDecimal.valueOf(2.0), 10);
    }

}
