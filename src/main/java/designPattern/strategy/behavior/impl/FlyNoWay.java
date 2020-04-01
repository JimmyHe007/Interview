package designPattern.strategy.behavior.impl;

import designPattern.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
