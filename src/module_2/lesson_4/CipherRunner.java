package module_2.lesson_4;

import module_2.lesson_4.cipher.Cipher;

public class CipherRunner {
    private Cipher cipher;
    private InfoMessager infoMessager;

    public CipherRunner(Cipher cipher, InfoMessager infoMessager) {
        this.cipher = cipher;
        this.infoMessager = infoMessager;
    }

    public void run() {
        // ...
        String message = cipher.encrypt("asdasd");
        infoMessager.onMessage(message, MessageType.INFO);
        // ...
        String decrypted = cipher.decrypt("asd");
        infoMessager.onMessage(decrypted, MessageType.INFO);
    }
}
