package module_2.lesson_4.cipher;

public class CaesarCipher implements Cipher{
    private char[] alphabet;
    private int key;

    public CaesarCipher(char[] alphabet, int key) {
        this.alphabet = alphabet;
        this.key = key;
    }

    @Override
    public String encrypt(String input) {
        return null;
    }

    @Override
    public String decrypt(String input) {
        return null;
    }
}
