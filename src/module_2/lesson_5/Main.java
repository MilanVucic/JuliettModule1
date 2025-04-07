package module_2.lesson_5;

import module_1.lesson_12.Person;
import module_2.lesson_5.priority_queue.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue<ToDoTask> queue = new MapPriorityQueue<>();
        MyPriorityQueue<ERRoomCase> queue2 = new MapPriorityQueue<>();

        queue.put(new ToDoTask("Trash", "take it out", TaskPriority.LOW));
        queue.put(new ToDoTask("Study", "english test", TaskPriority.MEDIUM));
        queue.put(new ToDoTask("Doctor", "visit the physician", TaskPriority.HIGH));
        queue.put(new ToDoTask("New phone", "buy new phone", TaskPriority.MEDIUM));
        queue.put(new ToDoTask("Fix bugs", "major bugs in production", TaskPriority.URGENT));
        queue.put(new ToDoTask("Fix car", "get the exhaust sorted", TaskPriority.URGENT));

        System.out.println(queue.getNext());
        System.out.println(queue.getNext());
        System.out.println(queue.getNext());
        System.out.println(queue.getNext());
        System.out.println(queue.getNext());
        System.out.println(queue.getNext());
    }

    private static void printList(List<? extends Number> list) {
        Number n = list.get(5);
        for (Number element : list) {
            System.out.println(element);
        }
    }
    // PECS -> Producer Extends, Consumer Super

    private static void fillList(List<? super Number> list) {
        list.add(5.3);
        list.add(5);

        Object b = list.get(5);
    }

    private static <T, U> void doSomething(T first, T another, U second) {
        T param;
        System.out.println(first);
        System.out.println(another);
        System.out.println(second);
    }
}
