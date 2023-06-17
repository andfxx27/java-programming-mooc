package andfxx.p1.variables;

import java.util.Scanner;

public class Variables {
    static Scanner scanner = new Scanner(System.in);

    public static void variousVariables() {
        int chickenCount = 9000;
        double baconWeightInKg = 0.1;
        String tractorType = "Zetor";

        System.out.println("Chicken:");
        System.out.println(chickenCount);
        System.out.println("Bacon (kg):");
        System.out.println(baconWeightInKg);
        System.out.println("Tractor:");
        System.out.println(tractorType);

        System.out.println();

        System.out.println("And finally, a summary:");
        System.out.println(chickenCount);
        System.out.println(baconWeightInKg);
        System.out.println(tractorType);
    }

    public static void integerInput() {
        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number " + num);
    }

    public static void doubleInput() {
        System.out.println("Give a number:");
        double num = Double.parseDouble(scanner.nextLine());
        System.out.println("You gave the number " + num);
    }

    public static void booleanInput() {
        System.out.println("Give a boolean:");
        boolean bool = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("True or false? " + bool);
    }

    public static void differentTypesOfInput() {
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Give a double:");
        double floatNum = Double.parseDouble(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + floatNum);
        System.out.println("You gave the boolean " + bool);
    }

    public static void variables() {
        System.out.println("Hello world from andfxx.p1.variables");
    }
}
