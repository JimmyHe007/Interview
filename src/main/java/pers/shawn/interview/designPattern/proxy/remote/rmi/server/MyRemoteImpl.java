package pers.shawn.interview.designPattern.proxy.remote.rmi.server;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * MyRemoteImpl class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Registry registry = LocateRegistry.createRegistry(8081);
        MyRemote service = new MyRemoteImpl();
        registry.rebind("RemoteHello", service);
    }

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "aaa";
    }

}
