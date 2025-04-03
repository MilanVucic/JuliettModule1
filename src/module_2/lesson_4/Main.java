
package module_2.lesson_4;

import module_2.lesson_4.cipher.Cipher;
import module_2.lesson_4.cipher.CipherProvider;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<SaveableToFile> stuffToSave = new ArrayList<>();
        stuffToSave.add(new Person());
        stuffToSave.add(new Car());

        for (SaveableToFile s: stuffToSave) {
            s.saveToFile("file.txt");
        }

        Cipher cipher = CipherProvider.getCipher(new char[] {'a','b','c'}, 5);
        cipher.encrypt("asdasd");

    }
}
