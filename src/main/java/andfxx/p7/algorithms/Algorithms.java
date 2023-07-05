package andfxx.p7.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms {
    public static void algorithms() {
        System.out.println("Hello world from andfxx.p7.algorithms");

        searching();
    }

    private static void searching() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "Naruto"));
        books.add(new Book(2, "Bleach"));
        books.add(new Book(3, "One Piece"));
        books.add(new Book(4, "HunterxHunter"));
        books.add(new Book(6, "Eyeshield 21"));
        books.add(new Book(8, "Katekyo Hitman Reborn"));
        books.add(new Book(9, "Sket Dance"));
        books.add(new Book(25, "Black Clover"));
        books.add(new Book(35, "Nisekoi"));
        books.add(new Book(45, "Dandadan"));
        books.add(new Book(66, "Sword Art Online"));
        books.add(new Book(89, "Tensura"));

        System.out.println(binarySearch(books, 1));
    }

    private static int binarySearch(ArrayList<Book> books, int searchedId) {
        int startIndex = 0;
        int endIndex = books.size() - 1;

        while (true) {
            if (startIndex > endIndex) {
                break;
            }

            int middleIndex = (startIndex + endIndex) / 2;

            if (books.get(middleIndex).getId() == searchedId) {
                return middleIndex;
            }

            if (books.get(middleIndex).getId() < searchedId) {
                startIndex = middleIndex + 1;
            }

            if (books.get(middleIndex).getId() > searchedId) {
                endIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    private static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }

        return -1;
    }

    private static void readyMadeSortingAlgorithm() {
        // sort int[]
        int[] numbers = {-1, 1, 0, 90, 34, 45, 100};
        System.out.println("Before sort int[]: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sort int[]: " + Arrays.toString(numbers));
        System.out.println();

        // sort String[]
        String[] names = {"Zoro", "Luffy", "Sanji", "Nami", "Usopp"};
        System.out.println("Before sort String[]: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After sort String[]: " + Arrays.toString(names));
        System.out.println();

        // sort ArrayList<Integer>
        List<Integer> integerList = new ArrayList<>();
        integerList.add(-1);
        integerList.add(90);
        integerList.add(-5);
        integerList.add(5);
        System.out.println("Before sort ArrayList<Integer>: " + integerList);
        Collections.sort(integerList);
        System.out.println("After sort ArrayList<Integer>: " + integerList);
        System.out.println();

        // sort ArrayList<String>
        List<String> stringList = new ArrayList<>();
        stringList.add("Naruto");
        stringList.add("Jiraiya");
        stringList.add("Tsunade");
        stringList.add("Neji");
        stringList.add("Hinata");
        System.out.println("Before sort ArrayList<String>: " + stringList);
        Collections.sort(stringList);
        System.out.println("After sort ArrayList<String>: " + stringList);
        System.out.println();
    }

    private static void sorting() {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        System.out.println("Before doing selection sort:");
        System.out.println(Arrays.toString(numbers));

        System.out.println();
        sort(numbers);

        System.out.println();
        System.out.println("After doing selection sort:");
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallest(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int indexOfSmallestFrom(int[] table, int startIndex) {
        return indexOfSmallest(table, startIndex);
    }

    private static int indexOfSmallest(int[] array, int startIndex) {
        int[] slicedArray = Arrays.copyOfRange(array, startIndex, array.length);
        int smallestValue = smallest(slicedArray);

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == smallestValue) {
                return i;
            }
        }

        return startIndex;
    }

    private static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        if (array.length == 1) {
            return array[0];
        }

        int min = array[0];

        for (int val : array) {
            if (val < min) {
                min = val;
            }
        }

        return min;
    }
}
