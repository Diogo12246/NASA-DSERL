package pt_pt.Dserl.Model;

public class PlanetType {
    private int idType;
    private String PlanetType;

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setPlanetType(String planetType) {
        PlanetType = planetType;
    }

    public int getIdType() {
        return idType;
    }

    public String getPlanetType() {
        return PlanetType;
    }

    @Override
    public String toString() {
        return getPlanetType();
    }
}
