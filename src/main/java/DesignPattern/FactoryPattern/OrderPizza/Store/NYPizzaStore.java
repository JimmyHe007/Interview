package DesignPattern.FactoryPattern.OrderPizza.Store;

import DesignPattern.FactoryPattern.OrderPizza.Pizza.NYStyleCheesePizza;
import DesignPattern.FactoryPattern.OrderPizza.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type == "cheese") {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
