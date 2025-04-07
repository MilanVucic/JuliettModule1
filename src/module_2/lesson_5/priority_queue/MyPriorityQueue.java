package module_2.lesson_5.priority_queue;

public interface MyPriorityQueue<T extends HasPriority> {
    // Queue = FIFO - First in first out (First come, first served)
    //               5   4                3   2
    // Prio queue -> [], [milan, marco], [], []

    void put(T item);
    T getNext();
}
