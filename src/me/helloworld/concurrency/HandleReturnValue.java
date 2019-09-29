package me.helloworld.concurrency;

/**
 * @author Jacob
 * @date 2019/9/28
 */
public class HandleReturnValue implements Runnable {

    private String value;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        value = "value is set";
    }


    public static void main(String[] args) throws InterruptedException {

        HandleReturnValue r = new HandleReturnValue();

        Thread thread = new Thread(r);

        thread.start();

//        while (r.value == null) {
//            Thread.sleep(100);
//        }

        thread.join();

        System.out.println(r.value);

    }
}
