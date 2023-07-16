package andfxx.p10.comparableinterface.compareto;

public record Person(String name, int height) implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.height, this.height);
    }
}
