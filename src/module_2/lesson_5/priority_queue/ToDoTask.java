package module_2.lesson_5.priority_queue;

public class ToDoTask implements HasPriority{
    private String name;
    private String description;
    private TaskPriority priority;

    public ToDoTask(String name, String description, TaskPriority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority.ordinal();
    }

    @Override
    public String toString() {
        return name + " " + description + " " + priority;
    }
}
