package Concurrent.Suspend;

public class DeprecatedSuspendResume implements Runnable {

    private volatile int firstVal;
    private volatile int secondVal;

    @Override
    public void run() {
        try {
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
            stepOne(val);
            stepTwo(val);
            val++;
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

}
