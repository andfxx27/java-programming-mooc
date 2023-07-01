package andfxx.p6.separatinguifromlogic.graderegister;

import java.util.Scanner;

public class GradeRegisterTextUi {
    private final Scanner scanner;
    private final GradeRegister gradeRegister;

    public GradeRegisterTextUi(Scanner scanner, GradeRegister gradeRegister) {
        this.scanner = scanner;
        this.gradeRegister = gradeRegister;
    }

    public void start() {
        readPoints();
        printGradeDistribution();

        System.out.println();
        System.out.println("The average of points: " + this.gradeRegister.averageOfPoints());

        System.out.println();
        System.out.println("The average of grades: " + this.gradeRegister.averageOfGrades());
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = this.scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            int points = Integer.parseInt(input);
            if (points < 0 || points > 100) {
                System.out.println("Impossible score.");
                continue;
            }

            this.gradeRegister.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = gradeRegister.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
