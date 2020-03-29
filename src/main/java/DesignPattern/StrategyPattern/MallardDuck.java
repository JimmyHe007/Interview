package DesignPattern.StrategyPattern;

import DesignPattern.StrategyPattern.Behavior.impl.FlyWithWings;
import DesignPattern.StrategyPattern.Behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
