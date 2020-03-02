package DesignPattern.Strategy.SimUDuck;

import DesignPattern.Strategy.SimUDuck.Behavior.impl.FlyNoWay;
import DesignPattern.Strategy.SimUDuck.Behavior.impl.Quack;

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
