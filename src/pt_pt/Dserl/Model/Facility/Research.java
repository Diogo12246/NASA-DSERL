package pt_pt.Dserl.Model.Facility;

public class Research {

    private String name;
    private double value;

    private static final Research Social = new Research("Social",12000);
    private static final Research Technological = new Research("Technological",50000);
    private static final Research Biological = new Research("Biological", 35000);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Research(String name, double value) {
        this.name = name;
        this.value = value;
    }
}
