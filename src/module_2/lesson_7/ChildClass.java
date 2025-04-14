package module_2.lesson_7;

public class ChildClass extends ParentClass {

    static int a = 500;
    static int b = a * a;
    static int d = 500;
    static int c = d;

    static {
        System.out.println("ChildClass - Static init block");
    }

    {
        System.out.println("ChildClass - Init block");
    }

    public ChildClass() {
        System.out.println("ChildClass - Constructor");
    }

    public void childMethod() {

    }
}
