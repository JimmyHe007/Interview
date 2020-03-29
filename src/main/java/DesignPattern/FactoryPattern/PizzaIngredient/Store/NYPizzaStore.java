package DesignPattern.FactoryPattern.PizzaIngredient.Store;

import DesignPattern.FactoryPattern.PizzaIngredient.Pizza.CheesePizza;
import DesignPattern.FactoryPattern.PizzaIngredient.Pizza.Pizza;
import DesignPattern.FactoryPattern.PizzaIngredient.PizzaIngredient.PizzaIngredientFactory;
import DesignPattern.FactoryPattern.PizzaIngredient.PizzaIngredient.impl.NYPizzaIngredientFactory;

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
