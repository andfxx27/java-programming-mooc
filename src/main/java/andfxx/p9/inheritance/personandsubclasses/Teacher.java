package andfxx.p9.inheritance.personandsubclasses;

public class Teacher extends Person {
    private final int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" + "Salary " + this.salary + " euro/month";
    }
}
