package andfxx.p8.similarityofobjects;

import andfxx.p8.similarityofobjects.vehicleregistry.LicensePlate;
import andfxx.p8.similarityofobjects.vehicleregistry.VehicleRegistry;

public class SimilarityOfObjects {
    public static void similarityOfObjects() {
        System.out.println("Hello world from andfxx.p8.similarityofobjects");

        vehicleRegistry();
    }

    private static void vehicleRegistry() {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        vehicleRegistry.add(li1, "FXA");
        vehicleRegistry.add(li2, "EVA");
        vehicleRegistry.add(li3, "VKN");

        vehicleRegistry.printLicensePlates();
        System.out.println();

        vehicleRegistry.printOwners();
        System.out.println();
    }

    private static void sameDate() {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }

    private static void hashForDate() {
        SimpleDate d1 = new SimpleDate(1, 2, 2000);
        SimpleDate d2 = new SimpleDate(5, 2, 2012);

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}
