package concurrency.concurrency22;

class Counter implements Runnable {
    int commonCounter;

    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>();

    public void run() {
        commonCounter++;

        if(threadLocalCounter.get() != null) {
            threadLocalCounter.set(threadLocalCounter.get().intValue() + 1);
        } else {
            threadLocalCounter.set(1);
        }

        System.out.println("commonCounter: " + commonCounter);
        System.out.println("threadLocalCounter: " + threadLocalCounter.get());
    }
}

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread counterThreadA = new Thread(counter);
        Thread counterThreadB = new Thread(counter);
        Thread counterThreadC = new Thread(counter);

        counterThreadA.start();
        counterThreadB.start();
        counterThreadC.start();


        try {
            counterThreadA.join();
            counterThreadB.join();
            counterThreadC.join();

        } catch (Exception e) {

        }
    }
}
