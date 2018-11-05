package pt_pt.Dserl.Model.Astronomical;



public abstract class AstronomicalEntity {
    private String name;
    private int code;
    private double size;
    private int discoveryDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public AstronomicalEntity(String name, int code, double size, int discoveryDate) {
        this.name = name;
        this.code = code;
        this.size = size;
        this.discoveryDate = discoveryDate;
    }


}
