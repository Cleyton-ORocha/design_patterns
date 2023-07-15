package com.gihub.cleyton_orocha.factory_method.afterWithEntityFactory;

import java.util.Scanner;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;
import com.gihub.cleyton_orocha.factory_method.afterWithEntityFactory.factory.GoblinWithEntityFactory;
import com.gihub.cleyton_orocha.factory_method.afterWithEntityFactory.factory.MimicWithEntityFactory;
import com.gihub.cleyton_orocha.factory_method.afterWithEntityFactory.factory.MonsterFactoryEntityFactory;
import com.gihub.cleyton_orocha.factory_method.afterWithEntityFactory.factory.SpyderWithEntityFactory;

public class AfterWithEntityFactory {
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Monster monster = null;
        MonsterFactoryEntityFactory spyderWithEntityFactory = new SpyderWithEntityFactory();
        MonsterFactoryEntityFactory mimicWithEntityFactory = new MimicWithEntityFactory();
        MonsterFactoryEntityFactory goblinWithEntityFactory = new GoblinWithEntityFactory();

        while (true) {
            System.out.println("What is the monster's number?");
            Integer number = Integer.parseInt(scan.next());
            
            
            if (number == 1) monster = spyderWithEntityFactory.createMonster();
            if (number == 2) monster = mimicWithEntityFactory.createMonster();
            if (number == 3) monster = goblinWithEntityFactory.createMonster();
            if (monster != null) break;
        }

        scan.close();

        System.out.println(monster.toString());
    }
}
