package pers.shawn.interview.designPattern.compound.multiple.adapter;

import pers.shawn.interview.designPattern.compound.multiple.bean.Goose;
import pers.shawn.interview.designPattern.compound.multiple.bean.Quackable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observable;
import pers.shawn.interview.designPattern.compound.multiple.observe.Observer;

/**
 * GooseAdapter class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "Goose pretending to be a Duck";
    }

}
