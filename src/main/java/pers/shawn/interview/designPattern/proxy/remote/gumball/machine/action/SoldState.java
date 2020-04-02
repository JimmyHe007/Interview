package pers.shawn.interview.designPattern.proxy.remote.gumball.machine.action;

import pers.shawn.interview.designPattern.proxy.remote.gumball.machine.GumballMachine;

/**
 * SoldState class
 *
 * @author hx
 * @module
 * @since 2020/4/1
 */
public class SoldState implements State {

    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
        return false;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
            System.out.println("Waiting for refill");
            gumballMachine.refill(5);
        }
    }

}
