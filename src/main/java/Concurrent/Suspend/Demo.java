package Concurrent.Suspend;

/**
 * 过期方法设置挂起, 恢复线程, 无法控制挂起时机, 可能造成死锁, 另外执行长时间计算的任务被突然挂起也会导致问题
 * 自定义方法添加挂起标识位, 明确了线程挂起的位置, 在执行业务逻辑前后会进行挂起检查, 因此结果都为true
 * 但是如果stepOne()或者stepTwo()执行时间过长的话, 还是会产生不一致(当在方法之间或执行时挂起线程)
 *
 * 终止线程也可以通过使用标识位来控制
 */
public class Demo {

    public static void main(String[] args) {
//        dsr();
        asr();
    }

    public static void asr() {
        AlternateSuspendResume asr = new AlternateSuspendResume();
        Thread t = new Thread(asr);
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        for (int i = 0; i < 10; i++) {
            asr.suspendRequest();

            //这里休眠时间要大于stepOne()里设置的, 防止在比较时, stepOne操作完成而stepTwo还没执行
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {

            }
            System.out.println("asr.areValuesEqual()=" + asr.areValuesEqual());
            asr.resumeRequest();
            try {
                Thread.sleep((long)Math.random()*2000);
            } catch (InterruptedException e) {

            }
        }
        System.exit(0);
    }

    public static void dsr() {
        DeprecatedSuspendResume dsr = new DeprecatedSuspendResume();
        Thread t = new Thread(dsr);
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        for (int i = 0; i < 10; i++) {
            t.suspend();
            System.out.println("dsr.areValuesEqual()=" + dsr.areValuesEqual());
            t.resume();
            try {
                Thread.sleep((long)(Math.random()*2000));
            } catch (InterruptedException e) {

            }
        }
        System.exit(0);
    }

}
