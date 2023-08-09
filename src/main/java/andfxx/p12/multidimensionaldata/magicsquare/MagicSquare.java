package andfxx.p12.multidimensionaldata.magicsquare;

import java.util.ArrayList;

public class MagicSquare {
    private final int[][] square;

    public MagicSquare(int[][] square) {
        this.square = square;
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < this.square.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < this.square[i].length; j++) {
                rowSum += this.square[i][j];
            }

            result.add(rowSum);
        }

        return result;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < this.square.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < this.square[i].length; j++) {
                rowSum += this.square[j][i];
            }

            result.add(rowSum);
        }

        return result;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> result = new ArrayList<>();

        // First diagonal
        int idx1 = 0;
        int idx2 = 0;

        int firstSum = 0;

        do {
            firstSum += this.square[idx1][idx2];

            idx1++;
            idx2++;

        } while (idx1 < this.square.length && idx2 < this.square.length);

        result.add(firstSum);

        // Second diagonal
        idx1 = 0;
        idx2 = this.square[idx1].length - 1;

        int secondSum = 0;

        do {
            secondSum += this.square[idx1][idx2];

            idx1++;
            idx2--;

        } while (idx1 < this.square.length && idx2 >= 0);

        result.add(secondSum);

        return result;
    }
}
