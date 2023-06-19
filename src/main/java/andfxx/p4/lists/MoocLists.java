package andfxx.p4.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class MoocLists {
    static Scanner scanner = new Scanner(System.in);

    public static void moocLists() {
        System.out.println("Hello world from andfxx.p3.Lists");

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);

        System.out.println(strings);
    }

    private static void removeLast(ArrayList<String> strings) {
        strings.remove(strings.get(strings.size() - 1));
    }

    private static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void printInRange() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }

    private static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (lowerLimit <= number && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    private static void onTheList() {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter series of names:");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            names.add(name);
        }

        System.out.print("Search for? ");
        String nameToSearchFor = scanner.nextLine();

        if (names.contains(nameToSearchFor)) {
            System.out.println(nameToSearchFor + " was found!");
        } else {
            System.out.println(nameToSearchFor + " was not found!");
        }
    }

    private static void averageOfAList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter series of numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Average: " + (double) sum / numbers.size());
    }

    private static void sumOfAList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter series of numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }

    private static void indexOfSmallest() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int min = 1000000;

        System.out.println("Enter series of numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 9999) {
                break;
            }

            numbers.add(number);
            if (min > number) {
                min = number;
            }
        }

        System.out.println("Smallest number: " + min);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == min) {
                System.out.println("Found at index: " + i);
            }
        }
    }

    public static void indexOf() {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter series of numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.print("Search for? ");
        int numberToSearchFor = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number == numberToSearchFor) {
                System.out.println(number + " is at index " + i);
            }
        }
    }

    public static void greatestInList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int max = 0;

        System.out.println("Enter series of numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The greatest number: " + max);
    }

    private static void onlyTheseNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter series of numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.print("From where? ");
        int startIndex = Integer.parseInt(scanner.nextLine());
        System.out.print("To where? ");
        int endIndex = Integer.parseInt(scanner.nextLine());

        if ((startIndex < 0 || startIndex > numbers.size() - 1) || (endIndex < 0 || endIndex > numbers.size() - 1)) {
            System.out.println("Index is not valid.");
            return;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }

    private static void rememberTheseNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter series of numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    private static void firstAndLast() {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter series of names:");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            names.add(name);
        }

        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));
    }

    private static void lastInList() {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter series of names:");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            names.add(name);
        }

        System.out.println("The last name in the list is " + names.get(names.size() - 1) + ".");
    }

    private static void listSize() {
        ArrayList<String> artists = new ArrayList<>();

        System.out.println("Enter series of artists:");
        while (true) {
            String artist = scanner.nextLine();
            if (artist.equals("")) {
                break;
            }
            artists.add(artist);
        }

        System.out.println("In total, there are " + artists.size() + " artists.");
    }

    /**
     * The following method will always produce IndexOutOfBoundsException
     */
    private static void indexOutOfBoundsException() {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        primeNumbers.add(2);
        primeNumbers.add(3);

        System.out.println(primeNumbers.get(2));
    }

    private static void secondPlusThird() {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter series of numbers:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            numbers.add(input);
        }

        if (numbers.size() < 3) {
            System.out.println("Variable numbers only contains fewer than 3 elements.");
            return;
        }

        int secondElement = numbers.get(1);
        int thirdElement = numbers.get(2);
        System.out.println("The sum of " + secondElement + " and " + thirdElement + " is " + (secondElement + thirdElement));
    }

    private static void thirdElement() {
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            names.add(input);
        }

        if (names.size() < 3) {
            System.out.println("Variable names only contains fewer than 3 elements.");
            return;
        }

        System.out.println(names.get(2));
    }

    private static void arrayListDemo() {
        ArrayList<String> genshinImpactCharacters = new ArrayList<>();
        genshinImpactCharacters.add("Venti");
        genshinImpactCharacters.add("Kazuha");
        genshinImpactCharacters.add("Heizou");

        System.out.println("List of genshin impact anemo characters:");
        System.out.println("---");
        for (String character : genshinImpactCharacters) {
            System.out.println(character);
        }
    }
}
