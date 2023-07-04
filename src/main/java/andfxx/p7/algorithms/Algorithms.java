package andfxx.p7.algorithms;

public class Algorithms {
    public static void algorithms() {
        System.out.println("Hello world from andfxx.p7.algorithms");

        sorting();
    }

    private static void sorting() {
        int numbers[] = {6, 5, 8, 7, 11};

        System.out.println(smallest(numbers));
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
