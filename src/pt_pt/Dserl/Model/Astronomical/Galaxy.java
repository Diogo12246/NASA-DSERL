package pt_pt.Dserl.Model.Astronomical;

import java.util.ArrayList;

public class Galaxy extends AstronomicalEntity {

    private ArrayList<StarSystem> starSystems = new ArrayList();

    public ArrayList<StarSystem> getStarSystems() {
        return starSystems;
    }

    public void setStarSystems(ArrayList<StarSystem> starSystems) {
        this.starSystems = starSystems;
    }

    public Galaxy(String name, int code, double size, int discoveryDate) {
        super(name, code, size, discoveryDate);
    }
}
