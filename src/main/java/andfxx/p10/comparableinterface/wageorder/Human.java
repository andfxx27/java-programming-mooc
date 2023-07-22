package andfxx.p10.comparableinterface.wageorder;

public record Human(String name, int wage) implements Comparable<Human> {

    public int compareTo(Human o) {
        return o.wage - this.wage;
    }
}
