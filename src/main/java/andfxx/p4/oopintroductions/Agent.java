package andfxx.p4.oopintroductions;

public class Agent {
    private final String firstName;
    private final String lastName;

    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "My name is " + this.lastName + ", " + firstName + " " + lastName;
    }
}
