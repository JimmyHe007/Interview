package DesignPattern.DecoratorPattern.Beverage.beverage;

public abstract class Beverage {

    String description = "Unknown Beverage";

    double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
