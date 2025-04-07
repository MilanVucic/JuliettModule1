package module_2.lesson_5.priority_queue;

import java.util.*;

public class MapPriorityQueue<T extends HasPriority> implements MyPriorityQueue<T> {
    // item -> take out the trash, 3
    // 3 -> [TOTT, WTD]
    // abc

    // see the doctor, 4
    // 4 -> []
    // wash the dishes, 3

    private SortedMap<Integer, List<T>> map = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    @Override
    public void put(T item) {
        if (map.containsKey(item.getPriority())) {
            map.get(item.getPriority()).add(item);
        } else {
            List<T> items = new ArrayList<>();
            items.add(item);
            map.put(item.getPriority(), items);
        }
    }

    @Override
    public T getNext() {
        if (map.firstKey() != null) {
            List<T> elements = map.get(map.firstKey());
            T elem = elements.removeFirst();
            if (elements.size() == 0) {
                map.remove(map.firstKey());
            }
            return elem;
        }
        return null;
    }
}
