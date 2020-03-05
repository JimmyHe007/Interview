package DesignPattern.Decorator.Beverage.beverage;

public class Espresso extends Beverage {

    public Espresso(double size) {
        description = "Espresso";
        setSize(size);
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
