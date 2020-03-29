package DesignPattern.FactoryPattern.PizzaIngredient;

import DesignPattern.FactoryPattern.PizzaIngredient.Pizza.Pizza;
import DesignPattern.FactoryPattern.PizzaIngredient.Store.NYPizzaStore;
import DesignPattern.FactoryPattern.PizzaIngredient.Store.PizzaStore;

/**
 * 抽象工厂模式, 用来创建一个产品家族,
 */
public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A: " + pizza.getName() + "\n");

    }

}
