package DesignPattern.StrategyPattern.Behavior.impl;

import DesignPattern.StrategyPattern.Behavior.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
