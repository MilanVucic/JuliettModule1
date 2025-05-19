package module_2.lesson_16;

import java.io.Serializable;

public class Anything implements Serializable {
    private int a;
    private double b;
    private String c;
    private transient int d;

    public Anything(int a, double b, String c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Anything{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                ", d=" + d +
                '}';
    }
}
