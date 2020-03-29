package DesignPattern.DecoratorPattern.Beverage.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(double size) {
        description = "House Blend Coffee";
        setSize(size);
    }

    @Override
    public double cost() {
        return .89;
    }

}
