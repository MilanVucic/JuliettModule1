package module_2.lesson_4.cipher;

public class CipherProvider {
    public static Cipher getCipher(char[] alphabet, int key) {
        return new CaesarCipher(alphabet, key);
    }
}
