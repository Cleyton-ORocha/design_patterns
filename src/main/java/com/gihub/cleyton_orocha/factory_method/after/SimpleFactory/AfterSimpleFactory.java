package com.gihub.cleyton_orocha.factory_method.after.SimpleFactory;

public class AfterSimpleFactory {

    /*
     *     As vantagens de um Simple Factory são a simplificação da aplicação em virtude de uma
     * futura modificação de código. Caso precise adicionar um novo Monster toda sua a complexidade
     * fica em uma unica factory e o client não conhece a entiry, reforçando o encapsulamento com o 
     * grupo entity sendo visto somente pela factory.
     * 
     *     O Half-Simple já especifica que é preciso separar as factories para um seleto tipo de Monstro
     * (Ou Iphone como diz o UML). O db tem a mesma ideia mostrando que um tal bd pode ser usado em virtude 
     * da chamada da factory.
     * 
     *     Elas em conjunto fazem com que o cliente não precise se adequar a adição ou não de uma nova classe
     * mantendo as regras na factory e mantendo o Princípio da Substituição de Liskov do SOLID com a abstração sendo passada
     * em vez da entidade.
     */

    public static void main(String[] args) {
        System.out.println(MonsterSimpleFactory.createMonster(1).toString());
    }
}
