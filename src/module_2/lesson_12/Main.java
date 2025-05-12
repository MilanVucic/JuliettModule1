package module_2.lesson_12;

import java.util.Calendar;
import java.util.concurrent.*;

public class Main {

    // Additional HW:
    // Create a multithreaded program to calculate the sum of
    // a large array of numbers. Split the work between 4 threads (or 8)
    volatile int a = 50;
    // 0 - 500
    // 501 - 1000
    // 1001 - 1500

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(() -> {
            System.out.println("...Calculating...");
            return 99;
        });
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }

    private static void factoryExample() {
        ShapeFactory factory = new CircleFactory();
        Shape circle = factory.produce();

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

        Calendar calendar = Calendar.getInstance();
    }

    private static void prioritiesExample() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T1: " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T2: " + i);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("T3: " + i);
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }

    private static void deadlockExample() {
        Object a = new Object();
        Object b = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (a) {
                System.out.println("T1 doing something with a");
                synchronized (b) {
                    System.out.println("T1 doing stuff with b");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (b) {
                System.out.println("T2 doing something with b");
                synchronized (a) {
                    System.out.println("T2 doing stuff with a");
                }
            }
        });
        t1.start();
        t2.start();
    }

    private static void joinExample() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T1: " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T2: " + i);
            }
        });
        t1.start();
        t2.start();
        try {
            System.out.println("Doing main thread stuff");
            t1.join();
            t2.join();
            System.out.println("Done");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void mutexExample() {
        Object a = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (a) {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("T1: " + i);
                }
            }
            System.out.println("Ending T1");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Starting T2");
            synchronized (a) {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("T2: " + i);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
