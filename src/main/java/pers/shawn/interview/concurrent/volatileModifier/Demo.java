package pers.shawn.interview.concurrent.volatileModifier;

/**
 * 非volatile修饰的变量, 线程可以把变量保存在寄存器中, 一般CPU执行时会很快刷新Cache, 只有在短时间高并发场景可能出现
 * 这里运行的示例就是即时刷新了, 所以另一个线程的输出不符合预期
 */
public class Demo {

    public static void main(String[] args) {
        try {
            Volatile v = new Volatile();
            Thread.sleep(100);
            Thread t = new Thread(v);
            t.start();
            Thread.sleep(100);
            v.workMethod();
        } catch (InterruptedException e) {
            System.out.println("one of the sleeps was interrupted");
        }
    }

}
