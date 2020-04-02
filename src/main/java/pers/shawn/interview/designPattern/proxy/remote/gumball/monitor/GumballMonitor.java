package pers.shawn.interview.designPattern.proxy.remote.gumball.monitor;

import pers.shawn.interview.designPattern.proxy.remote.gumball.machine.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * GumballMonitor class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class GumballMonitor {

    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
