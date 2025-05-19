package module_2.lesson_16;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Anything a = new Anything(1, 5.4, "Milan", 123);

        writeSerializedToFile(a);
        Anything b = readSerializedFromFile();
        System.out.println(a);
        System.out.println(b);
    }

    private static Anything readSerializedFromFile() {
        try {
            FileInputStream fin = new FileInputStream("test.ser");
            ObjectInputStream oos = new ObjectInputStream(fin);
            return (Anything) oos.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeSerializedToFile(Anything a) {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("test.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
