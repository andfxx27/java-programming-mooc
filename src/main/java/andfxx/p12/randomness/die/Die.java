package andfxx.p12.randomness.die;

import java.util.Random;

public class Die {
    private final Random random;
    private final int numberOfSides;

    public Die(int numberOfSides) {
        this.random = new Random();
        this.numberOfSides = numberOfSides;
    }

    public int throwDie() {
        return this.random.nextInt(this.numberOfSides) + 1;
    }
}
