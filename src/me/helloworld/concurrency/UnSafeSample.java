package me.helloworld.concurrency;

/**
 * @author Jacob
 * @date 2019/9/11
 */
public class UnSafeSample implements Runnable {

    static UnSafeSample instance = new UnSafeSample();
    static int a = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            a++;
        }
    }
}
