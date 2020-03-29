package DesignPattern.AdapterPattern.TurkeyDuck;

import DesignPattern.AdapterPattern.TurkeyDuck.Interface.Duck;
import DesignPattern.AdapterPattern.TurkeyDuck.Interface.Turkey;
import DesignPattern.AdapterPattern.TurkeyDuck.Interface.impl.MallardDuck;
import DesignPattern.AdapterPattern.TurkeyDuck.Interface.impl.WildTurkey;

public class DuckTest {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
