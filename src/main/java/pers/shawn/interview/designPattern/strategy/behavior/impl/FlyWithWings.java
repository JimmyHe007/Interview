package pers.shawn.interview.designPattern.strategy.behavior.impl;

import pers.shawn.interview.designPattern.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
