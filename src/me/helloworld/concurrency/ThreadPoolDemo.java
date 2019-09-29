package me.helloworld.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Jacob
 * @date 2019/9/29
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newCachedThreadPool();
        Future<String> task = threadPool.submit(new MyCallable());

        if (!task.isDone()) {
            System.out.println("Task is not finished, please wait");
        }

        try {
            System.out.println("Task done, the return value is " + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
