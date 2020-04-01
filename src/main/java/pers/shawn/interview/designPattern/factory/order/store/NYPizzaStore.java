package pers.shawn.interview.designPattern.factory.order.store;

import pers.shawn.interview.designPattern.factory.order.pizza.NYStyleCheesePizza;
import pers.shawn.interview.designPattern.factory.order.pizza.Pizza;

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
