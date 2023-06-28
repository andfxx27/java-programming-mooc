package andfxx.p5.methodandconstructoroverloading;

public class Person {
    private final String name;
    private final int age;

    public Person(String name) {
        // Use "this" keyword to refer other constructor
        // If a constructor call another constructor, "this" keyword must be called first
        // Below call is same as setting instance name to constructor parameter name and instance age to 0
        this(name, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am " + age + " year(s) old.";
    }
}
