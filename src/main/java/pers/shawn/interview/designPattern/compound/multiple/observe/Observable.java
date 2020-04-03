package pers.shawn.interview.designPattern.compound.multiple.observe;

import pers.shawn.interview.designPattern.compound.multiple.bean.Quackable;

import java.util.ArrayList;

/**
 * Observable class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class Observable implements QuackObservable {

    static ArrayList<Observer> observers = new ArrayList<>();
    Quackable duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
