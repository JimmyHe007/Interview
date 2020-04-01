package pers.shawn.interview.designPattern.decorator.beverage.condiment;

import pers.shawn.interview.designPattern.decorator.beverage.bean.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .2*getSize();
    }

}
