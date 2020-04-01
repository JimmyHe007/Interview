package pers.shawn.interview.concurrent.interrupt;

/**
 * 对catch InterruptedException的地方不加return处理的话会继续执行后面的方法, 因为interrupt()方法只是设置一个标志, 表示被中断
 */
public class SleepDemo {

    public static void main(String[] args) {
        SleepInterrupt si = new SleepInterrupt();
        Thread t = new Thread(si);
        t.start();
        //休眠两秒, 从而确保刚执行的线程有机会执行一段时间
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in main() - interrupting other thread ");
        t.interrupt();
        System.out.println("in main() - leaving");
    }

}
