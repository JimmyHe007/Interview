package designPattern.factory.pizzaIngredient.store;

import designPattern.factory.pizzaIngredient.pizza.CheesePizza;
import designPattern.factory.pizzaIngredient.pizza.Pizza;
import designPattern.factory.pizzaIngredient.ingredient.PizzaIngredientFactory;
import designPattern.factory.pizzaIngredient.ingredient.impl.NYPizzaIngredientFactory;

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
