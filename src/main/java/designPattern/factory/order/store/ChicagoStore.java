package designPattern.factory.order.store;

import designPattern.factory.order.pizza.ChicagoStyleCheesePizza;
import designPattern.factory.order.pizza.Pizza;

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
