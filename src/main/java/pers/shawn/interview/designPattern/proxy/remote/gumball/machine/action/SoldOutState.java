package pers.shawn.interview.designPattern.proxy.remote.gumball.machine.action;

import pers.shawn.interview.designPattern.proxy.remote.gumball.machine.GumballMachine;

/**
 * SoldOutState class
 *
 * @author hx
 * @module
 * @since 2020/4/1
 */
public class SoldOutState implements State {

    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned, but there are no gumballs");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}
