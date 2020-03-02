package Concurrent.Interrupt;

/**
 * interrupted()是静态方法, 哪个线程调用返回哪个线程的状态, 会自动重置中断状态为false
 */
public class InterruptReset {

    public static void main(String[] args) {
        System.out.println("Point X: Thread.interrupted()=" + Thread.interrupted());
        Thread.currentThread().interrupt();
        System.out.println("Point Y: Thread.interrupted()=" + Thread.interrupted());
        System.out.println("Point Z: Thread.interrupted()=" + Thread.interrupted());
    }

}
