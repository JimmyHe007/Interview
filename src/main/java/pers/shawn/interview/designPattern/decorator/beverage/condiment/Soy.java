package pers.shawn.interview.designPattern.decorator.beverage.condiment;

import pers.shawn.interview.designPattern.decorator.beverage.bean.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15*getSize();
    }

}
