package pers.shawn.interview.designPattern.state.action;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();

}
