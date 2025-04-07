package module_2.lesson_5;

public class BoundedGeneric<T extends ExampleClass> {
    private T param;

    public void method() {
        param.doStuff();
    }
}
