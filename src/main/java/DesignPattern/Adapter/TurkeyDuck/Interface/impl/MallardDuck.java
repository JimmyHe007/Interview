package DesignPattern.Adapter.TurkeyDuck.Interface.impl;

import DesignPattern.Adapter.TurkeyDuck.Interface.Duck;

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
