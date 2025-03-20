package module_2.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaseClass[] items = new BaseClass[]{
                new BaseClass(),
                new ChildClass1(),
                new ChildClass2()
        };
        for (BaseClass b : items) {
            b.printHello();
            ((ChildClass2) b).specialMethod();
        }

        List<String> a = new ArrayList<>();
        a.add("asd");
    }
}
