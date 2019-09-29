package me.helloworld.concurrency;

import java.util.concurrent.Callable;

/**
 * @author Jacob
 * @date 2019/9/28
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {

        String value = "Test";
        System.out.println("Ready to work");
        Thread.sleep(5000);
        System.out.println("Task completed");
        return value;
    }
}
