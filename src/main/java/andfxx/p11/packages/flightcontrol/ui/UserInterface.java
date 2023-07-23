package andfxx.p11.packages.flightcontrol.ui;

import andfxx.p11.packages.flightcontrol.logic.FlightControl;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final FlightControl flightControl;

    public UserInterface(Scanner scanner, FlightControl flightControl) {
        this.scanner = scanner;
        this.flightControl = flightControl;
    }

    public void start() {
        airportAssetControl();

        flightControl();
    }

    private void airportAssetControl() {
        System.out.println("Airport asset control");
        System.out.println("---------------------");

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit airport asset control");
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            }

            switch (input) {
                case "1" -> {
                    System.out.print("Give the airplane id: ");
                    String id = scanner.nextLine();
                    System.out.print("Give the airplane capacity: ");
                    int capacity = Integer.parseInt(scanner.nextLine());
                    this.flightControl.addAirplane(id, capacity);
                }
                case "2" -> {
                    System.out.print("Give the airplane id: ");
                    String id = scanner.nextLine();
                    System.out.print("Give the departure airport id: ");
                    String departureAirportId = scanner.nextLine();
                    System.out.print("Give the destination airport id: ");
                    String destinationAirportId = scanner.nextLine();
                    this.flightControl.addFlight(id, departureAirportId, destinationAirportId);
                }
            }
        }
    }

    private void flightControl() {
        System.out.println("Flight control");
        System.out.println("--------------");

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            }

            switch (input) {
                case "1" -> {
                    this.flightControl.printAirplanes();
                    System.out.println();
                }
                case "2" -> {
                    this.flightControl.printFlights();
                    System.out.println();
                }
                case "3" -> {
                    System.out.print("Give the airplane id: ");
                    String id = scanner.nextLine();
                    this.flightControl.printAirplaneDetails(id);
                }
            }
        }
    }
}
