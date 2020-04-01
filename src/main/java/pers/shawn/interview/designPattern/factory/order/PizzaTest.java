package pers.shawn.interview.designPattern.factory.order;

import pers.shawn.interview.designPattern.factory.order.pizza.Pizza;
import pers.shawn.interview.designPattern.factory.order.store.ChicagoStore;
import pers.shawn.interview.designPattern.factory.order.store.NYPizzaStore;
import pers.shawn.interview.designPattern.factory.order.store.PizzaStore;

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
