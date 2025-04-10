package module_2.lesson_6;

public class NamePrinter {
    private String decorator;

    public NamePrinter(String decorator) {
        this.decorator = decorator;
    }

    public void print(String input) {
        System.out.println(decorator + input + decorator);
    }
}
