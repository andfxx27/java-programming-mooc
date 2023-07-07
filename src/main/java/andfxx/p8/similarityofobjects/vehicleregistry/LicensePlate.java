package andfxx.p8.similarityofobjects.vehicleregistry;

import java.util.Objects;

public class LicensePlate {
    private final String country;
    private final String licenseNumber;

    public LicensePlate(String country, String licenseNumber) {
        this.country = country;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LicensePlate licensePlate)) {
            return false;
        }

        return this.country.equals(licensePlate.country) && this.licenseNumber.equals(licensePlate.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, licenseNumber);
    }

    @Override
    public String toString() {
        return country + " " + licenseNumber;
    }
}
