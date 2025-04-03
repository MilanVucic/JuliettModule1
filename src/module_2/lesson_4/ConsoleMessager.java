package module_2.lesson_4;

public class ConsoleMessager implements InfoMessager{
    @Override
    public void onMessage(String message, MessageType messageType) {
        // change color based on type
        System.out.println(message);
    }
}
