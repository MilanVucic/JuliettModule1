package lesson_21;

import java.io.Closeable;
import java.io.IOException;

public class CloseableExample implements AutoCloseable {
    protected static int a;

    @Override
    public void close() throws IOException {
        System.out.println("I'm closing...");
    }

    public void randomMethod() {
        System.out.println("Doing something");
    }
}
