package module_2.lesson_17.dynamic_proxy;

public class SomeImpl implements SomeInterface{
    @Override
    public void doStuff() {
        System.out.println("I'm doing stuff...");
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
        System.out.println("I'm done");
    }

    @Override
    public int doMoreStuff() {
        System.out.println("doing more stuff");
        return 5;
    }
}
