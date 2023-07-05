package andfxx.p7.largerexercises;

import andfxx.p7.largerexercises.gradestatistics.GradeStatistics;
import andfxx.p7.largerexercises.recipesearch.Recipe;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargerExercises {
    public static void largerExercises() {
        System.out.println("Hello world from andfxx.p7.largerexercises");

        recipeSearch();
    }

    private static void recipeSearch() {
        Scanner scanner = new Scanner(System.in);

        List<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String filename = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.parseInt(fileScanner.nextLine());

                List<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Failed reading file.");
            e.printStackTrace();
            return;
        }

        System.out.println("Commands:");
        System.out.println("list - lists all recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "list" -> {
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        System.out.println(recipe.name() + ", cooking time: " + recipe.cookingTime());
                    }
                }
                case "find name" -> {
                    System.out.print("Searched word: ");
                    String recipeName = scanner.nextLine();
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        if (recipe.name().toLowerCase().contains(recipeName.toLowerCase())) {
                            System.out.println(recipe.name() + ", cooking time: " + recipe.cookingTime());
                        }
                    }
                }
                case "find cooking time" -> {
                    System.out.print("Max cooking time: ");
                    int maxCookingTime = Integer.parseInt(scanner.nextLine());
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        if (recipe.cookingTime() <= maxCookingTime) {
                            System.out.println(recipe.name() + ", cooking time: " + recipe.cookingTime());
                        }
                    }
                }
                case "find ingredient" -> {
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        if (recipe.ingredients().contains(ingredient)) {
                            System.out.println(recipe.name() + ", cooking time: " + recipe.cookingTime());
                        }
                    }
                }
            }
        }
    }

    private static void gradeStatistics() {
        Scanner scanner = new Scanner(System.in);

        GradeStatistics gradeStatistics = new GradeStatistics();

        System.out.println("Enter point [1-100] (-1 stops the program):");
        while (true) {
            int point = Integer.parseInt(scanner.nextLine());
            if (point == -1) {
                break;
            }

            gradeStatistics.addPoint(point);
        }

        // Calculate average for all point
        System.out.println("Point average (all): " + gradeStatistics.calculateTotalPointAverage());

        double passingPointAverage = gradeStatistics.calculatePassingPointAverage();
        if (passingPointAverage == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingPointAverage);
        }

        // Calculate passing point percentage
        System.out.println("Pass percentage: " + gradeStatistics.calculatePassingPointPercentage());

        // Display grade distribution
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ": ");
            for (int v : gradeStatistics.getGrades()) {
                if (v == grade) {
                    System.out.print("*");
                }
            }
            grade--;

            System.out.println();
        }
    }
}
