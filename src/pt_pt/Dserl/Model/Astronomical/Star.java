package pt_pt.Dserl.Model.Astronomical;

public class Star extends AstronomicalEntity {

    private String Colour;

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public Star(String name, int code, double size, int discoveryDate, String colour) {
        super(name, code, size, discoveryDate);
        Colour = colour;
    }
}
