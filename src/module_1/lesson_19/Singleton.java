package module_1.lesson_19;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
