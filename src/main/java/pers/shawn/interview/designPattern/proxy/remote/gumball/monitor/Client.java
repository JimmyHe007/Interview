package pers.shawn.interview.designPattern.proxy.remote.gumball.monitor;

import pers.shawn.interview.designPattern.proxy.remote.gumball.machine.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Client class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class Client {

    public static void main(String[] args) {
        try {
            GumballMonitor monitor = new GumballMonitor((GumballMachineRemote) Naming.lookup("rmi://192.168.0.170:8081/gumballMachine"));
            System.out.println(monitor);
            System.out.println("----------");
            monitor.report();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
