package concurrency.concurrency18;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new SumTask(new int[]{1, 2, 3, 4, 5}));
        executorService.execute(new SumTask(new int[]{6, 7, 8, 9, 10}));
        executorService.shutdown();
    }
}
