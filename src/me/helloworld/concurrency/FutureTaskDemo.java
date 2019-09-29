package me.helloworld.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Jacob
 * @date 2019/9/29
 */
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> task = new FutureTask<>(new MyCallable());
        new Thread(task).start();
        if (!task.isDone()) {
            System.out.println("Task is not finished, please wait");
        }
        System.out.println("Task done, the return value is " + task.get());
    }
}
