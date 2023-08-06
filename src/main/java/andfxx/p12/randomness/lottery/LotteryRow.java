package andfxx.p12.randomness.lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryRow {
    private List<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public List<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumbers(int number) {
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        Random random = new Random();

        this.numbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            while (true) {
                int number = random.nextInt(40) + 1;
                if (containsNumbers(number)) {
                    continue;
                }

                this.numbers.add(number);

                break;
            }
        }
    }
}
