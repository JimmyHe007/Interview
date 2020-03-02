package DesignPattern.Strategy.SimUDuck.Behavior.impl;

import DesignPattern.Strategy.SimUDuck.Behavior.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
