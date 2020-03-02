package DesignPattern.Strategy.SimUDuck.Behavior.impl;

import DesignPattern.Strategy.SimUDuck.Behavior.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
