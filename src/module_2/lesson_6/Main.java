package module_2.lesson_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Milan", "Mikhail", "Michael", "Max", "Max", "Alexander");
        List<String> filtered = names.stream().filter(s -> s.startsWith("M"))
                .sorted(Main::orderStringsByLengthDesc)
                .distinct()
                .toList();
        System.out.println(filtered);

        List<Integer> nameLengths = names.stream()
                .sorted(Main::orderStringsByLengthDesc)
                .map(String::length)
                .distinct()
                .toList();
        System.out.println(nameLengths);

        List<String> reversed = names.stream()
                .map(Main::reverse)
                .toList();
        System.out.println(reversed);

        System.out.println(names.stream().anyMatch(s -> s.startsWith("M")));
        System.out.println(names.stream().anyMatch(s -> s.startsWith("C")));
        System.out.println(names.stream().allMatch(s -> s.length() >= 3));
        System.out.println(names.stream().allMatch(s -> s.length() > 3));

        Optional<String> result = names.stream().findFirst();
        String finalRes = result.orElse("asdfg");
    }

    private static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    private static int orderStringsByLengthDesc(String s1, String s2) {
        return s2.length() - s1.length();
    }

    private static void lambdaExamples() {
        // 1 -> "asd"
        // 2 -> "asdwqe"
        // 3 ->
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
        SortedMap<Integer, String> map = new TreeMap<>(Main::myComparison);
        SortedMap<Integer, String> map2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        List<String> names = List.of("Milan", "Mikhail", "Michael");
        NamePrinter namePrinter = new NamePrinter("*");
        names.forEach(Main::printName);
        names.forEach(namePrinter::print);
        names.forEach(NamePrinter::new); // pass a constructor (weird)

        names.forEach(System.out::println);
    }

    private static int myComparison(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }

    private static void printName(String s) {
        System.out.println(s);
    }
}
