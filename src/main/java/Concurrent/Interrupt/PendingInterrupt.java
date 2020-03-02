package Concurrent.Interrupt;

/**
 * 当不传参时, sleep正常执行, elapsedTime在2000附近, 传参时, 在sleep方法检测到线程被中断, 立即抛出InterruptedException
 */
public class PendingInterrupt {

    public static void main(String[] args) {
        if (args.length > 0) {
            //中断当前线程, 即Main
            Thread.currentThread().interrupt();
        }
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
            System.out.println("was NOT interrupted");
        } catch (InterruptedException e) {
            System.out.println("was interrupted");
        }
        System.out.println("elapsedTime=" + (System.currentTimeMillis()- startTime));
    }

}
