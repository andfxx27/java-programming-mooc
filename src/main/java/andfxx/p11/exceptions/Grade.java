package andfxx.p11.exceptions;

public class Grade {
    private int grade;

    public Grade(int grade) {
        if (grade < 1 || grade > 5) {
            throw new IllegalArgumentException("Invalid grade.");
        }

        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
