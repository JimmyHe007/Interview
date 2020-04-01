package pers.shawn.interview.designPattern.state.action;

import pers.shawn.interview.designPattern.state.GumballMachine;

/**
 * NoQuarterState class
 *
 * @author hx
 * @module
 * @since 2020/4/1
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned, but there's no quarter");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

}
