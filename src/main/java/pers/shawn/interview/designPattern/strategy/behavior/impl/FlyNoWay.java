package pers.shawn.interview.designPattern.strategy.behavior.impl;

import pers.shawn.interview.designPattern.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
