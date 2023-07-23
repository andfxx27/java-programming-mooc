package andfxx.p11.packages.flightcontrol.logic;

import andfxx.p11.packages.flightcontrol.domain.Airplane;
import andfxx.p11.packages.flightcontrol.domain.Airport;
import andfxx.p11.packages.flightcontrol.domain.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightControl {
    private final List<Airplane> airplanes;
    private final List<Flight> flights;
    private final List<Airport> airports;

    public FlightControl() {
        this.airplanes = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.airports = new ArrayList<>();
    }

    public void addAirplane(String id, int capacity) {
        Airplane airplane = new Airplane(id, capacity);

        if (!this.airplanes.contains(airplane)) {
            this.airplanes.add(airplane);
        }
    }

    public Airplane getAirplaneById(String id) {
        Airplane airplane = null;
        for (Airplane a : this.airplanes) {
            if (a.getId().equals(id)) {
                airplane = a;
            }
        }
        return airplane;
    }

    public void addFlight(String airplaneId, String departureAirportId, String destinationAirportId) {
        Airport departureAirport = new Airport(departureAirportId);
        Airport destinationAirport = new Airport(destinationAirportId);

        if (!this.airports.contains(departureAirport)) {
            this.airports.add(departureAirport);
        }

        if (!this.airports.contains(destinationAirport)) {
            this.airports.add(destinationAirport);
        }

        Airplane airplane = getAirplaneById(airplaneId);
        if (airplane != null) {
            Flight flight = new Flight(airplane, departureAirport, destinationAirport);
            if (!this.flights.contains(flight)) {
                this.flights.add(flight);
            }
        }
    }

    public void printAirplanes() {
        this.airplanes.forEach(System.out::println);
    }

    public void printFlights() {
        this.flights.forEach(System.out::println);
    }

    public void printAirplaneDetails(String airplaneId) {
        Airplane airplane = getAirplaneById(airplaneId);

        if (airplane != null) {
            System.out.println(airplane);
        } else {
            System.out.println("No airplane found!");
        }
    }
}
