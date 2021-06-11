package flightinfo;

public enum Plane {

    BOEING747(1, 250, 1000),
    AIRBUS380(2, 300, 1500),
    BOEING777(3, 400, 2000);

    private int capacity;
    private int planeWeight;
    private final int value;

    Plane(int value, int capacity, int planeWeight) {
        this.value = value;
        this.capacity = capacity;
        this.planeWeight = planeWeight;
    }

    public int getValue() {
        return value;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPlaneWeight() {
        return planeWeight;
    }
}
