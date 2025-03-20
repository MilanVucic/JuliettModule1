package module_2.lesson_1;

public class BaseClass {
    private int a;

    public void setA(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("!!!");
        }
        this.a = a;
    }

    public void printHello() {
        System.out.println("Hello from BaseClass");
    }
}
