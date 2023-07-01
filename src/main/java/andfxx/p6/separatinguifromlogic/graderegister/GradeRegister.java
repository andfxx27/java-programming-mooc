package andfxx.p6.separatinguifromlogic.graderegister;

import java.util.ArrayList;
import java.util.List;

public class GradeRegister {
    private final List<Integer> grades;
    private final List<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int pointsToGrade(int points) {
        int grade = -1;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int studentGrade : grades) {
            if (studentGrade == grade) {
                count++;
            }
        }
        return count;
    }

    public double averageOfGrades() {
        if (this.grades.size() == 0) {
            return -1;
        }

        int gradesSum = 0;

        int grade = 5;
        while (grade >= 0) {
            int stars = this.numberOfGrades(grade);
            gradesSum += grade * stars;
            grade = grade - 1;
        }

        return 1.0 * gradesSum / this.grades.size();
    }

    public double averageOfPoints() {
        if (this.points.size() == 0) {
            return -1;
        }

        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return 1.0 * sum / this.points.size();
    }
}
