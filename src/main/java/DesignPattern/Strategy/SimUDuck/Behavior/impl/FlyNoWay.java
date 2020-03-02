package DesignPattern.Strategy.SimUDuck.Behavior.impl;

import DesignPattern.Strategy.SimUDuck.Behavior.Interface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
