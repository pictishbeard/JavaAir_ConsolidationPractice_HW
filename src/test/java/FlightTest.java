import flightinfo.Flight;
import flightinfo.Plane;
import flightinfo.flightlist.flightpassengers.Passenger;
import flightinfo.flightlist.flightstaff.CabinCrew;
import flightinfo.flightlist.flightstaff.Pilot;
import flightinfo.flightlist.flightstaff.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

        Flight flight;
        Pilot pilot1;
        Pilot pilot2;
        CabinCrew crew1;
        CabinCrew crew2;
        CabinCrew crew3;
        CabinCrew crew4;
        Passenger passenger1;
        Passenger passenger2;
        Passenger passenger3;
        Passenger passenger4;
        Passenger passenger5;

        @Before
        public void before() {
            flight = new Flight(Plane.BOEING747, "134567", "Frankfurt", "Edinburgh", "4.40pm");
            pilot1 = new Pilot("Mike", Rank.CAPTAIN, "ABC123");
            flight.addPilot(pilot1);
            crew1 = new CabinCrew("Boberina", Rank.GRADE2);
            crew2 = new CabinCrew("Bobette", Rank.GRADE1);
            crew3 = new CabinCrew("Bob", Rank.CSV);
            flight.addCrew(crew1);
            flight.addCrew(crew2);
            flight.addCrew(crew3);
            flight.addCrew(crew4);
            passenger1 = new Passenger("Billiam", 1);
            passenger2 = new Passenger("Billulio", 1);
            passenger3 = new Passenger("Billvia", 1);
            passenger4 = new Passenger("Billizabeth", 1);
            flight.addPassenger(passenger1);
            flight.addPassenger(passenger2);
            flight.addPassenger(passenger3);
            flight.addPassenger(passenger4);
        }

        @Test
        public void canAddPilots() {
            assertEquals(1, flight.pilot.size());
        }

        @Test
        public void canAddCrew() {
            assertEquals(4, flight.cabinCrew.size());
        }

        @Test
        public void canAddPassenger() {
            assertEquals(4, flight.passengers.size());
        }

        @Test
        public void canShowAvailableSeats() {
            assertEquals(246, flight.getAvailableSeats());
        }

        @Test
        public void checkMaxBaggageWeight() {
            assertEquals(500, flight.calculateMaxBaggageWeight(), 0.0);
        }

        @Test
        public void checkBaggageWeight() {
            assertEquals(4000, flight.calculateBaggageWeight(), 0.0);
        }

        @Test
        public void checkBaggageWeightAllowancePerPassenger() {
            assertEquals(2.0, flight.baggageWeightAllowancePerPax(), 0.0);
        }

        @Test
        public void checkWeightAvailableForBaggage() {
            assertEquals(-3500.00, flight.weightAvailableForBaggage(), 0.0);
        }
}
