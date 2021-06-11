import flightinfo.flightlist.flightpassengers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Bob", 2);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Bob", passenger.getPassengerName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
