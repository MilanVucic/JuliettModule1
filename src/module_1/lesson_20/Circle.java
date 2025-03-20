package module_1.lesson_20;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius of " + radius + " is not > 0");
        }
        this.radius = radius;
    }
}
