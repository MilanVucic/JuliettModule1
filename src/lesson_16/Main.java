package lesson_16;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    // Find the intersection of 2 arrays.
    // Find the union of 2 arrays.

    // [1,2,3,4,5,6,7,8,9] and [7,8,9,10,11,12,13,14]
    // n + n +... n = n * n = n^2
    // O(n^2) -> O(n)
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        set.add(3);
        set.add(6);
        set.add(9);
        set.remove(5);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            if (elem == 6) {
                iterator.remove();
            }
        }
        System.out.println(set);

        HashSet<Integer> copy = new HashSet<>(set);

        for (Integer elem : copy) {
            if (elem == 9) {
                set.remove(9);
            }
        }
        System.out.println(set);
    }
}
