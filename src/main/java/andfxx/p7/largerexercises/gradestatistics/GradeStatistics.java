package andfxx.p7.largerexercises.gradestatistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeStatistics {
    private final List<Integer> grades;
    private final List<Integer> points;
    private final int passingGrade = 50;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    private void addGradeFromPoint(int point) {
        if (point < 50) {
            grades.add(0);
        } else if (point < 60) {
            grades.add(1);
        } else if (point < 70) {
            grades.add(2);
        } else if (point < 80) {
            grades.add(3);
        } else if (point < 90) {
            grades.add(4);
        } else {
            grades.add(5);
        }
    }

    public void addPoint(int point) {
        if (point >= 1 && point <= 100) {
            this.points.add(point);
            this.addGradeFromPoint(point);
        }
    }

    public double calculateTotalPointAverage() {
        int sumForTotalAverage = 0;
        for (int point : points) {
            sumForTotalAverage += point;
        }

        return 1.0 * sumForTotalAverage / points.size();
    }

    private int calculatePassedPointCount() {
        int passedPointCount = 0;
        for (int point : this.points) {
            if (point >= this.passingGrade) {
                passedPointCount++;
            }
        }

        return passedPointCount;
    }

    public double calculatePassingPointAverage() {
        int sumForPassedAverage = 0;
        for (int point : points) {
            if (point >= this.passingGrade) {
                sumForPassedAverage += point;
            }
        }

        return 1.0 * sumForPassedAverage / calculatePassedPointCount();
    }

    public double calculatePassingPointPercentage() {
        return 100.0 * calculatePassedPointCount() / this.points.size();
    }
}
