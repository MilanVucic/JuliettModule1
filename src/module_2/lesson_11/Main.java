package module_2.lesson_11;

public class Main {
    public static void main(String[] args) {

        final String ANSI_RED = "\u001B[31m";
        CountdownTimer timer = new CountdownTimer(6000, 100, new TimerInterface() {
            @Override
            public void onTick(int timeRemaining) {
                System.out.println(timeRemaining);
            }

            @Override
            public void onFinished() {
                System.out.println("Finished");
            }
        });
        timer.start();
    }

    private static void timerPrototype() {
        Thread t = new Thread(() -> {
            for (int i = 10; i >=0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
    }

    private static void sleepExample() {
        Thread t = new Thread(() -> {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("World");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Sneaking in");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ending");
        });
        t.start();
        t2.start();
    }

    private static void multipleThreads() {
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
        t1.start();
        t2.start();
        t3.start();
    }
}
