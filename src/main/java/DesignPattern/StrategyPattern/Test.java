package DesignPattern.StrategyPattern;

import DesignPattern.StrategyPattern.Behavior.impl.FlyRocketPowered;

/**
 * MallardDuck是一个行为固定的类, 无法更改, 通过动态set设定行为, 可以在运行时动态改变行为
 */
public class Test {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
