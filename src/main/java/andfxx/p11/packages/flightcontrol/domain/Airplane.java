package andfxx.p11.packages.flightcontrol.domain;

public class Airplane {
    private final String id;
    private final int capacity;

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Airplane airplane)) {
            return false;
        }

        return this.id.equals(airplane.id) && this.capacity == airplane.capacity;
    }

    @Override
    public String toString() {
        return id + " (" + capacity + " capacity)";
    }
}
