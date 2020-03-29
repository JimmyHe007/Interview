package DesignPattern.FactoryPattern.OrderPizza.Store;

import DesignPattern.FactoryPattern.OrderPizza.Pizza.ChicagoStyleCheesePizza;
import DesignPattern.FactoryPattern.OrderPizza.Pizza.Pizza;

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
