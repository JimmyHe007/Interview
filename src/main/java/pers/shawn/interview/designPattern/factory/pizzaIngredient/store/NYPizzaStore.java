package pers.shawn.interview.designPattern.factory.pizzaIngredient.store;

import pers.shawn.interview.designPattern.factory.pizzaIngredient.pizza.CheesePizza;
import pers.shawn.interview.designPattern.factory.pizzaIngredient.pizza.Pizza;
import pers.shawn.interview.designPattern.factory.pizzaIngredient.ingredient.PizzaIngredientFactory;
import pers.shawn.interview.designPattern.factory.pizzaIngredient.ingredient.impl.NYPizzaIngredientFactory;

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
