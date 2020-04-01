package concurrent.interrupt;

public class SleepInterrupt implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("in run() - about to sleep for 20 seconds");
            Thread.sleep(20000);
            System.out.println("in run() - wake up");
        } catch (InterruptedException e) {
            System.out.println("in run() - interrupted while sleeping");
            return;
        }
        System.out.println("in run() - leaving normally");
    }

}
