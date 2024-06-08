package Thread;

public class ThreadOne extends Thread{
    @Override
    public void run() {
        // viet code o day
        for(int i = 1; i <= 5; i++)
            System.out.println(i - 10);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
