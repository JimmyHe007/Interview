package designPattern.decorator.beverage.condiment;

import designPattern.decorator.beverage.bean.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
