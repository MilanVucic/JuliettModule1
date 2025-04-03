package module_2.lesson_4;

public class InterfaceImpl implements ExampleInterface {
    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }

    @Override
    public boolean isCool(double number) {
        return false;
    }
}
