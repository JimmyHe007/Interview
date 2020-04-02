package pers.shawn.interview.designPattern.proxy.remote.gumball.machine;

import pers.shawn.interview.designPattern.proxy.remote.gumball.machine.action.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * GumballMachineRemote class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;

}
