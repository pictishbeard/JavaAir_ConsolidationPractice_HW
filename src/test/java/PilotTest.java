import flightinfo.flightlist.flightstaff.Pilot;
import flightinfo.flightlist.flightstaff.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Adam", Rank.CAPTAIN, "ABC123");
    }

    @Test
    public void hasName() {
        assertEquals("Adam", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("ABC123", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyThePlane() {
        assertEquals("I'm flying the plane!", pilot.flyPlane());
    }
}
