package pers.shawn.interview.designPattern.compound.multiple.factory;

import pers.shawn.interview.designPattern.compound.multiple.bean.Quackable;

public interface AbstractDuckFactory {

    public Quackable createMallardDuck();
    public Quackable createRedheadDuck();
    public Quackable createDuckCall();
    public Quackable createRubberDuck();

}
