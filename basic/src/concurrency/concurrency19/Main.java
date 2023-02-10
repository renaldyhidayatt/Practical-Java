package concurrency.concurrency19;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class LogTask implements Runnable {
    public void run() {
        System.out.println("Execution Time: " + LocalDateTime.now());
    }
}

public class Main {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newSingleThreadScheduledExecutor();

        LogTask logTask = new LogTask();

        System.out.println("Submitting Time: " + LocalDateTime.now());

        scheduledExecutorService.schedule(logTask, 5, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
