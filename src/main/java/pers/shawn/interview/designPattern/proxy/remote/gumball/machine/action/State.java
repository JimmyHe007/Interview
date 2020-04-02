package pers.shawn.interview.designPattern.proxy.remote.gumball.machine.action;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();

}
