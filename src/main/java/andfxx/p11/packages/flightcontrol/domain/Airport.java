package andfxx.p11.packages.flightcontrol.domain;

public class Airport {
    private final String id;

    public Airport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Airport airport)) {
            return false;
        }

        return this.id.equals(airport.id);
    }
}
