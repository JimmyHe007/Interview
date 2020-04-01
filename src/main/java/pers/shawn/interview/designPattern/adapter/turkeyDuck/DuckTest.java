package pers.shawn.interview.designPattern.adapter.turkeyDuck;

import pers.shawn.interview.designPattern.adapter.turkeyDuck.action.Duck;
import pers.shawn.interview.designPattern.adapter.turkeyDuck.action.Turkey;
import pers.shawn.interview.designPattern.adapter.turkeyDuck.action.TurkeyAdapter;
import pers.shawn.interview.designPattern.adapter.turkeyDuck.action.impl.MallardDuck;
import pers.shawn.interview.designPattern.adapter.turkeyDuck.action.impl.WildTurkey;

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
