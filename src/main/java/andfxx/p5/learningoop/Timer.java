package andfxx.p5.learningoop;

public class Timer {
    private final TimerHand second;
    private final TimerHand hundredthOfASecond;

    public Timer() {
        second = new TimerHand(0, 60);
        hundredthOfASecond = new TimerHand(0, 100);
    }

    public void advance() {
        hundredthOfASecond.advance();

        if (hundredthOfASecond.getValue() == 0) {
            second.advance();
        }
    }

    @Override
    public String toString() {
        return String.format("%s:%s", second, hundredthOfASecond);
    }
}
