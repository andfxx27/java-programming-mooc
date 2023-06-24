package andfxx.p4.objectsinlist;

public class TelevisionProgram {
    private final String name;
    private final int duration;

    public int getDuration() {
        return this.duration;
    }

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
