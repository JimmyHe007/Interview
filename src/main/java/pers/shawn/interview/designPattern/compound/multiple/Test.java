package pers.shawn.interview.designPattern.compound.multiple;

import pers.shawn.interview.designPattern.compound.multiple.adapter.GooseAdapter;
import pers.shawn.interview.designPattern.compound.multiple.bean.*;
import pers.shawn.interview.designPattern.compound.multiple.composite.Flock;
import pers.shawn.interview.designPattern.compound.multiple.decorator.QuackCounter;
import pers.shawn.interview.designPattern.compound.multiple.factory.CountingDuckFactory;
import pers.shawn.interview.designPattern.compound.multiple.observe.Quackologist;

/**
 * Test class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class Test {

    public static void main(String[] args) {
//        Quackable mallard = new QuackCounter(new MallardDuck());
//        Quackable redhead = new QuackCounter(new RedheadDuck());
//        Quackable duck = new QuackCounter(new DuckCall());
//        Quackable rubber = new QuackCounter(new RubberDuck());
//        Quackable gooseDuck = new GooseAdapter(new Goose());

//        DuckFactory factory = new DuckFactory();
        CountingDuckFactory factory = new CountingDuckFactory();
        Quackable mallard = factory.createMallardDuck();
        Quackable redhead = factory.createRedheadDuck();
        Quackable duck = factory.createDuckCall();
        Quackable rubber = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

//        simulate(mallard);
//        simulate(redhead);
//        simulate(duck);
//        simulate(rubber);
//        simulate(gooseDuck);

        Flock allDuck = new Flock();
        allDuck.add(mallard);
        allDuck.add(redhead);
        allDuck.add(duck);
        allDuck.add(rubber);
        allDuck.add(gooseDuck);

//        System.out.println("All Duck Quack");
//        simulate(allDuck);

        Quackable redhead2 = factory.createRedheadDuck();
        Quackable redhead3 = factory.createRedheadDuck();

        Flock redheadDuck = new Flock();
        redheadDuck.add(redhead);
        redheadDuck.add(redhead2);
        redheadDuck.add(redhead3);

//        System.out.println("Redhead Duck Quack");
//        simulate(redheadDuck);

        Quackologist quackologist = new Quackologist();
        allDuck.registerObserver(quackologist);
        simulate(allDuck);

        System.out.println("The ducks quacked " + QuackCounter.getCount());
    }

    static void simulate(Quackable duck) {
        duck.quack();
    }

}
