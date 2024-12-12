package lesson_15;

import lesson_13.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Milan");
        arrayList.add("Richard");
        arrayList.add(0, "Michael");
        arrayList.set(0, "Donny");
        arrayList.remove("Milan");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            arrayList.set(i, "asd");
        }
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        arrayLists.add(arrayList);
    }
}
