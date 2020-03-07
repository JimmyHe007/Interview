package DesignPattern.Factory.OrderPizza.Store;

import DesignPattern.Factory.OrderPizza.Pizza.ChicagoStyleCheesePizza;
import DesignPattern.Factory.OrderPizza.Pizza.NYStyleCheesePizza;
import DesignPattern.Factory.OrderPizza.Pizza.Pizza;

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
