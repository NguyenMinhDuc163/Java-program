package Thread;

public class ThreadTwo implements Runnable{
    Thread t1;
    public ThreadTwo() {
    }
    public ThreadTwo(Thread t1) {
        this.t1 = t1;
    }
    @Override
    public void run() {
//        t1.join();
        System.out.println("1 2 3 4");
    }
}
