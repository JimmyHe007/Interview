package pers.shawn.interview.designPattern.strategy;

import pers.shawn.interview.designPattern.strategy.behavior.impl.FlyWithWings;
import pers.shawn.interview.designPattern.strategy.behavior.impl.Quack;

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
