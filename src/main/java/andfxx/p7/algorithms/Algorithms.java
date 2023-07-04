package andfxx.p7.algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void algorithms() {
        System.out.println("Hello world from andfxx.p7.algorithms");

        sorting();
    }

    private static void sorting() {
        int[] numbers = {6, 5, 8, 7, 11};

        System.out.println(indexOfSmallestFrom(numbers, 0));
        System.out.println(indexOfSmallestFrom(numbers, 1));
        System.out.println(indexOfSmallestFrom(numbers, 2));
    }

    private static int indexOfSmallestFrom(int[] table, int startIndex) {
        return -1;
    }

    private static int indexOfSmallest(int[] array) {
        int smallestValue = smallest(array);

        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestValue) {
                return i;
            }
        }

        return idx;
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
