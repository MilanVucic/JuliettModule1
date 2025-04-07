package module_2.lesson_5;

public class GenericExample<T, U> {
    private T param;
    private U another;

    public T getParam() {
        return param;
    }

    public void doStuff(T p1, U p2) {
        // ...
    }
}
