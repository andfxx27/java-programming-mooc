package andfxx.p7.largerexercises;

import andfxx.p7.largerexercises.bigyear.BigYear;
import andfxx.p7.largerexercises.bigyear.Bird;
import andfxx.p7.largerexercises.gradestatistics.GradeStatistics;
import andfxx.p7.largerexercises.recipesearch.Recipe;
import andfxx.p7.largerexercises.recipesearch.RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargerExercises {
    public static void largerExercises() {
        System.out.println("Hello world from andfxx.p7.largerexercises");

        bigYear();
    }

    private static void bigYear() {
        Scanner scanner = new Scanner(System.in);

        List<String> validCommands = new ArrayList<>(Arrays.asList("Add", "Observation", "All", "One", "Quit"));
        BigYear bigYear = new BigYear();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }

            if (!validCommands.contains(command)) {
                System.out.println("Invalid command.");
                continue;
            }

            switch (command) {
                case "Add" -> {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in latin: ");
                    String latinName = scanner.nextLine();

                    bigYear.addBird(new Bird(name, latinName));
                }
                case "Observation" -> {
                    System.out.print("Bird? ");
                    String bird = scanner.nextLine();

                    boolean exists = bigYear.observation(bird);

                    if (!exists) {
                        System.out.println("Not a bird!");
                    }
                }
                case "All" -> {
                    bigYear.all();
                }
                case "One" -> {
                    System.out.print("Bird? ");
                    String bird = scanner.nextLine();

                    bigYear.one(bird);
                }
            }
        }
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

        RecipeSearch recipeSearch = new RecipeSearch(recipes);

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
                    recipeSearch.displayRecipes(recipes);
                }
                case "find name" -> {
                    System.out.print("Searched word: ");
                    String recipeName = scanner.nextLine();
                    recipeSearch.displayRecipes(recipeSearch.getRecipesByName(recipeName));
                }
                case "find cooking time" -> {
                    System.out.print("Max cooking time: ");
                    int maxCookingTime = Integer.parseInt(scanner.nextLine());
                    recipeSearch.displayRecipes(recipeSearch.getRecipesWithCookingTimeLessThanOrEqualTo(maxCookingTime));
                }
                case "find ingredient" -> {
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    recipeSearch.displayRecipes(recipeSearch.getRecipesByIngredient(ingredient));
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
