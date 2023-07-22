package andfxx.p10.comparableinterface.studentsonalphabeticalorder;

public record Student(String name) implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
