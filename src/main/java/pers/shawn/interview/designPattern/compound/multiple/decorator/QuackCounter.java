package pers.shawn.interview.designPattern.compound.multiple.decorator;

import pers.shawn.interview.designPattern.compound.multiple.bean.Quackable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observer;

/**
 * QuackCounter class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class QuackCounter implements Quackable {

    Observable observable;
    Quackable duck;
    static int count = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

}
