package Concurrent.Interrupt;

/**
 * 可以用isInterrupted()方法检测线程是否有中断标识, 初始为false, 调用interrupt()方法后为true, 调用sleep方法抛出异常后为false
 */
public class InterruptCheck {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Point A: t.isInterrupted()=" + t.isInterrupted());
        t.interrupt();
        System.out.println("Point B: t.isInterrupted()=" + t.isInterrupted());
        System.out.println("Point C: t.isInterrupted()=" + t.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("was NOT interrupted");
        } catch (InterruptedException e) {
            System.out.println("was interrupted");
        }
        System.out.println("Point D: t.isInterrupted()=" + t.isInterrupted());
    }

}
