package andfxx.p6.objectswithinobjects;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<String> meals;

    public Menu() {
        meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
