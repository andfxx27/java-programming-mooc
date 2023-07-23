package andfxx.p11.packages.flightcontrol.domain;

public class Flight {
    private final Airplane airplane;
    private final Airport departureAirport;
    private final Airport destinationAirport;

    public Flight(Airplane airplane, Airport departureAirport, Airport destinationAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Flight flight)) {
            return false;
        }

        return this.airplane.equals(flight.airplane)
                && this.departureAirport.equals(flight.departureAirport)
                && this.destinationAirport.equals(flight.destinationAirport);
    }

    @Override
    public String toString() {
        return airplane.getId() + " (" + airplane.getCapacity() + " passengers) (" + departureAirport.getId() + "-" + destinationAirport.getId() + ")";
    }
}
