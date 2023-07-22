package andfxx.p10.otherusefultechniques.enumanditerator;

public class Person {
    private final String name;
    private final Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return name + ", " + education.name();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person person)) {
            return false;
        }

        return this.name.equalsIgnoreCase(person.name) && this.education.equals(person.education);
    }
}
