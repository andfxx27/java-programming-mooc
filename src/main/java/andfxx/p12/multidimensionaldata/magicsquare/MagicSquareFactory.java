package andfxx.p12.multidimensionaldata.magicsquare;

import java.util.Arrays;

public class MagicSquareFactory {
    public static MagicSquare createMagicSquare(int width) {
        if (width % 2 == 0 || width < 3) {
            throw new IllegalArgumentException("Width must be an odd integer with minimum value of 3.");
        }

        /*
         * Start from center most top row
         *
         * -> Go top-right if the cell is not occupied
         * -> Go down otherwise
         *
         * [8][1][6]
         * [3][5][7]
         * [4][9][2]
         */

        int[][] matrix = new int[width][width];

        // On pause, might come back later if inspired for the algorithm XD

        return new MagicSquare(matrix);
    }
}
