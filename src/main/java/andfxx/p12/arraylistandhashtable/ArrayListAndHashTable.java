package andfxx.p12.arraylistandhashtable;

import andfxx.p12.arraylistandhashtable.myhashmap.MyHashMap;
import andfxx.p12.arraylistandhashtable.mylist.MyList;

import java.util.Arrays;
import java.util.Random;

public class ArrayListAndHashTable {
    public static void arrayListAndHashTable() {
        System.out.println("Hello world from andfxx.p12.arraylistandhashtable");

        hashMap();
    }

    private static void hashMap() {
        MyHashMap<String, String> hobbiesMap = new MyHashMap<>();

        hobbiesMap.addPair("Felix", "Manga");
        hobbiesMap.addPair("Jks", "CSGO");

        System.out.println(hobbiesMap.get("Felix"));
        System.out.println(hobbiesMap.get("Jks"));

        hobbiesMap.remove("Jks");

        System.out.println(hobbiesMap.get("Jks"));
    }

    private static void list() {
        MyList<Integer> myList = new MyList<>();

        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            myList.addValue(i);
        }

        myList.addValue(80);

        System.out.println("myList: " + myList);

        System.out.println("Value of myList at index 9: " + myList.get(9));

        System.out.println("myList contains value of 80: " + myList.contains(80));

        myList.remove(10);

        System.out.println("myList after removing value of 10: " + myList);
    }

    private static void sumTheseForMe() {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }

    private static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int fromIndex = Math.max(fromWhere, 0);
        int toIndex = Math.min(toWhere, array.length);

        int sum = 0;

        for (int i = fromIndex; i < toIndex; i++) {
            if (smallest <= array[i] && array[i] <= largest) {
                sum += array[i];
            }
        }

        return sum;
    }

    private static void arrayRevisit_1() {
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[2] = 2;

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println();

        System.out.println("Array's length is " + numbers.length + " characters.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
