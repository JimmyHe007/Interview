package DesignPattern.Factory.PizzaIngredient.Store;

import DesignPattern.Factory.PizzaIngredient.Pizza.CheesePizza;
import DesignPattern.Factory.PizzaIngredient.Pizza.Pizza;
import DesignPattern.Factory.PizzaIngredient.PizzaIngredient.PizzaIngredientFactory;
import DesignPattern.Factory.PizzaIngredient.PizzaIngredient.impl.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type == "cheese") {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else {
            return null;
        }
        return pizza;
    }
}
