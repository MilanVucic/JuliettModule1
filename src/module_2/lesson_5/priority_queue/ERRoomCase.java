package module_2.lesson_5.priority_queue;

public class ERRoomCase implements HasPriority{
    private String patientName;
    private int priority;

    @Override
    public int getPriority() {
        return priority;
    }
}
