package pt_pt.Dserl.Model.Astronomical;

import java.util.ArrayList;

public class Cluster extends AstronomicalEntity {
    private ArrayList<Galaxy> galaxyCluster = new ArrayList<>();

    public ArrayList<Galaxy> getGalaxyCluster() {
        return galaxyCluster;
    }

    public void setGalaxyCluster(ArrayList<Galaxy> galaxyCluster) {
        this.galaxyCluster = galaxyCluster;
    }

    public Cluster(String name, int code, double size, int discoveryDate) {
        super(name, code, size, discoveryDate);
    }
}
