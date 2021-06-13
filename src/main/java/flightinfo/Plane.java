package flightinfo;

public enum Plane {

    BOEING747(250, 1000),
    AIRBUS380(300, 1500),
    BOEING77 (400, 2000);

    public final int capacity;
    public final int planeWeight;

    Plane(, int capacity, int planeWeight) {
        this.capacity = capacity;
        this.planeWeight = planeWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPlaneWeight() {
        return this.planeWeight;
    }
}
