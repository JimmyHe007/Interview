package DesignPattern.DecoratorPattern.Beverage.condiment;

import DesignPattern.DecoratorPattern.Beverage.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
