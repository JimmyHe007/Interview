package pers.shawn.interview.designPattern.factory.order.store;

import pers.shawn.interview.designPattern.factory.order.pizza.ChicagoStyleCheesePizza;
import pers.shawn.interview.designPattern.factory.order.pizza.Pizza;

public class ChicagoStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type == "cheese") {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
