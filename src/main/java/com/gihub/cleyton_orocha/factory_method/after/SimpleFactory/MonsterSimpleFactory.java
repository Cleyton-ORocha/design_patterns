package com.gihub.cleyton_orocha.factory_method.after.SimpleFactory;

import java.math.BigDecimal;
import java.util.Scanner;

import com.gihub.cleyton_orocha.factory_method.abstracts.Monster;
import com.gihub.cleyton_orocha.factory_method.domain.Goblin;
import com.gihub.cleyton_orocha.factory_method.domain.Mimic;
import com.gihub.cleyton_orocha.factory_method.domain.Spyder;

public class MonsterSimpleFactory {
    public static Monster createMonster(Integer number) {
        Scanner scan = new Scanner(System.in);
        Monster monster = null;

        while (true) {
            if (number == 1) monster = new Spyder("Mosco", "arachnid", BigDecimal.valueOf(2.0), 10);
            if (number == 2) monster = new Mimic("CoolChest", "chest", BigDecimal.valueOf(2.0), 5);
            if (number == 3) monster = new Goblin("Lindoval", "biped", BigDecimal.valueOf(1.2), 2);
            if (monster == null) {
                System.out.println("What is the monster's number?");
                number = Integer.parseInt(scan.next());
            }
        break;
        }

        scan.close();
        return monster;
    }
}
