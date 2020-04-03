package pers.shawn.interview.designPattern.compound.multiple.factory;

import pers.shawn.interview.designPattern.compound.multiple.bean.*;

/**
 * DuckFactory class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class DuckFactory implements AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
