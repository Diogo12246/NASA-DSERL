package pt_pt.Dserl.Model.Facility;

import pt_pt.Dserl.Model.Locational.Location;

public abstract class Facility {

    private String name;
    private Location location;
    private double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Facility(String name, Location location, double value) {
        this.name = name;
        this.location = location;
        this.value = value;
    }
}
