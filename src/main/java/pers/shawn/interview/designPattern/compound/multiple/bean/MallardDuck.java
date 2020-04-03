package pers.shawn.interview.designPattern.compound.multiple.bean;

import pers.shawn.interview.designPattern.compound.multiple.observe.Observable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observer;

/**
 * MallardDuck class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Mallard Duck";
    }
}
