package andfxx.p7.largerexercises.bigyear;

public class Bird {
    private final String name;
    private final String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservationCount() {
        return observationCount;
    }

    public void setObservationCount(int observationCount) {
        this.observationCount = observationCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Bird bird)) {
            return false;
        }

        return this.name.equals(bird.name) && this.latinName.equals(bird.latinName);
    }
}
