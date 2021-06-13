package flightinfo;

import flightinfo.flightlist.flightstaff.CabinCrew;
import flightinfo.flightlist.flightpassengers.Passenger;
import flightinfo.flightlist.flightstaff.Pilot;
import flightinfo.Plane;

import java.util.ArrayList;

public class Flight {
    public ArrayList<Pilot> pilot;
    public ArrayList<CabinCrew> cabinCrew;
    public ArrayList<Passenger> passengers;

    private Plane plane;
    private String flightNumber;
    private String destinationPort;
    private String departurePort;
    private String departureTime;
    private double flightWeight;

    public Flight(Plane plane, String flightNumber,String destination, String departureAirport, String departureTime) {
        this.pilot = new ArrayList<Pilot>();
        this.cabinCrew = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationPort = destination;
        this.departurePort = departureAirport;
        this.departureTime = departureTime;
        this.flightWeight = 0.02;
    }

    public void addPilot(Pilot pilot) {
        this.pilot.add(pilot);
    }

    public void addCrew(CabinCrew cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public int getAvailableSeats() {
        return this.plane.getCapacity() - passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < this.plane.getCapacity())
            this.passengers.add(passenger);
    }
    public double calculateMaxBaggageWeight() {
        return this.plane.getPlaneWeight() / 2;
    }


    public double calculateBaggageWeight() {
        double paxBaggageWeight = 0;
        for (Passenger passenger: this.passengers){
            paxBaggageWeight += (passenger.getNumberOfBags() * this.plane.planeWeight);
        }
        return paxBaggageWeight;
    }

    public double baggageWeightAllowancePerPax() {
        return (this.plane.getPlaneWeight() / 2) / this.plane.getCapacity();
    }

    public double weightAvailableForBaggage() {
        double passengerBaggageWeight = 0;
        double weightAvailable = (this.plane.getPlaneWeight() / 2);

        for (Passenger passenger: this.passengers){
            passengerBaggageWeight += (passenger.getNumberOfBags() * this.plane.planeWeight);
        }
        return weightAvailable - passengerBaggageWeight;
    }

    public void onFlight(String name) {
        for (Passenger passenger : this.passengers) {
            if (passenger.getPassengerName().equals(name)) {
                passenger.onFlight = true;
            }
        }
    }
}