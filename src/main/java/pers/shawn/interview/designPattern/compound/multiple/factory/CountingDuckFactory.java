package pers.shawn.interview.designPattern.compound.multiple.factory;

import pers.shawn.interview.designPattern.compound.multiple.bean.*;
import pers.shawn.interview.designPattern.compound.multiple.decorator.QuackCounter;

/**
 * CountingDuckFactory class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class CountingDuckFactory implements AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

}
