package designPattern.factory.order.store;

import designPattern.factory.order.pizza.NYStyleCheesePizza;
import designPattern.factory.order.pizza.Pizza;

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
