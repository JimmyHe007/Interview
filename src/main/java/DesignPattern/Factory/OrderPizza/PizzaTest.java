package DesignPattern.Factory.OrderPizza;

import DesignPattern.Factory.OrderPizza.Pizza.Pizza;
import DesignPattern.Factory.OrderPizza.Store.ChicagoStore;
import DesignPattern.Factory.OrderPizza.Store.NYPizzaStore;
import DesignPattern.Factory.OrderPizza.Store.PizzaStore;

/**
 * 一个Store即为一个工厂类, 生产出不同类型的披萨. 通过传参确定具体实例化哪一个
 */
public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("B: " + pizza.getName() + "\n");
    }

}
