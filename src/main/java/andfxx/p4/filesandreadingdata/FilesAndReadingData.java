package andfxx.p4.filesandreadingdata;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesAndReadingData {
    static Scanner scanner = new Scanner(System.in);

    public static void filesAndReadingData() {
        System.out.println("Hello world from andfxx.p4.filesandreadingdata");

        sportStatistics();
    }

    private static void sportStatistics() {
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner s = new Scanner(Paths.get(fileName))) {
            while (s.hasNextLine()) {
                String match = s.nextLine();
                if (match.contains(teamName)) {
                    gamesPlayed++;
                }

                String[] parts = match.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int visitingTeamPoints = Integer.parseInt(parts[3]);

                if (teamName.equals(homeTeam) && homeTeamPoints == 16 || teamName.equals(visitingTeam) && visitingTeamPoints == 16) {
                    wins++;
                } else if (teamName.equals(homeTeam) && homeTeamPoints < 16 || teamName.equals(visitingTeam) && visitingTeamPoints < 16) {
                    losses++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    private static void storingRecords() {
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        List<Person> people = Person.readRecordsFromFile(fileName);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void recordsFromAFile() {
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner s = new Scanner(Paths.get(fileName))) {
            while (s.hasNextLine()) {
                String[] parts = s.nextLine().split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String yearFormat = (age > 1) ? "years" : "year";
                System.out.println(name + ", " + age + " " + yearFormat);
            }
        } catch (Exception e) {
            System.out.println("Reading file failed.");
        }
    }

    private static void numbersFromAFile() {
        System.out.print("File? ");
        String fileName = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int count = 0;

        try (Scanner s = new Scanner(Paths.get(fileName))) {
            while (s.hasNextLine()) {
                int number = Integer.parseInt(s.nextLine());
                if (lowerBound <= number && number <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Numbers: " + count);
    }

    private static void isItInTheFile() {
        System.out.print("Name of the file: ");
        String fileName = scanner.nextLine();

        List<String> lines = new ArrayList<>();

        try (Scanner s = new Scanner(Paths.get(fileName))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
            return;
        }

        boolean found = false;

        System.out.print("Search for: ");
        String stringToSearchFor = scanner.nextLine();

        for (String line : lines) {
            if (line.contains(stringToSearchFor)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }

    private static void guessingListFromAFile() {
        System.out.print("Name of the file: ");
        String fileName = scanner.nextLine();

        List<String> guestList = new ArrayList<>();

        try (Scanner s = new Scanner(Paths.get(fileName))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();
                guestList.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter name, an empty line quits the program.");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            if (guestList.contains(input)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
    }

    private static void printingASpecifiedFile() {
        System.out.print("Which file should have its content printed? ");
        String fileName = scanner.nextLine();
        try (Scanner s = new Scanner(Paths.get(fileName))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            // Scanner will throw NoSuchFileException if the requested file doesn't exist
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void printingFromAFile() {
        try (Scanner s = new Scanner(Paths.get("file.txt"))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();

                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void readingFromAFile() {
        // Paths.get(...) read from root directory of a project
        try (Scanner s = new Scanner(Paths.get("file.txt"))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();

                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void cubes() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            int number = Integer.parseInt(input);

            System.out.println(number * number * number);
        }
    }

    private static void numberOfStrings() {
        int stringsReadCount = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            stringsReadCount++;
        }

        System.out.println(stringsReadCount);
    }
}
