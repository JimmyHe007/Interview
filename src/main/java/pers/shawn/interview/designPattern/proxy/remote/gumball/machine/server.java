package pers.shawn.interview.designPattern.proxy.remote.gumball.machine;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 * server class
 *
 * @author hx
 * @module
 * @since 2020/4/2
 */
public class server {

    public static void main(String[] args) {
        try {
            GumballMachineRemote gumballMachine = new GumballMachine("NY", 100);
            Registry registry = LocateRegistry.createRegistry(8081);
            registry.rebind("gumballMachine", gumballMachine);
            Scanner sc = new Scanner(System.in);
            System.out.println("购买?(Y/N)");
            String s = sc.nextLine();
            while ("y".equals(s)) {
                ((GumballMachine) gumballMachine).insertQuarter();
                ((GumballMachine) gumballMachine).turnCrank();
                System.out.println("继续购买?(Y/N)");
                s = sc.nextLine();
            }
            System.out.println("退出购买");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
