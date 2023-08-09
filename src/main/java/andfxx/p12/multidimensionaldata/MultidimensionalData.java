package andfxx.p12.multidimensionaldata;

import andfxx.p12.multidimensionaldata.magicsquare.MagicSquare;
import andfxx.p12.multidimensionaldata.magicsquare.MagicSquareFactory;

public class MultidimensionalData {
    public static void multidimensionalData() {
        System.out.println("Hello world from andfxx.p12.multidimensionaldata");

        magicSquare();
    }

    private static void magicSquare() {
        int[][] m1 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        int[][] m2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        MagicSquare ms1 = new MagicSquare(m1);
        MagicSquare ms2 = new MagicSquare(m2);

        System.out.println(ms1.sumsOfRows());
        System.out.println(ms2.sumsOfRows());

        System.out.println("===");

        System.out.println(ms1.sumsOfColumns());
        System.out.println(ms2.sumsOfColumns());

        System.out.println("===");

        System.out.println(ms1.sumsOfDiagonals());
        System.out.println(ms2.sumsOfDiagonals());

        System.out.println("===");

        MagicSquare ms3 = MagicSquareFactory.createMagicSquare(3);

        System.out.println(ms3.sumsOfRows());
    }

    private static void arrayAsAString() {
        int[][] matrix = {{3, 2, 7, 6}, {2, 4, 1, 0}, {3, 2, 1, 0}};

        System.out.println(arrayAsAString(matrix));
    }

    private static String arrayAsAString(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                stringBuilder.append(matrix[row][col]);
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
