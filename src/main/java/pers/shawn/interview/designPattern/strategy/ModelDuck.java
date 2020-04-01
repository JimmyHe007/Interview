package pers.shawn.interview.designPattern.strategy;

import pers.shawn.interview.designPattern.strategy.behavior.impl.FlyNoWay;
import pers.shawn.interview.designPattern.strategy.behavior.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
