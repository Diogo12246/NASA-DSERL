package pt_pt.Dserl.Model.Biological;

public abstract class Lifeform {
    private String name;
    private double racespan;
    private int discoveryYear;
    private String origins;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRacespan() {
        return racespan;
    }

    public void setRacespan(double racespan) {
        this.racespan = racespan;
    }

    public int getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(int discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    public String getOrigins() {
        return origins;
    }

    public void setOrigins(String origins) {
        this.origins = origins;
    }

    public Lifeform(String name, double racespan, int discoveryYear, String origins) {
        this.name = name;
        this.racespan = racespan;
        this.discoveryYear = discoveryYear;
        this.origins = origins;
    }

}
