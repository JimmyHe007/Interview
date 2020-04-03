package pers.shawn.interview.designPattern.compound.multiple.observe;

/**
 * Quackologist class
 *
 * @author hx
 * @module
 * @since 2020/4/3
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable observable) {
        System.out.println("Quackologist: " + observable + " just quacked.");
    }

}
