package pers.shawn.interview.designPattern.proxy.remote.rmi.client;

import pers.shawn.interview.designPattern.proxy.remote.rmi.server.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Test class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://192.168.0.170:8081/RemoteHello");
            String  s= service.sayHello();
            System.out.println(s);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
