package andfxx.p11.packages;

import andfxx.p11.packages.firstpackages.logic.ApplicationLogic;
import andfxx.p11.packages.firstpackages.ui.TextInterface;
import andfxx.p11.packages.firstpackages.ui.UserInterface;
import andfxx.p11.packages.flightcontrol.logic.FlightControl;

import java.util.Scanner;

public class Packages {
    public static void packages() {
        System.out.println("Hello world from andfxx.p11.packages");

        flightControl();
    }

    private static void flightControl() {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        new andfxx.p11.packages.flightcontrol.ui.UserInterface(scanner, flightControl).start();
    }

    private static void firstPackages() {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
