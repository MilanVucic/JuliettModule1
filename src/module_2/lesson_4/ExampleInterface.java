package module_2.lesson_4;

public interface ExampleInterface {
    void doSomething();
    boolean isCool(double number);
    default void doNewStuff(double a, int b) {
        //..
        helper();
    }

    private void helper() {
        System.out.println("Helping");
    }
}
