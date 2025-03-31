package module_2.lesson_2;

public class Rectangle extends Shape{
    private double a, b;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getCircumference() {
        return 2 * a + 2 * b;
    }
}
