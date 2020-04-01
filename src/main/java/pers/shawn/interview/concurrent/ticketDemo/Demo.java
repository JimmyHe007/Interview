package pers.shawn.interview.concurrent.ticketDemo;

/**
 * 继承Thread类
 */
public class Demo {

    public static void main(String[] args) {
//        new MyThread().start();
//        new MyThread().start();
//        new MyThread().start();
        MyRunnable my = new MyRunnable();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }

}
