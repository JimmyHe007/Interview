package DesignPattern.Factory.OrderPizza.Store;

import DesignPattern.Factory.OrderPizza.Pizza.NYStyleCheesePizza;
import DesignPattern.Factory.OrderPizza.Pizza.Pizza;

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
