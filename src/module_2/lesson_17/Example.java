package module_2.lesson_17;

public class Example {
    private int a;
    private static int b;
    public double c;
    public static float d;

    public Example(int a, double c) {
        System.out.println("int double cons");
        this.a = a;
        this.c = c;
    }

    private Example(int a) {
        System.out.println("int cons");
        this.a = a;
    }

    public int getA() {
        return a;
    }

    private double privateMethod() {
        System.out.println("normal private method");
        return 0;
    }

    private String privateMethod(int num) {
        System.out.println("private method with num: " + num + " a = " + a);
        return "asdf" + num;
    }

    @Override
    public String toString() {
        return "a = " + a + ", c = " + c;
    }
}
