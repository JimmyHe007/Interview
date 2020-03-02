package DesignPattern.Strategy.SimUDuck;

import DesignPattern.Strategy.SimUDuck.Behavior.impl.FlyWithWings;
import DesignPattern.Strategy.SimUDuck.Behavior.impl.Quack;

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
