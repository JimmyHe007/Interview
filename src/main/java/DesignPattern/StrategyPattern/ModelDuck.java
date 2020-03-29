package DesignPattern.StrategyPattern;

import DesignPattern.StrategyPattern.Behavior.impl.FlyNoWay;
import DesignPattern.StrategyPattern.Behavior.impl.Quack;

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
