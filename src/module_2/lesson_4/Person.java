package module_2.lesson_4;

public class Person implements Comparable<Person>, SaveableToFile{
    private String name;

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    @Override
    public void saveToFile(String filename) {
        // name...
    }
}
