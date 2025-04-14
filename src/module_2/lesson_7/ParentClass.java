package module_2.lesson_7;

public class ParentClass {
    int a = 5;

    static {
        System.out.println("ParentClass - Static init block");
    }

    {
        System.out.println("ParentClass - Init block");
    }

    public ParentClass() {
        System.out.println("ParentClass - Constructor");
    }

    public void parentMethod() {

    }
}
