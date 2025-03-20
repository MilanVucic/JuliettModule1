package module_1.lesson_13;

public class Example {
    int a = 500;
    static int b = 1000;
    static final double PI = 3.141592;
    static {
        b = 12030;
    }

    {
        a = 1320;
    }

    public void normalMethod() {
        System.out.println("I'm normal yay");
        doSomething();
        b = 500123;
        a = 12301023;
        System.out.println("AREA: " + a * a * PI);
    }

    public static void doSomething() {
        System.out.println("Doing something...");
//        a = 23;
//        normalMethod();
        b = 13;
    }

    public class InnerClass {

    }

    public static class StaticInnerClass {

    }
}
