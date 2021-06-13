package flightinfo.flightlist.flightpassengers;

public class Passenger {

    public String passengerName;
    public Integer numberOfBags;
    public boolean onFlight;

    public Passenger(String passengerName, Integer numberOfBags) {
        this.passengerName = passengerName;
        this.numberOfBags = numberOfBags;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public boolean onFlight() {
        return this.onFlight;
    }

}
