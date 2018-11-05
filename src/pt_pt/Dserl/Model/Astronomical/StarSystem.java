package pt_pt.Dserl.Model.Astronomical;

import java.util.ArrayList;

public class StarSystem extends AstronomicalEntity {

    private ArrayList<Star> starObjs = new ArrayList<>();
    private ArrayList<Planet> starPlanets = new ArrayList<>();

    public ArrayList<Star> getStarObjs() {
        return starObjs;
    }

    public void setStarObjs(ArrayList<Star> starObjs) {
        this.starObjs = starObjs;
    }

    public ArrayList<Planet> getStarPlanets() {
        return starPlanets;
    }

    public void setStarPlanets(ArrayList<Planet> starPlanets) {
        this.starPlanets = starPlanets;
    }

    public StarSystem(String name, int code, double size, int discoveryDate, ArrayList<Star> starObjs, ArrayList<Planet> starPlanets) {
        super(name, code, size, discoveryDate);
        this.starObjs = starObjs;
        this.starPlanets = starPlanets;
    }

}
