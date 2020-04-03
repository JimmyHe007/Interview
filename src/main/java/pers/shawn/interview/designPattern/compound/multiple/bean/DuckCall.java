package pers.shawn.interview.designPattern.compound.multiple.bean;

import pers.shawn.interview.designPattern.compound.multiple.observe.Observable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observer;

/**
 * DuckCall class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
        return "Duck Call";
    }
}
