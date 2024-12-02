package lesson_13.shapes;

public class Circle {
    public static final int DEFAULT_RADIUS = 1;
    private double radius;
    private Point2D center;

    public Circle(double radius, Point2D center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius, double x, double y) {
        this(radius, new Point2D(x, y));
    }

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle() {
        this(DEFAULT_RADIUS);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public boolean intersects(Circle other) {
        return center.distanceTo(other.center) < radius + other.radius;
    }

    public static boolean intersect(Circle c1, Circle c2) {
        return c1.intersects(c2);
    }

    public boolean contains(Circle other) {
        // TODO: Additional Homework
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
