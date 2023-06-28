package andfxx.p5.learningoop;

public class FitByte {
    private final int age;
    private final int restingHeartRate;

    public FitByte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * age);
        return (maximumHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
