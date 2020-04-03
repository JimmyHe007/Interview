package pers.shawn.interview.designPattern.compound.multiple.composite;

import pers.shawn.interview.designPattern.compound.multiple.bean.Quackable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observer;

import java.util.ArrayList;

/**
 * Flock class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class Flock implements Quackable {

    Observable observable;
    ArrayList<Quackable> ducks = new ArrayList<>();

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
        }
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
