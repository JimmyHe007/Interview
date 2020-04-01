package pers.shawn.interview.designPattern.strategy.behavior.impl;

import pers.shawn.interview.designPattern.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
