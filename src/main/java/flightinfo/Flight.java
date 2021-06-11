package flightinfo;

import flightinfo.flightlist.flightstaff.CabinCrew;
import flightinfo.flightlist.flightpassengers.Passenger;
import flightinfo.flightlist.flightstaff.Pilot;

import java.util.ArrayList;

public abstract class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;

    private String flightNumber;
    private String destinationPort;
    private String departurePort;
    private String departureTime;

}
