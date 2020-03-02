package DesignPattern.Strategy.SimUDuck.Behavior.impl;

import DesignPattern.Strategy.SimUDuck.Behavior.Interface.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
