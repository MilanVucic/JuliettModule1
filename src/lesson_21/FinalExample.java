package lesson_21;

import java.util.ArrayList;
import java.util.List;

public class FinalExample {
    final List<String> a = new ArrayList<>();
    final int b = 50;

    public final void doSomething() {
        a.add("asd");
        a.add("asd");
        a.add("asd");
        a.add("asd");
        a.add("asd");
        a.add("asd");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FinalExample) {
            FinalExample other = (FinalExample) obj;
        }
        return super.equals(obj);
    }
}
