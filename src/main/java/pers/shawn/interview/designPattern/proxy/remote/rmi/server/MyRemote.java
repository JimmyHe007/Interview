package pers.shawn.interview.designPattern.proxy.remote.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * MyRMI class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;

}
