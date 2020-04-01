package pers.shawn.interview.designPattern.strategy.behavior.impl;

import pers.shawn.interview.designPattern.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
