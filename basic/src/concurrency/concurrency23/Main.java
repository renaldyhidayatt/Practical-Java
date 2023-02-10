package concurrency.concurrency23;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


class SumTask implements Runnable {

    private int[] numbers;

    public SumTask(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        int sum = 0;

        for (int number : numbers)
            sum += number;

        System.out.println(Arrays.toString(numbers) + " sum = " + sum);
    }
}

public class Main {

    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();

        executor.execute(new SumTask(new int[]{1, 2, 3, 4, 5}));
        executor.execute(new SumTask(new int[]{6, 7, 8, 9, 10}));

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;

        threadPoolExecutor.shutdown();
    }
}
