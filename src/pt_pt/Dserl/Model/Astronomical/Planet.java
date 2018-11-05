package pt_pt.Dserl.Model.Astronomical;

import java.util.function.Predicate;

public class Planet extends AstronomicalEntity implements Predicate<Double> {

    private String planetaryType;
    private double orbit;
    private double dayTime;

    public Planet(String name, int code, double size, int discoveryDate, String planetaryType, double orbit, double dayTime) {
        super(name, code, size, discoveryDate);
        this.planetaryType = planetaryType;
        this.orbit = orbit;
        this.dayTime = dayTime;
    }


    @Override
    public boolean test(Double aDouble) {
        return false;
    }
}
