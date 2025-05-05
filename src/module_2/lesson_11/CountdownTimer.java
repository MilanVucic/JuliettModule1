package module_2.lesson_11;

public class CountdownTimer {
    public static final int DEFAULT_TICK = 1000;
    private int time; // in millis 10000
    private int tickDuration;// 500
    private TimerInterface timerInterface;

    public CountdownTimer(int time, TimerInterface timerInterface) {
        this(time, DEFAULT_TICK, timerInterface);
    }

    public CountdownTimer(int time, int tickDuration, TimerInterface timerInterface) {
        this.time = time;
        this.tickDuration = tickDuration;
        this.timerInterface = timerInterface;
    }

    public void start() {
        while (time > 0) {
            timerInterface.onTick(time);
            time -= tickDuration;
            try {
                Thread.sleep(tickDuration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        timerInterface.onFinished();
    }
}
