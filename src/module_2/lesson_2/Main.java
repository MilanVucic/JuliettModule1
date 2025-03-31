package module_2.lesson_2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle("#12FB15", 5),
                new Circle("#123AF5", 10),
                new Rectangle("#123AF5", 10, 10),
        };
        for (Shape s : shapes) {
            System.out.println(s);
        }

        System.out.println();
    }

}
