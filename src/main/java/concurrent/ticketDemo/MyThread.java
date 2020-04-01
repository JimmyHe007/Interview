package concurrent.ticketDemo;

public class MyThread extends Thread {

    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticket > 0) {
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}
