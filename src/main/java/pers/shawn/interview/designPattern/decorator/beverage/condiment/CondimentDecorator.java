package pers.shawn.interview.designPattern.decorator.beverage.condiment;

import pers.shawn.interview.designPattern.decorator.beverage.bean.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
