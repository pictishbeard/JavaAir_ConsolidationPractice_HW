package flightinfo.flightlist.flightstaff;

public enum CabinCrew {

    CAPTAIN(1),
    FIRSTOFFICER(2),
    PURSER(3),
    FLIGHTATTENDANT(4);

    private String name;
    private final int value;


    CabinCrew(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
