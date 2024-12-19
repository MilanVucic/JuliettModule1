package lesson_17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus scelerisque vestibulum urna, et ornare elit condimentum non. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. In quam orci, auctor sed accumsan sed, ultrices eu arcu. Ut dignissim commodo nisl nec dignissim. Proin vel pulvinar arcu, at molestie quam. Duis aliquam orci ex, at volutpat orci interdum interdum. Nam mauris nulla, mollis sit amet efficitur tincidunt, rhoncus et ex. Mauris ultrices sit amet enim ut ullamcorper. Maecenas ut lacus vel erat tristique posuere. Phasellus porttitor, nibh laoreet consectetur luctus, magna risus porttitor justo, at convallis neque turpis at dolor.\n" +
                "\n" +
                "Pellentesque felis libero, facilisis ut orci non, tempor maximus lorem. Pellentesque facilisis sed ante a maximus. Aliquam ultrices, dui rutrum vehicula consectetur, elit sem facilisis arcu, sed efficitur lacus purus id ex. Suspendisse eu diam augue. Morbi lorem nisi, convallis eget gravida id, fermentum id lectus. Duis massa metus, finibus sed risus ut, feugiat euismod mi. Suspendisse auctor tempor ante. Nullam sit amet risus sit amet ex rhoncus fermentum. Morbi volutpat risus ut volutpat mollis. Sed finibus porttitor malesuada. Quisque quis massa eros. Sed euismod dui sollicitudin magna auctor, ac ornare eros blandit. Sed vehicula mi a lacus molestie faucibus. Suspendisse non sagittis erat. Sed justo nulla, sollicitudin vel consequat sit amet, eleifend sit amet purus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.\n" +
                "\n" +
                "Donec euismod semper eleifend. Nulla ut mi nunc. Curabitur tempor sollicitudin justo molestie elementum. Duis euismod, nibh vitae consectetur sodales, massa ligula egestas tortor, eu venenatis diam mauris a mi. Nulla facilisis ipsum vel libero consequat, in tincidunt quam gravida. Aenean euismod lacus vel massa sagittis dapibus. Fusce justo tortor, tempus a interdum sed, congue fermentum risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. In bibendum urna sit amet blandit dapibus. Etiam a dolor sed ex volutpat tristique.\n" +
                "\n" +
                "Ut mollis nulla augue, eget convallis dui venenatis non. Phasellus vitae massa sit amet ante pulvinar feugiat sit amet ac nisl. Vivamus vel quam non orci luctus ultrices ac ac lectus. In dapibus dui quis dolor tristique, vitae rutrum est maximus. Donec tincidunt, diam nec tincidunt gravida, dui eros pretium arcu, id varius ligula augue sed risus. Praesent sed arcu ex. Pellentesque a fringilla neque. Nullam non faucibus tellus, convallis cursus mauris. Nunc scelerisque nec nibh sit amet sodales. Nulla sed auctor risus. Proin eu lorem eu ligula tempor porttitor. Sed in volutpat turpis, id facilisis tortor.\n" +
                "\n" +
                "Pellentesque interdum justo auctor risus facilisis, sit amet euismod ante facilisis. Cras at mollis dui, ac lobortis mauris. Nam sit amet nisl venenatis libero aliquet tincidunt. Sed pellentesque id metus quis volutpat. Fusce ac dapibus erat. Nulla nec vestibulum ex. Vestibulum scelerisque ac nulla ut sagittis. Nam laoreet, felis blandit porttitor pharetra, tortor ante porttitor enim, sit amet accumsan turpis magna eget quam. Morbi nisl nisl, posuere in tellus scelerisque, ullamcorper venenatis neque. Ut sed blandit massa.";
        // 3 -> hello
        // 2 -> love
        // 1 -> LIST<i, stuff, hi>

        Map<String, Integer> wordCount = getWordCount(sentence);
        Map<Integer, List<String>> finalMap = getWordsByNumberOfOccurrences(wordCount);
        for (Integer key: finalMap.keySet()) {
            System.out.println(key + " -> " + finalMap.get(key));
        }

    }

    // 5 -> List<hello, hi>
    private static Map<Integer, List<String>> getWordsByNumberOfOccurrences(Map<String, Integer> input) {
        Map<Integer, List<String>> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            // "hello" -> 5 - this is entry
            // "hi" -> 5
            if (map.containsKey(entry.getValue())) {
                List<String> oldList = map.get(entry.getValue());
                oldList.add(entry.getKey());
                map.put(entry.getValue(), oldList);
            } else {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                map.put(entry.getValue(), list);
            }
        }
        return map;
    }

    // This returns a map of words to their counts
    // e.g. hello -> 3, hi -> 1
    private static Map<String, Integer> getWordCount(String input) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = input.split(" ");
        for (String word: words) {
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    private static void treeStuff() {
        // log2 (1,000) -> 10
        // log2 (1,000,000) -> 20
        // log2 (1,000,000,000) -> 30
        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; //o2.compareTo(o1)
            }
        });
        map.put(1, "some");
        map.put(50, "asd");
        map.put(100, "fc");
        map.put(6, "wqetsda");
        map.put(88, "gwqe");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println(map);
    }

    private static HashMap<Character, Integer> getLetterFrequencies(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (map.containsKey(letter)) {
                Integer letterCount = map.get(letter);
                map.put(letter, letterCount + 1);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }

    private static void showingMaps() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Milan", "Vucic");
        map.put("Richard", "Vagner");
        map.put("Milan", "Something");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void mapMethods(HashMap<String, String> map) {
        System.out.println(map.containsKey("Milan"));
        System.out.println(map.containsKey("Luca"));
        System.out.println(map.containsValue("Vucic"));
        System.out.println(map.containsValue("Vagner"));
        System.out.println(map.get("Milan"));
        System.out.println(map.size());
    }
}
