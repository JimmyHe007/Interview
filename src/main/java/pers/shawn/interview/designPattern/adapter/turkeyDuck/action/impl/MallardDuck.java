package pers.shawn.interview.designPattern.adapter.turkeyDuck.action.impl;

import pers.shawn.interview.designPattern.adapter.turkeyDuck.action.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
