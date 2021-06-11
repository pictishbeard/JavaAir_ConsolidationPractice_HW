package flightinfo.flightlist.flightstaff;

public enum CabinCrew {

    GRADE1(1),
    GRADE2(2),
    SUPERVISOR(3);

    private final int value;

    CabinCrew(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
