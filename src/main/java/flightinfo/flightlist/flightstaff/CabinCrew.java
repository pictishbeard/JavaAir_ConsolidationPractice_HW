package flightinfo.flightlist.flightstaff;

public class CabinCrew {

    private String name;
    private Rank ranking;


    public CabinCrew(String name, Rank rank) {
        this.name = name;
        this.ranking = rank;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return ranking;
    }

    public String announcementCall() {
        return "In for a bumpy ride!";
    }


}
