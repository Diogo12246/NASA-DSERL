package pt_pt.Dserl.Model;

public class Planet {
    private int idPlanet;
    private String Name;
    private int code;
    private double size;
    private int discoveryDate;
    private int planetType;
    private double orbit;
    private double dayTime;
    private String description_notes;

    public int getIdPlanet() {
        return idPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDiscoveryDate() {
        return discoveryDate;
    }

    public void setDiscoveryDate(int discoveryDate) {
        this.discoveryDate = discoveryDate;
    }

    public int getPlanetType() {
        return planetType;
    }

    public void setPlanetType(int planetType) {
        this.planetType = planetType;
    }

    public double getOrbit() {
        return orbit;
    }

    public void setOrbit(double orbit) {
        this.orbit = orbit;
    }

    public double getDayTime() {
        return dayTime;
    }

    public void setDayTime(double dayTime) {
        this.dayTime = dayTime;
    }

    public String getDescription_notes() {
        return description_notes;
    }

    public void setDescription_notes(String description_notes) {
        this.description_notes = description_notes;
    }

    public Planet(int idPlanet, String name, int code, double size, int discoveryDate, int planetType, double orbit, double dayTime, String description_notes) {
        this.idPlanet = idPlanet;
        Name = name;
        this.code = code;
        this.size = size;
        this.discoveryDate = discoveryDate;
        this.planetType = planetType;
        this.orbit = orbit;
        this.dayTime = dayTime;
        this.description_notes = description_notes;
    }

    @Override
    public String toString() {
        return getName();
    }
}
