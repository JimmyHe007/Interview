package DesignPattern.DecoratorPattern.Beverage;

import DesignPattern.DecoratorPattern.Beverage.beverage.Beverage;
import DesignPattern.DecoratorPattern.Beverage.beverage.Espresso;
import DesignPattern.DecoratorPattern.Beverage.beverage.HouseBlend;
import DesignPattern.DecoratorPattern.Beverage.condiment.Mocha;
import DesignPattern.DecoratorPattern.Beverage.condiment.Soy;
import DesignPattern.DecoratorPattern.Beverage.condiment.Whip;

/**
 * 装饰者模式, 动态添加配料计算价格
 * 区分大中小时, 可以在创建组件时传入值, 在装饰者的构造方法中获取到size并计算
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        Beverage beverage1 = new Espresso();
//        beverage1 = new Mocha(beverage1);
//        beverage1 = new Mocha(beverage1);
//        beverage1 = new Whip(beverage1);
//        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
//
//        Beverage beverage2 = new HouseBlend();
//        beverage2 = new Soy(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage = new Espresso(1);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Espresso(0.67);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend(1.33);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }

}
