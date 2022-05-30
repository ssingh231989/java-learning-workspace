package com.interview.practise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SquareCal {


}

public class FeatureThreadDemo {

    public static void main(String ar[]) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        int num = 1000;
        Future f = executorService.submit(() -> {
            Thread.sleep(1000);
            return num * num;
        });

        System.out.println("Is done" + f.isDone());
        System.out.println("Is cancelled" + f.isCancelled());
        System.out.println("Get "+ f.get());
        System.out.println("Is done" + f.isDone());
        System.out.println("Is cancelled" + f.isCancelled());
        executorService.shutdown();
    }
   /* public Future<Integer> calculate(Integer input) {
        return executorService.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }*/
}
