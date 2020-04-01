package concurrent.interrupt;

/**
 * 线程A调用线程B的join方法, 则线程A等待B执行完毕再执行
 * yield是静态方法, 会让出CPU执行权给同等级的线程, 如果没有相同级别的线程在等待CPU的执行权, 则该线程继续执行
 */
public class YieldAndJoinDemo {

    public static void main(String[] args) throws InterruptedException {

//        Thread.yield();
        Thread t = new Thread(() -> {
            try {
                //休眠5s, 让主线程优先执行
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
            }
        });
        t.start();
//        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("main-" + i);
        }

    }

}
