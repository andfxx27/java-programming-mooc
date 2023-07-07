package andfxx.p8.similarityofobjects.vehicleregistry;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private Map<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.registry.containsKey(licensePlate)) {
            return false;
        }

        this.registry.remove(licensePlate);

        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        for (String owner : this.registry.values()) {
            System.out.println(owner);
        }
    }
}
