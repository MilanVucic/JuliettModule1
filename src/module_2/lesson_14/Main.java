package module_2.lesson_14;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<Integer> variable = ThreadLocal.withInitial(() -> 5);
        Thread t1 = new Thread(() -> {
            variable.set(50);
            System.out.println("T1 " + variable.get());
        });
        Thread t2 = new Thread(() -> {
            variable.set(500);
            System.out.println("T2 " + variable.get());
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(variable.get());
    }

    private static void executors() {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
//        Future<Integer> result = scheduler.schedule(checkSomeStuff(), 3, TimeUnit.SECONDS);
//        try {
//            System.out.println(result.get());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        scheduler.shutdown();
    }

    private static Callable<Integer> checkSomeStuff() {
        return () -> 5;
    }
}
