package andfxx.p11.exceptions.validatingparameters;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        if ((name == null || name.isEmpty() || name.length() > 40) || (age < 0 || age > 120)) {
            throw new IllegalArgumentException("Name must be between 1-40 chars, age must be between 1-120.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " years old";
    }
}
