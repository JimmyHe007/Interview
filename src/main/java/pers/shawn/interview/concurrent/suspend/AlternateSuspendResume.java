package pers.shawn.interview.concurrent.suspend;

/**
 * waitWhileSuspended()方法这里会不断请求处理器周期地执行检查
 * 更佳的技术是: 使用"通知-等待"机制
 */
public class AlternateSuspendResume  implements Runnable {

    private volatile int firstVal;
    private volatile int secondVal;
    private volatile boolean suspended;

    @Override
    public void run() {
        try {
            suspended = false;
            firstVal = 0;
            secondVal = 0;
            workMethod();
        } catch (InterruptedException e) {
            System.out.println("Interrupted while in workMethod()");
        }
    }

    public boolean areValuesEqual() {
        return firstVal == secondVal;
    }

    private void workMethod() throws InterruptedException {
        int val = 1;
        while (true) {
            waitWhileSuspended();
            stepOne(val);
            stepTwo(val);
            val++;
            waitWhileSuspended();
            Thread.sleep(200);
        }
    }

    private void stepOne(int newVal) throws InterruptedException {
        firstVal = newVal;
        Thread.sleep(300);
    }

    private void stepTwo(int newVal) {
        secondVal = newVal;
    }

    public void suspendRequest() {
        suspended = true;
    }

    public void resumeRequest() {
        suspended = false;
    }

    private void waitWhileSuspended() throws InterruptedException {
        while (suspended) {
            Thread.sleep(200);
        }
    }
}
